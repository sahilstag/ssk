package NEW1;

public class stringbufferbuilder {
	public static void main(String[] args) {
		
	
	String s="velocity";
	s.concat("kataraj"); 
	System.out.println(s);
	//it will print s= velocity only because its immutable
	//that is immutable
	
	StringBuilder build =new StringBuilder("pune");
	build.append("m");
	System.out.println(build);
	//here actual value is change to punem 
	//that mean its mutable
	build.append("s");
	build.append("g");
	System.out.println(build);
	
	StringBuffer buffer=new StringBuffer("mumbai");
	buffer.append("p");
	System.out.println(buffer);
	//result is mumbaip
	//that is its mutable
	buffer.append("h");
	System.out.println(buffer);
	
	
	
	}
}
