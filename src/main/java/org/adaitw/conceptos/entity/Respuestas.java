package org.adaitw.conceptos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Respuestas  extends Base {

    @Column(name= "contenido_respuestas")
    private String contenido_respuestas;

    @Column( name="id_pregunta")
    private int id_pregunta;


    @Column(name= "es_correcta")
    private String es_correcta;
}
