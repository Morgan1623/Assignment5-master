package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.HealthCareController;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Healthcare.MedicalAid;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HealthcareServices.MedicalAidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/MedicalAid")
public class MedicalAidController
{

    @Autowired
    private MedicalAidService medicalAidService;

    @PostMapping("/create")
    @ResponseBody
    public MedicalAid create(MedicalAid medicalAid)
    {
        return medicalAidService.update(medicalAid);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public MedicalAid update(MedicalAid medicalAid)
    {
        return medicalAidService.update(medicalAid);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        medicalAidService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public MedicalAid read(@PathVariable String id)
    {
        return medicalAidService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<MedicalAid> getAll()

    {
        return medicalAidService.getAll();
    }

}
