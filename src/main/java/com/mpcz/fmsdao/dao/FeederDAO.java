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
    private static Logger logger = GlobalResources.getLogger(FeederDAO.class);

    @Autowired
    FeederRepository feederRepository;


    public List<Feeder> getAll() {
        String methodName = "getAll()  :";
        logger.info(methodName + "called");
        List<Feeder> feeders = feederRepository.findAll();

        return feeders;
    }

    public void deleteByID(Long Id) {
        String methodName = "deleteFeeder";
        logger.info(methodName + "called");
        feederRepository.deleteById(Id);
    }

    public FeederInterface insertFeeder(FeederInterface feederInterface) {
        String methodName = "updateFeederInterface() :";
        logger.info(methodName + "called");
        feederRepository.save(feederInterface);
        return feederInterface;
    }

}
