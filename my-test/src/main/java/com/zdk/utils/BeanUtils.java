package com.zdk.utils;

import org.springframework.context.ApplicationContext;

public class BeanUtils {

	public static void printAllBeans(ApplicationContext applicationContext) {
		String[] beans =applicationContext
				.getBeanDefinitionNames();
		System.err.println("一共有："+ applicationContext.getBeanDefinitionCount());
		for (String beanName : beans) {
			Class<?> beanType = applicationContext
					.getType(beanName);
			System.out.println("BeanName:" + beanName);
			System.out.println("Bean的类型：" + beanType);
			System.out.println("Bean所在的包：" + beanType.getPackage());
			System.out.println("Bean：" + applicationContext.getBean(
					beanName));
		}
	}


}
