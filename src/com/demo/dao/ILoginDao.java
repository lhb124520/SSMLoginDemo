package com.demo.dao;

import com.demo.entity.UserInfo;

public interface ILoginDao {
   UserInfo getUserByName(String UserID);
}
