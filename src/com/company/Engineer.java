package com.company;

public class Engineer extends Employee {
    private double signOnBonus;
    private double salary;

    /**
     * parameterless constructor
     */
    public Engineer() {
        this.signOnBonus = 0;
        this.salary = 0;
    }

    /**
     * parameterized constructor
     * @param name A variable of type String
     * @param baseSalary a variable of type double
     * @param yearsOfExperience A variable of type int
     * @param yearsAtCompany A variable of type int
     * @param vacationDays A variable of type int
     */
    public Engineer(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany, int vacationDays) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany, vacationDays);
    }

    /**
     * This should set the salary for engineers to 1.5 the base salary...but not working properly
     */
    public void setSalary() {
        this.salary = super.getBaseSalary() * 1.5;
    }

    /**
     * Should return the value of salary...but not working properly
     * @return
     */
    public double getSalary() {
        return salary;
    }

    /**
     * sets the number of vacation days
     */
    //@Override
    public void setVacationDays() {
        if(super.getYearsAtCompany() == 1) {
            super.setVacationDays(14);
        } else if (super.getYearsAtCompany() >= 2) {
            super.setVacationDays(21);
        }
    }

    /**
     * Sets the sign on bonus based on the years of experience
     */
    public void setSignOnBonus() {
        if(getYearsOfExperience() < 5) {
            this.signOnBonus = 5000.00;
        } else if(getYearsOfExperience() >= 5) {
            this.signOnBonus = 10000.000;
        }
    }

    /**
     * Gets the sign on bonus
     * @return signOnBonus
     */
    public double getSignOnBonus() {
        return this.signOnBonus;
    }

    /**
     * Updated method to also return vacation days
     * @return
     */
    @Override
    public String toString() {
        return "Employee: "+super.getName()+", Salary: "+String.valueOf(this.getSalary())+ ", Motto: "+motto()+", Number of vacation days: "+super.getVacationDays() + ", Sign on bonus: " +  this.getSignOnBonus();
    }

    /**
     * Updated motto for Engineers
     * @return
     */
    @Override
    public String motto() {
        return "To the optimist, the glass is half full. To the pessimist, the glass is half empty. To the engineer, the glass is twice as big as it needs to be.";
    }
}
