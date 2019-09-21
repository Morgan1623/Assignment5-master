package BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.EntertainmentServices;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Party;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface PartyService extends IServices<Party, String>
{
    ArrayList<Party> getAll();
}
