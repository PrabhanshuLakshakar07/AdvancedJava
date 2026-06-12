package example.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // marks this class as an entity class
@Table(name="cdac_Picnic_Master") //Maps to DB table...
public class CdacPicnic { //Entity class , Table :cdac_Picnic_Master
	@Id //Marks this field as an ID field
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	@Column(name="picnic_id")   //maps to column of db table
	private Integer picnicId; 
	@Column(name= "picnic_location" , length=40)
	private String location;
	@Column(name= "picnic_date" , length=30)
	private String date;
	@Column(name= "picnic_head_count" )
	private int headCount;
	
	public  CdacPicnic() {
		
	}

	@Override
	public String toString() {
		return "CdacPicnic [picnicId=" + picnicId + ", location=" + location + ", date=" + date + ", headCount="
				+ headCount + "]";
	}

	public CdacPicnic(Integer picnicId, String location, String date, int headCount) {
		super();
		this.picnicId = picnicId;
		this.location = location;
		this.date = date;
		this.headCount = headCount;
	}

	public Integer getPicnicId() {
		return picnicId;
	}

	public void setPicnicId(Integer picnicId) {
		this.picnicId = picnicId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getHeadCount() {
		return headCount;
	}

	public void setHeadCount(int headCount) {
		this.headCount = headCount;
	}
}
