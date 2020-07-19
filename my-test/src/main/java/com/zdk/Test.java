package com.zdk;

import com.zdk.utils.BeanUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ZhangDongkun
 * @date：2019/12/5
 * @description：
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		BeanUtils.printAllBeans(applicationContext);


	}
}

