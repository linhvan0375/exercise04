package com.web.demo.repository.admin.listuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.demo.entity.Users;
@Repository
public interface AdminUserRepo extends JpaRepository<Users, Integer> {
	
}
