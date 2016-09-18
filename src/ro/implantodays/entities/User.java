package ro.implantodays.entities;

import java.sql.Date;

public class User extends Entity{

	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int numberOfLogins;
	private Date lastVisit;
	private Date dateRegistered;
	private String role;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the numberOfLogins
	 */
	public int getNumberOfLogins() {
		return numberOfLogins;
	}
	/**
	 * @param numberOfLogins the numberOfLogins to set
	 */
	public void setNumberOfLogins(int numberOfLogins) {
		this.numberOfLogins = numberOfLogins;
	}
	/**
	 * @return the lastVisit
	 */
	public Date getLastVisit() {
		return lastVisit;
	}
	/**
	 * @param lastVisit the lastVisit to set
	 */
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	/**
	 * @return the dateRegistered
	 */
	public Date getDateRegistered() {
		return dateRegistered;
	}
	/**
	 * @param dateRegistered the dateRegistered to set
	 */
	public void setDateRegistered(Date dateRegistered) {
		this.dateRegistered = dateRegistered;
	}
	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}
}
