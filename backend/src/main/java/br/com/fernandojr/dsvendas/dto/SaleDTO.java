package br.com.fernandojr.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import br.com.fernandojr.dsvendas.entities.Sale;

public class SaleDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	
	private SellerDTO sellerDto;
	
	public SaleDTO() {
	}

	public SaleDTO(Long id, Integer visited, Integer deals, Double amount, LocalDate date, SellerDTO sellerDto) {		
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.sellerDto = sellerDto;
	}
	
	public SaleDTO(Sale entity) {		
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		sellerDto = new SellerDTO(entity.getSeller());
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the visited
	 */
	public Integer getVisited() {
		return visited;
	}

	/**
	 * @param visited the visited to set
	 */
	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	/**
	 * @return the deals
	 */
	public Integer getDeals() {
		return deals;
	}

	/**
	 * @param deals the deals to set
	 */
	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}

	/**
	 * @return the sellerDto
	 */
	public SellerDTO getSellerDto() {
		return sellerDto;
	}

	/**
	 * @param sellerDto the sellerDto to set
	 */
	public void setSellerDto(SellerDTO sellerDto) {
		this.sellerDto = sellerDto;
	}	
	
}
