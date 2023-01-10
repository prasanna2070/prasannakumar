package constructor.org;

public class SingleConst {

	public SingleConst() {
	
		this("prasannakumar.N");
		System.out.println("Default constructor");
			}
	
	public SingleConst(String email) {
		
		
		this("Prasanna", 5011990l);
		System.out.println("parameterized constructor");
	    System.out.println(email);
		
	}
	
	public SingleConst(String name, long dob){
		
		System.out.println("two parametrized");
		System.out.println(name);
		System.out.println(dob);
	}
	
	
	
	
}
