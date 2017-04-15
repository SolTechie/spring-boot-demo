package base.service.impl;

import base.service.AutowiredService;
import org.springframework.stereotype.Service;

//@Component @Repository
@Service
public class AutowiredServiceAnnyImpl implements AutowiredService {
    @Override
    public String echo() {
        return "this is anny";
    }
}
