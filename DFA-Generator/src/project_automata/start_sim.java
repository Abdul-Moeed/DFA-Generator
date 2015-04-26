package project_automata;

import java.io.IOException;

public class start_sim {

	public static void main(String[] args) throws IOException {
		structure_file obj = new structure_file("trans_table.txt");
		obj.read_file();
		ui_dfa ui = new ui_dfa();
		ui.initDraw();
		ui.setVisible(true);
	}
}
