package com.softitilan.library.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
@Table(name = "tprestamos")
public class TprestamosVO implements Serializable  {
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    //Reference One: tprestamos.id_lector to tlector.id
    @ManyToOne
    @JoinColumn(name="idlector", referencedColumnName="id")
    private TlectorVO idLector;
    //Reference Two: tprestamos.id_libro to tlibro.id
    @ManyToOne
    @JoinColumn(name = "idLibro", referencedColumnName = "id")
    private TlibroVO idLibro;
    
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaPrestamo;
    
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaEntregaFija;
    
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date fechaEntrega;
    
    private int status;
    
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date creadoAt;
    
    private int creadoPor;
    
    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date modificadoAt;
    
    private int modificadoPor;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public TlectorVO getIdLector() {
		return idLector;
	}

	public void setIdLector(TlectorVO idLector) {
		this.idLector = idLector;
	}

	public TlibroVO getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(TlibroVO idLibro) {
		this.idLibro = idLibro;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaEntregaFija() {
		return fechaEntregaFija;
	}

	public void setFechaEntregaFija(Date fechaEntregaFija) {
		this.fechaEntregaFija = fechaEntregaFija;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getCreadoAt() {
		return creadoAt;
	}

	public void setCreadoAt(Date creadoAt) {
		this.creadoAt = creadoAt;
	}

	public int getCreadoPor() {
		return creadoPor;
	}

	public void setCreadoPor(int creadoPor) {
		this.creadoPor = creadoPor;
	}

	public Date getModificadoAt() {
		return modificadoAt;
	}

	public void setModificadoAt(Date modificadoAt) {
		this.modificadoAt = modificadoAt;
	}

	public int getModificadoPor() {
		return modificadoPor;
	}

	public void setModificadoPor(int modificadoPor) {
		this.modificadoPor = modificadoPor;
	}
	
	@Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
    }  
    

}