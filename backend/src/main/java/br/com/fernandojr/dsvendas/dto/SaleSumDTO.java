package br.com.fernandojr.dsvendas.dto;

import java.io.Serializable;

import br.com.fernandojr.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Double soma;
	
	public SaleSumDTO() {		
	}

	public SaleSumDTO(Seller seller, Double soma) {		
		this.sellerName = seller.getName();
		this.soma = soma;
	}

	/**
	 * @return the sellerName
	 */
	public String getSellerName() {
		return sellerName;
	}

	/**
	 * @param sellerName the sellerName to set
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	/**
	 * @return the soma
	 */
	public Double getSoma() {
		return soma;
	}

	/**
	 * @param soma the soma to set
	 */
	public void setSoma(Double soma) {
		this.soma = soma;
	}	
	
	

}
