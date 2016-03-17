package com.Shawn;

/**
 * Created by Wolfknightx on 3/15/2016.
 * This subclass refers to bees and their insect type.
 */
public class oBee extends oinsect {
    protected String beeColor;
    protected boolean makesHoney = false;
    protected String favFlower;

    public oBee(String name, String color, Boolean makesHoney, String favFlower, int wingCount){
        //Now set the variables to specifics.
        insectName = name;
        beeColor = color;
        this.makesHoney = makesHoney; //the "this." grabs the class variable which makes it easier to read.
        this.favFlower = favFlower;
        numOfWings = wingCount;
        //numberOfLegs = legs; //I played with this to add the legs then commented it out.
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
        if (makesHoney == true){
            System.out.println("This bee makes the honey! " + insectName + " " + beeColor + " "
                    + " " + numberOfLegs + " " + numOfWings + " " + favFlower);
        }else {
            System.out.println("This bee does not make the honey" + insectName + " "
                    + beeColor + " " + " " + numberOfLegs + " " + numOfWings + " " + favFlower);
        }
    }

}
