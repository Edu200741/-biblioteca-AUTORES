
package com.edu200741.autores.repository;

import com.edu200741.autores.model.Autores;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAutoresRepository extends JpaRepository<Autores,Long>{
    @Query("SELECT i FROM  Autores i WHERE :libros MEMBER OF i.libros")
    List<Autores> findAutoresBylibros(String libros);
    
}

