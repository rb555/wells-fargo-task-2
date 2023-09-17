package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


@Entity
public class Client {
    @Id
    @GeneratedValue()
    @Column(name = "clientId")
    private long clientId;
    @ManyToOne
    @Column(name = "advisorId")
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    public Client(long advisorId, String firstName, String lastName, String address, String phone, String email) {
    }
}



    
    



