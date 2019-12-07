package com.farma.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//clases singulares y tablas en plural
@Entity
@Table(name = "patients")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Ingrese nombre")
	@Column(name = "name",nullable = false,length = 90)
	private String fistName;
	
	@NotEmpty(message = "Ingrese apellido")
	@Column(name = "name",nullable = false,length = 90)
	private String lastName;

	@Size(min=8,max=8)
	@NotEmpty(message = "Ingrese dni")
	@Column(name = "dni",nullable = false,length = 8)
	private String dni;
	
	/*RELACION*/
	@OneToMany(mappedBy = "patientId",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Sign> signosVitales;//1 paciente tiene varios ginos
	
	@OneToMany(mappedBy = "patientId",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Voucher> vouchers;//1 paciente tiene varios vouchers
	/*END RELACION*/
	
	public Patient() {
	signosVitales=new ArrayList<>();
	vouchers=new ArrayList<>();
	
	}
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public List<Sign> getSignosVitales() {
		return signosVitales;
	}

	public void setSignosVitales(List<Sign> signosVitales) {
		this.signosVitales = signosVitales;
	}

	public List<Voucher> getVouchers() {
		return vouchers;
	}

	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
	
	
	
	
}









