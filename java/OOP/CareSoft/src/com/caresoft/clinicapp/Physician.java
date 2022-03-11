package com.caresoft.clinicapp;

import java.sql.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser {
	 private ArrayList<String> patientNotes;

	public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length();
		if(length == 4)
			return true;
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(super.id == confirmedAuthID)
			return true;
		return false;
	}
	 public void newPatientNotes(String notes, String patientName, Date date) {
	        String report = String.format(
	            "Datetime Submitted: %s \n", date);
	        report += String.format("Reported By ID: %s\n", this.id);
	        report += String.format("Patient Name: %s\n", patientName);
	        report += String.format("Notes: %s \n", notes);
	        this.patientNotes.add(report);
	    }

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	 
	

}
