package commonLibs;

import java.util.Date;

public class TestDate {

	public static void main(String[] args) {
		Date oDate;
		String[] sDatePart;
		String sDateStamp;
		
		
		oDate = new Date();
		System.out.println(oDate.toString());
		//Thu Apr 06 11:16:54 IST 2017

		sDatePart = oDate.toString().split(" ");
		
		sDateStamp = sDatePart[5] + "_" +
				sDatePart[1] + "_" +
				sDatePart[2] + "_" +
				sDatePart[3] ;
		
		//2017_Apr_06_11:16:54
		
		sDateStamp = sDateStamp.replace(":",  "_");
		System.out.println(sDateStamp);//2017_Apr_06_11_16_54

	}

}
