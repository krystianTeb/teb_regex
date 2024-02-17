package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        var regex = "\\d";
        Pattern pattern = Pattern.compile(regex);

        while(true) {
            // Start - Pobieranie wartości od użytkownika
            Scanner scan = new Scanner(System.in);
            System.out.println("Proszę o podanie cyfry od 0-9: ");
            String liczba = scan.next();
            // Koniec - Pobieranie wartości od użytkownika
            Matcher matcher = pattern.matcher(liczba);

            if(matcher.matches() == false) {
                System.out.println("Podałeś złą wartość. Wprowadź cyfrę jeszcze raz!");
            }else{
                break;
            }
        }

    }
}