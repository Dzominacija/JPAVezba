package domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String indexNumber;
	private Date birthDate;
	@OneToOne
	@JoinColumn(name = "STUD_MODUL_ID")
	private StudentModul studentModul;
	
	public Student() {
		super();
	}
	public Student(String firstName, String lastName, String indexNumber, Date birthDate, StudentModul studentModul) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.indexNumber = indexNumber;
		this.birthDate = birthDate;
		this.studentModul = studentModul;
	}
	public Student(Long id, String firstName, String lastName, String indexNumber, Date birthDate,
			StudentModul studentModul) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.indexNumber = indexNumber;
		this.birthDate = birthDate;
		this.studentModul = studentModul;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getIndexNumber() {
		return indexNumber;
	}
	public void setIndexNumber(String indexNumber) {
		this.indexNumber = indexNumber;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public StudentModul getStudentModul() {
		return studentModul;
	}
	public void setStudentModul(StudentModul studentModul) {
		this.studentModul = studentModul;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", indexNumber="
				+ indexNumber + ", birthDate=" + birthDate + ", studentModul=" + studentModul + "]";
	}
	
	
	
}
