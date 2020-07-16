package com.zdk;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.zdk")
@Import(com.zdk.TestBean.class)
public class AppConfig {
}
