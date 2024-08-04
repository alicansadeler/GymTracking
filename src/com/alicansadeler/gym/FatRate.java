package com.alicansadeler.gym;

import com.alicansadeler.gym.enums.Gender;

public class FatRate {
    private double waist;
    private double neck;
    private double hip;
    private double length;
    private Gender gender;

    public FatRate(double waist, double neck, double hip, double length, Gender gender) {
        this.waist = waist;
        this.neck = neck;
        this.hip = hip;
        this.length = length;
        this.gender = gender;
    }

    public double calcFat(Gender gender) {
        double result = 0;
        if (gender == Gender.MALE) {
            result = (86.01 * Math.log10(waist - neck)) - (70.041 * Math.log10(length)) + 36.76;
        } else if (gender == Gender.FEMALE) {
            result = (163.205 * Math.log10(waist + hip - neck)) - (97.684 * Math.log10(length)) - 78.387;
        }
        return result;
    }

    @Override
    public String toString() {
        return " " + calcFat(gender);
    }
}
