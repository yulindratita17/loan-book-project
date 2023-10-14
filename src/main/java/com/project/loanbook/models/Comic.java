package com.project.loanbook.models;

import com.project.loanbook.abstracts.BookForLoan;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Comic extends BookForLoan{
    String genre;

}
