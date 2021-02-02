package codingpractice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversionSolution {
	public static void main(String[] str) throws ParseException {
		String input = "07:05:45PM";
		DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
	    DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
	    Date date= df.parse(input);
	    String output = outputformat.format(date);
	    System.out.println(output);
	      
	}
}
