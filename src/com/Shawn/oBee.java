package com.Shawn;

/**
 * Created by Wolfknightx on 3/15/2016.
 * This subclass refers to bees and their insect type.
 */
public class oBee extends oinsect {
    protected String color;
    protected boolean likesHoney = true;
    protected String favFlower;

    public String getColor(){
        return color;
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
}
