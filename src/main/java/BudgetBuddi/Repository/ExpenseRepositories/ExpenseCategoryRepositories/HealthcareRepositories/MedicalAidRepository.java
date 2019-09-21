package BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HealthcareRepositories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Healthcare.MedicalAid;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface MedicalAidRepository extends ImplementationRepository<MedicalAid, String>
{
    ArrayList<MedicalAid> getAll();
}//class
