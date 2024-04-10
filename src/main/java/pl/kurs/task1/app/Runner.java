package pl.kurs.task1.app;

import pl.kurs.task1.models.*;
import pl.kurs.task1.services.PersonController;

public class Runner {
    public static void main(String[] args) {


        PersonController personController = new PersonController();

        Student student1 = new Student
                ("Jan", "Śruba", "89041575979", "Bogota", "35A", 1_200);
        Student student2 = new Student
                ("Janek", "Śrubek", "01290997931", "Rzym", "12B", 1_300);
        Student student3 = new Student
                ("Janeczek", "Śrubeczka", "81052047216", "Portland", "44C", 1_500);
        Employee employee1 = new Employee
                ("Diana", "Śpioch", "88093089342", "Nowe Delhi", "DevOps engineer", 25_500);
        Employee employee2 = new Employee
                ("Barbara", "Boligłowa", "59072785162", "Capetown", "Project manager", 30_500);
        Employee employee3 = new Employee
                ("Emilia", "Kwasigroch", "63071237742", "Saloniki", "Data scientist", 16_500);

        Person[] people = {student1, student2, student3, employee1, employee2, employee3};

        System.out.println("Osoba z największym dochodem to: ");
        Person personWithMaxIncome = personController.getPersonWithMaxIncome(people);
        System.out.println(personWithMaxIncome.getFirstName() + " " + personWithMaxIncome.getLastName());

        System.out.println(("Liczba kobiet w tablicy wynosi: " + personController.countFemales(people)));
    }
}


