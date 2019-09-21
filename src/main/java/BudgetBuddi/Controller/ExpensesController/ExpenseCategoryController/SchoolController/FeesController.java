package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.SchoolController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.School.Fees;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.SchoolServices.FeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Fees")
public class FeesController
{
    @Autowired
    private FeesService feesService;

    @PostMapping("/create")
    @ResponseBody
    public Fees create(Fees fees)
    {
        return feesService.update(fees);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Fees update(Fees fees)
    {
        return feesService.update(fees);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        feesService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Fees read(@PathVariable String id)
    {
        return feesService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Fees> getAll()

    {
        return feesService.getAll();
    }



}//class
