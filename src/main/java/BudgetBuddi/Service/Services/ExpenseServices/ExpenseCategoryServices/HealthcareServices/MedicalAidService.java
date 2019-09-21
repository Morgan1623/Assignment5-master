package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HealthcareServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Healthcare.MedicalAid;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface MedicalAidService extends IServices<MedicalAid, String>
{
    ArrayList<MedicalAid> getAll();
}
