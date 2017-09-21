package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDo implements ActionListener{
	JButton button;
	JButton button2;
	JButton button3;
	JButton button4;
	String name;
	String task;
	ToDo todo;
	ArrayList <String> list = new ArrayList<String>();
	Scanner scan = null;
	PrintWriter pw = null;
	File file = new File("/Users/league/Desktop/ /src/intro_to_file_io/test.txt");
	
public  static void main(String[] args) {
	ToDo todo = new ToDo();
	todo.main2();
	

	
	
}
void main2() {
	JFrame frame = new JFrame();
	frame.setSize(500, 500);
	frame.setVisible(true);
	JPanel panel = new JPanel();
	button = new JButton();
	button2 = new JButton();
	button3 = new JButton();
	button4 = new JButton();
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	button.setText("add task");
	button2.setText("remove task");
	button3.setText("save");
	button4.setText("load");
	button.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
}

ToDo (){
	try {
		
		scan = new Scanner(file);
		pw = new PrintWriter(file);
		
		pw.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());
	}
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource() == button) {
		//String name = JOptionPane.showInputDialog("What is your name?");
		String task =JOptionPane.showInputDialog("Hi, my name is Siri, your personal assisstant. What is your task, " + name + "?" );
		list.add(task);
		
	}
	if (e.getSource() == button4) {
		pw.println(task);
	}
}
}
