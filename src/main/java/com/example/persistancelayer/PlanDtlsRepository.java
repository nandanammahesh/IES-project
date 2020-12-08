package com.example.persistancelayer;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanDtlsRepository  extends JpaRepository<PlanDtlsEntity, Serializable>{

}
