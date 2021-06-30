package com.web.demo.service.admin.listuser;

import java.util.List;

import org.springframework.stereotype.Service;

import com.web.demo.entity.Users;
import com.web.demo.repository.admin.listuser.AdminUserRepo;

@Service
public class AdminUserServiceImp implements AdminUserService {

	@Override
	public void deleteById(Integer id) {
		user.deleteById(id);
	}

	AdminUserRepo user;

	public AdminUserServiceImp(AdminUserRepo users) {
		super();
		this.user = users;
	}

	@Override
	public List<Users> findAll() {

		return user.findAll();
	}

	@Override
	public <S extends Users> S save(S entity) {
		return user.save(entity);
	}

	@Override

	public Users getById(Integer id) {
		return user.getById(id);
	}

}
