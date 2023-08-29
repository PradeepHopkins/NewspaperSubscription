package org.input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NewspaperSubscription {

    static class Newspaper {
        String name;
        double[] dailyCost;

        public Newspaper(String name, double[] dailyCost) {
            this.name = name;
            this.dailyCost = dailyCost;
        }

        public double calculateWeeklyCost() {
            return Arrays.stream(dailyCost).sum();
        }
    }

    public static List<List<String>> getPossibleCombinations(double budget, Newspaper... newspapers) {
        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < newspapers.length; i++) {
            for (int j = i + 1; j < newspapers.length; j++) {
                if (newspapers[i].calculateWeeklyCost() + newspapers[j].calculateWeeklyCost() <= budget) {
                    result.add(Arrays.asList(newspapers[i].name, newspapers[j].name));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Newspaper TOI = new Newspaper("TOI", new double[]{3, 3, 3, 3, 3, 5, 6});
        Newspaper Hindu = new Newspaper("Hindu", new double[]{2.5, 2.5, 2.5, 2.5, 2.5, 4, 4});
        Newspaper ET = new Newspaper("ET", new double[]{4, 4, 4, 4, 4, 4, 10});
        Newspaper BM = new Newspaper("BM", new double[]{1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5});
        Newspaper HT = new Newspaper("HT", new double[]{2, 2, 2, 2, 2, 4, 4});

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your budget: ");
        double budget = scanner.nextDouble();

        List<List<String>> combinations = getPossibleCombinations(budget, TOI, Hindu, ET, BM, HT);
        System.out.println("For budget " + budget + ", possible combinations: " + combinations);
    }
}
