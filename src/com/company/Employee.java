package com.company;

public class Employee {
    private String name;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    private int vacationDays;

    /**
     * Parameterless constructor
     */
    public Employee(){
        this.name = "";
        //this.baseSalary = 0;
        this.yearsOfExperience = 0;
        this.yearsAtCompany = 0;
        this.vacationDays = 0;
    }

    /**
     * Parameterized constructor
     *@param name A variable of type String
     *@param baseSalary A variable of type double
     *@param yearsOfExperience A variable of type int
     *@param yearsAtCompany A variable of type int
     * @param vacationDays A variable of type int
     */
    public Employee(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany, int vacationDays){
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience =  yearsOfExperience;
        this.yearsAtCompany = yearsAtCompany;
        this.vacationDays = vacationDays;
    }

    /**
     * Set name
     * @param name A variable of type String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * sets the base salary to $50,000.00
     */
    public void setBaseSalary() {
        this.baseSalary = 50000.00;
    }

    /**
     * Set Years of Experience
     * @param yearsOfExperience A variable of type int
     */
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    /**
     * Set years at Company
     * @param yearsAtCompany A variable of type int
     */
    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    /**
     * Sets the number of vacation days
     * @param vacationDays A variable of type int
     */
    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    /**
     * Get the name of an employee
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the Base Salary of an employee
     * @return baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Get the years of experience of an employee
     * @return yearsOfExperience
     */
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    /**
     * Get the number of years an employee has been with the company
     * @return yearsAtCompany
     */
    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    /**
     * Returns the number of vacation weeks
     * @return vacationWeeks
     */
    public int getVacationDays() {
        return vacationDays;
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return "Employee: "+name+", Salary: "+String.valueOf(getBaseSalary())+ ", Motto: "+motto();
    }

    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "We value our employees";
    }
}
