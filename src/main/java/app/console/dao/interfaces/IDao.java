package app.console.dao.interfaces;

import java.util.List;

import app.console.exceptions.ReaderFileException;

public interface IDao  {
	public String getHeader();

	public long count()  throws ReaderFileException;

	public long countDistinct(String field)  throws ReaderFileException;

	public List<String> filter(String field, String value)  throws ReaderFileException;

}
