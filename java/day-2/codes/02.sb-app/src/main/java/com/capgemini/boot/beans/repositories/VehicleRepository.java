package com.capgemini.boot.beans.repositories;

import org.springframework.stereotype.Repository;

@Repository
public class VehicleRepository {

	public VehicleRepository() {
		System.out.println("VehicleRepository :: Constructor");
	}

}
