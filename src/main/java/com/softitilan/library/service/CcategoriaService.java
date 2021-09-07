package com.softitilan.library.service;

import com.softitilan.library.model.CcategoriaDTO;
import mx.softitlan.utils.PagedList;
import mx.softitlan.utils.exception.AppException;

import java.util.Map;


public interface CcategoriaService {
    int insert(CcategoriaDTO ccategoriaDTO) throws AppException;
    void update(int id,Map<String, Object> data) throws AppException;
    void delete(int id) throws AppException;
    PagedList<CcategoriaDTO> findAllPagedList(int start,int limit) throws AppException;
}
