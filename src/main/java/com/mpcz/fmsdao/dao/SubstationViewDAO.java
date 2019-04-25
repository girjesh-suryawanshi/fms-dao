package com.mpcz.fmsdao.dao;

import com.mpcz.fmsdao.repository.UsersRepository;
import com.mpcz.fmsdao.utility.GlobalResources;
import com.mpcz.fmsinterface.SubstationInterface;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubstationViewDAO {
    private static Logger logger = GlobalResources.getLogger(SubstationViewDAO.class);

    @Autowired
    UsersRepository usersRepository;

    public List<? extends SubstationInterface> getAll() {

        List<? extends SubstationInterface> substationInterfaces = usersRepository.getAll();

        return substationInterfaces;
    }
}
