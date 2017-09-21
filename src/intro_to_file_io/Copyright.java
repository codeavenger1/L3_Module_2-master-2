package intro_to_file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Copyright {
public static void main(String[] args) {
	Scanner scan;
	String files = "/Users/league/Desktop/ /src/intro_to_file_io/Encrypt";
	PrintWriter pw = null;
	File file = new File(files);
	try {
		scan = new Scanner(file);
		pw = new PrintWriter(file);
		pw.println("// Copyright © 2017 by Shiva");
		pw.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}
	
}
}
