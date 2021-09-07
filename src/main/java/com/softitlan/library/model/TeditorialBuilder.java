package com.softitlan.library.model;

public class TeditorialBuilder {
	private TeditorialBuilder() {
		
	}
	
	public static TeditorialDTO fromVO (TeditorialVO TeditorialVO ) {
		TeditorialVO origin= TeditorialVO;
		TeditorialDTO destin= new TeditorialDTO();
		
		destin.setId(origin.getId());
		destin.setName(origin.getName());
		destin.setNumeroPublicaciones(origin.getNumeroPublicaciones());
		destin.setPaisOrigen(origin.getPaisOrigen());
		destin.setCorreo(origin.getCorreo());
		destin.setDireccion(origin.getDireccion());
		destin.setPaginaWeb(origin.getPaginaWeb());
		destin.setCreatedBy(origin.getCreatedBy());
	    destin.setModifiedBy(origin.getModifiedBy());
		
		return destin;
	}
	
	public static TeditorialVO fromDTO (TeditorialDTO TeditorialDTO ) {
		TeditorialDTO origin= TeditorialDTO;
		TeditorialVO destin= new TeditorialVO();
		
		destin.setId(origin.getId());
		destin.setName(origin.getName());
		destin.setNumeroPublicaciones(origin.getNumeroPublicaciones());
		destin.setPaisOrigen(origin.getPaisOrigen());
		destin.setCorreo(origin.getCorreo());
		destin.setDireccion(origin.getDireccion());
		destin.setPaginaWeb(origin.getPaginaWeb());
		destin.setCreatedBy(origin.getCreatedBy());
	    destin.setModifiedBy(origin.getModifiedBy());
		
		return destin;
	}
}
