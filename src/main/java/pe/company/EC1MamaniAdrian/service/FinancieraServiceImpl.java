package pe.company.EC1MamaniAdrian.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.company.EC1MamaniAdrian.model.Financiera;
import pe.company.EC1MamaniAdrian.repository.FinancieraRepository;

import java.util.Collection;

@Service
public class FinancieraServiceImpl implements FinancieraService{

    @Autowired
    private FinancieraRepository financieraRepository;

    @Override
    public void insert(Financiera financiera){
        financieraRepository.insert(financiera);
    }

    @Override
    public void update(Financiera financiera){
        financieraRepository.update(financiera);
    }

    @Override
    public void delete(int nroPrestamo){
        financieraRepository.delete(nroPrestamo);
    }

    @Override
    public Financiera findById(int nroPrestamo){
        return financieraRepository.findById(nroPrestamo);
    }

    @Override
    public Collection<Financiera> findAll(){
        return financieraRepository.findAll();
    }
}
