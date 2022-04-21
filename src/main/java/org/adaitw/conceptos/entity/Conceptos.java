package org.adaitw.conceptos.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;


@Entity
@Table( name= "Conceptos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class Conceptos extends Base {

    @Column(name = "nombre_concepto")
    private String nombre_concepto;
    @Column(name = "numero_concepto")
    private int numero_concepto;
    @Column(name = "contenido_concepto")
    private String contenido_concepto;

    @ManyToOne
    @JoinColumn(name = "contenido_pregunta")
    private Preguntas preguntas;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="descripcion_consejo")
     private Consejos consejos;
}
