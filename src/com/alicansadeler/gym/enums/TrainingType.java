package com.alicansadeler.gym.enums;

public enum TrainingType {

    FULLBODY(3),
    UPPER_LOWER(4),
    PPL(6),
    SPLIT(5),
    MIKE_MENTZER(2);

    private final int weeklyVolume;

    TrainingType(int weeklyVolume) {
        this.weeklyVolume = weeklyVolume;
    }

    public int getWeeklyVolume() {
        return weeklyVolume;
    }
}

/*

 */