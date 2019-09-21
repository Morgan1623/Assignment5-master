package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.CarController;


import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car.Petrol;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.CarServices.PetrolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Petrol")
public class PetrolController
{
    @Autowired
    private PetrolService petrolService;

    @PostMapping("/create")
    @ResponseBody
    public Petrol create(Petrol petrol)
    {
        return petrolService.update(petrol);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Petrol update(Petrol petrol)
    {
        return petrolService.update(petrol);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        petrolService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Petrol read(@PathVariable String id)
    {
        return petrolService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Petrol> getAll()

    {
        return petrolService.getAll();
    }

}//class
