package com.project.loanbook.services;

public class MenuService {
    
    public static void mainMenu(){
        String[] listMainMenu = {"Data All Book For Loan", "Loan", "Return", "Data All Loan Book Order", "Exit"};
        boolean isLooping = true;
        int optionMenu;

        do {
            PrintService.printMenu("Main Menu", listMainMenu);
            
        } while (isLooping);
    }
}
