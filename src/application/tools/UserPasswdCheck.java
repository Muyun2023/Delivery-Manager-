package application.tools;

import java.util.regex.Pattern;

public class UserPasswdCheck {
	
	public  static boolean isValidUserName(String userName) {
		String patternName = "^[a-zA-Z]\\w{5,19}$";
		boolean matchName = Pattern.matches(patternName, userName);
		if(matchName) {
			return true;
		}
		return false;
	}
	
	public static boolean isValidPassword(String password) {
		String patternPasswd = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^\\w\\s]).{8,30}$";		//密码包含字母、数字和特殊字符
		boolean matchPasswd = Pattern.matches(patternPasswd, password);
		if(matchPasswd) {
			return true;
		}
		return false;
	}
	
	public static boolean isValidMail(String mail) {
		String patternMail = "^\\w[\\w_-]+@[\\w_-]+(\\.[\\w]+)+$";
		boolean  matchMail = Pattern.matches(patternMail, mail);
		if(matchMail) {
			return true;
		}
		return false;
	}

}
