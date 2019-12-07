package com.farma.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "signs")
public class Sign {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DecimalMin("1.00")
	@Column(name = "temperature",columnDefinition = "Decimal(8,2)",nullable = false)
	private double temperature;
	
	@DecimalMin("1.00")
	@Column(name = "pulse",columnDefinition = "Decimal(8,2)",nullable = false)
	private double pulse;
	
	@DecimalMin("1.00")
	@Column(name = "respiratoryRhythm",columnDefinition = "Decimal(8,2)",nullable = false)
	private double respiratoryRhythms;
	
	/*RELACION*/
	@NotNull(message = "Debe seleccionar un paciente")
	@ManyToOne
	@JoinColumn(name = "patient_id",nullable = false)
	private Patient patientId;  //FK
	/*END RELACION*/
	
	
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPulse() {
		return pulse;
	}

	public void setPulse(double pulse) {
		this.pulse = pulse;
	}

	public double getRespiratoryRhythms() {
		return respiratoryRhythms;
	}

	public void setRespiratoryRhythms(double respiratoryRhythms) {
		this.respiratoryRhythms = respiratoryRhythms;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	 
	

}



















