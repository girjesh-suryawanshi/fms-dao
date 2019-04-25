package com.mpcz.fmsdao.repository;

import com.mpcz.fmsentity.bean.Users;
import com.mpcz.fmsinterface.UserInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    public UserInterface findByUserName(String userName);
}
