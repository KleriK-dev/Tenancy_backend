package com.app.tenancy.service;

import com.app.tenancy.model.Tenant;
import com.app.tenancy.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantServiceImpl implements TenantService {
	
	private final TenantRepository tenantRepository;
	
	@Autowired
	public TenantServiceImpl(final TenantRepository tenantRepository) {
		this.tenantRepository = tenantRepository;
	}
	
	@Override
	public List<Tenant> findAll() {
		return tenantRepository.findAll();
	}
	
	@Override
	public Tenant findTenantById(final String id) {
		return tenantRepository.findTenantById(id);
	}
}
