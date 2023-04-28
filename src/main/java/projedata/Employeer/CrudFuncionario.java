package projedata.Employeer;

import java.util.List;
import java.math.BigDecimal;

public class CrudFuncionario {
  public List<Funcionario> deleteName(String name) {
    ModelFuncionario model = new ModelFuncionario();
    try {
      return model.deletePerson(name);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  
  public List<Funcionario> updateRemunaration(Funcionario employeer, BigDecimal value) {
	  ModelFuncionario model = new ModelFuncionario();
	  try {
        return model.updateRemuneration(employeer, value);
	  } catch (Exception e) {
        e.printStackTrace();
        return null;
	  }
  }
  
  public List<Funcionario> getAllFunc() {
    ModelFuncionario model = new ModelFuncionario();
    try {
      return model.findAll();
    } catch (Exception e) {
    	e.printStackTrace();
    	return null;
    }
  }
}
