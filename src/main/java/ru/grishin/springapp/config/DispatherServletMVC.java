package ru.grishin.springapp.config;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;


/**
 *
 * @author grish
 */
public class DispatherServletMVC extends AbstractAnnotationConfigDispatcherServletInitializer{
 
    @Override
    protected Class<?>[] getRootConfigClasses(){
        return null;
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class[] {SpringConfig.class};
    }
    
    @Override
    protected String[] getServletMappings(){
        return new String[] {"/"};
    }
    
}
