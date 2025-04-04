package com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.configClass;

import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.componentClass.Waiter;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 通过 bean definition 定义导入
 */
public class WaiterRegister implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
		registry.registerBeanDefinition("waiter", new RootBeanDefinition(Waiter.class));
	}
}
