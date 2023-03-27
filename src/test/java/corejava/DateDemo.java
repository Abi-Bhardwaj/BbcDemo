package corejava;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.xalan.xsltc.compiler.sym;

public class DateDemo {
	
	public static void main(String args[]) {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(sdf.format(d));
		SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		
	}
	

}
