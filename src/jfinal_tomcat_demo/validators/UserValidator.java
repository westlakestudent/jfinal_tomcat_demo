package jfinal_tomcat_demo.validators;

import jfinal_tomcat_demo.model.User;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

/**
 *
 * UserValidator
 * @author chendong
 * 2014年11月17日 上午11:26:17
 * @version 1.0.0
 *
 */
public class UserValidator extends Validator{

	@Override
	protected void handleError(Controller c) {
		c.keepModel(User.class);
		String actionKey = getActionKey();
		if (actionKey.equals("/user/save"))
			c.render("add.jsp");
		else if (actionKey.equals("/user/update"))
			c.render("edit.jsp");
	}

	@Override
	protected void validate(Controller c) {
		validateRequiredString("user.username", "username", "请输入姓名!");
		validateRequiredString("user.email", "email", "请输入邮箱地址!");
	}

}
