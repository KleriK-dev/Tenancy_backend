package com.app.tenancy.service;

import com.app.tenancy.model.Tenant;

import java.util.List;

public interface TenantService {
	
	List<Tenant> findAll();
	
}
