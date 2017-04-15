package base.service.impl;

import base.service.AutowiredService;
import org.springframework.stereotype.Repository;

//@Component @Service
@Repository
public class AutowiredServiceBobImpl implements AutowiredService {
    @Override
    public String echo() {
        return "this is bob";
    }
}
