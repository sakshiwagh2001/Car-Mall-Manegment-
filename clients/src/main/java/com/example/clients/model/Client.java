package com.example.clients.model;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    private String client_name;

    private String client_address;

    private String username;

    private String password;

    private String client_email;

    private String client_mobile;

    private String token;

    private boolean is_active;

    private String profile_picture;

    private Date last_login;

    private String contact_person;

    private String contact_person_email;

    private String contact_person_phone;

    private Date date_added;

    private Date date_modified;

    private Date date_deleted;
}
