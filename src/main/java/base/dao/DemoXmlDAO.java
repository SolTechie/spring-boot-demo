package base.dao;

import base.models.DemoBatis;
import org.apache.ibatis.annotations.Param;

public interface DemoXmlDAO {

    DemoBatis getDemoById(String id);

    int deleteDemoById(String id);

    int updateName(@Param(value = "id") String id, @Param(value = "name") String name);
}
