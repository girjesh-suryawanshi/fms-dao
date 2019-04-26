package com.mpcz.fmsdao.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpcz.fmsdao.repository.ZoneRepository;
import com.mpcz.fmsinterface.ZoneInterface;

@Service
public class ZoneDAO {
@Autowired
ZoneRepository repository;

public List<? extends ZoneInterface> getAll(){
	return repository.findAll();
}
}
