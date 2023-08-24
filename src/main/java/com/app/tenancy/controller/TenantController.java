package com.app.tenancy.controller;

import com.app.tenancy.model.Tenant;
import com.app.tenancy.service.TenantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/tenant")
public class TenantController {
	
	private final TenantServiceImpl tenantServiceImpl;
	
	@Autowired
	public TenantController(final TenantServiceImpl tenantServiceImpl) {
		this.tenantServiceImpl = tenantServiceImpl;
	}
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Tenant> findAll() {
		return tenantServiceImpl.findAll();
	}
	
	@GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public Tenant findTenantById(@RequestParam("id") final String id) {
		return tenantServiceImpl.findTenantById(id);
	}
	
}
