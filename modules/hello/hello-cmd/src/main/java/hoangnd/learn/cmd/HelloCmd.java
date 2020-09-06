package hoangnd.learn.cmd;

import hoangnd.learn.api.HelloService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@Component(
        immediate = true,
        property = {
                "osgi.command.scope=hello",
                "osgi.command.function=hi"
        }
)
public class HelloCmd {

    private final HelloService helloService;

    @Activate
    public HelloCmd(HelloService helloService) {
        this.helloService = helloService;
    }
    public void hi(String name){
        System.out.println(this.helloService.sayHi(name));
    }
}