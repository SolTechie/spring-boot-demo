package base.dao;

import base.models.DemoBatis;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DemoAnnoDAO {
    @Select("SELECT * FROM demos WHERE id = #{id}")
    DemoBatis getDemo(@Param("id") String id);
}
