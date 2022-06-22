package jp.rena.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// @Configuration
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    // 加载 Spring 配置类中的信息,初始化 Spring 容器
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SpringConfig.class };
    }

    // 加载 Spring 配置类中的信息,初始化 Spring MVC 容器
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { SpringMVCConfig.class };
    }

    // 配置 DispatchServlet 的映射路径
    @Override
    protected String[] getServletMappings() {
        // return new String[] { "/*" };
        return new String[] { "/" };
    }

}
