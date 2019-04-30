package com.mpcz.fmsdao.dao;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpcz.fmsdao.repository.SubstationFeederRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsentity.bean.SubstationFeeder;
import com.mpcz.fmsinterface.SubstationFeederInterface;
import com.mpcz.fmsinterface.SubstationInterface;

@Service
public class SubstationFeederDAO {

	private static Logger logger = GlobalResources.getLogger(SubstationFeederDAO.class);

	@Autowired
	SubstationFeederRepository substationFeederRepository;

	public SubstationFeederInterface save(SubstationFeederInterface substationFeederInterface) {
		String methodName = "save() :";
		logger.info(methodName + " Called");
		SubstationFeeder substationFeeder = (SubstationFeeder) substationFeederInterface;
		SubstationFeederInterface substationFeederInterfaceDB = null;
		if (substationFeederInterface != null) {
			substationFeederInterfaceDB = substationFeederRepository.save(substationFeeder);
		}
		return substationFeederInterfaceDB;
	}

	public List<? extends SubstationFeederInterface> getAll() {
		String methodName = "getAll() :";
		logger.info(methodName + " Called");
		List<? extends SubstationFeederInterface> substationInterfaces = substationFeederRepository.findAll();

		return substationInterfaces;
	}

	public List<? extends SubstationFeederInterface> getAllBySubstationId(Long substationId) {
		String methodName = "getAllBySubstationId() :";
		logger.info(methodName + " Called");
		List<? extends SubstationFeederInterface> substationInterfaces = substationFeederRepository
				.findAllBysubstationId(substationId);

		return substationInterfaces;
	}

	public List<? extends SubstationFeederInterface> saveAllSubstationFeeder(Iterable<SubstationFeeder> entities) {
		String methodName = "saveAllSubstationFeeder() :";
		logger.info(methodName + " Called");
		List<? extends SubstationFeederInterface> substationInterfaces = substationFeederRepository.saveAll(entities);
		return substationInterfaces;
	}

}
