package com.localjobs.mongo;

import java.util.Arrays;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

public class Job {

	private String companyName;

	private String jobTitle;

	private double distance;

	private String[] skills;

	private String formattedAddress;

	public Job() {
		// TODO Auto-generated constructor stub
	}

	public Job(BasicDBObject obj) {
		BasicDBObject result = (BasicDBObject) obj;
		this.distance = result.getDouble("dis");
		BasicDBObject jobObj = (BasicDBObject) result.get("obj");
		this.companyName = ((BasicDBObject) jobObj.get("company"))
									.getString("companyName");
		this.jobTitle = jobObj.getString("jobTitle");
		this.formattedAddress = jobObj.getString("formattedAddress");
		this.skills = ((BasicDBList) jobObj.get("skills")).toArray(new String[0]);
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String getFormattedAddress() {
		return formattedAddress;
	}

	public void setFormattedAddress(String formattedAddress) {
		this.formattedAddress = formattedAddress;
	}

	@Override
	public String toString() {
		return "Job [companyName=" + companyName + ", jobTitle=" + jobTitle
				+ ", distance=" + distance + ", skills="
				+ Arrays.toString(skills) + ", formattedAddress="
				+ formattedAddress + "]";
	}
	
	
	
	
}
