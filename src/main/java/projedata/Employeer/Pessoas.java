package projedata.Employeer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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
	
	public String birthDateDayMonthYear() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    return this.birthDate.format(formatter);
	}
}
