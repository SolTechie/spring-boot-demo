package base.controllers;

import base.service.DemoConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoConfigController {

    @Autowired
    private DemoConfigService demoConfigService;

    @RequestMapping("/getConfigValue")
    public String getConfigValue() {
        return demoConfigService.getConfigValue();
    }

}
