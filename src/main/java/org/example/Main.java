package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        var regex = "\\d{4}";//"[0-9]{4}"
        Pattern pattern = Pattern.compile(regex);

        while(true) {
            // Start - Pobieranie wartości od użytkownika
            Scanner scan = new Scanner(System.in);
            System.out.println("Proszę o podanie pinu (Cztery cyfry 0-9): ");
            String liczba = scan.next();
            // Koniec - Pobieranie wartości od użytkownika
            Matcher matcher = pattern.matcher(liczba);

            if(matcher.matches()) {
                break;
            }else{
                System.out.println("Podałeś złą wartość. Wprowadź cyfry jeszcze raz!");
            }
        }

    }
}