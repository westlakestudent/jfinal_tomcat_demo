package jfinal_tomcat_demo;


import jfinal_tomcat_demo.controllers.HelloController;
import jfinal_tomcat_demo.controllers.IndexController;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;

public class JFinalDemoConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants constants) {
		constants.setDevMode(true);
		constants.setViewType(ViewType.JSP);
	}

	@Override
	public void configHandler(Handlers arg0) {

	}

	@Override
	public void configInterceptor(Interceptors arg0) {

	}

	@Override
	public void configPlugin(Plugins arg0) {

	}

	@Override
	public void configRoute(Routes routes) {
		routes.add("/", IndexController.class,"/pages");
		routes.add("/hello", HelloController.class);
	}

}
