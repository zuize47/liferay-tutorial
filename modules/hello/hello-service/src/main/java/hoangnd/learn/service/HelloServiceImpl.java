package hoangnd.learn.service;

import com.liferay.portal.kernel.service.UserLocalService;
import hoangnd.learn.api.HelloService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

/**
 * @author hoang
 */
@Component(
        immediate = true,
        service = HelloService.class
)
public class HelloServiceImpl extends AbstractService implements HelloService {

    @Activate
    public HelloServiceImpl(UserLocalService userLocalService) {
        super(userLocalService);
    }

    @Override
    public String sayHi(String name) {
        return "Hi " + name;
    }
}