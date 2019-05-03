package com.example.zuulproxyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.filters.ErrorFilter;
import com.example.filters.PostFilter;
import com.example.filters.PreFilter;
import com.example.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
//@ComponentScan("com.example")
public class ZuulProxyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyServiceApplication.class, args);
	}
	
	 @Bean
	    public PreFilter preFilter() {
	        return new PreFilter();
	    }
	    @Bean
	    public PostFilter postFilter() {
	        return new PostFilter();
	    }
	    @Bean
	    public ErrorFilter errorFilter() {
	        return new ErrorFilter();
	    }
	    @Bean
	    public RouteFilter routeFilter() {
	        return new RouteFilter();
	    }

}
