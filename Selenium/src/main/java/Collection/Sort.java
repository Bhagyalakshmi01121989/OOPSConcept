package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sort {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	 List<String> companyname = new ArrayList<String>();
		 companyname.add("HCL");
		 companyname.add("Wipro");
		 companyname.add("Aspire System");
		 companyname.add("CTS");
		
		for (String eachitem1 : companyname) {
			System.out.println(eachitem1);
			
		}
		//collections.reverse(companyname);
		Collections.sort(companyname);
		System.out.println("***************************************");
		
		for (String eachitem2 : companyname) {
			System.out.println(eachitem2);
			
		}

	}
	

		
	}

