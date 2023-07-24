package org.example;

public class PersonBuilder {
    public String name;
    public String surname;
    public int age;
    public String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("Возраст недопустимый");
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) throw new IllegalStateException("Не хватает обяхательных полей");
        return new Person(name, surname, age, address);
    }
}