package ua.com.hata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "place")
public class Place {
	
	@Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id", length = 6, nullable = false)
    private long id;
 
    @Column(name = "address")
    private String address;
 
    @Column(name = "cost")
    private String cost;
    
    @Column(name = "rooms")
    private String rooms;
    
    @Column(name = "floor")
    private String floor;
    
    public Place(String address, String cost, String rooms, String floor) {
    	this.address = address;
    	this.cost = cost;
    	this.rooms = rooms;
    	this.address = address;
    	this.floor = floor;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}
 
}
