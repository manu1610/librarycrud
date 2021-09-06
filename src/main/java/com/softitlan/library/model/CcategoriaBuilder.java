package com.softitlan.library.model;


public class CcategoriaBuilder {
	private CcategoriaBuilder() {
		
	}
	
	public static CcategoriaDTO fromVO (CcategoriaVO courseVO){
		CcategoriaVO origin = courseVO;
        CcategoriaDTO destin = new CcategoriaDTO();

        destin.setId(origin.getId());
        destin.setTipo(origin.getTipo());
        destin.setCreatedBy(origin.getCreatedBy());
        destin.setModifiedBy(origin.getModifiedBy());

        return destin;
    }

    public static CcategoriaVO fromDTO (CcategoriaDTO courseDTO){
    	CcategoriaDTO origin = courseDTO;
        CcategoriaVO destin = new CcategoriaVO();

        destin.setId(origin.getId());
        destin.setTipo(origin.getTipo());
        destin.setCreatedBy(origin.getCreatedBy());
        destin.setModifiedBy(origin.getModifiedBy());

        return destin;
    }
}
