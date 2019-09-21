package BudgetBuddi.Controller.ExpensesController.ExpensesController;

import BudgetBuddi.Domain.Expenses.Expense.Expense;
import BudgetBuddi.Service.Services.ExpenseServices.ExpensesServices.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Expense")
public class ExpenseController
{
    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/create")
    @ResponseBody
    public Expense create(Expense expense)
    {
        return expenseService.update(expense);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Expense update(Expense expense)
    {
        return expenseService.update(expense);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        expenseService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Expense read(@PathVariable String id)
    {
        return expenseService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Expense> getAll()

    {
        return expenseService.getAll();
    }


}//class
