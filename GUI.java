package BuffonNeedle;

import javax.swing.JFrame;

public class GUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GUI() {
		setSize(300, 300);
		setTitle("Buffon Needle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Paint());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		GUI g = new GUI();
	}

}
