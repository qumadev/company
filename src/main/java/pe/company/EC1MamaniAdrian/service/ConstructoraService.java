package pe.company.EC1MamaniAdrian.service;

import pe.company.EC1MamaniAdrian.model.Constructora;

import java.util.Collection;

public interface ConstructoraService {
    public abstract void insert(Constructora constructora);
    public abstract void update(Constructora constructora);
    public abstract void delete(int codProyecto);
    public abstract Constructora findById(int codProyecto);
    public abstract Collection<Constructora> findAll();
}
