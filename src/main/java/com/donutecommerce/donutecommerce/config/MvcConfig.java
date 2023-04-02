package com.donutecommerce.donutecommerce.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("/index");
        registry.addViewController("/login").setViewName("/login");
        registry.addViewController("/register").setViewName("/register");
        registry.addViewController("/shop").setViewName("/shop");
        registry.addViewController("/cart").setViewName("/cart");
        registry.addViewController("/view/product").setViewName("/view_product");
        registry.addViewController("/categories").setViewName("/category");
        registry.addViewController("/categories/add").setViewName("/add_category");
        registry.addViewController("/products/add").setViewName("/add_product");
        registry.addViewController("/admin/dashboard").setViewName("/admin_dashboard");
        registry.addViewController("/products").setViewName("/product");
        registry.addViewController("/check-out").setViewName("/checkout");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/");
    }
}
