package domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Exam", uniqueConstraints = @UniqueConstraint(columnNames = { "PROF_COURSE_ID", "STUDENT_ID" }))
public class Exam implements Serializable {
	private static final long serialVersionUID = 6567138859403139796L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "PROF_COURSE_ID", referencedColumnName = "ID")
	private ProfCourse profCourse;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")
	private Student student;

	@Temporal(TemporalType.DATE)
	private Date examDate;

	private int ocena;

	public Exam() {
		super();
	}

	public Exam(Long id, ProfCourse profCourse, Student student, Date examDate, int ocena) {
		super();
		this.id = id;
		this.profCourse = profCourse;
		this.student = student;
		this.examDate = examDate;
		this.ocena = ocena;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProfCourse getProfCourse() {
		return profCourse;
	}

	public void setProfCourse(ProfCourse profCourse) {
		this.profCourse = profCourse;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((examDate == null) ? 0 : examDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ocena;
		result = prime * result + ((profCourse == null) ? 0 : profCourse.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
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
		Exam other = (Exam) obj;
		if (examDate == null) {
			if (other.examDate != null)
				return false;
		} else if (!examDate.equals(other.examDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (ocena != other.ocena)
			return false;
		if (profCourse == null) {
			if (other.profCourse != null)
				return false;
		} else if (!profCourse.equals(other.profCourse))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", profCourse=" + profCourse + ", student=" + student + ", examDate=" + examDate
				+ ", ocena=" + ocena + "]";
	}

}
