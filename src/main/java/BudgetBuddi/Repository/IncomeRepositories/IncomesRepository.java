package BudgetBuddi.Repository.IncomeRepositories;

import BudgetBuddi.Domain.Income.Incomes;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface IncomesRepository extends ImplementationRepository<Incomes, String>
{
    ArrayList<Incomes> getAll();
}//class
