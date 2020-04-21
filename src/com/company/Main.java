package com.company;

public class Main {

    public static void main(String[] args) {

        Employee jane = new Employee("Jane", 50000.00, 1, 0);
        TechnicalWriter autumn = new TechnicalWriter("Autumn",0.00,3,1);
        Engineer sydney = new Engineer();
        ProjectManager onyx = new ProjectManager("Onyx", 2*50000.00,20,8);
        ProjectManager sage = new ProjectManager();

        System.out.println(jane);
        System.out.println("");

        autumn.setVacationDays();
        autumn.setBaseSalary();
        System.out.println(autumn);

        sydney.setName("Sydney");
        sydney.setSalary();
        sydney.setYearsAtCompany(5);
        sydney.setYearsOfExperience(10);
        sydney.setSignOnBonus();
        sydney.setVacationDays();
        System.out.println(sydney);

        onyx.setVacationDays();
        onyx.setSharesOfCompanyStock();
        System.out.println(onyx);

        sage.setName("Sage");
        sage.setYearsAtCompany(3);
        sage.setYearsOfExperience(10);
        sage.setSalary();
        sage.setVacationDays();
        sage.setSharesOfCompanyStock();
        System.out.println(sage);

    }
}
