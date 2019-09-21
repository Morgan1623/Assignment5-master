package BudgetBuddi.Repository.IncomeRepositories;

import BudgetBuddi.Domain.Income.RegularIncome;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface RegularIncomeRepository extends ImplementationRepository<RegularIncome, String>
{
    ArrayList<RegularIncome> getAll();
}//class
