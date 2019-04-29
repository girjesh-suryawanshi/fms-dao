package com.mpcz.fmsdao.dao;

import java.util.List;

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
    	SubstationInterface substationInterfaceDB=null;
    	if(substationInterface!=null)
    	{
    		substationInterfaceDB=substationRepository.save(substationInterface);
    	}
    	return substationInterfaceDB;
    }
    
    //public List<? extends SubstationInterface> getAll(){

    //    List<? extends SubstationInterface>substationInterfaces =  substationRepository.findAll();

    //    return substationInterfaces;
    // }

    public List<Substation> getAll() {
        String methodName = "getAll()  :";
        logger.info(methodName + "called");
        List<Substation> substation = substationRepository.findAll();

        return substation;
    }

    public void deleteByID(Long Id) {
        String methodName = "deleteSubstation";
        logger.info(methodName + "called");
        substationRepository.deleteById(Id);
    }
}
