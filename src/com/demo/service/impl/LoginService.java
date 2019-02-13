package com.demo.service.impl;

import com.demo.dao.ILoginDao;
import com.demo.entity.UserInfo;
import com.demo.service.ILoginService;

public class LoginService implements ILoginService{
	private ILoginDao dao;	

	

	@Override
	public String login(UserInfo user) {		 
		 UserInfo _user = dao.getUserByName(user.getUserID());
		 System.out.println("�����Ա����:"+user.getUserID());
		 System.out.println("���������:"+user.getPassword());
		if (_user == null)
            return "has no user " +user.getUserID();
        if (!_user.getPassword().equals(user.getPassword()))
            return "invalida password";
        
        if (_user.getPosition().equals("ϵͳ����Ա"))
            return "login Admin";
        if (_user.getPosition().equals("����Ա"))
            return "login Cashier";
        if (_user.getPosition().equals("�ɹ�Ա"))
            return "login Buyer";
        if (_user.getPosition().equals("�˿�"))
            return "login Customer";
        return "login success";
	}
	public void setDao(ILoginDao dao) {
		this.dao = dao;
	}
}
