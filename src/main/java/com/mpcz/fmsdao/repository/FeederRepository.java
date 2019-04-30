package com.mpcz.fmsdao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpcz.fmsentity.bean.Feeder;
import com.mpcz.fmsinterface.FeederInterface;
import com.mpcz.fmsinterface.SubstationInterface;

public interface FeederRepository extends JpaRepository<Feeder, Long>{

	
	public FeederInterface findByStatusAndId(String status,Long id);
	
	public List<? extends FeederInterface> findAllByStatus(String status);

}
