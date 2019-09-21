package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories;

import BudgetBuddi.Factory.ExpenseCategoryFactory.EntertainmentFactories.FitnessFactory;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface FitnessRepository extends ImplementationRepository<FitnessFactory, String>
{
    ArrayList<FitnessFactory> getAll();
}//class
