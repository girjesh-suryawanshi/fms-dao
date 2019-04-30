package com.mpcz.fmsdao.dao;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpcz.fmsdao.repository.SubstationRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsentity.bean.Substation;
import com.mpcz.fmsinterface.SubstationInterface;
@Service
public class SubstationDAO {

    private static Logger logger = GlobalResources.getLogger(SubstationDAO.class);

    @Autowired
    SubstationRepository substationRepository;

    public SubstationInterface getSubstation(String substationCode) {
        String methodName = "getSubstation() ";
        logger.info(methodName + "called");
        SubstationInterface substationInterface = null;
        if (substationCode != null) {
        	System.out.println("Test substationCode DAO"+substationCode);
        	substationInterface = substationRepository.findBySubstationCode(substationCode);
            System.out.println("Test DAO Repo"+substationInterface.getSubstationName());
        }
        return substationInterface;
    }
    
    public SubstationInterface save(Substation substationInterface)
    {
    	logger.info("Substation DAO save():Called"); 
    	SubstationInterface substationInterfaceDB=null;
    	if(substationInterface!=null)
    	{
    		substationInterfaceDB=substationRepository.save(substationInterface);
    	}
    	return substationInterfaceDB;
    }
    
    public List<? extends SubstationInterface> getAll(String status){
    	logger.info("Substation DAO getAll():Called"); 
        List<? extends SubstationInterface>substationInterfaces =  substationRepository.findAllByStatus(status);

        return substationInterfaces;
     }

	public SubstationInterface getSubstation(long id) {
		String methodName = "getSubstation() ";
        logger.info(methodName + "called");
        SubstationInterface substation = null;
       
        	substation = substationRepository.findByStatusAndId("ENABLE", id);
        	if(substation!=null)
        	{
        		 return substation;	
        	}
        	else
        	{
        		return null;
        	}
        } 
   
    
   
}
