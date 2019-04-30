package com.mpcz.fmsdao.dao;

import com.mpcz.fmsdao.repository.UsersRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsinterface.UserInterface;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersDAO {

	private static Logger logger = GlobalResources.getLogger(UsersDAO.class);

	@Autowired
	UsersRepository usersRepository;

	public UserInterface getUser(String userName) {
		String methodName = "getUser() ";
		logger.info(methodName + "called");
		UserInterface userInterface = null;
		if (userName != null) {
			System.out.println("Test DAO" + userName);
			userInterface = usersRepository.findByUserName(userName);
			System.out.println("Test DAO Repo" + userInterface.getRole());
		}
		return userInterface;
	}
}
