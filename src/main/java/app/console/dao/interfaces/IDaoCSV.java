package app.console.dao.interfaces;

import java.io.File;
import java.util.List;

import app.console.exceptions.ReaderFileException;

public interface IDaoCSV {
	
	public List<String> getLines() throws ReaderFileException  ;
	
	public  String getSeparator();

	public  String getHeader();
	
	public  File getDirectory();

}
