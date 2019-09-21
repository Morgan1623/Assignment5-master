package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.PersonalRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Clothes;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface ClothesRepository extends ImplementationRepository<Clothes, String>
{
    ArrayList<Clothes> getAll();
}//class
