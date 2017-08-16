package selecao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.pgrl.reader.impl.controller.CityController;
import br.pgrl.reader.model.enums.ControllersEnum;

public class ViewEnumTest {
	@Test
	public void daoEnumTest() {
		
	assertTrue(CityController.class.isInstance(ControllersEnum.CITY.getController()));	
	assertEquals("Cidades",ControllersEnum.CITY.getTitle());	

	}
}
