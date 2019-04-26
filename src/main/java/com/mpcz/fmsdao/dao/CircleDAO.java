package com.mpcz.fmsdao.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpcz.fmsdao.repository.CircleRepository;
import com.mpcz.fmsinterface.CircleInterface;

@Service
public class CircleDAO {
@Autowired
CircleRepository repository;

public List<? extends CircleInterface> getAll(){
	return repository.findAll();
}
}
