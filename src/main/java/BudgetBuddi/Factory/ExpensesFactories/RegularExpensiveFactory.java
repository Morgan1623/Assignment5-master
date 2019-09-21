package BudgetBuddi.Factory.ExpensesFactories;

import BudgetBuddi.Domain.Expenses.Expense.RegularExpsenses;

import java.util.ArrayList;

public class RegularExpensiveFactory
{
    public static RegularExpsenses getRegularExpense (ArrayList<String> regularExpsensesList, double total, double amount)
    {
        return new RegularExpsenses.Builder()
                .regularExpsensesList(regularExpsensesList)

                .total(total)
                .amount(amount)
                .build();


    }
}
