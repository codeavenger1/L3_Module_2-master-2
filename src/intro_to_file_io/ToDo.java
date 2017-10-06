package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDo implements ActionListener {
	JButton add;
	JButton remove;
	JButton save;
	JButton load;
	String name;
	String task;
	String removet;
	ToDo todo;
	String scans = "";
	ArrayList<String> list = new ArrayList<String>();
	File file = new File("/Users/league/Desktop/ /src/intro_to_file_io/test.txt");
	FileWriter fw;
	Scanner scan;
	public static void main(String[] args) {
		ToDo todo = new ToDo();
		todo.main2();

	}

	void main2() {
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		JPanel panel = new JPanel();
		add = new JButton();
		remove = new JButton();
		save = new JButton();
		load = new JButton();
		frame.add(panel);
		panel.add(add);
		panel.add(remove);
		panel.add(save);
		panel.add(load);
		add.setText("add task");
		remove.setText("remove task");
		save.setText("save");
		load.setText("load");
		add.addActionListener(this);
		remove.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
	}

	ToDo() {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == add) {
			// String name = JOptionPane.showInputDialog("What is your name?");
			task = JOptionPane.showInputDialog("What is your task?");
			list.add(task + "\n");
			System.out.println(task);
		}
		if (e.getSource() == save) {
			try {
				fw = new FileWriter("src/intro_to_file_io/ToDo", true);
				for (int i = 0; i < list.size(); i++) {
					fw.write(list.get(i));
				}
				fw.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if(e.getSource() == load) {
			
			try {
				scan = new Scanner(new File ("src/intro_to_file_io/ToDo"));
				while(scan.hasNextLine()) {
				//System.out.println(scans = scan.nextLine());
				
				scans += scan.nextLine();
				scans += "\n";
		}
			JOptionPane.showMessageDialog(null, scans);           
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
		if (e.getSource() == remove) {
			removet = JOptionPane.showInputDialog("What is the task you want to remove?\n");
			if (list.contains(removet)) {
				list.remove(removet);
			}

		}
	}
}
