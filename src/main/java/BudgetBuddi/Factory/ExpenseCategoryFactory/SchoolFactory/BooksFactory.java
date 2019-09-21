package BudgetBuddi.Factory.ExpenseCategoryFactory.SchoolFactory;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Books;

import java.util.Date;

public class BooksFactory
{
    public static Books getBooks (String description, int date, double total, double amount)
    {
        return new Books.Builder().description(description)
                .date(date)
                .total(total)
                .amount(amount)
                .build();


    }
}
