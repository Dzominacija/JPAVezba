package domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Professor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String firstName;
	private String lastName;
	private Date contractStart;

	@OneToMany(mappedBy = "professor", orphanRemoval = true, cascade = CascadeType.ALL)
	private Set<ProfCourse> ProfCourse;
	
	public Professor() {
		super();
	}

	public Professor(String title, String firstName, String lastName, Date contractStart,
			Department department) {
		super();
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contractStart = contractStart;
	}

	public Professor(Long id, String title, String firstName, String lastName, Date contractStart, Course course,
			Department department) {
		super();
		this.id = id;
		this.title = title;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contractStart = contractStart;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Date getContractStart() {
		return contractStart;
	}

	public void setContractStart(Date contractStart) {
		this.contractStart = contractStart;
	}

	public Set<ProfCourse> getProfCourse() {
		return ProfCourse;
	}

	public void setProfCourse(Set<ProfCourse> profCourse) {
		ProfCourse = profCourse;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", title=" + title + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contractStart=" + contractStart + ", ProfCourse=" + ProfCourse + "]";
	}
	
}
