package tmdpbo.views.*;

import javax.swing.*;

class Window extends JFrame{
	public Window(String title){
		setTitle(title);
		setSize(1000,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		visible(true);
	}

	protected void visible(Boolean bool){
		setVisible(bool);
	}

	protected void close(){
		disponse();
	}
}