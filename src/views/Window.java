package Views;

import javax.swing.*;

class Window extends JFrame{
	public Window(){
		setTitle("The Survive Hop");
		setSize(1000,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		visible(true);
	}

	protected void visible(Boolean bool){
		setVisible(bool);
	}

	protected void close(){
		dispose();
	}
}