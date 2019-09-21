package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.TravelController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Travel.Uber;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.TravelServices.UberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Uber")
public class UberController
{

    @Autowired
    private UberService uberService;

    @PostMapping("/create")
    @ResponseBody
    public Uber create(Uber uber)
    {
        return uberService.update(uber);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Uber update(Uber uber)
    {
        return uberService.update(uber);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        uberService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Uber read(@PathVariable String id)
    {
        return uberService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Uber> getAll()

    {
        return uberService.getAll();
    }



}//class
