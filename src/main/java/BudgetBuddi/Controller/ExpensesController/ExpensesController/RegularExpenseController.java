package BudgetBuddi.Controller.ExpensesController.ExpensesController;

import BudgetBuddi.Domain.Expenses.Expense.RegularExpsenses;
import BudgetBuddi.Service.Services.ExpenseServices.ExpensesServices.RegularExpenseServices;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

@RestController
@RequestMapping("/RegularExpense")
public class RegularExpenseController
{
    @Autowired
    private RegularExpenseServices regularExpenseServices;

    @PostMapping("/create")
    @ResponseBody
    public RegularExpsenses create(RegularExpsenses regularExpsenses)
    {
        return regularExpenseServices.update(regularExpsenses);
    }

    @PostMapping("/update")
    @ResponseBody
    public RegularExpsenses update (RegularExpsenses regularExpsenses)
    {
        return regularExpenseServices.update(regularExpsenses);
    }

    @GetMapping
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        regularExpenseServices.delete(id);
    }

    @GetMapping
    @ResponseBody
    public void read(@PathVariable String id)
    {
        regularExpenseServices.delete(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<RegularExpsenses> getAll()

    {
        return regularExpenseServices.getAll();
    }



}//class
