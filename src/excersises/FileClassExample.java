package excersises;

import java.io.File;

public class FileClassExample {
	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		System.out.println(f1.getPath()+ "," + f1.getParent() + "," +f1.getName());
		String res="";
		if(f1.isFile()) {
			res="FILE";
		}
		else if(f1.isDirectory())
			res="DIRECTORY";
		else 
			res = "ERROR!";
		System.out.println(f1.getPath() + ": " + res);
		
		
	}

}
