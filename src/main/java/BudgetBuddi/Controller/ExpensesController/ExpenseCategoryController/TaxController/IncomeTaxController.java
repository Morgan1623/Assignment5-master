package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.TaxController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Tax.IncomeTax;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TaxServices.IncomeTaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/IncomeTax")
public class IncomeTaxController
{
    @Autowired
    private IncomeTaxService incomeTaxService;

    @PostMapping("/create")
    @ResponseBody
    public IncomeTax create(IncomeTax incomeTax)
    {
        return incomeTaxService.update(incomeTax);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public IncomeTax update(IncomeTax incomeTax)
    {
        return incomeTaxService.update(incomeTax);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        incomeTaxService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public IncomeTax read(@PathVariable String id)
    {
        return incomeTaxService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<IncomeTax> getAll()

    {
        return incomeTaxService.getAll();
    }



}//class
