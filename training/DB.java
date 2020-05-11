package training;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DB {
	private static Set<EmployeeBase> empList;
	private static ArrayList<Payable> payableList; 
	private static ArrayList<UnionBase> unionList;
	
	public DB() {
		
		empList = new HashSet<EmployeeBase>();
		payableList = new ArrayList<Payable>();
		unionList = new ArrayList<UnionBase>();
	}
	
	public static Set<EmployeeBase> getEmployeeSet(){
		return empList;
	}
	public static ArrayList<Payable> getPayableList(){
		return payableList;
	}
	
	public static ArrayList<UnionBase> getUnionList(){
		return unionList;
	}
	
	
	
}
