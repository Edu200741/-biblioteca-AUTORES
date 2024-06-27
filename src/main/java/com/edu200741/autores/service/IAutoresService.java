
package com.edu200741.autores.service;

import com.edu200741.autores.model.Autores;
import java.util.List;


public interface IAutoresService {
    
    public void saveAutores(Autores autores);
    public void deleteAutores(Long id);
    public void editAutores(Long id, Autores autores);
    public List<Autores> getAutores();
    public Autores findAutoresById(Long id);
    public List<Autores> findAutoresByLibros(String libros);
}
