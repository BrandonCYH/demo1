package com.demo1.demo1.controller;

import com.demo1.demo1.model.SystemConfiguration;
import com.demo1.demo1.repository.SystemConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class SystemController {
    @Autowired
    private SystemConfigurationRepository systemConfigurationRepository;

    @GetMapping
    public String addProduct() {
        SystemConfiguration systemConfiguration1 = new SystemConfiguration();
        SystemConfiguration systemConfiguration2 = new SystemConfiguration();
        SystemConfiguration systemConfiguration3 = new SystemConfiguration();

        systemConfiguration1.setUser("John");
        systemConfiguration1.setRole("admin");
        systemConfiguration1.setProduct("AmeenWear Classic Hoodie");
        systemConfiguration1.setCategory("Apparel");

        systemConfiguration2.setUser("Lily");
        systemConfiguration2.setRole("admin");
        systemConfiguration2.setProduct("AmeenPure Olive Oil Soap");
        systemConfiguration2.setCategory("Organic Soap");

        systemConfiguration3.setUser("Brandon");
        systemConfiguration3.setRole("admin");
        systemConfiguration3.setProduct("AmeenHarvest Wildflower Honey");
        systemConfiguration3.setCategory("Honey");

        systemConfigurationRepository.save(systemConfiguration1);
        systemConfigurationRepository.save(systemConfiguration2);
        systemConfigurationRepository.save(systemConfiguration3);

        return "index.html";
    }
}
