package ro.implantodays.entities;

import java.sql.Date;

public class Registration extends Entity{
private int userID;
private int courseID;
private Date dateRegistered;
private int paymentConfirmation;
/**
 * @return the userID
 */
public int getUserID() {
	return userID;
}
/**
 * @param userID the userID to set
 */
public void setUserID(int userID) {
	this.userID = userID;
}
/**
 * @return the courseID
 */
public int getCourseID() {
	return courseID;
}
/**
 * @param courseID the courseID to set
 */
public void setCourseID(int courseID) {
	this.courseID = courseID;
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
 * @return the paymentConfirmation
 */
public int getPaymentConfirmation() {
	return paymentConfirmation;
}
/**
 * @param paymentConfirmation the paymentConfirmation to set
 */
public void setPaymentConfirmation(int paymentConfirmation) {
	this.paymentConfirmation = paymentConfirmation;
}
}
