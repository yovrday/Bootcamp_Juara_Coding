package com.juaracoding.soalweek1;

public class No_7_Employee {

public static void main(String[] args) {
		
	System.out.println(employee(8,"Peter","Tan",2500));
	System.out.println(employee(8,"Peter","Tan",999));

}
	static String employee (int id,String fname, String lname, int salary ) {
	  
	System.out.println("Employee [id="+id+",name="+fname+" "+lname+",salary="+salary+"]");
	  
	System.out.println("id is : "+id);
    System.out.println("firstname is  : "+fname);
    System.out.println("lastname is  : "+lname);
    System.out.println("salary is : "+salary);
    
    int asalary = salary*12;
    
    System.out.println("name is : "+fname+" "+lname);
    System.out.println("annual salary is : "+asalary);
    int bsalary = asalary/10-100;
    System.out.println("Employee [id="+id+",name="+fname+" "+lname+",salary="+bsalary+"]");
	  
	return "";
}
}

