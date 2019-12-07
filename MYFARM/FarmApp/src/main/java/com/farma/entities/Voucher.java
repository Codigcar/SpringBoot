package com.farma.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vouchers")
public class Voucher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	/*RELACION*/
	@ManyToOne//clave foranea generada
	@JoinColumn(name = "patient_id",nullable = false)
	private Patient patientId;

	/*1 voucher tiene varias lineas(estas lineas son los detalles)*/
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "voucher_id")
	private List<VoucherDetail> vourcherDetail;
	/*END RELACION*/
	
	
	
	
	public Voucher() {
		// TODO Auto-generated constructor stub
		vourcherDetail=new ArrayList<>();
	}

	public void addVoucherDetail(VoucherDetail item) {
		this.vourcherDetail.add(item);
	}
	
	public Double getTotal() {
		Double total=0.0;
		int size=this.vourcherDetail.size();
		for (int i = 0; i <size; i++) {
			total=total+this.vourcherDetail.get(i).calculateAmount();
		}
		return total;
	}
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Patient getPatientId() {
		return patientId;
	}

	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}

	public List<VoucherDetail> getVourcherDetail() {
		return vourcherDetail;
	}

	public void setVourcherDetail(List<VoucherDetail> vourcherDetail) {
		this.vourcherDetail = vourcherDetail;
	}
	
	
	
}