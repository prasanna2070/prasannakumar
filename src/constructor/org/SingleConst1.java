package constructor.org;

public class SingleConst1 extends SingleConst {
	
public SingleConst1(String name, long dob){
		
		System.out.println("two parametrized");
		System.out.println(name);
		System.out.println(dob);
		}
	
	public static void main(String[] args) {
		SingleConst sc= new SingleConst();
		SingleConst sc1 = new SingleConst("pkw", 5856456865889l);
	}
	

}
