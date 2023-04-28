package projedata.Employeer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UtilToMapAndInc {

  private Map<String, List<String>> mapJobAndPeople = new LinkedHashMap<>();
  
  UtilToMapAndInc () {
    this.populateMap();
  }

  final void populateMap() {
    CrudFuncionario crud = new CrudFuncionario();
	  
    List<Funcionario> tableEmployeersData = crud.getAllFunc();
    
    for(Funcionario employeer : tableEmployeersData) {
      String job = employeer.getJob();
      String name = employeer.getName();
      if (!this.getMapJobAndPeople().containsKey(job)) {
        this.mapJobAndPeople.put(job, new ArrayList<String>());
      }
      this.mapJobAndPeople.get(job).add(name);
    }
  }
  
  public void incRemuneration() {
    CrudFuncionario crud = new CrudFuncionario();
    
    List<Funcionario> tableEmployeersData = crud.getAllFunc();
    
    tableEmployeersData.stream()
        .forEach(employeer -> {
           BigDecimal newRemuneration = new BigDecimal(employeer.getRemuneration().longValue() * 1.1);
           crud.updateRemunaration(employeer, newRemuneration);
        });
  }
  
  public Map<String, List<String>> getMapJobAndPeople() {
    return mapJobAndPeople;
  }
}