package com.dbtask.usejdbc.entity;




import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "secure_users")

//@Getter
//@Setter
//@ToString(exclude = "password") // toString excluding password
public class UserEntity  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	
    @Column(length = 20)
    private String firstName;

    @Column(length = 20)
    private String lastName;

    @Column(length = 30, unique = true)
    private String email;

    @Column(length = 300, nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private UserRole role;

    @Transient // => skips from persistence => no col. generation
    private String confirmPassword;

   

  
   
    
    
    // one to one ---->Booking
//  @OneToOne(mappedBy = "owner", fetch = FetchType.LAZY)
//  private RationBooking bokking;

  
  
  
  public UserEntity() {
	  
  }


    // additional overloaded ctor : to be used in JPQL ctor expression



	public UserEntity(String firstName, String lastName, String email, String password, UserRole role,
			String confirmPassword) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.confirmPassword = confirmPassword;
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



	public UserRole getRole() {
		return role;
	}



	public void setRole(UserRole role) {
		this.role = role;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}



	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



	

    
    
    
    
    
    
    
}
