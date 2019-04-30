package com.mpcz.fmsdao.dao;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpcz.fmsdao.repository.FeederRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsentity.bean.Feeder;
import com.mpcz.fmsinterface.FeederInterface;

@Service


public class FeederDAO {
	private Logger logger = GlobalResources.getLogger(FeederDAO.class);
	@Autowired
	FeederRepository feederRepository;
	
	public FeederInterface save(Feeder feederInterface)
	{
		logger.info("Feeder DAO save():Called"); 
		FeederInterface feederInterfaceDB = null;
		if(feederInterface != null)
		{
			feederInterfaceDB = feederRepository.save(feederInterface);
		}
		return feederInterfaceDB;
	}
	
	public FeederInterface getFeeder(String status,Long id )
	{
		logger.info("Feeder DAO  getFeeder():Called"); 
		FeederInterface feederInterfaceDB = null;
		if(id != null)
		{
			feederInterfaceDB = feederRepository.findByStatusAndId(status, id);
		}
		return feederInterfaceDB;
	}
	public List<? extends FeederInterface> getAll(String status){
		logger.info("Feeder DAO getAll():Called"); 
        List<? extends FeederInterface>feederInterfaces =  feederRepository.findAllByStatus(status);
        return feederInterfaces;
     }

}
