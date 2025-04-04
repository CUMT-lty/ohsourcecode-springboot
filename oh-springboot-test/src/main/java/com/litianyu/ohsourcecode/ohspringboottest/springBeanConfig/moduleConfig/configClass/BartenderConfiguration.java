package com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.configClass;

import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.componentClass.Bartender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过配置类导入
 */
@Configuration
public class BartenderConfiguration {

	// BartenderConfiguration 也会被注入到容器中

	@Bean
	public Bartender bartender1() {
		return new Bartender("bartender1");
	}

	@Bean
	public Bartender bartender2() {
		return new Bartender("bartender2");
	}

	@Bean
	public Bartender bartender3() {
		return new Bartender("bartender3");
	}
}
