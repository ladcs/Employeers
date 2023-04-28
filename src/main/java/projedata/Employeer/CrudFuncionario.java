package projedata.Employeer;

import java.util.List;

import java.math.BigDecimal;

public class CrudFuncionario {
  public void deleteByName(String name) {
    ModelFuncionario model = new ModelFuncionario();

    try {
      model.deletePerson(name);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public void updateRemunaration(Funcionario employeer, BigDecimal value) {
	  ModelFuncionario model = new ModelFuncionario();

	  try {
        model.updateRemuneration(employeer, value);
	  } catch (Exception e) {
        e.printStackTrace();
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
  
  public Funcionario getFuncByName(String name) {
	  ModelFuncionario model = new ModelFuncionario();

	  try {
        return model.findByName(name);
	  } catch (Exception e) {
        e.printStackTrace();
        return null;
	  }
  }
}
