package jfinal_tomcat_demo.controllers;

import jfinal_tomcat_demo.model.User;
import jfinal_tomcat_demo.validators.UserValidator;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

/**
 *
 * UserController
 * @author chendong
 * 2014年11月17日 上午10:43:18
 * @version 1.0.0
 *
 */
public class UserController extends Controller {
	public void index(){
		setAttr("userList", User.dao.findAll());
		render("user.jsp");
	}
	
	public void add(){}
	
	@Before(UserValidator.class)
	public void save() {
		getModel(User.class).save();
		redirect("/user");
	}
	
	public void edit() {
		setAttr("user", User.dao.findById(getParaToInt()));
	}
	
	@Before(UserValidator.class)
	public void update(){
		getModel(User.class).update();
		redirect("/user");
	}
	
	public void delete(){
		getModel(User.class).deleteById(getParaToInt());
		redirect("/user");
	}

}
