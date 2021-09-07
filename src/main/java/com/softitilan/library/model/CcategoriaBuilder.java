package com.softitilan.library.model;


public class CcategoriaBuilder {
	private CcategoriaBuilder() {
		
	}
	
	public static CcategoriaDTO fromVO (CcategoriaVO ccategoriaVO){
		CcategoriaVO origin = ccategoriaVO;
        CcategoriaDTO destin = new CcategoriaDTO();

        destin.setId(origin.getId());
        destin.setTipo(origin.getTipo());
        destin.setCreatedBy(origin.getCreatedBy());
        destin.setModifiedBy(origin.getModifiedBy());

        return destin;
    }

    public static CcategoriaVO fromDTO (CcategoriaDTO ccategoriaDTO){
    	CcategoriaDTO origin = ccategoriaDTO;
        CcategoriaVO destin = new CcategoriaVO();

        destin.setId(origin.getId());
        destin.setTipo(origin.getTipo());
        destin.setCreatedBy(origin.getCreatedBy());
        destin.setModifiedBy(origin.getModifiedBy());

        return destin;
    }
}
