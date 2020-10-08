package com.soccerPlayers.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.soccerPlayers.Form.UserLoginBeanForm;

public class UserLoginAction extends Action {

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		UserLoginBeanForm loginForm = (UserLoginBeanForm) form;
		System.out.println("In User Login Action Class");
		System.out.println(loginForm.getUserName());
		System.out.println(loginForm.getPassword());
		request.setAttribute("userName", loginForm.getUserName());
		request.setAttribute("password", loginForm.getPassword());

		return mapping.findForward("success");
	}
}