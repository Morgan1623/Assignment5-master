package BudgetBuddi.Repository;

public interface ImplementationRepository <T, ID>
{
    T create(T t);
    T update(T t);
    void delete (ID id);
    T read (ID id);

}//class
