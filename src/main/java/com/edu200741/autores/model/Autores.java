
package com.edu200741.autores.model;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

 @Getter @Setter
 @AllArgsConstructor
 @NoArgsConstructor
 @Entity
public class Autores {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String nacionalidad;
    @Temporal(TemporalType.DATE)
    private LocalDate fechaNac;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<String> libros;
}
