
public class Driver {
	public static void main(String[]args){
		Dictionary Dictionary = new Dictionary();
		// isEmpty:
		System.out.println("IsEmpty: " + Dictionary.isEmpty());
		// getSize:
		System.out.println("Size = " + Dictionary.getSize());
		// insert:
		System.out.println("Inserting...");
		Dictionary.insert("dog");
		Dictionary.insert("cat");
		Dictionary.insert("tiger");
		Dictionary.insert("giraffe");
		Dictionary.insert("cat");
		// getSize:
		System.out.println("Size = " + Dictionary.getSize());
		// find:
		System.out.println("find cat: " + Dictionary.find("cat"));
		System.out.println("find dog: " + Dictionary.find("dog"));
		System.out.println("find mouse: " + Dictionary.find("mouse"));
		// printSorted:
		System.out.println("PrintSorted: ");
		Dictionary.printSorted();					
		// printSorted after removing tiger:
		Dictionary.remove("tiger");
		System.out.println("printSorted after removing tiger:");
		Dictionary.printSorted();
		//trying to find tiger after lazy-deleting tiger:
		System.out.println("find tiger: " + Dictionary.find("tiger"));
		// getSize:
		System.out.println("Size = " + Dictionary.getSize());
		
		
		//single rotation:
		//write test code to demonstrate that single rotation works:
		//double rotation:
		//write test code to demonstrate that double rotation works:
		}
}
