package org.app;

public class University implements Person.EducationalInstitution {
    private final String name;
    private final int minAge;
    private Object years;

    public University(String name, int minAge) {
        this.name = name;
        this.minAge = minAge;
    }

    @Override
    public boolean isEligible(Person person) throws InterruptedException {
        Object Years;


        return minAge >= minAge;
    }



    @Override
    public String getName() {
        return name;
    }

    public Object getYears() {
        return years;
    }
}

