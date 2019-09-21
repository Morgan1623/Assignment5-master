package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.EntertainmentController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Fitness;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.EntertainmentServices.FitnessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Fitness")
public class FitnessController
{
    @Autowired
    private FitnessService fitnessService;

    @PostMapping("/create")
    @ResponseBody
    public Fitness create(Fitness fitness)
    {
        return fitnessService.update(fitness);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Fitness update(Fitness fitness)
    {
        return fitnessService.update(fitness);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        fitnessService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Fitness read(@PathVariable String id)
    {
        return fitnessService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Fitness> getAll()

    {
        return fitnessService.getAll();
    }

}//class
