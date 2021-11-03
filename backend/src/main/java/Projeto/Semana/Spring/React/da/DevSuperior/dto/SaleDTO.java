package Projeto.Semana.Spring.React.da.DevSuperior.dto;

import java.time.LocalDate;

import Projeto.Semana.Spring.React.da.DevSuperior.entities.Sale;

public class SaleDTO {

	private long id;
	private int visited;
	private int deals;
	private double amount;
	private LocalDate date;

	private SellerDTO seller;

	public SaleDTO() {

	}

	public SaleDTO(long id, int visited, int deals, double amount, LocalDate date, SellerDTO seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO(Sale entity) {
		id = entity.getId();
		visited = entity.getVisited();
		deals = entity.getDeals();
		amount = entity.getAmount();
		date = entity.getDate();
		seller = new SellerDTO(entity.getSeller());
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVisited() {
		return visited;
	}

	public void setVisited(int visited) {
		this.visited = visited;
	}

	public int getDeals() {
		return deals;
	}

	public void setDeals(int deals) {
		this.deals = deals;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getSeller() {
		return seller;
	}

	public void setSeller(SellerDTO seller) {
		this.seller = seller;
	}
	
}
