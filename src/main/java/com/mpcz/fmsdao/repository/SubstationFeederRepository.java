package com.mpcz.fmsdao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpcz.fmsentity.bean.SubstationFeeder;
import com.mpcz.fmsinterface.SubstationFeederInterface;

public interface SubstationFeederRepository extends JpaRepository<SubstationFeeder, Long> {
//public SubstationFeederInterface save(SubstationFeederInterface SubstationFeederInterface);
List<SubstationFeederInterface> findAllBysubstationId(long substationId);
//public Iterable<? extends SubstationFeederInterface> saveAll(Iterable<SubstationFeederInterface> entities);
}
