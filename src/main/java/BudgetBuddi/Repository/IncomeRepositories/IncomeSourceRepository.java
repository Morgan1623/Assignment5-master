package BudgetBuddi.Repository.IncomeRepositories;

import BudgetBuddi.Domain.Income.IncomeSource;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface IncomeSourceRepository extends ImplementationRepository<IncomeSource, String>
{
    ArrayList<IncomeSource> getAll();
}//class
