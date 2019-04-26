package com.mpcz.fmsdao.dao;

import com.mpcz.fmsdao.repository.SubstationRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsentity.bean.SubStation;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubstationViewDAO {
    private static Logger logger = GlobalResources.getLogger(SubstationViewDAO.class);

    @Autowired
    SubstationRepository substationRepository;

    public List<SubStation> getAll() {
        String methodName = "getAll()  :";
        logger.info(methodName + "called");
        List<SubStation> substation = substationRepository.findAll();

        return substation;
    }
}
