package com.macross.model;

import java.math.BigDecimal;

public class Varitech {

	private BigDecimal id;
	private BigDecimal hours;
	private String model;
	private String base;
	private BigDecimal autonomy;
	
	
	public Varitech(BigDecimal hours, String model, String base, BigDecimal autonomy) {
		super();
		this.hours = hours;
		this.model = model;
		this.base = base;
		this.autonomy = autonomy;
	}
	

	public Varitech() {

	}


	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getHours() {
		return hours;
	}

	public void setHours(BigDecimal hours) {
		this.hours = hours;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public BigDecimal getAutonomy() {
		return autonomy;
	}

	public void setAutonomy(BigDecimal autonomy) {
		this.autonomy = autonomy;
	}

}
