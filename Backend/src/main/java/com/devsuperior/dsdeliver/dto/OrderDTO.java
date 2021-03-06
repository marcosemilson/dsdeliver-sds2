package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;

public class OrderDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String address;
	private double longitude;
	private double latitude;
	private Instant moment;
	private OrderStatus status;
	private double total;
	
	private List<ProductDTO> products = new ArrayList<>();
	
	public OrderDTO() {
		
	}

	public OrderDTO(Long id, String address, double longitude, double latitude,  Instant moment, OrderStatus status, double total) {
		this.id = id;
		this.address = address;
		this.longitude = longitude;
		this.latitude = latitude;
		this.moment = moment;
		this.status = status;
		this.total = total;
	}
	
	public OrderDTO(Order entity) {
		id = entity.getId();
		address = entity.getAddress();
		longitude = entity.getLongitude();
		latitude = entity.getLatitude();
		moment = entity.getMoment();
		status = entity.getStatus();
		total = entity.getTotal();
		products = entity.getProducts().stream()
				.map(x->new ProductDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}
	
	

}
