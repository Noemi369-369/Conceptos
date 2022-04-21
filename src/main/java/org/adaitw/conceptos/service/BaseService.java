package org.adaitw.conceptos.service;


import org.adaitw.conceptos.entity.Base;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base,ID extends Serializable> {


    public List<E> findAll() throws Exception;

    public E findById(ID id) throws Exception;

    public E save(E entity) throws Exception;

    public E update(ID id , E entity) throws Exception;

    public Boolean delete(ID id) throws Exception;

}




