package com.mpcz.fmsdao.dao;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpcz.fmsdao.repository.ZoneRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsentity.bean.Zone;
import com.mpcz.fmsinterface.ZoneInterface;

@Service
public class ZoneDAO {
	@Autowired
	ZoneRepository repository;
	private Logger logger = GlobalResources.getLogger(ZoneDAO.class);

	public List<? extends ZoneInterface> getAll() {
		String methodName = "getAll() :";
		logger.info(methodName + " Called");
		return repository.findAll();
	}

	public Zone getZone(long id) {
		String methodName = "getZone() :";
		logger.info(methodName + " Called");
		Zone zoneInterface = null;
		zoneInterface = repository.findById(id).get();
		return zoneInterface;
	}
}
