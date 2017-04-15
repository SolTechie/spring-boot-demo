package base.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DemoConfigService {

    @Value(value = "${spring.configVar1}")
    private String configVar1;

    // classpath:config/ 会覆盖 classpath下的configVar2
    @Value(value = "${spring.configVar2}")
    private String configVar2;

    @Value(value = "${configVar3}")
    private String configVar3;

    public String getConfigValue() {
        return "var1: " + configVar1 + " var2:" + configVar2 + " var3:" + configVar3;
    }
}
