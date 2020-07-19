package com.zdk;

import com.zdk.service.AopServiceTest;
import com.zdk.utils.BeanUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(value = "com.zdk")
@EnableAspectJAutoProxy
public class MainConfig {
	public static void main(String[] args) {
		ApplicationContext  applicationContext =
				new AnnotationConfigApplicationContext(MainConfig.class);
		//BeanUtils.printAllBeans(applicationContext);
		AopServiceTest test = (AopServiceTest)applicationContext.getBean("aopServiceTest");
		test.logTest();
	}



}
