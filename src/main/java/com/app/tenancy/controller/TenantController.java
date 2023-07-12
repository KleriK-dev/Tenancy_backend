package com.app.tenancy.controller;

import com.app.tenancy.model.Tenant;
import com.app.tenancy.service.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tenant")
public class TenantController {
	
	private final TenantServiceImpl tenantServiceImpl;
	
	@Autowired
	public TenantController(TenantServiceImpl tenantServiceImpl) {
		this.tenantServiceImpl = tenantServiceImpl;
	}
	
	@GetMapping
	public List<Tenant> findAll(){
		return tenantServiceImpl.findAll();
	}
	
}
