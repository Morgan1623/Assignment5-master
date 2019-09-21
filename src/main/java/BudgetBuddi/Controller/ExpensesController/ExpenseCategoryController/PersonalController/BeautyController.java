package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.PersonalController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Beauty;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.PersonalServices.BeautyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Beauty")
public class BeautyController
{
    @Autowired
    private BeautyServices beautyServices;

    @PostMapping("/create")
    @ResponseBody
    public Beauty create(Beauty beauty)
    {
        return beautyServices.update(beauty);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Beauty update(Beauty beauty)
    {
        return beautyServices.update(beauty);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        beautyServices.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Beauty read(@PathVariable String id)
    {
        return beautyServices.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Beauty> getAll()

    {
        return beautyServices.getAll();
    }


}//class
