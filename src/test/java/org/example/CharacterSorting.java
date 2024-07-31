package org.example;

import java.util.Arrays;

public class CharacterSorting {
    public static  String sortCharacters (String text){
     text = text.toLowerCase().replaceAll("[^a-z]","");
     char[] chars= text.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }

    public static void main(String[] args) {
        String text= "When not studying nuclear physics, Bambi likes to play\n" +
                "beach volleyball.";
        String afterSorting = sortCharacters(text);
        System.out.println(afterSorting);
    }
}

