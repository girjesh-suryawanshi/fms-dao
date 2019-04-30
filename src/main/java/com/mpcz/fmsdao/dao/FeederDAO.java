package com.mpcz.fmsdao.dao;
import com.mpcz.fmsdao.repository.FeederRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsentity.bean.Feeder;
import com.mpcz.fmsinterface.FeederInterface;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeederDAO {
	private Logger logger = GlobalResources.getLogger(FeederDAO.class);
	@Autowired
	FeederRepository feederRepository;

	public FeederInterface save(Feeder feederInterface) {
		String methodName = "save() :";
		logger.info(methodName + " Called");
		FeederInterface feederInterfaceDB = null;
		if (feederInterface != null) {
			feederInterfaceDB = feederRepository.save(feederInterface);
		}
		return feederInterfaceDB;
	}

	public FeederInterface getFeeder(String status, Long id) {
		String methodName = "getFeeder() :";
		logger.info(methodName + " Called");
		FeederInterface feederInterfaceDB = null;
		if (id != null) {
			feederInterfaceDB = feederRepository.findByStatusAndId(status, id);
		}
		return feederInterfaceDB;
	}

	public List<? extends FeederInterface> getAll(String status) {
		String methodName = "getAll() :";
		logger.info(methodName + " Called");
		List<? extends FeederInterface> feederInterfaces = feederRepository.findAllByStatus(status);
		return feederInterfaces;
	}

}
