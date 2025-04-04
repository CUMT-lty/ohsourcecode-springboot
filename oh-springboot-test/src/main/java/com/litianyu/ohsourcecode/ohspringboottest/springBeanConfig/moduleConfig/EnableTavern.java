package com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig;

import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.componentClass.Boss;
import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.configClass.BarImportSelector;
import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.configClass.BartenderConfiguration;
import com.litianyu.ohsourcecode.ohspringboottest.springBeanConfig.moduleConfig.configClass.WaiterRegister;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 场景是一个酒馆，需要将吧台、调酒师、、服务员、老板，这四种不同实体元素都导入到酒馆中
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // 表示该注解只能用于类、接口、枚举或注解声明上。
@Import({Boss.class, BartenderConfiguration.class, BarImportSelector.class, WaiterRegister.class}) // 会被 @EnableTavern 注解携带着一起导入
public @interface EnableTavern {

}
