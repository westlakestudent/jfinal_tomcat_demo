package jfinal_tomcat_demo.interceptors;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;
import com.jfinal.core.Controller;

public class HelloInterceptor implements Interceptor {

	public void intercept(ActionInvocation ai) {
		String method = ai.getMethodName();
		 Controller controller = ai.getController();
		if(method.equals("jack"))
			ai.invoke();
		else
			controller.redirect("/pages/404.jsp");
			
	}

}
