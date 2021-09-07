package com.softitilan.library.repository;

import com.softitilan.library.model.CcategoriaVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CcategoriaRepository extends JpaRepository<CcategoriaVO, Integer> {
    List<CcategoriaVO> findAllActive();
    CcategoriaVO findByType(@Param("type") String type);
}
