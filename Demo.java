class Demo{
	// whenever we recieve args from cmd, they are always in the form of text
	// String args[]
	// String []arr
	// String[] arguments
	// String ...x -> varargs -> variable arguments
	public static void main(String args[]){  // void is the return type
		Z.someOtherFn();
		PrintStream out = new PrintStream();
		if(args.length > 1){
			int a = Integer.valueOf(args[0]);
			int b = Integer.valueOf(args[1]);
			System.out.println(a+b);
		}
		System.out.println("Welcome to Java World!");
		Z obj = new Z();  // used to create new object of Z class
		obj.someFn();
	}
}
class Y{

}
class Z{
	public static void main(String args[]){
	}
	int someFn(){
		return 10 + 20;
	}
	static int someOtherFn(){

	}
}

// Class,interface names -> capitalCase, ArrayIndexOutOfBoundsException
// Variable names -> camelCase, isPrimeNumber, isDuplicate, isFound, studentObject
// COMPANY_NAME, MAX_SIZE, MAX$SIZE12344, 1234MAX_SIZE

// .java
/*javac <source-file>
compile Demo.java -> Student.class
java <class-name>

java command

1. Linking and loading of classes and static things -> min 1k classes of java
2. Bytecode verification
3. Conversion to machine code
4. Machine code execution -> fires psvm()

JRE internally uses JITc
Just-in-time compilers*/
