package com.zdk;

import com.zdk.domain.RainBow;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		//指定Bean定义信息；（Bean的类型，Bean。。。）
		RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
		//注册一个Bean，指定bean名
		registry.registerBeanDefinition("rainBow", beanDefinition);


	}
}