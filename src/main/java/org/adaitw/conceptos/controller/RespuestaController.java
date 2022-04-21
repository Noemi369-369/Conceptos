package org.adaitw.conceptos.controller;

import org.adaitw.conceptos.entity.Respuestas;
import org.adaitw.conceptos.service.RespuestaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping( path= "/conceptos")
public class RespuestaController extends BaseControllerImpl<Respuestas, RespuestaServiceImpl> {


}
