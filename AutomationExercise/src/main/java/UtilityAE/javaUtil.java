package UtilityAE;

import java.util.Date;
import java.util.Random;

public class javaUtil {
	
	public int randomNo() {
		
		Random r = new Random();
		int rno = r.nextInt(99);
		return rno;
		
	}
	
	public String dtSshot() {
		
		String dt = new Date().toString();
		String dtShot = dt.replace(" ", "_").replace(":", "_");
		return dtShot;
	}

}
