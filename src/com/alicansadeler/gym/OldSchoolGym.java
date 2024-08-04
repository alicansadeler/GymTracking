package com.alicansadeler.gym;

import java.util.Arrays;

public class OldSchoolGym extends FitnessCenter{

    private StudentInfo[] studentInfo;

    public OldSchoolGym(String gymName, String gymAddress, String employerFullName,
                        StudentInfo[] studentInfo) {

        super(gymName, gymAddress, employerFullName);
        this.studentInfo = studentInfo;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                Arrays.toString(studentInfo) + "\n";
    }
}
