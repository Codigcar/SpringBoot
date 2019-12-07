package com.farma.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.farma.entities.Voucher;
import com.farma.service.VoucherService;

public class VoucherServiceImpl implements VoucherService {

	@Autowired
	private VoucherService voucherService;
	
	@Transactional(readOnly = true)
	@Override
	public List<Voucher> findAll() throws Exception {
		// TODO Auto-generated method stub
		return voucherService.findAll();
	}
	
	@Transactional
	@Override
	public Voucher save(Voucher t) throws Exception {
		// TODO Auto-generated method stub
		return voucherService.save(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Voucher> findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return voucherService.findById(id);
	}

	@Transactional
	@Override
	public void deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		voucherService.deleteById(id);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Voucher> fetchByVoucherIdWithPatientWhitVoucherDetailWithMedicine(Long id) {
		// TODO Auto-generated method stub
		return voucherService.fetchByVoucherIdWithPatientWhitVoucherDetailWithMedicine(id);
	}

}