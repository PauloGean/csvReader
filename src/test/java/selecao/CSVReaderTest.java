package selecao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.pgrl.reader.api.csv.dao.ICSVReader;
import br.pgrl.reader.api.csv.dao.IDaoCSV;
import br.pgrl.reader.exceptions.DataQueryException;
import br.pgrl.reader.impl.csv.dao.CSVReader;

public class CSVReaderTest {
	@Mock
	private IDaoCSV daoCSV;

	private ICSVReader reader;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		Mockito.when(daoCSV.getDirectory()).thenReturn("cidades.csv");
		reader = new CSVReader(daoCSV);

	}

	@Test
	public void getLinesTest()  throws DataQueryException  {

		List<String> lines = reader.getLines();
		assertEquals(11, lines.size());

	}

	
	@Test(expected = DataQueryException.class)
	public void getLinesTestNotFoundFile() throws DataQueryException  {
		Mockito.when(daoCSV.getDirectory()).thenReturn("acidades.csv");

		reader.getLines();

	}
}
