package com.xingyun.singlearchitecturespringbootshoppingsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication annotation extends
 * @EnableAutoConfiguration (resolve the annotation with AutoConfigurationImportSelector.class),
 * @ComponentScan (resolve the bean name with BeanNameGenerator.class,
 *                 resolve the bean scope with AnnotationScopeMetadataResolver)
 * @Configuration (resolve the annotation with the Component.class annotation)
 * ----------------------------------
 * default EnableAutoConfiguration and do some default config of start.* Class library
 * default mark the current class is component class and Instantiate an object
 * default scan package com.xingyun.singlearchitecturespringbootshoppingsample.**
 * @author qing-feng.zhao
 */
@SpringBootApplication
public class SingleArchitectureSpringBootShoppingSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleArchitectureSpringBootShoppingSampleApplication.class, args);
    }
}
