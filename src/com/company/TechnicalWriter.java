package com.company;

public class TechnicalWriter extends Employee {
    /**
     * paramaterless constructor
     */
    public TechnicalWriter() {

    }

    /**
     * parameterized constructor that takes from the Employee constructor
     * @param name A variable of type String
     * @param baseSalary A variable of type double
     * @param yearsOfExperience A variable of type int
     * @param yearsAtCompany A variable of type int
     */
    public TechnicalWriter(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany) {
        super(name, baseSalary, yearsOfExperience, yearsAtCompany);
    }

    /**
     * sets the number of vacation days
     */
    public void setVacationDays() {
        if(super.getYearsAtCompany() == 1) {
            super.setVacationDays(7);
        } else if (super.getYearsAtCompany() >= 2) {
            super.setVacationDays(14);
        }
    }

    /**
     * Updated method to also return vacation days
     * @return
     */
    @Override
    public String toString() {
        return super.toString()+"\nNumber of vacation days: "+super.getVacationDays()+"\n";
    }

    /**
     * Updated motto for technical writers
     * @return
     */
    @Override
    public String motto() {
        return "You can always edit a bad page. You can't edit a blank page.";
    }
}
