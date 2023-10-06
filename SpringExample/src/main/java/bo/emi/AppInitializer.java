package bo.emi;

import bo.emi.configuration.AppContext;
import bo.emi.configuration.WebMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected String[] getServletMappings() {
        return new String[] {
                "/"
        };
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {
                AppContext.class
        };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {
                WebMvcConfig.class
        };
    }
}
