package data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SeasonTicket {
	
	private Long id;
	private int price;
	private LocalDate expireDate;
	private LocalDate purchaseDate;
	private Long bankCard;
	private Long idClient;
	private List <SeasonTicket> ticket = new ArrayList<>();
	
	public SeasonTicket(){
		id = 2147483648L;
		price = 80;
		expireDate = LocalDate.of(2020, 7, 28);
		purchaseDate = LocalDate.of(2019, 7, 28);
		bankCard = 5689453L;
		idClient = 45687845L;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}
	
	public LocalDate getExpireDate() {
		return expireDate;
	}
	
	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	
	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}
	
	public void setBankCard(Long bankCard) {
		this.bankCard = bankCard;
	}
	
	public Long getBankCard() {
		return bankCard;
	}
	
	public void setClientId(Long idClient) {
		this.idClient = idClient;
	}
	
	public Long getIdClient() {
		return idClient;
	}
	
	public List<SeasonTicket> selectSeasonTicket() {
		return ticket;
	}
	
	public void getCardData() {}
	
	
}
