package base.service;

import base.models.Demo;

import java.util.List;

public interface DemoRestService {

    public String[] names = new String[]{"jack", "tom", "clark", "joy"};

    public Demo getDemoInfo(int id, String name);

    public List<Demo> getDemoInfos(String ids);
}
