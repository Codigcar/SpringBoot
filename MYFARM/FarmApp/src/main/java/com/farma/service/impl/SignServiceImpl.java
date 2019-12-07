package com.farma.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.farma.entities.Sign;
import com.farma.service.SignService;

public class SignServiceImpl implements SignService {

	@Autowired
	private SignService signService;

	@Transactional(readOnly = true)
	@Override
	public List<Sign> findAll() throws Exception {
		// TODO Auto-generated method stub
		return signService.findAll();
	}

	@Transactional
	@Override
	public Sign save(Sign t) throws Exception {
		// TODO Auto-generated method stub
		return signService.save(t);
	}

	@Transactional(readOnly = true)
	@Override
	public Optional<Sign> findById(Long id) throws Exception {
		// TODO Auto-generated method stub
		return signService.findById(id);
	}

	@Transactional
	@Override
	public void deleteById(Long id) throws Exception {
		// TODO Auto-generated method stub
		signService.deleteById(id);
	} 
	
	

}
