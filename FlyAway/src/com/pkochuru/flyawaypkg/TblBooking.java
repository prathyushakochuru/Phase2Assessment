package com.pkochuru.flyawaypkg;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tblBooking")
public class TblBooking {

	public TblBooking() {
		super();
	}
	
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	int ID;
	
	@Column(name="FirstName")
	String FirstName;
	
	@Column(name="LastName")
	String LastName;
	
	@Column(name="Address")
	String Address;
	
	@Column(name="DOB")
	String DOB;
	
	@Column(name="ContactNo")
	String ContactNo;
	
	@Column(name="EmailId")
	String EmailID;
	
	@Column(name="DOT")
	String DOT;
	
	@Column(name="FlightID")
	String FlightID;
	
	@Column(name="TotalPrice")
	String TotalPrice;
	
	@Column(name="CardNo")
	String CardNo;
	
	@Column(name="ZipCode")
	String ZipCode;
	
	@Column(name="Status")
	String Status;
	
	@Column(name="DateCreated")
	Date Datecreated;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getContactNo() {
		return ContactNo;
	}

	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}

	public String getEmailID() {
		return EmailID;
	}

	public void setEmailID(String emailID) {
		EmailID = emailID;
	}

	public String getDOT() {
		return DOT;
	}

	public void setDOT(String dOT) {
		DOT = dOT;
	}

	public String getFlightID() {
		return FlightID;
	}

	public void setFlightID(String flightID) {
		FlightID = flightID;
	}

	public String getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		TotalPrice = totalPrice;
	}

	public String getCardNo() {
		return CardNo;
	}

	public void setCardNo(String cardNo) {
		CardNo = cardNo;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getDatecreated() {
		return Datecreated;
	}

	public void setDatecreated(Date datecreated) {
		Datecreated = datecreated;
	}

	public TblBooking(String firstName, String lastName, String address, String dOB, String contactNo, String emailID,
			String dOT, String flightID, String totalPrice, String cardNo, String zipCode, String status,
			Date datecreated) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		DOB = dOB;
		ContactNo = contactNo;
		EmailID = emailID;
		DOT = dOT;
		FlightID = flightID;
		TotalPrice = totalPrice;
		CardNo = cardNo;
		ZipCode = zipCode;
		Status = status;
		Datecreated = datecreated;
	}

	@Override
	public String toString() {
		return "TblBooking [ID=" + ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address
				+ ", DOB=" + DOB + ", ContactNo=" + ContactNo + ", EmailID=" + EmailID + ", DOT=" + DOT + ", FlightID="
				+ FlightID + ", TotalPrice=" + TotalPrice + ", CardNo=" + CardNo + ", ZipCode=" + ZipCode + ", Status="
				+ Status + ", Datecreated=" + Datecreated + "]";
	}
	
	
	
	

}
