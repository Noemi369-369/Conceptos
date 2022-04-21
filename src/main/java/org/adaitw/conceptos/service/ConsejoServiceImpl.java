package org.adaitw.conceptos.service;

import org.adaitw.conceptos.entity.Conceptos;
import org.adaitw.conceptos.entity.Consejos;
import org.adaitw.conceptos.repository.BaseRepository;
import org.adaitw.conceptos.repository.ConsejosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsejoServiceImpl extends BaseServiceImpl<Consejos, Long > implements ConsejoService {

    @Autowired
    private ConsejosRepository consejosRepository;

    public ConsejoServiceImpl(BaseRepository<Consejos, Long> baseRepository) {
        super(baseRepository);

    }

}






