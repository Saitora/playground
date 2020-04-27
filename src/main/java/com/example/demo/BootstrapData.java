package com.example.demo;

import com.example.demo.dao.repository.TipsRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements InitializingBean {

    @Autowired
    private TipsRepository tipsRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        tipsRepository.save("Tip one");
        tipsRepository.save("Tip two");
        tipsRepository.save("Tip three");
        tipsRepository.save("Tip four");
        tipsRepository.save("Tip five");
    }

}
