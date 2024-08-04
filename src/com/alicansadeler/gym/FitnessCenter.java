package com.alicansadeler.gym;

public abstract class FitnessCenter {

    private String gymName;
    private String gymAddress;
    private String employerFullName;

    private static int totalStudents;


    public FitnessCenter(String gymName, String gymAddress, String employerFullName) {
        this.gymName = gymName;
        this.gymAddress = gymAddress;
        this.employerFullName = employerFullName;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public String getGymAddress() {
        return gymAddress;
    }

    public void setGymAddress(String gymAddress) {
        this.gymAddress = gymAddress;
    }

    public String getEmployerFullName() {
        return employerFullName;
    }

    public void setEmployerFullName(String employerFullName) {
        this.employerFullName = employerFullName;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    public static void setTotalStudents(int totalStudents) {
        FitnessCenter.totalStudents = totalStudents;
    }

    @Override
    public String toString() {
        return "Fitness Center" + '\n' +
                "Salon Adı =  " + gymName + '\n' +
                "Salon Adresi = " + gymAddress + '\n' +
                "İşveren İsmi = " + employerFullName;
    }
}
