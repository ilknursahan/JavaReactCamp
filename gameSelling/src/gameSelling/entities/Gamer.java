package gameSelling.entities;

import java.util.Date;

import gameSelling.abstracts.Entity;



public class Gamer implements Entity{

	private int gamerid;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	
	public Gamer () {}
	
	public Gamer(int gamerid, String firstName, String lastName, Date dateOfBirth, String nationalityId) {
		super();
		this.gamerid = gamerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}


	public int getGamerid() {
		return gamerid;
	}


	public void setGamerid(int gamerid) {
		this.gamerid = gamerid;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	 
}
