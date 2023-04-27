package projedata.Employeer;

import java.time.LocalDate;

/**
 * class Pessoa, base to class Funcionario. 
 */
public class Pessoas {
	
	private String name;
	private LocalDate birthDate;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
