/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.resourcesimporter.util;

import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portlet.documentlibrary.model.DLFolderConstants;

import java.io.InputStream;

import java.net.URL;
import java.net.URLConnection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Raymond Augé
 * @author Ryan Park
 * @author Paul Shemansky
 */
public class ResourceImporter extends FileSystemImporter {

	@Override
	public void importResources() throws Exception {
		doImportResources();
	}

	@Override
	protected void addDDMStructures(
			String parentStructureId, String structuresDirName)
		throws Exception {

		Set<String> resourcePaths = servletContext.getResourcePaths(
			resourcesDir.concat(structuresDirName));

		if (resourcePaths == null) {
			return;
		}

		for (String resourcePath : resourcePaths) {
			if (resourcePath.endsWith(StringPool.SLASH)) {
				continue;
			}

			String name = FileUtil.getShortFileName(resourcePath);

			URL url = servletContext.getResource(resourcePath);

			URLConnection urlConnection = url.openConnection();

			doAddDDMStructures(
				parentStructureId, name, urlConnection.getInputStream());
		}
	}

	@Override
	protected void addDDMTemplates(
			String ddmStructureKey, String templatesDirName)
		throws Exception {

		Set<String> resourcePaths = servletContext.getResourcePaths(
			resourcesDir.concat(templatesDirName));

		if (resourcePaths == null) {
			return;
		}

		for (String resourcePath : resourcePaths) {
			if (resourcePath.endsWith(StringPool.SLASH)) {
				continue;
			}

			String name = FileUtil.getShortFileName(resourcePath);

			URL url = servletContext.getResource(resourcePath);

			URLConnection urlConnection = url.openConnection();

			doAddDDMTemplates(
				ddmStructureKey, name, urlConnection.getInputStream());
		}
	}

	@Override
	protected void addDLFileEntries(String fileEntriesDirName)
		throws Exception {

		String resourcePathRoot = resourcesDir.concat(
			fileEntriesDirName.substring(1));

		recurseDLDirectory(
			DLFolderConstants.DEFAULT_PARENT_FOLDER_ID, resourcePathRoot,
			resourcePathRoot);
	}

	@Override
	protected void addJournalArticles(
			String ddmStructureKey, String ddmTemplateKey,
			String articlesDirName)
		throws Exception {

		Set<String> resourcePaths = servletContext.getResourcePaths(
			resourcesDir.concat(articlesDirName));

		if (resourcePaths == null) {
			return;
		}

		for (String resourcePath : resourcePaths) {
			if (resourcePath.endsWith(StringPool.SLASH)) {
				continue;
			}

			String name = FileUtil.getShortFileName(resourcePath);

			URL url = servletContext.getResource(resourcePath);

			URLConnection urlConnection = url.openConnection();

			doAddJournalArticles(
				ddmStructureKey, ddmTemplateKey, name,
				urlConnection.getInputStream());
		}
	}

	protected void doAddDLFileEntry(String resourcePathRoot, String resourcePath)
		throws Exception {

		String folderPath = FileUtil.getPath(resourcePath) + StringPool.SLASH;

		Long parentFolderId = _folderIds.get(folderPath);

		if (parentFolderId == null) {
			throw new Exception("No Folder Created for File Path :" +
				folderPath);
		}

		String name = FileUtil.getShortFileName(resourcePath);

		URL url = servletContext.getResource(resourcePath);

		URLConnection urlConnection = url.openConnection();

		doAddDLFileEntry(
			parentFolderId, name, urlConnection.getInputStream(),
			urlConnection.getContentLength());
	}

	@Override
	protected InputStream getInputStream(String fileName) throws Exception {
		URL url = servletContext.getResource(resourcesDir.concat(fileName));

		if (url == null) {
			return null;
		}

		URLConnection urlConnection = url.openConnection();

		return urlConnection.getInputStream();
	}

	private String getFolderName(String resourcePath) {
		String path = FileUtil.getPath(resourcePath);
		String folderName = path.substring(
			path.lastIndexOf(StringPool.SLASH) + 1);
		return folderName;
	}

	private void recurseDLDirectory(
		long parentFolderId, String currentPath, String resourcePathRoot)
		throws Exception {

		Set<String> resourcePaths = servletContext.getResourcePaths(
			currentPath);

		if (resourcePaths == null || resourcePaths.isEmpty()) {
			return;
		}

		for (String resourcePath : resourcePaths) {
			if (resourcePath.endsWith(StringPool.SLASH)) {
				String folderName = getFolderName(resourcePath);
				long dlFolderId = addDLFolder(parentFolderId, folderName);
				_folderIds.put(resourcePath, dlFolderId);
				recurseDLDirectory(dlFolderId, resourcePath, resourcePathRoot);
			}
			else {
				doAddDLFileEntry(resourcePathRoot, resourcePath);
			}
		}
	}

	private Map<String, Long> _folderIds = new HashMap<String, Long>();

}