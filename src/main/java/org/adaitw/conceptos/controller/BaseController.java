package org.adaitw.conceptos.controller;

import org.adaitw.conceptos.entity.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController<E extends Base, ID extends Serializable>{

    public ResponseEntity<?>getAll();
    public ResponseEntity<?>getOne(@PathVariable Long id);
    public ResponseEntity<?>save (@RequestBody E entity);
    public ResponseEntity<?>update (@PathVariable Long id, @RequestBody E entity);
    public ResponseEntity<?>delete(@PathVariable Long id);
}

