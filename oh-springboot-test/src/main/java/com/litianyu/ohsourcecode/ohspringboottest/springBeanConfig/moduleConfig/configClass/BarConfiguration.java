package com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.configClass;

import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.componentClass.Bar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {

	@Bean
	public Bar bar1() {
		return new Bar();
	}
}
