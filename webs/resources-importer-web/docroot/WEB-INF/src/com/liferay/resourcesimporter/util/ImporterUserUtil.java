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

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
public class ImporterUserUtil {

	public static User getImportUser(
		ServiceContext serviceContext, String userUuid, String userIdAsString,
		String userScreenName)
		throws Exception {

		User user = null;
		long userId = 0;
		long companyId = serviceContext.getCompanyId();

		if (Validator.isNotNull(userUuid)) {
			try {
				user =
					UserLocalServiceUtil.getUserByUuidAndCompanyId(
						userUuid, companyId);
			}
			catch (Exception e) {
			}
		}
		else if (Validator.isNotNull(userIdAsString)) {
			userId = Long.parseLong(userIdAsString);
			user = UserLocalServiceUtil.fetchUserById(userId);
		}
		else if (Validator.isNotNull(userScreenName)) {
			user =
				UserLocalServiceUtil.fetchUserByScreenName(
					companyId, userScreenName);
		}

		if (user != null) {
			userId = user.getUserId();
		}
		else {
			userId = serviceContext.getUserId();
			user = UserLocalServiceUtil.getUser(userId);
		}

		return user;
	}
}