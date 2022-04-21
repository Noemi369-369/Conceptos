package org.adaitw.conceptos.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="Preguntas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Preguntas extends Base {

    @Column(name= "contenido_pregunta")
    private String contenido_pregunta;

    @OneToOne
    @JoinColumn(name = "respuestas_id")
    private Respuestas respuestas;

}
