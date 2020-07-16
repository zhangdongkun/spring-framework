package com.zdk;

import com.zdk.domain.Person;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
@Import({MyBeanDefinitionRegister.class})
public class MainConfig {
	@Bean
	@Conditional({LinuxCondition.class})
	public Person person01(){
		return  new Person("Bill",10);
	}

	@Bean
	public Person person02(){
		return  new Person("lcs",10);
	}
}
