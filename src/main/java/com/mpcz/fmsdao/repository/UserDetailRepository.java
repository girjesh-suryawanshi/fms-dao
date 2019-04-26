package com.mpcz.fmsdao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpcz.fmsentity.bean.UserDetails;
import com.mpcz.fmsinterface.UserDetailsInterface;

public interface UserDetailRepository extends JpaRepository<UserDetails, Long> {
	
	 public UserDetailsInterface findByUserName(String userName);

}
