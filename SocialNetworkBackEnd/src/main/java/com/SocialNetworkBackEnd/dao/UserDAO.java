package com.SocialNetworkBackEnd.dao;

import org.springframework.stereotype.Service;

//import java.util.List;

import com.SocialNetworkBackEnd.Model.UserDetail;

@Service
public interface UserDao {

     public boolean addUser(UserDetail user);
     public boolean updateOnlineStatus(String status,UserDetail user);
	 //boolean saveUser(User user);
}