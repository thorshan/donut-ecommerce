package com.donutecommerce.donutecommerce.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/shop").setViewName("shop");
        registry.addViewController("/cart").setViewName("cart");
        registry.addViewController("/view/product").setViewName("view_product");
        registry.addViewController("/categories").setViewName("category");
        registry.addViewController("/categories/add").setViewName("add_category");
        registry.addViewController("/products/add").setViewName("add_product");
        registry.addViewController("/admin/dashboard").setViewName("admin_dashboard");
        registry.addViewController("/products").setViewName("product");
        registry.addViewController("/check-out").setViewName("checkout");
    }
}
