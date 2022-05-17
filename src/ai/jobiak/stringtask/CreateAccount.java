package ai.jobiak.stringtask;

public class CreateAccount {

		private String firstName;
		private String lastName;
		private Long phoneno;
		private String email;
		private String password;

		public CreateAccount() {
			// TODO Auto-generated constructor stub
		}

		public CreateAccount(String firstName, String lastName, Long phoneno, String email, String password) {
		
			this.firstName = firstName;
			this.lastName = lastName;
			this.phoneno = phoneno;
			this.email = email;
			this.password = password;
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

		public Long getPhoneno() {
			return phoneno;
		}

		public void setPhoneno(Long phoneno) {
			this.phoneno = phoneno;
		}
		

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "CreateAccount [firstName=" + firstName + ", lastName=" + lastName + ", phoneno=" + phoneno + ", email="
					+ email + ", password=" + password + "]";
		}
	   
		

	}

