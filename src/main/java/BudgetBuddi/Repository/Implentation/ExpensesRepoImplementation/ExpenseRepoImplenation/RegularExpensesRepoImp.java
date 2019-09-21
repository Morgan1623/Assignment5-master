package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseRepoImplenation;

import BudgetBuddi.Domain.Expenses.Expense.RegularExpsenses;
import BudgetBuddi.Repository.ExpenseRepositories.ExpensesRepositories.RegularExpenseRepository;

import java.util.ArrayList;

public class RegularExpensesRepoImp implements RegularExpenseRepository
{

    private static RegularExpensesRepoImp repository = null;
    ArrayList<RegularExpsenses> regExpenses;

    private RegularExpensesRepoImp() {this.regExpenses = new ArrayList<>();}

    public static RegularExpensesRepoImp getRepository()
    {
        if(repository == null) repository = new RegularExpensesRepoImp();
        return repository;

    }//method


    public ArrayList<RegularExpsenses> getAll()
    {
        return this.regExpenses;
    }


    public RegularExpsenses create(RegularExpsenses regularExpsenses)
    {
        this.regExpenses.add(regularExpsenses);
        return null;
    }


    public RegularExpsenses update(RegularExpsenses regularExpsenses)
    {
        this.regExpenses.set(1, null);
        return null;
    }


    public void delete(String s)
    {
        //find the expense and delete it if it exsists
        this.regExpenses.remove(regExpenses);


    }


    public RegularExpsenses read(String s)
    {
        //find the expense that matches id and return it if it exists
        {
            for (int i = 0; i < regExpenses.size(); i++)
                System.out.println(regExpenses.get(i));

            return null;
        }

    }
}//class
