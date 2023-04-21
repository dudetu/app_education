package org.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EducationApp {

    public EducationApp() {
        List<Person.EducationalInstitution> institutions = new ArrayList<>();
        institutions.add((Person.EducationalInstitution) new School("Elementary School", 6, 11));
        institutions.add((Person.EducationalInstitution) new School("High School", 14, 18));
        institutions.add((Person.EducationalInstitution) new University("University", 18));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print(" ");

    }

    public int myMethod() {
        return 0;
    }
}