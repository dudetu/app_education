package org.app;

public class Person {
    private String name;
    private final DateTime birthDate;

    public Person(String name, DateTime birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public DateTime getBirthDate() {
        return birthDate;
    }
    public interface EducationalInstitution {
        boolean isEligible(Person person) throws InterruptedException;
        String getName();
    }

}

