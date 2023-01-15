import javax.swing.*;
import java.awt.*;

class Frame extends JFrame{
    public Frame() {
	
	setTitle("INDOMERID");
	setExtendedState(JFrame.MAXIMIZED_BOTH);
	setUndecorated(true);
	setVisible(true);
	changeBkColor();

	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void changeBkColor() {
            Container contentPane = getContentPane();
            contentPane.setBackground(Color.WHITE);
	}
    
}
