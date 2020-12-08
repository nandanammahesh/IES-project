package com.example.persistancelayer;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDtlsRepository extends JpaRepository<ContactDtlsEntity, Serializable> {

}
