package com.wzp.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.wzp.dao.UserDao;
import com.wzp.dto.UserDto;
import com.wzp.service.UserService;

@Service("userService")   //Spring注解有初始化作用，创建UserServiceImpl这个类的一个实例化对象名字为userService--> = UserServiceImpl userService = new UserServiceImpl()
@Transactional   //Spring注解，当进行数据库操作出现异常的时候，进行事务回滚
public class UserServiceImpl implements UserService{
  @Resource(name="UserDao")
  private UserDao userdao;   //Spring注解有初始化作用，用于获取名字为UserDao的实例化对象,即UserDaoimpl类中的@Repository("UserDao") 创建出来的实例化对象

public UserDto findByName(String username){
	  List<UserDto> list = userdao.searchByname("from UserDto u where u.username ='"+username+"'");
	  if(list==null || list.size()>1 || list.size()==0)
	  return null;
	  else return list.get(0);
	  
  }

public UserDao getUserdao() {
	return userdao;
}

public void setUserdao(UserDao userdao) {
	this.userdao = userdao;
}


}
