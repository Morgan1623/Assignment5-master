package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.PersonalController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Personal.Clothes;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.PersonalServices.ClothesServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Clothes")
public class ClothesController
{
    @Autowired
    private ClothesServices clothesServices;

    @PostMapping("/create")
    @ResponseBody
    public Clothes create(Clothes clothes)
    {
        return clothesServices.update(clothes);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Clothes update(Clothes clothes)
    {
        return clothesServices.update(clothes);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        clothesServices.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Clothes read(@PathVariable String id)
    {
        return clothesServices.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Clothes> getAll()

    {
        return clothesServices.getAll();
    }


}//class
