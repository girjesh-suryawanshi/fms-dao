package com.mpcz.fmsdao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpcz.fmsentity.bean.Zone;
@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long>{

}
