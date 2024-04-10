package pl.kurs.task1.services;

import pl.kurs.task1.models.Person;

public class PersonController {
    public Person getPersonWithMaxIncome(Person[] people) {
        Person personWithMaxIncome = null;
        double maxIncome = 0;

        for (Person person : people) {
            double income = person.getIncome();
            if (income > maxIncome) {
                maxIncome = income;
                personWithMaxIncome = person;
            }
        }
        return personWithMaxIncome;
    }

    public int countFemales(Person[] people) {
        int femaleCounter = 0;
        for (Person person : people) {
            if (getGender(person).equals("F")) {
                femaleCounter++;
            }
        }
        return femaleCounter;
    }

    private String getGender(Person person) {
        return person.getPesel().charAt(person.getPesel().length() - 2) % 2 == 0 ? "F" : "M";
    }
}

