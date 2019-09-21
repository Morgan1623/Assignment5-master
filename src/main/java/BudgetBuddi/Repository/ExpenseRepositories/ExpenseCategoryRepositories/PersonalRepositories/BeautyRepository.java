package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Beauty;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface BeautyRepository extends ImplementationRepository<Beauty, String>
{
    ArrayList<Beauty> getAll();

}//class
