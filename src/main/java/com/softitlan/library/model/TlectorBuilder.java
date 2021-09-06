package com.softitlan.library.model;

public class TlectorBuilder {
	private TlectorBuilder() {}
	
	public static TlectorDTO fromVO (TlectorVO tlectorVO) {
		TlectorVO origin = tlectorVO;
		TlectorDTO destin = new TlectorDTO();
		
		destin.setId(origin.getId());
		destin.setNombre(origin.getNombre());
		destin.setApellidoPaterno(origin.getApellidoPaterno());
		destin.setApellidoMaterno(origin.getApellidoMaterno());
		destin.setDireccion(origin.getDireccion());
		destin.setTelefono(origin.getTelefono());
		destin.setStatus(origin.getStatus());
		destin.setCreatedAt(origin.getCreatedAt());
		destin.setCreatedBy(origin.getCreatedBy());
		destin.setModifiedAt(origin.getModifiedAt());
		destin.setModifiedBy(origin.getModifiedBy());
		
		return destin;
	}
	
	
	public static TlectorVO fromDTO (TlectorDTO tlectorDTO) {
		TlectorDTO origin = tlectorDTO;
		TlectorVO destin = new TlectorVO();
		
		destin.setId(origin.getId());
		destin.setNombre(origin.getNombre());
		destin.setApellidoPaterno(origin.getApellidoPaterno());
		destin.setApellidoMaterno(origin.getApellidoMaterno());
		destin.setDireccion(origin.getDireccion());
		destin.setTelefono(origin.getTelefono());
		destin.setStatus(origin.getStatus());
		destin.setCreatedAt(origin.getCreatedAt());
		destin.setCreatedBy(origin.getCreatedBy());
		destin.setModifiedAt(origin.getModifiedAt());
		destin.setModifiedBy(origin.getModifiedBy());
		
		return destin;
	}
}
