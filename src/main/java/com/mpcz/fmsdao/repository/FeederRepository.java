package com.mpcz.fmsdao.repository;

import com.mpcz.fmsentity.bean.Feeder;
import com.mpcz.fmsinterface.FeederInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeederRepository extends JpaRepository<Feeder, Long> {

    public FeederInterface save(FeederInterface feederInterface);
}
