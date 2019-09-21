package BudgetBuddi.Service;

public interface IServices<TYPE, ID>
{
    TYPE create (TYPE type);
    TYPE update (TYPE type);
    void delete(ID id);
    TYPE read(ID id);

}
