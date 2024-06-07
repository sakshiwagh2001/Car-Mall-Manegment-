package com.example.clients_seq.repository;

import com.example.clients_seq.model.ClientSeq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientSeqRepository extends JpaRepository<ClientSeq, Long> {
    // You can add custom query methods here if needed
}
