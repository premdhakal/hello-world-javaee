
package com.soccerPlayers.Form;

import org.apache.struts.action.ActionForm;

public class UserLoginBeanForm extends ActionForm {

	private static final long serialVersionUID = 1341061406990264176L;

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
