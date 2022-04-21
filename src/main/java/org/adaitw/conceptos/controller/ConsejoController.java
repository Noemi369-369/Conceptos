package org.adaitw.conceptos.controller;

import org.adaitw.conceptos.entity.Consejos;
import org.adaitw.conceptos.service.ConsejoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="*")
@RequestMapping( path= "/consejos")
public class ConsejoController extends BaseControllerImpl<Consejos, ConsejoServiceImpl> {

}



