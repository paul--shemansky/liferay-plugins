/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.knowledgebase.service;

import com.liferay.portal.service.InvokableLocalService;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class KBArticleLocalServiceClp implements KBArticleLocalService {
	public KBArticleLocalServiceClp(InvokableLocalService invokableLocalService) {
		_invokableLocalService = invokableLocalService;

		_methodName0 = "addKBArticle";

		_methodParameterTypes0 = new String[] {
				"com.liferay.knowledgebase.model.KBArticle"
			};

		_methodName1 = "addKBArticle";

		_methodParameterTypes1 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String[][]",
				"java.lang.String[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName2 = "addKBArticleResources";

		_methodParameterTypes2 = new String[] {
				"com.liferay.knowledgebase.model.KBArticle", "boolean",
				"boolean"
			};

		_methodName3 = "addKBArticleResources";

		_methodParameterTypes3 = new String[] {
				"com.liferay.knowledgebase.model.KBArticle",
				"java.lang.String[][]", "java.lang.String[][]"
			};

		_methodName4 = "addKBArticleResources";

		_methodParameterTypes4 = new String[] { "long", "boolean", "boolean" };

		_methodName5 = "addKBArticleResources";

		_methodParameterTypes5 = new String[] {
				"long", "java.lang.String[][]", "java.lang.String[][]"
			};

		_methodName6 = "addKBArticlesMarkdown";

		_methodParameterTypes6 = new String[] {
				"long", "long", "java.lang.String", "java.io.InputStream",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName7 = "addTempAttachment";

		_methodParameterTypes7 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.io.InputStream", "java.lang.String"
			};

		_methodName8 = "createKBArticle";

		_methodParameterTypes8 = new String[] { "long" };

		_methodName9 = "deleteGroupKBArticles";

		_methodParameterTypes9 = new String[] { "long" };

		_methodName10 = "deleteKBArticle";

		_methodParameterTypes10 = new String[] {
				"com.liferay.knowledgebase.model.KBArticle"
			};

		_methodName11 = "deleteKBArticle";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "deleteKBArticles";

		_methodParameterTypes12 = new String[] { "long[][]" };

		_methodName13 = "deletePersistedModel";

		_methodParameterTypes13 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName14 = "deleteTempAttachment";

		_methodParameterTypes14 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String"
			};

		_methodName15 = "dynamicQuery";

		_methodParameterTypes15 = new String[] {  };

		_methodName16 = "dynamicQuery";

		_methodParameterTypes16 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName17 = "dynamicQuery";

		_methodParameterTypes17 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName18 = "dynamicQuery";

		_methodParameterTypes18 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName19 = "dynamicQueryCount";

		_methodParameterTypes19 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName20 = "dynamicQueryCount";

		_methodParameterTypes20 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName21 = "fetchKBArticle";

		_methodParameterTypes21 = new String[] { "long" };

		_methodName22 = "fetchKBArticleByUrlTitle";

		_methodParameterTypes22 = new String[] { "long", "java.lang.String" };

		_methodName23 = "fetchKBArticleByUuidAndGroupId";

		_methodParameterTypes23 = new String[] { "java.lang.String", "long" };

		_methodName24 = "fetchLatestKBArticle";

		_methodParameterTypes24 = new String[] { "long", "int" };

		_methodName25 = "fetchLatestKBArticleByUrlTitle";

		_methodParameterTypes25 = new String[] { "long", "java.lang.String", "int" };

		_methodName26 = "getActionableDynamicQuery";

		_methodParameterTypes26 = new String[] {  };

		_methodName27 = "getAllDescendantKBArticles";

		_methodParameterTypes27 = new String[] {
				"long", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName28 = "getBeanIdentifier";

		_methodParameterTypes28 = new String[] {  };

		_methodName29 = "getCompanyKBArticles";

		_methodParameterTypes29 = new String[] {
				"long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName30 = "getCompanyKBArticlesCount";

		_methodParameterTypes30 = new String[] { "long", "int" };

		_methodName31 = "getExportActionableDynamicQuery";

		_methodParameterTypes31 = new String[] {
				"com.liferay.portal.kernel.lar.PortletDataContext"
			};

		_methodName32 = "getGroupKBArticles";

		_methodParameterTypes32 = new String[] {
				"long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName33 = "getGroupKBArticlesCount";

		_methodParameterTypes33 = new String[] { "long", "int" };

		_methodName34 = "getKBArticle";

		_methodParameterTypes34 = new String[] { "long" };

		_methodName35 = "getKBArticle";

		_methodParameterTypes35 = new String[] { "long", "int" };

		_methodName36 = "getKBArticleAndAllDescendantKBArticles";

		_methodParameterTypes36 = new String[] {
				"long", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName37 = "getKBArticleAndAllDescendants";

		_methodParameterTypes37 = new String[] {
				"long", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName38 = "getKBArticleByUrlTitle";

		_methodParameterTypes38 = new String[] { "long", "java.lang.String" };

		_methodName39 = "getKBArticleByUuidAndGroupId";

		_methodParameterTypes39 = new String[] { "java.lang.String", "long" };

		_methodName40 = "getKBArticleVersions";

		_methodParameterTypes40 = new String[] {
				"long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName41 = "getKBArticleVersionsCount";

		_methodParameterTypes41 = new String[] { "long", "int" };

		_methodName42 = "getKBArticles";

		_methodParameterTypes42 = new String[] {
				"long", "long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName43 = "getKBArticles";

		_methodParameterTypes43 = new String[] {
				"long[][]", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName44 = "getKBArticles";

		_methodParameterTypes44 = new String[] { "int", "int" };

		_methodName45 = "getKBArticlesByUuidAndCompanyId";

		_methodParameterTypes45 = new String[] { "java.lang.String", "long" };

		_methodName46 = "getKBArticlesByUuidAndCompanyId";

		_methodParameterTypes46 = new String[] {
				"java.lang.String", "long", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName47 = "getKBArticlesCount";

		_methodParameterTypes47 = new String[] {  };

		_methodName48 = "getKBArticlesCount";

		_methodParameterTypes48 = new String[] { "long", "long", "int" };

		_methodName49 = "getLatestKBArticle";

		_methodParameterTypes49 = new String[] { "long", "int" };

		_methodName50 = "getLatestKBArticleByUrlTitle";

		_methodParameterTypes50 = new String[] { "long", "java.lang.String", "int" };

		_methodName51 = "getPersistedModel";

		_methodParameterTypes51 = new String[] { "java.io.Serializable" };

		_methodName52 = "getPreviousAndNextKBArticles";

		_methodParameterTypes52 = new String[] { "long" };

		_methodName53 = "getSectionsKBArticles";

		_methodParameterTypes53 = new String[] {
				"long", "java.lang.String[][]", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName54 = "getSectionsKBArticlesCount";

		_methodParameterTypes54 = new String[] {
				"long", "java.lang.String[][]", "int"
			};

		_methodName55 = "getSiblingKBArticles";

		_methodParameterTypes55 = new String[] {
				"long", "long", "int", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName56 = "getSiblingKBArticlesCount";

		_methodParameterTypes56 = new String[] { "long", "long", "int" };

		_methodName57 = "getTempAttachmentNames";

		_methodParameterTypes57 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName59 = "moveKBArticle";

		_methodParameterTypes59 = new String[] { "long", "long", "long", "double" };

		_methodName60 = "search";

		_methodParameterTypes60 = new String[] {
				"long", "java.lang.String", "java.lang.String", "int",
				"java.util.Date", "java.util.Date", "boolean", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName61 = "setBeanIdentifier";

		_methodParameterTypes61 = new String[] { "java.lang.String" };

		_methodName62 = "subscribeGroupKBArticles";

		_methodParameterTypes62 = new String[] { "long", "long" };

		_methodName63 = "subscribeKBArticle";

		_methodParameterTypes63 = new String[] { "long", "long", "long" };

		_methodName64 = "unsubscribeGroupKBArticles";

		_methodParameterTypes64 = new String[] { "long", "long" };

		_methodName65 = "unsubscribeKBArticle";

		_methodParameterTypes65 = new String[] { "long", "long" };

		_methodName66 = "updateKBArticle";

		_methodParameterTypes66 = new String[] {
				"com.liferay.knowledgebase.model.KBArticle"
			};

		_methodName67 = "updateKBArticle";

		_methodParameterTypes67 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String[][]",
				"java.lang.String[][]", "long[][]",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName68 = "updateKBArticleAsset";

		_methodParameterTypes68 = new String[] {
				"long", "com.liferay.knowledgebase.model.KBArticle", "long[][]",
				"java.lang.String[][]", "long[][]"
			};

		_methodName69 = "updateKBArticleResources";

		_methodParameterTypes69 = new String[] {
				"com.liferay.knowledgebase.model.KBArticle",
				"java.lang.String[][]", "java.lang.String[][]"
			};

		_methodName70 = "updateKBArticlesPriorities";

		_methodParameterTypes70 = new String[] { "java.util.Map" };

		_methodName71 = "updatePriority";

		_methodParameterTypes71 = new String[] { "long", "double" };

		_methodName72 = "updateStatus";

		_methodParameterTypes72 = new String[] {
				"long", "long", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName73 = "updateViewCount";

		_methodParameterTypes73 = new String[] { "long", "long", "int" };
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle addKBArticle(
		com.liferay.knowledgebase.model.KBArticle kbArticle) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName0,
					_methodParameterTypes0,
					new Object[] { ClpSerializer.translateInput(kbArticle) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle addKBArticle(long userId,
		long parentResourcePrimKey, java.lang.String title,
		java.lang.String urlTitle, java.lang.String content,
		java.lang.String description, java.lang.String[] sections,
		java.lang.String[] selectedFileNames,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName1,
					_methodParameterTypes1,
					new Object[] {
						userId,
						
					parentResourcePrimKey,
						
					ClpSerializer.translateInput(title),
						
					ClpSerializer.translateInput(urlTitle),
						
					ClpSerializer.translateInput(content),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(sections),
						
					ClpSerializer.translateInput(selectedFileNames),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void addKBArticleResources(
		com.liferay.knowledgebase.model.KBArticle kbArticle,
		boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName2,
				_methodParameterTypes2,
				new Object[] {
					ClpSerializer.translateInput(kbArticle),
					
				addGroupPermissions,
					
				addGuestPermissions
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void addKBArticleResources(
		com.liferay.knowledgebase.model.KBArticle kbArticle,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName3,
				_methodParameterTypes3,
				new Object[] {
					ClpSerializer.translateInput(kbArticle),
					
				ClpSerializer.translateInput(groupPermissions),
					
				ClpSerializer.translateInput(guestPermissions)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void addKBArticleResources(long kbArticleId,
		boolean addGroupPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName4,
				_methodParameterTypes4,
				new Object[] {
					kbArticleId,
					
				addGroupPermissions,
					
				addGuestPermissions
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void addKBArticleResources(long kbArticleId,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName5,
				_methodParameterTypes5,
				new Object[] {
					kbArticleId,
					
				ClpSerializer.translateInput(groupPermissions),
					
				ClpSerializer.translateInput(guestPermissions)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void addKBArticlesMarkdown(long userId, long groupId,
		java.lang.String fileName, java.io.InputStream inputStream,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName6,
				_methodParameterTypes6,
				new Object[] {
					userId,
					
				groupId,
					
				ClpSerializer.translateInput(fileName),
					
				ClpSerializer.translateInput(inputStream),
					
				ClpSerializer.translateInput(serviceContext)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void addTempAttachment(long groupId, long userId,
		java.lang.String fileName, java.lang.String tempFolderName,
		java.io.InputStream inputStream, java.lang.String mimeType)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName7,
				_methodParameterTypes7,
				new Object[] {
					groupId,
					
				userId,
					
				ClpSerializer.translateInput(fileName),
					
				ClpSerializer.translateInput(tempFolderName),
					
				ClpSerializer.translateInput(inputStream),
					
				ClpSerializer.translateInput(mimeType)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle createKBArticle(
		long kbArticleId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName8,
					_methodParameterTypes8, new Object[] { kbArticleId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteGroupKBArticles(long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName9,
				_methodParameterTypes9, new Object[] { groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle deleteKBArticle(
		com.liferay.knowledgebase.model.KBArticle kbArticle)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName10,
					_methodParameterTypes10,
					new Object[] { ClpSerializer.translateInput(kbArticle) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle deleteKBArticle(
		long kbArticleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName11,
					_methodParameterTypes11, new Object[] { kbArticleId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteKBArticles(long[] resourcePrimKeys)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName12,
				_methodParameterTypes12,
				new Object[] { ClpSerializer.translateInput(resourcePrimKeys) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public com.liferay.portal.model.PersistedModel deletePersistedModel(
		com.liferay.portal.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName13,
					_methodParameterTypes13,
					new Object[] { ClpSerializer.translateInput(persistedModel) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void deleteTempAttachment(long groupId, long userId,
		java.lang.String fileName, java.lang.String tempFolderName)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName14,
				_methodParameterTypes14,
				new Object[] {
					groupId,
					
				userId,
					
				ClpSerializer.translateInput(fileName),
					
				ClpSerializer.translateInput(tempFolderName)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName15,
					_methodParameterTypes15, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.DynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName16,
					_methodParameterTypes16,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<T>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName17,
					_methodParameterTypes17,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<T>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName18,
					_methodParameterTypes18,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<T>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName19,
					_methodParameterTypes19,
					new Object[] { ClpSerializer.translateInput(dynamicQuery) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName20,
					_methodParameterTypes20,
					new Object[] {
						ClpSerializer.translateInput(dynamicQuery),
						
					ClpSerializer.translateInput(projection)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Long)returnObj).longValue();
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle fetchKBArticle(
		long kbArticleId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName21,
					_methodParameterTypes21, new Object[] { kbArticleId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle fetchKBArticleByUrlTitle(
		long groupId, java.lang.String urlTitle) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName22,
					_methodParameterTypes22,
					new Object[] { groupId, ClpSerializer.translateInput(
							urlTitle) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle fetchKBArticleByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName23,
					_methodParameterTypes23,
					new Object[] { ClpSerializer.translateInput(uuid), groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle fetchLatestKBArticle(
		long resourcePrimKey, int status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName24,
					_methodParameterTypes24,
					new Object[] { resourcePrimKey, status });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle fetchLatestKBArticleByUrlTitle(
		long groupId, java.lang.String urlTitle, int status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName25,
					_methodParameterTypes25,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(urlTitle),
						
					status
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName26,
					_methodParameterTypes26, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getAllDescendantKBArticles(
		long resourcePrimKey, int status,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName27,
					_methodParameterTypes27,
					new Object[] {
						resourcePrimKey,
						
					status,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.String getBeanIdentifier() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName28,
					_methodParameterTypes28, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getCompanyKBArticles(
		long companyId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName29,
					_methodParameterTypes29,
					new Object[] {
						companyId,
						
					status,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getCompanyKBArticlesCount(long companyId, int status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName30,
					_methodParameterTypes30, new Object[] { companyId, status });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.portal.kernel.lar.PortletDataContext portletDataContext) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName31,
					_methodParameterTypes31,
					new Object[] {
						ClpSerializer.translateInput(portletDataContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getGroupKBArticles(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName32,
					_methodParameterTypes32,
					new Object[] {
						groupId,
						
					status,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getGroupKBArticlesCount(long groupId, int status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName33,
					_methodParameterTypes33, new Object[] { groupId, status });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle getKBArticle(
		long kbArticleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName34,
					_methodParameterTypes34, new Object[] { kbArticleId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle getKBArticle(
		long resourcePrimKey, int version)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName35,
					_methodParameterTypes35,
					new Object[] { resourcePrimKey, version });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticleAndAllDescendantKBArticles(
		long resourcePrimKey, int status,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName36,
					_methodParameterTypes36,
					new Object[] {
						resourcePrimKey,
						
					status,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticleAndAllDescendants(
		long resourcePrimKey, int status,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName37,
					_methodParameterTypes37,
					new Object[] {
						resourcePrimKey,
						
					status,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle getKBArticleByUrlTitle(
		long groupId, java.lang.String urlTitle)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName38,
					_methodParameterTypes38,
					new Object[] { groupId, ClpSerializer.translateInput(
							urlTitle) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle getKBArticleByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName39,
					_methodParameterTypes39,
					new Object[] { ClpSerializer.translateInput(uuid), groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticleVersions(
		long resourcePrimKey, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName40,
					_methodParameterTypes40,
					new Object[] {
						resourcePrimKey,
						
					status,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getKBArticleVersionsCount(long resourcePrimKey, int status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName41,
					_methodParameterTypes41,
					new Object[] { resourcePrimKey, status });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticles(
		long groupId, long parentResourcePrimKey, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName42,
					_methodParameterTypes42,
					new Object[] {
						groupId,
						
					parentResourcePrimKey,
						
					status,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticles(
		long[] resourcePrimKeys, int status,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName43,
					_methodParameterTypes43,
					new Object[] {
						ClpSerializer.translateInput(resourcePrimKeys),
						
					status,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticles(
		int start, int end) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName44,
					_methodParameterTypes44, new Object[] { start, end });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticlesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName45,
					_methodParameterTypes45,
					new Object[] { ClpSerializer.translateInput(uuid), companyId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getKBArticlesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName46,
					_methodParameterTypes46,
					new Object[] {
						ClpSerializer.translateInput(uuid),
						
					companyId,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getKBArticlesCount() {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName47,
					_methodParameterTypes47, new Object[] {  });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public int getKBArticlesCount(long groupId, long parentResourcePrimKey,
		int status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName48,
					_methodParameterTypes48,
					new Object[] { groupId, parentResourcePrimKey, status });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle getLatestKBArticle(
		long resourcePrimKey, int status)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName49,
					_methodParameterTypes49,
					new Object[] { resourcePrimKey, status });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle getLatestKBArticleByUrlTitle(
		long groupId, java.lang.String urlTitle, int status)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName50,
					_methodParameterTypes50,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(urlTitle),
						
					status
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName51,
					_methodParameterTypes51,
					new Object[] { ClpSerializer.translateInput(primaryKeyObj) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.portal.model.PersistedModel)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle[] getPreviousAndNextKBArticles(
		long kbArticleId)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName52,
					_methodParameterTypes52, new Object[] { kbArticleId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle[])ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getSectionsKBArticles(
		long groupId, java.lang.String[] sections, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName53,
					_methodParameterTypes53,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(sections),
						
					status,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getSectionsKBArticlesCount(long groupId,
		java.lang.String[] sections, int status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName54,
					_methodParameterTypes54,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(sections),
						
					status
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> getSiblingKBArticles(
		long groupId, long parentResourcePrimKey, int status, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName55,
					_methodParameterTypes55,
					new Object[] {
						groupId,
						
					parentResourcePrimKey,
						
					status,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public int getSiblingKBArticlesCount(long groupId,
		long parentResourcePrimKey, int status) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName56,
					_methodParameterTypes56,
					new Object[] { groupId, parentResourcePrimKey, status });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return ((Integer)returnObj).intValue();
	}

	@Override
	public java.lang.String[] getTempAttachmentNames(long groupId, long userId,
		java.lang.String tempFolderName)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName57,
					_methodParameterTypes57,
					new Object[] {
						groupId,
						
					userId,
						
					ClpSerializer.translateInput(tempFolderName)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.lang.String[])ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		throw new UnsupportedOperationException();
	}

	@Override
	public void moveKBArticle(long userId, long resourcePrimKey,
		long parentResourcePrimKey, double priority)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName59,
				_methodParameterTypes59,
				new Object[] {
					userId,
					
				resourcePrimKey,
					
				parentResourcePrimKey,
					
				priority
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public java.util.List<com.liferay.knowledgebase.model.KBArticle> search(
		long groupId, java.lang.String title, java.lang.String content,
		int status, java.util.Date startDate, java.util.Date endDate,
		boolean andOperator, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.liferay.knowledgebase.model.KBArticle> orderByComparator) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName60,
					_methodParameterTypes60,
					new Object[] {
						groupId,
						
					ClpSerializer.translateInput(title),
						
					ClpSerializer.translateInput(content),
						
					status,
						
					ClpSerializer.translateInput(startDate),
						
					ClpSerializer.translateInput(endDate),
						
					andOperator,
						
					start,
						
					end,
						
					ClpSerializer.translateInput(orderByComparator)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (java.util.List<com.liferay.knowledgebase.model.KBArticle>)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		try {
			_invokableLocalService.invokeMethod(_methodName61,
				_methodParameterTypes61,
				new Object[] { ClpSerializer.translateInput(beanIdentifier) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void subscribeGroupKBArticles(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName62,
				_methodParameterTypes62, new Object[] { userId, groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void subscribeKBArticle(long userId, long groupId,
		long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName63,
				_methodParameterTypes63,
				new Object[] { userId, groupId, resourcePrimKey });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void unsubscribeGroupKBArticles(long userId, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName64,
				_methodParameterTypes64, new Object[] { userId, groupId });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void unsubscribeKBArticle(long userId, long resourcePrimKey)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName65,
				_methodParameterTypes65,
				new Object[] { userId, resourcePrimKey });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle updateKBArticle(
		com.liferay.knowledgebase.model.KBArticle kbArticle) {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName66,
					_methodParameterTypes66,
					new Object[] { ClpSerializer.translateInput(kbArticle) });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle updateKBArticle(
		long userId, long resourcePrimKey, java.lang.String title,
		java.lang.String content, java.lang.String description,
		java.lang.String[] sections, java.lang.String[] selectedFileNames,
		long[] removeFileEntryIds,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName67,
					_methodParameterTypes67,
					new Object[] {
						userId,
						
					resourcePrimKey,
						
					ClpSerializer.translateInput(title),
						
					ClpSerializer.translateInput(content),
						
					ClpSerializer.translateInput(description),
						
					ClpSerializer.translateInput(sections),
						
					ClpSerializer.translateInput(selectedFileNames),
						
					ClpSerializer.translateInput(removeFileEntryIds),
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void updateKBArticleAsset(long userId,
		com.liferay.knowledgebase.model.KBArticle kbArticle,
		long[] assetCategoryIds, java.lang.String[] assetTagNames,
		long[] assetLinkEntryIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName68,
				_methodParameterTypes68,
				new Object[] {
					userId,
					
				ClpSerializer.translateInput(kbArticle),
					
				ClpSerializer.translateInput(assetCategoryIds),
					
				ClpSerializer.translateInput(assetTagNames),
					
				ClpSerializer.translateInput(assetLinkEntryIds)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void updateKBArticleResources(
		com.liferay.knowledgebase.model.KBArticle kbArticle,
		java.lang.String[] groupPermissions, java.lang.String[] guestPermissions)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName69,
				_methodParameterTypes69,
				new Object[] {
					ClpSerializer.translateInput(kbArticle),
					
				ClpSerializer.translateInput(groupPermissions),
					
				ClpSerializer.translateInput(guestPermissions)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void updateKBArticlesPriorities(
		java.util.Map<java.lang.Long, java.lang.Double> resourcePrimKeyToPriorityMap)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName70,
				_methodParameterTypes70,
				new Object[] {
					ClpSerializer.translateInput(resourcePrimKeyToPriorityMap)
				});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public void updatePriority(long resourcePrimKey, double priority) {
		try {
			_invokableLocalService.invokeMethod(_methodName71,
				_methodParameterTypes71,
				new Object[] { resourcePrimKey, priority });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	@Override
	public com.liferay.knowledgebase.model.KBArticle updateStatus(long userId,
		long resourcePrimKey, int status,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {
		Object returnObj = null;

		try {
			returnObj = _invokableLocalService.invokeMethod(_methodName72,
					_methodParameterTypes72,
					new Object[] {
						userId,
						
					resourcePrimKey,
						
					status,
						
					ClpSerializer.translateInput(serviceContext)
					});
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}

		return (com.liferay.knowledgebase.model.KBArticle)ClpSerializer.translateOutput(returnObj);
	}

	@Override
	public void updateViewCount(long userId, long resourcePrimKey, int viewCount)
		throws com.liferay.portal.kernel.exception.PortalException {
		try {
			_invokableLocalService.invokeMethod(_methodName73,
				_methodParameterTypes73,
				new Object[] { userId, resourcePrimKey, viewCount });
		}
		catch (Throwable t) {
			t = ClpSerializer.translateThrowable(t);

			if (t instanceof com.liferay.portal.kernel.exception.PortalException) {
				throw (com.liferay.portal.kernel.exception.PortalException)t;
			}

			if (t instanceof RuntimeException) {
				throw (RuntimeException)t;
			}
			else {
				throw new RuntimeException(t.getClass().getName() +
					" is not a valid exception");
			}
		}
	}

	private InvokableLocalService _invokableLocalService;
	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName19;
	private String[] _methodParameterTypes19;
	private String _methodName20;
	private String[] _methodParameterTypes20;
	private String _methodName21;
	private String[] _methodParameterTypes21;
	private String _methodName22;
	private String[] _methodParameterTypes22;
	private String _methodName23;
	private String[] _methodParameterTypes23;
	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName26;
	private String[] _methodParameterTypes26;
	private String _methodName27;
	private String[] _methodParameterTypes27;
	private String _methodName28;
	private String[] _methodParameterTypes28;
	private String _methodName29;
	private String[] _methodParameterTypes29;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
	private String _methodName35;
	private String[] _methodParameterTypes35;
	private String _methodName36;
	private String[] _methodParameterTypes36;
	private String _methodName37;
	private String[] _methodParameterTypes37;
	private String _methodName38;
	private String[] _methodParameterTypes38;
	private String _methodName39;
	private String[] _methodParameterTypes39;
	private String _methodName40;
	private String[] _methodParameterTypes40;
	private String _methodName41;
	private String[] _methodParameterTypes41;
	private String _methodName42;
	private String[] _methodParameterTypes42;
	private String _methodName43;
	private String[] _methodParameterTypes43;
	private String _methodName44;
	private String[] _methodParameterTypes44;
	private String _methodName45;
	private String[] _methodParameterTypes45;
	private String _methodName46;
	private String[] _methodParameterTypes46;
	private String _methodName47;
	private String[] _methodParameterTypes47;
	private String _methodName48;
	private String[] _methodParameterTypes48;
	private String _methodName49;
	private String[] _methodParameterTypes49;
	private String _methodName50;
	private String[] _methodParameterTypes50;
	private String _methodName51;
	private String[] _methodParameterTypes51;
	private String _methodName52;
	private String[] _methodParameterTypes52;
	private String _methodName53;
	private String[] _methodParameterTypes53;
	private String _methodName54;
	private String[] _methodParameterTypes54;
	private String _methodName55;
	private String[] _methodParameterTypes55;
	private String _methodName56;
	private String[] _methodParameterTypes56;
	private String _methodName57;
	private String[] _methodParameterTypes57;
	private String _methodName59;
	private String[] _methodParameterTypes59;
	private String _methodName60;
	private String[] _methodParameterTypes60;
	private String _methodName61;
	private String[] _methodParameterTypes61;
	private String _methodName62;
	private String[] _methodParameterTypes62;
	private String _methodName63;
	private String[] _methodParameterTypes63;
	private String _methodName64;
	private String[] _methodParameterTypes64;
	private String _methodName65;
	private String[] _methodParameterTypes65;
	private String _methodName66;
	private String[] _methodParameterTypes66;
	private String _methodName67;
	private String[] _methodParameterTypes67;
	private String _methodName68;
	private String[] _methodParameterTypes68;
	private String _methodName69;
	private String[] _methodParameterTypes69;
	private String _methodName70;
	private String[] _methodParameterTypes70;
	private String _methodName71;
	private String[] _methodParameterTypes71;
	private String _methodName72;
	private String[] _methodParameterTypes72;
	private String _methodName73;
	private String[] _methodParameterTypes73;
}