package com.softitilan.library.model;

public class TlibroBuilder {

	private TlibroBuilder() {}
	
	public static TlibroDTO fromVO (TlibroVO tlibroVO) {
		TlibroVO origin = tlibroVO;
		TlibroDTO destin = new TlibroDTO();
		
		destin.setId(origin.getId());
		destin.setTitulo(origin.getTitulo());
		destin.setIdAutor(origin.getIdAutor());
		destin.setAnioPublicacion(origin.getAnioPublicacion());
		destin.setIdEditorial(origin.getIdEditorial());
		destin.setEdicion(origin.getEdicion());
		destin.setIsbn(origin.getIsbn());
		destin.setNumeroPaginas(origin.getNumeroPaginas());
		destin.setIdCategoria(origin.getIdCategoria());
		destin.setCantidadLibros(origin.getCantidadLibros());
        destin.setCreatedBy(origin.getCreatedBy());
        destin.setModifiedBy(origin.getModifiedBy());
		
		return destin;
	}
	
	public static TlibroVO fromDTO (TlibroDTO tlibroDTO) {
		TlibroDTO origin = tlibroDTO;
		TlibroVO destin = new TlibroVO();
		
		destin.setId(origin.getId());
		destin.setTitulo(origin.getTitulo());
		destin.setIdAutor(origin.getIdAutor());
		destin.setAnioPublicacion(origin.getAnioPublicacion());
		destin.setIdEditorial(origin.getIdEditorial());
		destin.setEdicion(origin.getEdicion());
		destin.setIsbn(origin.getIsbn());
		destin.setNumeroPaginas(origin.getNumeroPaginas());
		destin.setIdCategoria(origin.getIdCategoria());
		destin.setCantidadLibros(origin.getCantidadLibros());
        destin.setCreatedBy(origin.getCreatedBy());
        destin.setModifiedBy(origin.getModifiedBy());
		
		return destin;
	}
}
