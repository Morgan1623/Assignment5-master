package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.EntertainmentController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Party;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.EntertainmentServices.PartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Party")
public class PartyController
{
    @Autowired
    private PartyService partyService;

    @PostMapping("/create")
    @ResponseBody
    public Party create(Party party)
    {
        return partyService.update(party);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public Party update(Party party)
    {
        return partyService.update(party);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        partyService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public Party read(@PathVariable String id)
    {
        return partyService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<Party> getAll()

    {
        return partyService.getAll();
    }


}//class
