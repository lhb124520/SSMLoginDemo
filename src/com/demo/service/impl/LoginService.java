package com.demo.service.impl;

import com.demo.dao.ILoginDao;
import com.demo.entity.UserInfo;
import com.demo.service.ILoginService;

public class LoginService implements ILoginService{
	private ILoginDao dao;	

	

	@Override
	public String login(UserInfo user) {		 
		 UserInfo _user = dao.getUserByName(user.getUserID());
		 System.out.println("输入的员工号:"+user.getUserID());
		 System.out.println("输入的密码:"+user.getPassword());
		if (_user == null)
            return "has no user " +user.getUserID();
        if (!_user.getPassword().equals(user.getPassword()))
            return "invalida password";
        
        if (_user.getPosition().equals("系统管理员"))
            return "login Admin";
        if (_user.getPosition().equals("收银员"))
            return "login Cashier";
        if (_user.getPosition().equals("采购员"))
            return "login Buyer";
        if (_user.getPosition().equals("顾客"))
            return "login Customer";
        return "login success";
	}
	public void setDao(ILoginDao dao) {
		this.dao = dao;
	}
}
