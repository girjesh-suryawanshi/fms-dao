package com.mpcz.fmsdao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpcz.fmsentity.bean.Circle;
import com.mpcz.fmsinterface.CircleInterface;
@Repository
public interface CircleRepository extends JpaRepository<Circle, Long> {

}
