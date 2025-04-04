package com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig;

import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.componentClass.Bar;
import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.componentClass.Bartender;
import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.componentClass.Boss;
import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.componentClass.Waiter;
import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.configClass.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class TavernApplication {
	public static void main(String[] args) {
		// 注意获取的是哪个组件的 bean 上下文
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
		// 看下组件下的 bean 列表
		System.out.println("BeanDefinitionNames===>");
		Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
		// 1. 导入单个 bean
		System.out.println("Boss===>");
		Boss boss = ctx.getBean(Boss.class);
		System.out.println(boss);
		// 2. 通过配置类导入
		System.out.println("Bartender===>");
		Map<String, Bartender> bartenderMap = ctx.getBeansOfType(Bartender.class);
		bartenderMap.forEach((name, bartender) -> System.out.println(name + bartender));
		// 3. 通过 ImportSelector 导入
		System.out.println("Bar===>");
		ctx.getBeansOfType(Bar.class).forEach((name, bar) -> System.out.println(name + bar));
		// 4. 通过 ImportBeanDefinitionRegistrar 导入
		System.out.println("Waiter===>");
		ctx.getBeansOfType(Waiter.class).forEach((name, waiter) -> System.out.println(name + waiter));
	}
}
