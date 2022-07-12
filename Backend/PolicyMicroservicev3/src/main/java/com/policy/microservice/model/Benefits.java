package com.policy.microservice.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="benefits")
public class Benefits {

	@Id
	@Column(name="BID")
	private String benefitId;
	
	@Column(name="Name")
	private String benefitName;

	public Benefits(String benefitId, String benefitName) {
		super();
		this.benefitId = benefitId;
		this.benefitName = benefitName;
	}
	
	//The join table is being created by benefits table, here we are using mappedBy attribute
	//mappedBy functions asks policyBenefits attribute to not handle the table create, and give the responsibility to benefits attribute in Policy Table
	@JsonIgnore	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL,mappedBy = "benefits")
	private Set<Policy> policyBenefits = new HashSet<>();
	
	
}
