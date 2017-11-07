/**
 * Program: NFL Draft Final 
 * Project - NFL Player class 
 * File: NFLPlayer.java
 * Summary: The NFL Player class for the project. 
 * Author: Evan W Wilson Date:
 * November 5, 2017
 **/
package draftfinalproject;

public class NFLPlayer {

    //declare variables
    String firstName;
    String lastName;
    String position;
    String college;
    double dash40;
    int age;
    int height;
    int weight;
    double BMI;
    int experience;
    String injury;

    //constructor without parameters
    public NFLPlayer() {
    }

    //constructor that accepts all variables
    public NFLPlayer(String firstName, String lastName, String position, String college, double dash40,
            int age, int height, int weight, double BMI, int experience, String injury) {

    }

    //following methods set and get all variables
    public void setFirstName(String n1) {
        firstName = n1;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String n2) {
        lastName = n2;
    }

    public String getLastName() {
        return lastName;
    }

    public void setPosition(String p) {
        position = p;
    }

    public String getPosition() {
        return position;
    }

    public void setDash40(double d) {
        dash40 = d;
    }

    public double getDash40() {
        return dash40;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;
    }

    public void setWeight(int w) {
        weight = w;
    }

    public int getWeight() {
        return weight;
    }

    //uses weight and height to calculate BMI
    public void setBMI(int weight, int height) {
        BMI = (weight * .45) / ((height * .025) * 2);
        BMI = Math.round(BMI * 100.0) / 100.0;
    }

    public double getBMI() {
        return BMI;
    }

    //sets # years college experience assuming going straight to college
    public void setExperience(int age) {
        experience = age - 18;
    }

    public int getExperience() {
        return experience;
    }

    public void setCollege(String c) {
        college = c;
    }

    public String getCollege() {
        return college;
    }

    public void setInjury(String i) {
        injury = i;
    }

    public String getInjury() {
        return injury;
    }

    public String toString() {

        //converts height into feet/inches
        int feet = height / 12;
        int inches = height % 12;

        return "Name:  " + firstName + " " + lastName
                + "\nPosition:  " + position
                + "\nCollege:  " + college
                + "\n40 Yard dash time:  " + dash40
                + "\nAge:  " + age
                + "\nHeight:  " + feet + " foot " + inches + " inches"
                + "\nWeight:  " + weight
                + "\nBMI:  " + BMI
                + "\nYears College Experiennce:  " + experience
                + "\n" + injury;
    }
}
