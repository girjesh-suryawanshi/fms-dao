package com.mpcz.fmsdao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpcz.fmsentity.bean.Substation;
import com.mpcz.fmsinterface.SubstationInterface;

public interface SubstationRepository extends JpaRepository<Substation, Long>{
	
	public SubstationInterface findBySubstationCode(String substationCode);
	
	public SubstationInterface findByStatusAndId(String status,Long id);
	
	public List<? extends SubstationInterface> findAllByStatus(String status);

}
