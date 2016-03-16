package com.Shawn;

/**
 * Created by Wolfknightx on 3/14/2016.
 * Get and Sets have been set to public so that the information can be read and written as needed.
 */

public class oinsect {
    protected String insectName = "";
    protected int numOfWings = 0;
    protected static int numberOfLegs = 6;

    public String getInsectName(){
        return insectName;
    }
    public void setInsectName(String insectName){
        insectName = "";
    }

    public int getNumOfWings(){
        return numOfWings;
    }
    public void setNumOfWings(int numOfWings){
        numOfWings = 0;
    }

    public int getNumberOfLegs(){
        return numberOfLegs;
    }
    public void setNumberOfLegs(){
        numberOfLegs = 0;
    }
}
