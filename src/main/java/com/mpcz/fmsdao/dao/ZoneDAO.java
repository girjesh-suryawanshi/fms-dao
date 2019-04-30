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
public List<? extends ZoneInterface> getAll(){
	logger.info("Zone DAO getAll():Called"); 
	return repository.findAll();
}

public Optional<Zone> getZone(long id){
	
	logger.info("Zone DAO getZone():Called"); 
	Optional<Zone> zoneInterface=null;
	
	zoneInterface=repository.findById(id);
	if(zoneInterface.isPresent())
	{
		return zoneInterface;
	}
	return zoneInterface;
}
}
