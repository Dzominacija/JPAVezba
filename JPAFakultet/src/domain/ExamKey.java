package domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ExamKey implements Serializable {
	private static final long serialVersionUID = -7240361601630296025L;

	private Long profCourseId;
	private Long studentId;

	public ExamKey() {
		super();
	}

	public ExamKey(Long profCourseId, Long studentId) {
		super();
		this.profCourseId = profCourseId;
		this.studentId = studentId;
	}

	public Long getProfCourseId() {
		return profCourseId;
	}

	public void setProfCourseId(Long profCourseId) {
		this.profCourseId = profCourseId;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((profCourseId == null) ? 0 : profCourseId.hashCode());
		result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
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
		ExamKey other = (ExamKey) obj;
		if (profCourseId == null) {
			if (other.profCourseId != null)
				return false;
		} else if (!profCourseId.equals(other.profCourseId))
			return false;
		if (studentId == null) {
			if (other.studentId != null)
				return false;
		} else if (!studentId.equals(other.studentId))
			return false;
		return true;
	}
}
