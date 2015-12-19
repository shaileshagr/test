
package com.nike.config;

/**
 * Description : To bootstrap the spring application along with other
 * configurations. Defining application properties here to drive application
 * specific property approach
 * 
 * @author rranja
 * @author arao3
 * @author dmally
 * @since 3/4/2015 10:21 AM
 */

import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



@Order(1)
public class ApplicationConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] { };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //return new Class<?>[] { ComponentScanerConfig.class, WebApplicationConfig.class ,IntegrationSecurityConfig.class};
//        return new Class<?>[] { WebApplicationConfig.class};
        return new Class<?>[] { WebApplicationConfig.class ,IntegrationSecurityConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/rest/*" };
    }


    
    
}
