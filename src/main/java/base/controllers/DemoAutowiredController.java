package base.controllers;

import base.service.AutowiredService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DemoAutowiredController {

    //有多个实现类时，用@Qualifier 标识具体的实现类
    @Autowired
    @Qualifier("autowiredServiceAnnyImpl")
    private AutowiredService autowiredAnnyService;

    //也可以用Resource 指明name
    @Resource(name = "autowiredServiceBobImpl")
    private AutowiredService autowiredBobService;

    @RequestMapping("/getAnny")
    public String getAnny(){
        return autowiredAnnyService.echo();
    }

    @RequestMapping("/getBob")
    public String getBob(){
        return autowiredBobService.echo();
    }
}
