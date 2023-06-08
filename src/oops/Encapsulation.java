package oops;
class EmplyoeData
{
	private String Empname;
	private int Empage;
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public int getEmpage() {
		return Empage;
	}
	public void setEmpage(int empage) {
		Empage = empage;
	}
	
	
}
public class Encapsulation {

	public static void main(String[] args)
	{
		EmplyoeData emp=new EmplyoeData();
		emp.setEmpname("Komal");
		emp.setEmpage(30);
		
		System.out.println(emp.getEmpname());
		System.out.println(emp.getEmpage());
	}

}
/*Codeshare logo
 ShareSign UpLog In
1
package oops;
2
​
3
class EmployeeDetails
4
{
5
  //private variable for data hiding
6
  private String employeeName;
7
  private int employeeAge;
8
  
9
  //Setter methods
10
  public void setEmployeeName(String name) {
11
    employeeName = name;
12
  }
13
  
14
  public void setEmployeeAge(int age) {
15
    employeeAge = age;
16
  }
17
  
18
  //getter methods
19
  public String getEmployeeName() {
20
    return employeeName;
21
  }
22
  
23
  public int getEmployeeAge() {
24
    return employeeAge;
25
  }
26
  
27
  
28
}
29
​
30
public class EncapsulationEx {
31
​
32
  public static void main(String[] args) {
33
    // TODO Auto-generated method stub
34
    
35
    EmployeeDetails emp = new EmployeeDetails();
36
    emp.setEmployeeName("Arun");
37
    emp.setEmployeeAge(30);
38
    


JOBS

SPONSORCoderPad - Interview developers in a realistic & intuitive IDE. Write, execute, and debug code live with candidates.px
Hide Ads
*/
