package org.adaitw.conceptos.service;


import org.adaitw.conceptos.entity.Respuestas;
import org.adaitw.conceptos.repository.BaseRepository;
import org.adaitw.conceptos.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaServiceImpl extends BaseServiceImpl<Respuestas, Long> implements RespuestaService {
    @Autowired
    private RespuestaRepository respuestaRepository;

    public RespuestaServiceImpl(BaseRepository<Respuestas, Long> baseRepository) {
        super(baseRepository);
    }
}

