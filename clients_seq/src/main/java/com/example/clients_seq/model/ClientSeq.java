package com.example.clients_seq.model;


import jakarta.persistence.*;



@Entity
@Table(name = "clients_seq")
public class ClientSeq {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long next_val;

    public Long getNext_val() {
        return next_val;
    }

    public void setNext_val(Long next_val) {
        this.next_val = next_val;
    }
}
