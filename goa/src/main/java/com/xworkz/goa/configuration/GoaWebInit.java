package com.xworkz.goa.configuration;

import java.util.Arrays;


import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GoaWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
   implements WebMvcConfigurer{
	
	public GoaWebInit() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses");
		Class[] ref= {GoaConfiguration.class};
		return ref;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses");
		Class[] configClass = {GoaConfiguration.class };
		//System.out.println("configClass" + Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings");
		String[] ref1 = { "/" };
		System.out.println("getServletMappings:" + Arrays.toString(ref1));
		return ref1;

	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("created configureDefaultServletHandling");
		configurer.enable();
	}


}
