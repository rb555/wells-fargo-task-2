package com.wellsfargo.counselor.entity;

public class ClientBuilder {
    private long advisorId;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;

    public ClientBuilder setAdvisorId(long advisorId) {
        this.advisorId = advisorId;
        return this;
    }

    public ClientBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ClientBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ClientBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public ClientBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public ClientBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Client createClient() {
        return new Client(advisorId, firstName, lastName, address, phone, email);
    }
}