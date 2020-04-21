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
     */
    public ProjectManager(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
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
     * Returns a value that is double the base salary
     * @return
     */
    public double getDoubleBaseSalary() {
        super.setBaseSalary();
        double newSalary = super.getBaseSalary();
        newSalary *= 2;
        return newSalary;
    }

    /**
     * Sets the value of salary two double the base salary
     */
    public void setSalary() {
        this.salary = this.getDoubleBaseSalary();
        super.setBaseSalary(salary);
    }

    /**
     * Returns the value of salary
     * @return
     */
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
        return super.toString()+"\nNumber of vacation days: "+super.getVacationDays() + "\nNumber of shares in company stock: " +  this.sharesOfCompanyStock+"\n";
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
