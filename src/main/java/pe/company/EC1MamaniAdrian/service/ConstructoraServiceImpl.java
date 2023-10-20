package pe.company.EC1MamaniAdrian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.company.EC1MamaniAdrian.model.Constructora;
import pe.company.EC1MamaniAdrian.repository.ConstructoraRepository;

import java.util.Collection;

@Service
public class ConstructoraServiceImpl implements ConstructoraService{

    @Autowired
    private ConstructoraRepository constructoraRepository;


    @Override
    public void insert(Constructora constructora) {
        constructoraRepository.insert(constructora);
    }

    @Override
    public void update(Constructora constructora) {
        constructoraRepository.update(constructora);
    }

    @Override
    public void delete(int codProyecto) {
        constructoraRepository.delete(codProyecto);
    }

    @Override
    public Constructora findById(int codProyecto) {
        return constructoraRepository.findById(codProyecto);
    }

    @Override
    public Collection<Constructora> findAll(){
        return constructoraRepository.findAll();
    }
}
