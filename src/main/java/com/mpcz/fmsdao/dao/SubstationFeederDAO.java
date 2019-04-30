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

    
    public SubstationFeederInterface save(SubstationFeederInterface substationFeederInterface)
    {
    	logger.info("Substation Feeder DAO save():Called"); 
    	SubstationFeeder substationFeeder = (SubstationFeeder) substationFeederInterface;
    	SubstationFeederInterface substationFeederInterfaceDB=null;
    	if(substationFeederInterface!=null)
    	{
    		substationFeederInterfaceDB=substationFeederRepository.save(substationFeeder);
    	}
    	return substationFeederInterfaceDB;
    }
    
    public List<? extends SubstationFeederInterface> getAll(){
    	logger.info("Substation Feeder DAO getAll():Called"); 
    	List<? extends SubstationFeederInterface>substationInterfaces = substationFeederRepository.findAll();

        return substationInterfaces;
     } 
   
  public List<? extends SubstationFeederInterface> getAllBySubstationId(Long substationId)
   {
	  logger.info("Substation Feeder DAO getAllBySubstationId():Called"); 
	   List<? extends SubstationFeederInterface>substationInterfaces =substationFeederRepository.findAllBysubstationId(substationId);
  
   return substationInterfaces;
   }
  
  public List<? extends SubstationFeederInterface>  saveAllSubstationFeeder(Iterable<SubstationFeeder> entities){
	  logger.info("Substation Feeder DAO saveAllSubstationFeeder():Called");   
	  List<? extends SubstationFeederInterface>substationInterfaces =substationFeederRepository.saveAll(entities);
	  return substationInterfaces;
  }
   
}
