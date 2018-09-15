package pl.abbl.blog.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import pl.abbl.blog.config.hibernate.HibernateConf;
import pl.abbl.blog.config.security.SecurityConf;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
        		SecurityConf.class
        };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebApplicationContextConfig.class
        };
    }

    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }
}
