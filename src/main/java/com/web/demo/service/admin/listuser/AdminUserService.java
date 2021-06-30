package com.web.demo.service.admin.listuser;

import java.util.List;

import com.web.demo.entity.Users;

public interface AdminUserService {
	
	List<Users> findAll();

	<S extends Users> S save(S entity);

	Users getById(Integer id);

	void deleteById(Integer id);
}
