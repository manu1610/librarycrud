package com.softitlan.library.model;

public class TautorBuilder {
	private TautorBuilder() {}
	public static TautorDTO fromVO (TautorVO courseVO){
		TautorVO origin = courseVO;
        TautorDTO destin = new TautorDTO();

        destin.setId(origin.getId());
        destin.setNombre(origin.getNombre());
        destin.setApellidoPaterno(origin.getApellidoPaterno());
        destin.setApellidoMaterno(origin.getApellidoMaterno());
        destin.setPaisOrigen(origin.getPaisOrigen());
        destin.setFechaNacimiento(origin.getFechaNacimiento());
        destin.setStatus(origin.getStatus());
        destin.setCreatedBy(origin.getCreatedBy());
        destin.setModifiedBy(origin.getModifiedBy());

        return destin;
    }

    public static TautorVO fromDTO (TautorDTO courseDTO){
    	TautorDTO origin = courseDTO;
        TautorVO destin = new TautorVO();

        destin.setId(origin.getId());
        destin.setNombre(origin.getNombre());
        destin.setApellidoPaterno(origin.getApellidoPaterno());
        destin.setApellidoMaterno(origin.getApellidoMaterno());
        destin.setPaisOrigen(origin.getPaisOrigen());
        destin.setFechaNacimiento(origin.getFechaNacimiento());
        destin.setStatus(origin.getStatus());
        destin.setCreatedBy(origin.getCreatedBy());
        destin.setModifiedBy(origin.getModifiedBy());

        return destin;
    }
}
