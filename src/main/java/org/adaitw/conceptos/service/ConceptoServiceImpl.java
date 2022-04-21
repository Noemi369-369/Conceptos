package org.adaitw.conceptos.service;

import org.adaitw.conceptos.entity.Conceptos;
import org.adaitw.conceptos.repository.BaseRepository;
import org.adaitw.conceptos.repository.ConceptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConceptoServiceImpl extends BaseServiceImpl<Conceptos, Long> implements ConceptoService {
   @Autowired
   private ConceptoRepository conceptoRepository;

    public ConceptoServiceImpl (BaseRepository<Conceptos, Long> baseRepository ){
      super (baseRepository);






   }
}

