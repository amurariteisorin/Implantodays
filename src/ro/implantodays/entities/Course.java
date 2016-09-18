package ro.implantodays.entities;

import java.sql.Date;

public class Course extends Entity{
private String courseName;
private double price;
private String description;
private String image;
private Date startDate;
private int numberOfParticipants;
private int duration;
private String um;
/**
 * @return the courseName
 */
public String getCourseName() {
	return courseName;
}
/**
 * @param courseName the courseName to set
 */
public void setCourseName(String courseName) {
	this.courseName = courseName;
}
/**
 * @return the price
 */
public double getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}
/**
 * @return the description
 */
public String getDescription() {
	return description;
}
/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}
/**
 * @return the image
 */
public String getImage() {
	return image;
}
/**
 * @param image the image to set
 */
public void setImage(String image) {
	this.image = image;
}
/**
 * @return the startDate
 */
public Date getStartDate() {
	return startDate;
}
/**
 * @param startDate the startDate to set
 */
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
/**
 * @return the numberOfParticipants
 */
public int getNumberOfParticipants() {
	return numberOfParticipants;
}
/**
 * @param numberOfParticipants the numberOfParticipants to set
 */
public void setNumberOfParticipants(int numberOfParticipants) {
	this.numberOfParticipants = numberOfParticipants;
}
/**
 * @return the duration
 */
public int getDuration() {
	return duration;
}
/**
 * @param duration the duration to set
 */
public void setDuration(int duration) {
	this.duration = duration;
}
/**
 * @return the um
 */
public String getUm() {
	return um;
}
/**
 * @param um the um to set
 */
public void setUm(String um) {
	this.um = um;
}

}
