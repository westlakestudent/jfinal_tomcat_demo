package jfinal_tomcat_demo.model;

import com.jfinal.plugin.activerecord.Model;

/**
 *
 * User
 * @author chendong
 * 2014年11月13日 下午4:01:29
 * @version 1.0.0
 *
 */
public class User extends Model<User> {

	private static final long serialVersionUID = 4394092697970466642L;
	
	public static final User dao = new User();

}
