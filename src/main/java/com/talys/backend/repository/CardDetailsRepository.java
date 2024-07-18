package com.talys.backend.repository;

import com.talys.backend.entities.CardDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardDetailsRepository  extends JpaRepository<CardDetails, String> {

}
