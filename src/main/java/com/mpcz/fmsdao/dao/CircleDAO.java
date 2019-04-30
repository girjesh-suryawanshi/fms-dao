package com.mpcz.fmsdao.dao;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpcz.fmsdao.repository.CircleRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsinterface.CircleInterface;

@Service
public class CircleDAO {
	@Autowired
	CircleRepository repository;
	private Logger logger = GlobalResources.getLogger(CircleDAO.class);

	public List<? extends CircleInterface> getAll() {
		String methodName = "getAll() :";
		logger.info(methodName + " Called");
		return repository.findAll();
	}
}
