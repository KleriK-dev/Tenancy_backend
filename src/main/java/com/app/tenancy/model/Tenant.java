package com.app.tenancy.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "tenants")
public class Tenant {
	
	@Id
	@Column(name = "id", nullable = false)
	private String id;
	
	@Column(name = "created_at")
	private LocalDate createdDate;
	
	@Column(name = "updated_at")
	private LocalDate updatedDate;
	
	@Column(name = "data")
	private String data;
	
}
