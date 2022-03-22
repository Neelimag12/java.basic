package com.training.CG;

import java.util.HashMap;

public class Employee1 {
	HashMap<String,Double>hmap=new HashMap<>();
	Employee1(double CTC){
		hmap.put("CTC",CTC);
		
	}
	HashMap calculate() {
		double basic_sal=0.4*hmap.get("CTC");
		hmap.put("Basic salary",basic_sal);
		hmap.put("PF amount",0.12*basic_sal);
		return hmap;
	}
	

}

