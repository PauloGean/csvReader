package app.involves.cmd.controller;

import java.util.List;

import app.involves.controller.IComand;
import app.involves.dao.interfaces.IDao;
import app.involves.exceptions.ConsultDatesException;

public class Filter implements IComand {
	@Override
	public void exec(String comand,IDao dao) throws ConsultDatesException {
		String[] comands=comand.split(" ");
		String field=comands[1];
		String value=comands[2];
		List<String> list=dao.filter(field, value);
		System.out.println(dao.getHeader());
		for (String line : list) {
			System.out.println(line);
		}	
	}

}