package projedata.Employeer;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class Funcionario extends Pessoas {
	
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
