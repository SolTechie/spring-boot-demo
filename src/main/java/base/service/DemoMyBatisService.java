package base.service;

import base.dao.DemoAnnoDAO;
import base.dao.DemoXmlDAO;
import base.models.DemoBatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DemoMyBatisService {

    @Autowired
    private DemoAnnoDAO demoBatisDAO;

    @Autowired
    private DemoXmlDAO demoXmlDAO;

    public DemoBatis getDemoAnnoBatis(String id) {
        return demoBatisDAO.getDemo(id);
    }

    public DemoBatis getDemoXmlBatis(String id) {
        return demoXmlDAO.getDemoById(id);
    }

    public Integer delDemoXmlBatis(String id) {
        return demoXmlDAO.deleteDemoById(id);
    }

    @Transactional
    public Integer changeName(String id, String name) throws Exception {
        Integer code = demoXmlDAO.updateName(id, name);
        if (code > 0) {
//            注意 RuntimeException 才会导致事物回滚
            throw new RuntimeException("1234");
        }
        return code;
    }
}
