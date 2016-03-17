package com.Shawn;

public class InsectManager {

    public static void main(String[] args) {
	// write your code here

        oButterfly newButterFly = new oButterfly("Monarch", "red and orange", 4, 70, "milkweed");
        newButterFly.printSpeciesData();
        //when this touches material in the Superclass: oInsect for the legs it changes all of the material which
        //follows.

        oBee oneBee = new oBee("Killer Bee", "Light Red", false, "None: Likes human flesh", 6);
        oneBee.printSpeciesData();

        oBee twoBee = new oBee ("Bumblebee", "Yellow and Black", true, "Any", 4);
        twoBee.printSpeciesData();
    }
}
