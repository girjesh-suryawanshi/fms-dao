package com.mpcz.fmsdao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpcz.fmsentity.bean.Substation;
import com.mpcz.fmsinterface.SubstationInterface;

public interface SubstationRepository extends JpaRepository<Substation, Long>{
	
	public SubstationInterface findBySubstationCode(String substationCode);

}
