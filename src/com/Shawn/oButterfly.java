package com.Shawn;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Wolfknightx on 3/15/2016.
 * This is to be an "extension" of oinsect.
 */

public class oButterfly extends oinsect {
    protected String wingColor = "";
    protected String favoriteFlower = "";

    public String getWingColor(){
        return wingColor;
    }
    public void setWingColor(String wingColor){
        wingColor = "";
    }
    public String getFavoriteFlower(){
        return favoriteFlower;
    }
    public void setFavoriteFlower(String favoriteFlower){
        favoriteFlower = "";
    }

    public oButterfly(String name, String color, int wingCount, int legCount, String favFlower){
        //this is the constructor of a new butterfly.
        // There is no type so we ref- obutterfly and we don't pass anything in.
        insectName = name;
        wingColor = color;
        numOfWings = wingCount;
        favoriteFlower = favFlower;
        numberOfLegs = legCount;
    }

    public void printSpeciesData(){
        System.out.println(insectName + " " + wingColor + " " + numOfWings + " " + numberOfLegs
                + " " + favoriteFlower);
    }
}
