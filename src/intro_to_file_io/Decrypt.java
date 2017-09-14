package intro_to_file_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Decrypt {
public static void main(String[] args) {
	Scanner scan = null;
	File file;
	//JFileChooser jf = new JFileChooser();
	//file = jf.getSelectedFile();
	file = new File("/Users/league/Desktop/Encrypt.txt") ;
	try {
		scan = new Scanner(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(reverseStr(scan.nextLine()));
	
}
public static String reverseStr(String a) {
	String b = "";
	for (int i = a.length()-1; i > -1; i--) {
		b += a.charAt(i);
	}
	return b;
	
}
}
