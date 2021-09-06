package com.softitlan.library.model;

public class TlectorBuilder {
	private TlectorBuilder() {}
	
	public static TlectorDTO fromVO (TlectorVO tlectorVO) {
		TlectorVO origin = tlectorVO;
		TlectorDTO destin = new TlectorDTO();
		
		origin.setId(destin.getId());
		origin.setNombre(destin.getNombre());
		origin.setApellidoPaterno(destin.getApellidoPaterno());
		origin.setApellidoMaterno(destin.getApellidoMaterno());
		origin.setDireccion(destin.getDireccion());
		origin.setTelefono(destin.getTelefono());
		origin.setStatus(destin.getStatus());
		origin.setCreatedAt(destin.getCreatedAt());
		origin.setCreatedBy(destin.getCreatedBy());
		origin.setModifiedAt(destin.getModifiedAt());
		origin.setModifiedBy(destin.getModifiedBy());
		
		return destin;
	}
	
	
	public static TlectorVO fromDTO (TlectorDTO tlectorDTO) {
		TlectorDTO origin = tlectorDTO;
		TlectorVO destin = new TlectorVO();
		
		origin.setId(destin.getId());
		origin.setNombre(destin.getNombre());
		origin.setApellidoPaterno(destin.getApellidoPaterno());
		origin.setApellidoMaterno(destin.getApellidoMaterno());		
		origin.setDireccion(destin.getDireccion());
		origin.setTelefono(destin.getTelefono());
		origin.setStatus(destin.getStatus());
		origin.setCreatedAt(destin.getCreatedAt());
		origin.setCreatedBy(destin.getCreatedBy());
		origin.setModifiedAt(destin.getModifiedAt());
		origin.setModifiedBy(destin.getModifiedBy());
		
		return destin;
	}
}
