package com.demo.action;

import com.demo.entity.UserInfo;
import com.demo.service.ILoginService;

public class LoginAction {
	private ILoginService service;
	private String UserID;
	private String UserName;
	private String Password;
	private String Sex;
	private String Phone;
	private String Address;
	private String position;
	private UserInfo userInfo;
	private String errMsg;
	private String tip;

	public String login() {
		System.out.println("LoginAction输入的员工号:"+UserID);
		System.out.println("LoginAction输入的密码:"+Password);
		String result = service.login(new UserInfo(UserID, UserName, Password, Sex, Phone, Address, position));
		System.out.println("result:" + result);
		if ("login Admin".equals(result)) {

			return "login Admin";
		}
		if ("login Cashier".equals(result)) {

			return "login Cashier";
		}
		if ("login Buyer".equals(result)) {

			return "login Buyer";
		}
		if ("login Customer".equals(result)) {

			return "login customer";
		}
		if ("login success".equals(result)) {

			return "success";
		}
		tip = result;
		return "failure";
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public ILoginService getService() {
		return service;
	}

	public void setService(ILoginService service) {
		this.service = service;
	}

	public String getUserID() {
		return UserID;
	}

	public void setUserID(String userID) {
		UserID = userID;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

}
