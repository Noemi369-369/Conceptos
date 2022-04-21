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

public class Consejos  extends Base{

    @Column(name= "contenido_consejo")
    private String contenido_consejo;

    @Column (name="descripcion_consejo")
    private String descripcion_consejo;




}
