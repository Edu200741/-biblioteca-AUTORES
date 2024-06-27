
package com.edu200741.autores.controller;

import com.edu200741.autores.model.Autores;
import com.edu200741.autores.service.AutoresService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AutoresController {
    @Autowired
    private AutoresService serv;
    
    @PostMapping("/save")
    public String saveAutor(@RequestBody Autores autor){
        serv.saveAutores(autor);
        return "guardado con exito";
    }
    
    @GetMapping("/libro/{titulo}")
    public List<Autores> findLibroByTitulo(@PathVariable String titulo){
        return serv.findAutoresByLibros(titulo);
    }
    
    @DeleteMapping("/delete/{id}")
    public String deleteAutor(@PathVariable Long id){
        serv.deleteAutores(id);
        return "eliminado con exito";
    }
    
    @PutMapping("/edit")
    public String editAutor(@RequestBody Autores autor){
        serv.editAutores(autor);
        return "editado con exito";
    }
    
    @GetMapping("/findById/{id}")
    public Autores findAutoresById(Long id){
        return serv.findAutoresById(id);
    }
}
