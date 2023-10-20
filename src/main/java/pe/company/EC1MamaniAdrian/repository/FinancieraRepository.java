package pe.company.EC1MamaniAdrian.repository;

import pe.company.EC1MamaniAdrian.model.Financiera;

import java.util.Collection;

public interface FinancieraRepository {
    public abstract void insert(Financiera financiera);
    public abstract void update(Financiera financiera);
    public abstract void delete(int nroPrestamo);
    public abstract Financiera findById(int nroPrestamo);
    public abstract Collection<Financiera> findAll();
}
