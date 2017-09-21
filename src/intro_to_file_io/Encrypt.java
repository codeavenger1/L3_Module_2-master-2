package intro_to_file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Encrypt {
	
public static void main(String[] args) {
	Scanner scan = null;
	PrintWriter pw = null;
	File file = new File("/Users/league/Desktop/ /src/intro_to_file_io/Encrypt");

	String reverse =JOptionPane.showInputDialog("Give me an encrypted message");
	
	try {
		scan = new Scanner(file);
		pw = new PrintWriter(file);
		pw.println(reverseStr(reverse));
		pw.println("// Copyright © 2017 by Shiva");
		pw.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
	}
	
	
	
}

public static String reverseStr(String a) {
	String b = "";
	for (int i = a.length()-1; i > -1; i--) {
		b += a.charAt(i);
	}
	return b;
	
}
}
