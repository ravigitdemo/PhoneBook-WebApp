package com.nit.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.ContactEntity;

public interface ContactRepo extends JpaRepository<ContactEntity,Serializable>{

}
