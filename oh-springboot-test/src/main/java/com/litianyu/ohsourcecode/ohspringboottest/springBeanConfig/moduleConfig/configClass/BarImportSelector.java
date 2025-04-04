package com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.configClass;

import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.componentClass.Bar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {

	// BarImportSelector 本身不会被注入到容器中

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// 必须是类的全限定名
		return new String[]{Bar.class.getName(), BarConfiguration.class.getName()};
	}
}
