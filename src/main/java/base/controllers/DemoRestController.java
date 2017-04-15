package base.controllers;

import base.models.Demo;
import base.service.DemoRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * rest controller的样例，返回json串，配合@RestController的注解，返回对象中有get方法的值组成json串返回
 */
@RestController
public class DemoRestController {

    @Autowired
    private DemoRestService demoRestService;

    //取单个
    @RequestMapping("/getDemoInfo")
    public Demo getDemoInfo(@RequestParam(value = "id") int id, @RequestParam(value = "nm", defaultValue = "no_one") String name) {
        return demoRestService.getDemoInfo(id, name);
    }

    //批量取
    @RequestMapping("/getDemoInfos")
    public List<Demo> getDemoInfos(@RequestParam(value = "ids") String ids) {
        return demoRestService.getDemoInfos(ids);
    }

}
