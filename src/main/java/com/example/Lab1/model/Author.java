package com.example.Lab1.model;


import javax.persistence.*;

@Entity

public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private String surname;

    @ManyToOne
    private Country country;

    public Author() {
    }

    public Author(Long id, String name, String surname, Country country) {
        this.Id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Country getCountry() {
        return country;
    }
}
