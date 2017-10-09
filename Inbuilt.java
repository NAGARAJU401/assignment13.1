package String;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as
public class Inbuilt {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
	  //classes are the basics of opps(object oriented programming)
	public static void main(String[] args){
		//Public is a keyword that is used as an access modifier for methods and variables.
				//static used to prepare a field,method or inner classes as a class field.
				//void: it is void if the method does not return a value.
				//main:it is a function name When a program starts running, it has to start execution from somewhere.
				//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.

			// TODO Auto-generated method stub
		int integer=200;//Initializing the integer value
		String string=String.valueOf(integer);
		
//creating a String object. 
//valueOf(integer):means it is static method Of string class.
//It is a returns the value of integer that we gave
//It convert int into String in java
		string=Integer.toString(integer);
		System.out.println("After converting int into string");
		 //system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.
		System.out.println("Output is:"+integer);
		//system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.
}
}