package pe.company.EC1MamaniAdrian.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import pe.company.EC1MamaniAdrian.model.Financiera;
import pe.company.EC1MamaniAdrian.repository.FinancieraRepository;

import java.util.Collection;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FinancieraServiceImpl implements FinancieraService{

    @Autowired
    private FinancieraRepository financieraRepository;

    @Override
    @Transactional
    public void insert(Financiera financiera){
        financieraRepository.save(financiera);
    }

    @Override
    @Transactional
    public void update(Financiera financiera){
        financieraRepository.save(financiera);
    }

    @Override
    @Transactional
    public void delete(int nroPrestamo){
        financieraRepository.deleteById(nroPrestamo);
    }

    @Override
    @Transactional(readOnly = true)
    public Financiera findById(int nroPrestamo){
        return financieraRepository.findById(nroPrestamo).orElse(null);
    }

    @Override
    @Transactional(readOnly = true)
    public Collection<Financiera> findAll(){
        return (Collection<Financiera>)financieraRepository.findAll();
    }
}
