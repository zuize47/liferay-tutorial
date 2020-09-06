package hoangnd.learn.service;

import com.liferay.portal.kernel.service.UserLocalService;

public abstract class AbstractService {

    private final UserLocalService userLocalService;

    protected AbstractService(UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }
}
