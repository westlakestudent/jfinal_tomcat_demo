package jfinal_tomcat_demo.controllers;


import jfinal_tomcat_demo.interceptors.HelloInterceptor;

import com.jfinal.aop.Before;
import com.jfinal.core.ActionKey;
import com.jfinal.core.Controller;

@Before(HelloInterceptor.class)
public class HelloController extends Controller {

	public void say(){
		renderText("Hello JFianl World!");
	}
	
	public void index(){
		renderText("method index() is the default method.");
	}
	
	@ActionKey("/jack")
	public void jack(){
		renderText("use the @actionkey");
	}
}
