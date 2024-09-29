package com.interceptor.interceptor.config;



import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RequestInterceptorConfig implements WebMvcConfigurer {

    // Register an interceptor with the registry, Interceptor name : RequestInterceptor
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RequestInterceptor());
    }
    //* We can register any number of interceptors with our spring application context
}


