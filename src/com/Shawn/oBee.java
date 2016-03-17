package com.Shawn;

/**
 * Created by Wolfknightx on 3/15/2016.
 * This subclass refers to bees and their insect type.
 */
public class oBee extends oinsect {
    protected String beeColor;
    protected boolean likesHoney = true;
    protected String favFlower;

    public oBee(String name, String color, Boolean likesHoney, String favFlower, int wingCount){
        //Now set the variables to specifics.
        insectName = name;
        beeColor = color;
        this.likesHoney = likesHoney; //this grabs the class variable which makes it easier to read.
        this.favFlower = favFlower;
        numOfWings = wingCount;
        //all bees have 6 legs - no modifier added.
    }

    public String getColor(){
        return beeColor;
    }
    public void setColor(String color){
        color = "";
    }
    public String getFavFlower(){
        return favFlower;
    }
    public void setFavFlower(String favFlower){
        favFlower = "";
    }

    public void printSpeciesData(){
        System.out.println(insectName + " " + beeColor + " " + likesHoney + " " + numberOfLegs + " " + numOfWings
                + " " + favFlower);
    }

}
