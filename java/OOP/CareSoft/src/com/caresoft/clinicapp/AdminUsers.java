package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUsers extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
	private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents = new ArrayList<String>();
	public AdminUsers(Integer id) {
		super(id);
		 	
		}
	
	public AdminUsers(Integer id, String role) {
		super(id);
		this.role = role;
	}

	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length();
		if(super.pin == length)
			return true;
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(super.id == confirmedAuthID) {
			return true;
		}
		newIncident("wrong reqestration");
		return false;
	}
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        this.securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        this.securityIncidents.add(report);
    }

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.securityIncidents;
	}

	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	

}
