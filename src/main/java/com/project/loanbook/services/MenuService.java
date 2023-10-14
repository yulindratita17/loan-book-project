package com.project.loanbook.services;

import java.util.List;

import com.project.loanbook.abstracts.BookForLoan;
import com.project.loanbook.models.Member;
import com.project.loanbook.repositories.BookForLoanRepository;
import com.project.loanbook.repositories.MemberRepository;

public class MenuService {

    public static void runApp(){
        List<BookForLoan> listBookForLoan = BookForLoanRepository.getAllBookForLoan();
        List<Member> listMember = MemberRepository.getAllMember();

        mainMenu(listBookForLoan, listMember);
        
    }

    public static void mainMenu(List<BookForLoan> listBookForLoan, List<Member> listMember) {
        String[] listMainMenu = { "Data All Book For Loan", "Loan", "Return", "Data All Loan Book Order", "Exit" };
        boolean isLooping = true;
        int optionMenu;

        do {
            PrintService.printMenu("Main Menu", listMainMenu);
            optionMenu = ValidationService.validateNumberWithRange("Choose item: ", "Only number accepted",
                    ValidationService.regexNumber, 0, 4);

            switch (optionMenu) {
                case 1:
                PrintService.printDataBookForLoan("Data Book For Loan", listBookForLoan);

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 0:
                    isLooping = false;

                    break;

            }

        } while (isLooping);
    }
}
