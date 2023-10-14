package com.project.loanbook.services;

import java.util.List;

import com.project.loanbook.abstracts.BookForLoan;

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
            } else {
                System.out.printf(formatTabel, number, menu);
            }
            number++;
        }
        System.out.println("==========================================================");
    }

    public static void printDataBookForLoan(String tittle, List<BookForLoan> listBook) {
        int num = 1;
        String formatTabel = "| %-4s | %-10s | %-45s | %-20s | %-5s |%n";
        System.out.println("\n====================================================================================================");
        System.out.printf("| %-96s |%n", tittle);
        System.out.println("====================================================================================================");
        System.out.printf(formatTabel, "No", "Book ID", "Tittle", "Author", "Stock");
        System.out.println("====================================================================================================");

        for (BookForLoan bookForLoan : listBook) {
            System.out.printf(formatTabel, num, bookForLoan.getBookID(), bookForLoan.getTittle(), bookForLoan.getAuthor(), bookForLoan.getStock());
            num++;
        }
        System.out.println("====================================================================================================\n");

    }
}
