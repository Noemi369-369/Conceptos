package org.adaitw.conceptos.service;

import org.adaitw.conceptos.entity.Preguntas;
import org.adaitw.conceptos.repository.BaseRepository;
import org.adaitw.conceptos.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PreguntaServiceImpl extends BaseServiceImpl<Preguntas, Long> implements PreguntaService {
    @Autowired
    private PreguntaRepository preguntaRepository;

    public PreguntaServiceImpl(BaseRepository<Preguntas, Long> baseRepository) {
        super(baseRepository);
    }

}

