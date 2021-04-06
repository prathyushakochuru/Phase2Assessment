package com.pkochuru.flyawaypkg;


import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class tblFlights {

	public tblFlights() {
		super();
	}
	
	@Column(name="FlightID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	int FlightID;
	
	@Column(name="FlightModel")
	String FlightModel;
	
	@Column(name="Source")
	String Source;
	
	@Column(name="Destination")
	String Destination;
	
	@Column(name="Airlines")
	String Airlines;
	
	@Column(name="Duration")
	String Duration;
	
	@Column(name="TicketPrice")
	String TicketPrice;

	public int getFlightID() {
		return FlightID;
	}

	public void setFlightID(int flightID) {
		FlightID = flightID;
	}

	public String getFlightModel() {
		return FlightModel;
	}

	public void setFlightModel(String flightModel) {
		FlightModel = flightModel;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getAirlines() {
		return Airlines;
	}

	public void setAirlines(String airlines) {
		Airlines = airlines;
	}

	public String getDuration() {
		return Duration;
	}

	public void setDuration(String duration) {
		Duration = duration;
	}

	public String getTicketPrice() {
		return TicketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		TicketPrice = ticketPrice;
	}

	public tblFlights(String flightModel, String source, String destination, String airlines, String duration,
			String ticketPrice) {
		super();
		FlightModel = flightModel;
		Source = source;
		Destination = destination;
		Airlines = airlines;
		Duration = duration;
		TicketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "TblFlights [FlightID=" + FlightID + ", FlightModel=" + FlightModel + ", Source=" + Source
				+ ", Destination=" + Destination + ", Airlines=" + Airlines + ", Duration=" + Duration
				+ ", TicketPrice=" + TicketPrice + "]";
	}
	
	
	
	
	

}
