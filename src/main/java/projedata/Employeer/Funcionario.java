package projedata.Employeer;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario extends Pessoas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	Funcionario() {
		super();
	}
	private BigDecimal remuneration;
	private String job;

	public BigDecimal getRemuneration() {
		return remuneration;
	}

	public void setRemuneration(BigDecimal remuneration) {
		this.remuneration = remuneration;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	
	
}
