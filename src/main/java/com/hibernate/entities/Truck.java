package com.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Truck extends Transportation {
@Column(nullable = false)
private int noOfContainers;

public int getNoOfContainers() {
	return noOfContainers;
}

public void setNoOfContainers(int noOfContainers) {
	this.noOfContainers = noOfContainers;
}


}
