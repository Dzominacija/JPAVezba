package domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ProfCourseKey implements Serializable{
	private static final long serialVersionUID = 319256892845150466L;
	
	private Long profesorId;
	private Long predmetId;
		
	public ProfCourseKey() {
		super();
	}
	public ProfCourseKey(Long profesorId, Long predmetId) {
		super();
		this.profesorId = profesorId;
		this.predmetId = predmetId;
	}
	public Long getProfesorId() {
		return profesorId;
	}
	public void setProfesorId(Long profesorId) {
		this.profesorId = profesorId;
	}
	public Long getPredmetId() {
		return predmetId;
	}
	public void setPredmetId(Long predmetId) {
		this.predmetId = predmetId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((predmetId == null) ? 0 : predmetId.hashCode());
		result = prime * result + ((profesorId == null) ? 0 : profesorId.hashCode());
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
		ProfCourseKey other = (ProfCourseKey) obj;
		if (predmetId == null) {
			if (other.predmetId != null)
				return false;
		} else if (!predmetId.equals(other.predmetId))
			return false;
		if (profesorId == null) {
			if (other.profesorId != null)
				return false;
		} else if (!profesorId.equals(other.profesorId))
			return false;
		return true;
	}
	
	
}
