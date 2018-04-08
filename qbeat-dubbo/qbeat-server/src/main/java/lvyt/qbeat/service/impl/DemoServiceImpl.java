package lvyt.qbeat.service.impl;

import lvyt.qbeat.service.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author by lvyt
 *         on 2018/4/4.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService{

    @Override
    public String test(String name) {
        return String.format("Hello %s",name);
    }

}
