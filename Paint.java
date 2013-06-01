package BuffonNeedle;

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.util.Random;
import javax.swing.JComponent;

public class Paint extends JComponent {
	Needle n;
	Random gen = new Random();
	
	public Paint() {
		this.n = new Needle();
		addMouseListener(new Click());
	}
	
	class Click implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			repaint();
		}
		public void mouseEntered(MouseEvent arg0) {}
		public void mouseExited(MouseEvent arg0) {}
		public void mousePressed(MouseEvent arg0) {}
		public void mouseReleased(MouseEvent arg0) {}
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawLine(0, 250, 300, 250);
		g2.drawLine(0, 150, 300, 150);
		int xVal = gen.nextInt(250);
		n.drop();
		double x2 = xVal + (Math.cos(Math.toRadians(n.angle))*100);
		Line2D needle = new Line2D.Double(xVal, 300-(n.ylow*50), x2, 300-(n.yhigh*50));
		g2.draw(needle);
		if (needle.intersectsLine(0, 250, 300, 250) || needle.intersectsLine(0, 150, 300, 150)) {
			n.hits++;
			g2.drawString("Hit", 150, 75);
		}
		else
			g2.drawString("Miss", 150, 75);
		g2.drawString("Tries / hits = " + (double) n.getTries() / n.getHits(), 150, 100);
	}
}
