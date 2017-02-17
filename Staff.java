public class Staff {
  private String email;
  private String hashedPassword;

  public Staff(String email, String plainPassword) throws InputValidationException {
    setEmail(email);
    setPassword(plainPassword);
  }

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) throws InputValidationException {
    if (email.matches("(\\p{ASCII}){1,30}@scotairlines\\.com")) {
      this.email = email;
    }
    else {
      throw new InputValidationException();
    }
	}

	public String getHashedPassword() {
		return this.hashedPassword;
	}

	public void setPassword(String plainPassword) throws InputValidationException {
    if (plainPassword.matches("(\\p{ASCII}){8,20}")) {
      Cipher cipher = new RailFenceCipher();
      this.hashedPassword = cipher.hash(plainPassword);
    }
    else {
      throw new InputValidationException();
    }
	}

  public boolean equals(Object object) {
    Staff staff = (Staff) object;
    return getEmail().equals(staff.getEmail()) && getHashedPassword().equals(staff.getHashedPassword());
  }
}
