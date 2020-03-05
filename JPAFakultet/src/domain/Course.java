package domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private int ESPB;
	@OneToOne
	@JoinColumn(name = "COURSE_MODUL_ID")
	private StudentModul studentModul;
	private int semestar;
	
	@OneToMany(mappedBy = "course", orphanRemoval = true, cascade = CascadeType.ALL)
	private  Set<ProfCourse> profCourse;
	
	public Course() {
		super();
	}

	public Course(String name, int eSPB, StudentModul studentModul, int semestar) {
		super();
		this.name = name;
		this.ESPB = eSPB;
		this.studentModul = studentModul;
		this.semestar = semestar;
	}

	public Course(Long id, String name, int eSPB, StudentModul studentModul, int semestar) {
		super();
		this.id = id;
		this.name = name;
		this.ESPB = eSPB;
		this.studentModul = studentModul;
		this.semestar = semestar;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getESPB() {
		return ESPB;
	}

	public void setESPB(int eSPB) {
		ESPB = eSPB;
	}

	public StudentModul getStudentModul() {
		return studentModul;
	}

	public void setStudentModul(StudentModul studentModul) {
		this.studentModul = studentModul;
	}

	public int getSemestar() {
		return semestar;
	}

	public void setSemestar(int semestar) {
		this.semestar = semestar;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", ESPB=" + ESPB + ", studentModul=" + studentModul
				+ ", semestar=" + semestar + "]";
	}
	
	

}
