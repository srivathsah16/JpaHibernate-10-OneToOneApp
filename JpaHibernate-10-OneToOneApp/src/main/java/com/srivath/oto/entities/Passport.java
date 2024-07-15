package com.srivath.oto.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_passport")
public class Passport {

	@Id
	@Column(name = "passport_id")
	private Integer passportId;
	@Column(name = "expiry_date")
	private LocalDate expiryDate;

	public Integer getPassportId() {
		return passportId;
	}

	public void setPassportId(Integer passportId) {
		this.passportId = passportId;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", expiryDate=" + expiryDate + "]";
	}

}
