package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class  Main {

    static String addAndSubtract(String s, String t, int k) {

        int similar = 0;
        int changes = 0;

        while ((similar < s.length() & similar < t.length()) &&
                (s.charAt(similar) == t.charAt(similar))) {
            similar++;
        }

        changes = s.length() - similar;

        changes = changes + (t.length() - similar);

        if (changes == k)
            return "Yes";
        else if (changes < k) {
            for (int j = 0; j < similar; j++) {
                changes += 2;
                if (changes == k)
                    return "Yes";
            }
            if (changes < k)
                return "Yes";
            else return "No";
        } else
            return "No";

    }

    public static void main(String[] args) throws IOException {


        try (Scanner scanner = new Scanner(new FileReader("tests.txt"))) {


            int numberOfTest = scanner.nextInt();
            for (int i = 0; i < numberOfTest; i++) {
                String first = scanner.next();
                String second = scanner.next();
                int numOfChanges = scanner.nextInt();
                System.out.println(addAndSubtract(first, second, numOfChanges));
            }

        }
    }
}