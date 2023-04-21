package org.app;

public class School implements Person.EducationalInstitution {
    private String name;
    private int minAge;
    private int maxAge;

    public School(String name, int minAge, int maxAge) {
        this.name = name;
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public boolean isEligible(Person person) {
        Object Years = new Object();
        int age = Years.getClass().getModifiers();
        return age >= minAge && age <= maxAge;
    }

    @Override
    public String getName() {
        return name;
    }
}


