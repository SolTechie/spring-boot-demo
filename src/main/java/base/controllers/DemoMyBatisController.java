package base.controllers;

import base.models.DemoBatis;
import base.service.DemoMyBatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMyBatisController {

    @Autowired
    private DemoMyBatisService demoMyBatisService;

    @RequestMapping("/myBatisAnnoDemo")
    public DemoBatis myBatisAnnoDemo(@RequestParam(value = "id", defaultValue = "1") String id) {
        return demoMyBatisService.getDemoAnnoBatis(id);
    }

    @RequestMapping("/myBatisXmlDemo")
    public DemoBatis myBatisXmlDemo(@RequestParam(value = "id", defaultValue = "1") String id) {
        return demoMyBatisService.getDemoXmlBatis(id);
    }

    @RequestMapping("/delBatisXmlDemo")
    public Integer delBatisXmlDemo(@RequestParam(value = "id", defaultValue = "1") String id) {
        return demoMyBatisService.delDemoXmlBatis(id);
    }

    @RequestMapping(value = "/changeDemoName")
    public Integer changeDemoName(@RequestParam(value = "id") String id, @RequestParam(value = "name") String name) {
        try {
            return demoMyBatisService.changeName(id, name);
        } catch (Exception e) {
            return e.hashCode();
        }
    }

}
