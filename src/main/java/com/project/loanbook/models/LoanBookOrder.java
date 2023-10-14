package com.project.loanbook.models;

import com.project.loanbook.abstracts.BookForLoan;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class LoanBookOrder {
    String loanID;
    Member member;
    BookForLoan loanBook;
    int loanDuration;
    double loanFee;
}
