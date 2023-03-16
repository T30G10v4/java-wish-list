package org.lessons.java.christmas.bonus;

import org.lessons.java.christmas.ChristmasLetter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> wishes = new ArrayList<>();

        String choose = "";
        String wish = "";


        do {

            System.out.print("Inserisci un nuovo desiderio per Natale: ");
            wish = scan.nextLine();
            wishes.add(wish);
            System.out.print("Vuoi inserire un nuovo desiderio? S/N: ");
            choose = scan.nextLine();

        } while (!choose.equalsIgnoreCase("n"));


        Collections.sort(wishes);

        org.lessons.java.christmas.ChristmasLetter letter1 = new ChristmasLetter(" Luigino ", " via Milano 144 ", wishes);
        System.out.println(letter1.isGood());
        try {
            letter1.send();
        } catch (RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        //System.out.println(wishes.toString());

    }
}