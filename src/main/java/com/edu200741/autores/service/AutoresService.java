
package com.edu200741.autores.service;

import com.edu200741.autores.model.Autores;
import com.edu200741.autores.repository.IAutoresRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoresService implements IAutoresService{
    
    @Autowired
    private IAutoresRepository repo;

    @Override
    public void saveAutores(Autores autores) {
        repo.save(autores);
    
    }

    @Override
    public void deleteAutores(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void editAutores(Long id, Autores autores) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Autores> getAutores() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Autores findAutoresById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Autores> findAutoresByLibros(String libros) {
        return repo.findAutoresBylibros(libros);
    }
    
}
