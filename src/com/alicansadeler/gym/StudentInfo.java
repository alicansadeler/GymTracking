package com.alicansadeler.gym;

import com.alicansadeler.gym.Interface.StudentMetots;
import com.alicansadeler.gym.enums.TrainingType;

public  class StudentInfo implements StudentMetots {

    private String studentFullName;
    private int studentAge;
    private boolean skeletonPerformance;
    private TrainingType trainingType;
    private FatRate fatRate;

    public StudentInfo(String studentFullName, int studentAge, FatRate fatRate, boolean skeletonPerformance, TrainingType trainingType) {
        this.studentFullName = studentFullName;
        this.studentAge = studentAge;
        this.fatRate = fatRate;
        this.skeletonPerformance = skeletonPerformance;
        this.trainingType = trainingType;
    }

    @Override
    public void setStudentFullName(String studentFullName) {
        this.studentFullName = studentFullName;
    }

    @Override
    public int getStudentAge() {
        return studentAge;
    }

    @Override
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public void setStudentFatRate(FatRate fatRate) {
        this.fatRate = fatRate;
    }

    @Override
    public boolean getSkeletonPerformance() {
        return skeletonPerformance;
    }

    @Override
    public void setSkeletonPerformance(boolean skeletonPerformance) {
        this.skeletonPerformance = skeletonPerformance;
    }

    @Override
    public String toString() {
        return  '\n' +
                "Öğrencinin İsmi = " + studentFullName + '\n' +
                "Öğrencinin Yaşı = " + studentAge + '\n' +
                "Öğrencinin Yağ oranı = " + fatRate.toString() + '\n' +
                "Öğrencinin Fizik Rahatsızlığı Var mı ? = " + skeletonPerformance + '\n' +
                "Antrenman Tipi = " + trainingType + '\n' ;
    }
}
