package org.adaitw.conceptos.controller;

import org.adaitw.conceptos.entity.Preguntas;
import org.adaitw.conceptos.service.PreguntaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins ="*")
@RequestMapping( path= "/preguntas")
public class PreguntaController extends BaseControllerImpl<Preguntas, PreguntaServiceImpl> {


}
