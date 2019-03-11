package com.example.nbp;



public class GoldCourse {

    private Double courseGold;

    public double getCourseGold() {
        return courseGold;
    }

    public void setCourseGold(double courseGold) {
        this.courseGold = courseGold;
    }

    @Override
    public String toString() {
        return "GoldCourse{" +
                "courseGold=" + courseGold +
                '}';
    }
}
