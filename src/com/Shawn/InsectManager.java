package com.Shawn;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {
	// call the objects in the other classes and run the code.

        oButterfly newButterFly = new oButterfly("Monarch", "red and orange", 4, 70, "milkweed");
//        newButterFly.printSpeciesData();
        //when this touches material in the Superclass: oInsect for the legs it changes all of the material which
        //follows.

        oBee oneBee = new oBee("Killer Bee", "Light Red", false, "None: Likes human flesh", 6);
        //oneBee.printSpeciesData();

        oBee twoBee = new oBee ("Bumblebee", "Yellow and Black", true, "Poppies", 4);
        //twoBee.printSpeciesData();

        //create a linkedlist which will loop over the printSpecialData and add the information to the list.
        LinkedList<oInsect> insects = new LinkedList<oInsect>();
        insects.add(oneBee);
        insects.add(twoBee);
        insects.add(newButterFly);

        for (oInsect i: insects){
            i.printSpeciesData();
        }
    }
}
