package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Party;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface PartyRepository extends ImplementationRepository<Party, String>
{
    ArrayList<Party> getAll();
}//class
