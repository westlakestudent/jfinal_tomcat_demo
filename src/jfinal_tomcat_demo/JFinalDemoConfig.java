package jfinal_tomcat_demo;

import jfinal_tomcat_demo.controllers.HelloController;
import jfinal_tomcat_demo.controllers.IndexController;
import jfinal_tomcat_demo.controllers.UserController;
import jfinal_tomcat_demo.model.User;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;

public class JFinalDemoConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants constants) {
		loadPropertyFile("jdbc.properties");
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
	public void configPlugin(Plugins plugins) {
		String jdbcurl = getProperty("jdbcUrl");
		String user = getProperty("user");
		String password = getProperty("password");
		C3p0Plugin c30plugin = new C3p0Plugin(jdbcurl,
				user, password);
		plugins.add(c30plugin);
		ActiveRecordPlugin ac = new ActiveRecordPlugin(c30plugin);
		plugins.add(ac);
		ac.addMapping("user", User.class);
	}

	@Override
	public void configRoute(Routes routes) {
		routes.add("/", IndexController.class, "/pages");
		routes.add("/hello", HelloController.class);
		routes.add("/user", UserController.class);
	}

}
