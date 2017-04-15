package base.service.impl;

import base.models.Demo;
import base.service.DemoRestService;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Service @Repository
@Component
public class DemoRestServiceImpl implements DemoRestService {

    @Override
    public List<Demo> getDemoInfos(String ids) {
        List<Demo> demos = new ArrayList<Demo>();
        String[] idArr = StringUtils.split(ids, ",");
        for (String id : idArr) {
            demos.add(new Demo(Integer.parseInt(id), names[RandomUtils.nextInt(0, 4)]));
        }
        return demos;
    }

    @Override
    public Demo getDemoInfo(int id, String name) {
        Demo user = new Demo(id, name);
        return user;
    }
}
