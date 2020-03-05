package domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "ProfessorCourse", uniqueConstraints = @UniqueConstraint(columnNames = { "PROFESSOR_ID", "COURSE_ID" }))
public class ProfCourse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "PROFESSOR_ID", referencedColumnName = "ID")
	private Professor professor;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "COURSE_ID", referencedColumnName = "ID")
	private Course course;

}
