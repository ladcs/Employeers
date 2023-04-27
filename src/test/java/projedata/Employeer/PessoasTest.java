package projedata.Employeer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple Pessoas.
 */
public class PessoasTest {
	@Test
	  @DisplayName("Testa se cria a lista corretamente")
	  void insertAll() {
		Pessoas p1 = new Pessoas("Garus", "22/09/1988");
		Pessoas p2 = new Pessoas("Rafael", "03/05/1994");
		Pessoas p3 = new Pessoas("Luciano", "19/02/1992");
		
		assertEquals(p1.getName(), "Garus");
		assertEquals(p1.getBirthDay(), "22/09/1988");
		assertEquals(p2.getName(), "Rafael");
		assertEquals(p2.getBirthDay(), "03/05/1994");
		assertEquals(p3.getName(), "Luciano");
		assertEquals(p3.getBirthDay(), "19/02/1992");
	  }
}
