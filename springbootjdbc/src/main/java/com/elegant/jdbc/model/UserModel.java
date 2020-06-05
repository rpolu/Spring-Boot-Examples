package com.elegant.jdbc.model;

public class UserModel {

	private Long mobilNum;
	private String firstName;
	private String lastName;
	private String address;
	private String email;

	public UserModel(Long mobilNum, String firstName, String lastName, String address, String email) {
		this.mobilNum = mobilNum;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.email = email;
	}

	public UserModel() {
	}

	public Long getMobilNum() {
		return mobilNum;
	}

	public void setMobilNum(Long mobilNum) {
		this.mobilNum = mobilNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobilNum == null) ? 0 : mobilNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobilNum == null) {
			if (other.mobilNum != null)
				return false;
		} else if (!mobilNum.equals(other.mobilNum))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserModel [mobilNum=" + mobilNum + ", firstName=" + firstName + ", lastName=" + lastName + ", address="
				+ address + ", email=" + email + "]";
	}

}
