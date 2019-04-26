package com.mpcz.fmsdao.repository;
import com.mpcz.fmsentity.bean.Substation;
import com.mpcz.fmsinterface.SubstationInterface;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubstationRepository extends JpaRepository<Substation, Long> {
	
	public SubstationInterface findBySubstationCode(String substationCode);


}
