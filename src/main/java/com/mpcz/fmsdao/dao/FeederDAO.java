package com.mpcz.fmsdao.dao;

import com.mpcz.fmsdao.repository.FeederRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsinterface.FeederInterface;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeederDAO {
    private static Logger logger = GlobalResources.getLogger(FeederDAO.class);

    @Autowired
    FeederRepository feederRepository;

    public FeederInterface insertFeeder(FeederInterface feederInterface){
        String methodName ="updateFeederInterface() :";
        logger.info(methodName + "called");
        feederRepository.save(feederInterface);
        return  feederInterface;
    }
}
