package com.hibernate.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Transportation extends Vehicule {
	int loadCapacity;

}
