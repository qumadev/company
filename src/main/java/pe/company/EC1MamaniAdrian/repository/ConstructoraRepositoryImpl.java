package pe.company.EC1MamaniAdrian.repository;

import org.springframework.stereotype.Repository;
import pe.company.EC1MamaniAdrian.model.Constructora;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Repository
public class ConstructoraRepositoryImpl implements ConstructoraRepository{
    public static Collection<Constructora> itemsConstructora = new ArrayList<>();

    @Override
    public void insert(Constructora constructora) {
        itemsConstructora.add(constructora);
    }

    @Override
    public void update(Constructora constructora) {
        Constructora oldConstructora = findById(constructora.getCodProyecto());
        itemsConstructora.remove(oldConstructora);

        Constructora newConstructora = new Constructora(constructora);
        itemsConstructora.add(newConstructora);
    }

    @Override
    public void delete(int instructorId) {
        Constructora oldConstructora = findById(instructorId);
        itemsConstructora.remove(oldConstructora);

    }

    @Override
    public Constructora findById(int instructorId) {
        Optional<Constructora> instructor = itemsConstructora.stream()
                .filter(p -> p.getCodProyecto() == instructorId)
                .findFirst();

        return instructor.orElse(null);
    }

    @Override
    public Collection<Constructora> findAll(){
        return itemsConstructora;
    }

}
