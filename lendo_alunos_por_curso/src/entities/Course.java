package entities;

import java.util.Objects;

public class Course {
	
	private Integer aluno;

	public Course(Integer aluno) {
		this.aluno = aluno;
	}

	public Integer getAluno() {
		return aluno;
	}

	public void setAluno(Integer aluno) {
		this.aluno = aluno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(aluno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(aluno, other.aluno);
	}
	
	

}
