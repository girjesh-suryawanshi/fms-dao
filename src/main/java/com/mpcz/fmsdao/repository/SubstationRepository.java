package com.mpcz.fmsdao.repository;

import com.mpcz.fmsentity.bean.SubStation;
import com.mpcz.fmsinterface.SubstationInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubstationRepository extends JpaRepository<SubStation, Long> {

}
