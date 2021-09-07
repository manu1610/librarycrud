package com.softitilan.library.service.impl;

import com.softitilan.library.model.CcategoriaBuilder;
import com.softitilan.library.model.CcategoriaDTO;
import com.softitilan.library.model.CcategoriaVO;
import com.softitilan.library.repository.CcategoriaRepository;
import com.softitilan.library.service.CcategoriaService;
import mx.softitlan.utils.PagedList;
import mx.softitlan.utils.Utils;
import mx.softitlan.utils.exception.AppException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CcategoriaServiceImpl implements CcategoriaService {

    private static final Logger LOG = LoggerFactory.getLogger(CcategoriaServiceImpl.class);

    @Autowired
    private CcategoriaRepository ccategoriaRepository;

    @Override
    public int insert(CcategoriaDTO ccategoriaDTO) throws AppException {
        int nextId=0;
        try{
            CcategoriaVO vo = CcategoriaBuilder.fromDTO(ccategoriaDTO);
            vo.setId(0);
            vo.setCreatedAt(new Date());
            vo.setModifiedAt(new Date());
            vo.setStatus(1);
            nextId = ccategoriaRepository.save(vo).getId();
        }catch (Exception e){
            Utils.raise(e,"Error al insertar una categoria");
        }
        return nextId;
    }

    @Override
    public void update(int id, Map<String, Object> data) throws AppException {
        LOG.debug(">>>> update->id: {}, ccategoria: {}",id,data);
        try{
            Optional<CcategoriaVO> ccategoriaOptional = ccategoriaRepository.findById(id);
            if(!ccategoriaOptional.isPresent()){
                throw new AppException("No existe el registro");
            }
            //tipo
            if(data.containsKey("tipo")){
                String tipo = data.get("tipo").toString();
                ccategoriaOptional.get().setTipo(tipo);
            }
            //modifiedBy
            if(data.containsKey("modifiedBy")){
                Integer modifiedBy = (Integer)data.get("modifiedBy");
                ccategoriaOptional.get().setModifiedBy(modifiedBy);
            }
            ccategoriaOptional.get().setModifiedAt(new Date());
            ccategoriaRepository.save(ccategoriaOptional.get());
        }catch (Exception e){
          Utils.raise(e,"Error al atualizar el registro");
        }
    }

    @Override
    public void delete(int id) throws AppException {
        try{
            Optional<CcategoriaVO> ccategoriaOptional = ccategoriaRepository.findById(id);
            if(!ccategoriaOptional.isPresent()){
                throw new AppException("No existe el registro");
            }
            if(ccategoriaOptional.get().getStatus()==0){
                throw new AppException("El registro a sido eliminado");
            }
            ccategoriaOptional.get().setStatus(0);
            ccategoriaRepository.save(ccategoriaOptional.get());
        }catch(Exception e){
            Utils.raise(e,"Error al eliminar el registro");
        }
    }

    @Override
    public PagedList<CcategoriaDTO> findAllPagedList(int start, int limit) throws AppException {
        PagedList<CcategoriaDTO> pagedList=null;
        try {
            List<CcategoriaVO> ccategoriaVOList = ccategoriaRepository.findAllActive();
            if(ccategoriaVOList.isEmpty()){
                throw new AppException("No se ecuentran registros");
            }

            List<CcategoriaDTO> tempList = new ArrayList<>();
            ccategoriaVOList.forEach(c->tempList.add(CcategoriaBuilder.fromVO(c)));
            pagedList = new PagedList<>(tempList,tempList.size(),start,limit);
        }catch(Exception e){
            Utils.raise(e,"Error al econtrar la paginacion");
        }
        return pagedList;
    }
}
