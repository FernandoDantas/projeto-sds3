package br.com.fernandojr.dsvendas.dto;

import java.io.Serializable;

import br.com.fernandojr.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String sellerName;
	private Long visited;
	private Long deals;
	
	public SaleSuccessDTO() {		
	}

	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {		
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
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
	 * @return the visited
	 */
	public Long getVisited() {
		return visited;
	}

	/**
	 * @param visited the visited to set
	 */
	public void setVisited(Long visited) {
		this.visited = visited;
	}

	/**
	 * @return the deals
	 */
	public Long getDeals() {
		return deals;
	}

	/**
	 * @param deals the deals to set
	 */
	public void setDeals(Long deals) {
		this.deals = deals;
	}
	
}
