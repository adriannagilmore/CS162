package com.company;

public class ProjectManager extends Employee {
    private int sharesOfCompanyStock;
    private double salary;

    /**
     * parameterless constructor
     */
    public ProjectManager() {
    }

    /**
     * parameterized constructor
     * @param name A variable of type String
     * @param baseSalary A variable of type double
     * @param yearsOfExperience A variable of type int
     * @param yearsAtCompany A variable of type int
     * @param vacationDays A variable of type int
     */
    public ProjectManager(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany, int vacationDays) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany, vacationDays);
    }

    /**
     * sets the number of shares in company stock
     */
    public void setSharesOfCompanyStock() {
        this.sharesOfCompanyStock = 100*getYearsAtCompany();
    }

    /**
     * gets the number of shares in company stock
     * @return
     */
    public int getSharesOfCompanyStock() {
        return sharesOfCompanyStock;
    }

    /**
     * Should return a value that is double the base value...but not working properly
     * @return
     */
    public double getDoubleBaseSalary() {
        double newSalary = super.getBaseSalary();
        newSalary = newSalary*2;
        return newSalary;
    }

    /**
     * should set the salary to double the base salary...but not working properly
     */
    public void setSalary() {
        this.salary = this.getDoubleBaseSalary();
    }

    public double getSalary() {
        return salary;
    }

    /**
     * sets the number of vacation days
     */
    public void setVacationDays() {
        if(super.getYearsAtCompany() == 1) {
            super.setVacationDays(21);
        } else if (super.getYearsAtCompany() >= 2) {
            super.setVacationDays(28);
        }
    }

    /**
     * Updated method to also return vacation days
     * @return
     */
    @Override
    public String toString() {
        return "Employee: "+super.getName()+", Salary: "+String.valueOf(this.getSalary())+ ", Motto: "+motto()+", Number of vacation days: "+super.getVacationDays() + ", Number of shares in company stock: " +  this.sharesOfCompanyStock;
    }

    /**
     * Updated motto for Engineers
     * @return
     */
    @Override
    public String motto() {
        return "There is nothing so useless as doing efficiently that which should not be done at all.";
    }
}
