package com.pd.couchbase;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;
import org.springframework.data.domain.Persistable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.pd.benchmark.dataobjects.BenchmarkConstants;
import com.pd.benchmark.dataobjects.PersonRecord;



@Document

public class Person implements Persistable<Long>{

	@Id
	@Field
	private long personId;

	@Field
	public String lastName;

	@Field
	public String firstName;
	
	@Field
	public String gender;
	
	@Field
	public LocalDate dateOfBirth;
	
	@Field
	public LocalDateTime tsCr;
		
	@Field
	public LocalDateTime tsUp;
	
	@Field
	public String nameUp;
	
	@Field
	private String cag;
	
	
	@Transient
	@JsonIgnore
	public boolean isInsert;

	/**
	 * 
	 */
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(PersonRecord personRecord) {
		this.personId = personRecord.getPersonId();
		this.lastName = personRecord.getLastName();
		this.firstName = personRecord.getFirstName();
		this.gender = personRecord.getGender();
		this.dateOfBirth = personRecord.getDateOfBirth();
		this.tsCr = LocalDateTime.now();
		this.cag=personRecord.getCag();
	}


	public long getPersonId() {
		return personId;
	}


	public void setPersonId(long personId) {
		this.personId = personId;
	}

	@Override
	@JsonIgnore
	public boolean isNew() {
		return isInsert;
	}

	public void setIsInsert(boolean isInsert) {
		this.isInsert = isInsert;
	}

	@Override
	public Long getId() {
		return personId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getTsCr() {
		return tsCr;
	}

	public void setTsCr(LocalDateTime tsCr) {
		this.tsCr = tsCr;
	}

	public LocalDateTime getTsup() {
		return tsUp;
	}

	public void setTsup(LocalDateTime tsUp) {
		this.tsUp = tsUp;
	}

	public String getNameUp() {
		return nameUp;
	}

	public void setNameUp(String nameUp) {
		this.nameUp = nameUp;
	}


	public LocalDateTime getTsUp() {
		return tsUp;
	}


	public void setTsUp(LocalDateTime tsUp) {
		this.tsUp = tsUp;
	}


	public String getCag() {
		return cag;
	}


	public void setCag(String cag) {
		this.cag = cag;
	}

	
}
