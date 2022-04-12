package myownpractice;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {

        //Creating an array list
        ArrayList<String> carriers = new ArrayList<String>();
        carriers.add("BST");
        carriers.add("ATT");
        carriers.add("VZW");
        carriers.add("SPR");
        System.out.println(carriers);

        //getting one item from the list
        System.out.println(carriers.get(0));

        //Change an Item in the array list
        System.out.println(carriers.set(1, "GFI"));

    }

}
