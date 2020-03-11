package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input the Sami's massage:  ");
        StringBuilder s = new StringBuilder(input.next());

        int counter = 0;
        char temp;
        char char1 = 'S';
        char char2 = 'O';
        System.out.print("\nThe Corruption letter is : ");
        for (int i = 0; i < s.length(); i++) {
            temp = s.charAt(i);
            if (temp != char1 && temp != char2 ){
                counter++;
                System.out.print(temp);
            }
        }

        int del = 0;
        int numberOfDeletedLetter = s.length() % 3 ;
        if (numberOfDeletedLetter != 0){
            del = 3 - numberOfDeletedLetter;
            counter += del;
        }

        System.out.println(numberOfDeletedLetter);

        System.out.println("\nThe number of letters that were deleted : "+del);
        System.out.println("\nThe number of letters that were altered : "+counter);

    }
}
