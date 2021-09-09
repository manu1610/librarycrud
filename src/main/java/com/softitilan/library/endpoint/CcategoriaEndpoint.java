package com.softitilan.library.endpoint;

import com.softitilan.library.model.CcategoriaDTO;
import com.softitilan.library.service.CcategoriaService;
import mx.softitlan.utils.PagedList;
import mx.softitlan.utils.ResponseBody;
import mx.softitlan.utils.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ccategoria")

public class CcategoriaEndpoint {

    private static final Logger LOGGER = LoggerFactory.getLogger(CcategoriaEndpoint.class);

    @Autowired
    private CcategoriaService ccategoriaService;

    @PostMapping("/insert")
    public ResponseEntity<ResponseBody<Integer>> insert(@RequestBody CcategoriaDTO ccategoria){
        LOGGER.debug(">>>Insert()->ccategoria:{}",ccategoria);
        ResponseEntity<ResponseBody<Integer>> response=null;
        try{
            int nextId=ccategoriaService.insert(ccategoria);
            response= Utils.response200OK(nextId);
        }catch (Exception e){
            response=Utils.handle(e,"Error al insertar el nuevo registro");
        }
        return response;
    }

    @PostMapping("/update")
    public ResponseEntity<ResponseBody<Void>> update(@RequestParam("id") Integer id, @RequestBody Map<String,Object> data){
        LOGGER.debug(">>>> update->id: {}, ccategoria: {}",id,data);
        ResponseEntity<ResponseBody<Void>> response=null;
        try{
            ccategoriaService.update(id,data);
            response= Utils.response200OK();
        }catch (Exception e){
            response=Utils.handle(e,"Error al acutilizar el registro");
        }
        return response;
    }

    @GetMapping("/delete")
    public ResponseEntity<ResponseBody<Void>> delete(@RequestParam("id") Integer id){
        LOGGER.debug(">>>> delete->id: {}",id);
        ResponseEntity<ResponseBody<Void>> response=null;
        try{
            ccategoriaService.delete(id);
            response= Utils.response200OK();
        }catch (Exception e){
            response=Utils.handle(e,"Error al eliminar el registro");
        }
        return response;
    }

    @GetMapping("/findAll")
    public ResponseEntity<ResponseBody<List<CcategoriaDTO>>> findAll(@RequestParam("start") int start, @RequestParam("limit") int limit){
        LOGGER.debug(">>>> findAll <<<< start: {} limit: {}",start,limit);
        ResponseEntity<ResponseBody<List<CcategoriaDTO>>> response=null;
        PagedList<CcategoriaDTO> ccategoriaList=null;
        try{
            ccategoriaList = ccategoriaService.findAllPagedList(start,limit);
            response=Utils.response200OK(ccategoriaList.getList(), ccategoriaList.getTotal());
        }catch (Exception e){
            response=Utils.handle(e,"Error al encontrar la lista");
        }
        return response;
    }

}
