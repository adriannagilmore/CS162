package com.company;

public class Main {

    public static void main(String[] args) {

        Employee jane = new Employee("Jane", 50000.00, 1, 0, 0);
        TechnicalWriter autumn = new TechnicalWriter("Autumn",0.00,3,1,0);
        Engineer sydney = new Engineer();
        ProjectManager beth = new ProjectManager();

        System.out.println(jane);
        System.out.println(jane.getBaseSalary());

        autumn.setVacationDays();
        autumn.setBaseSalary();
        System.out.println(autumn);
        System.out.println(autumn.getBaseSalary());

        sydney.setName("Sydney");
        sydney.setSalary();
        sydney.setYearsOfExperience(10);
        sydney.setSignOnBonus();
        sydney.setVacationDays();
        System.out.println(sydney);
        System.out.println(sydney.getBaseSalary());

        beth.setName("Beth");
        beth.setYearsAtCompany(3);
        beth.setYearsOfExperience(15);
        beth.setSharesOfCompanyStock();
        beth.setSalary();
        beth.setVacationDays();
        System.out.println(beth);
        System.out.println(beth.getDoubleBaseSalary());

    }
}
