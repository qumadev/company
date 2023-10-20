package pe.company.EC1MamaniAdrian.repository;

import org.springframework.stereotype.Repository;
import pe.company.EC1MamaniAdrian.model.Financiera;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Repository
public class FinancieraRepositoryImpl implements FinancieraRepository{
    public static Collection<Financiera> itemsFinanciera = new ArrayList<>();

    @Override
    public void insert(Financiera financiera){
        itemsFinanciera.add(financiera);
    }

    @Override
    public void update(Financiera financiera){
        Financiera oldFinanciera = findById(financiera.getNroPrestamo());
        itemsFinanciera.remove(oldFinanciera);

        Financiera newFinanciera = new Financiera(financiera);
        itemsFinanciera.add(newFinanciera);
    }

    @Override
    public void delete(int nroPrestamo){
        Financiera financiera = findById(nroPrestamo);
        itemsFinanciera.remove(financiera);
    }

    @Override
    public Financiera findById(int nroPrestamo){
        Optional<Financiera> financiera = itemsFinanciera.stream()
                .filter(v -> v.getNroPrestamo() == nroPrestamo)
                .findFirst();

        return financiera.orElse(null);
    }

    @Override
    public Collection<Financiera> findAll(){
        return itemsFinanciera;
    }
}
