package com.phaenorah.relationships.services;

import org.springframework.stereotype.Service;

import com.phaenorah.relationships.models.License;
import com.phaenorah.relationships.models.Person;
import com.phaenorah.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	LicenseRepository licenseRepo;
	LicenseService(LicenseRepository licenseRepo){
        this.licenseRepo = licenseRepo;
    }	
	public License createLicense(License license) {
		license.setNumber(this.generateLicenseNumber());
		return licenseRepo.save(license);
				
	}
	public int generateLicenseNumber() {
		License license = licenseRepo.findTopByOrderByNumberDesc();
		if(license == null)
			return 1;
		int largestNumber = license.getNumber();
		largestNumber++;
		return (largestNumber);
	}
	public void joinPerson(License license, Person person){
        license.setPerson(person);
        licenseRepo.save(license);
    }

}
