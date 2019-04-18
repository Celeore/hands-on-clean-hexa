package com.happytown.core.entities;

public class TrancheAge {

    private Integer ageMin;
    private Integer ageMax;

    public TrancheAge( Integer ageMin, Integer ageMax) {
        this.ageMin = ageMin;
        this.ageMax = ageMax;
    }

    public static TrancheAgeBuilder builder() {
        return new TrancheAgeBuilder();
    }

    public Integer getAgeMin() {
        return ageMin;
    }

    public Integer getAgeMax() {
        return ageMax;
    }


    public static class TrancheAgeBuilder {
        private Integer ageMin;
        private Integer ageMax;


        public TrancheAgeBuilder ageMin(int ageMin) {
            this.ageMin = ageMin;
            return this;
        }

        public TrancheAgeBuilder ageMax(int ageMax) {
            this.ageMax = ageMax;
            return this;
        }

        public TrancheAge build() {
            return new TrancheAge(this.ageMin, this.ageMax);
        }
    }
}
