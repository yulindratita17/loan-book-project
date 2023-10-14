package com.project.loanbook.services;

public class PrintService {
    public static void printMenu(String title, String[] listMenu) {
        int number = 1;
        String formatTabel = "| %-3s | %-48s |%n";
        System.out.println(title);
        System.out.println("==========================================================");
        System.out.printf(formatTabel, "No", "Menu");
        System.out.println("==========================================================");

        for (String menu : listMenu) {
            if (number == listMenu.length) {
                System.out.printf(formatTabel, 0, menu);
            }else {
                System.out.printf(formatTabel, number, menu);
            }
            number++;
        }
        System.out.println("==========================================================");
    }
}
