package antwar;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Spelplan extends Canvas implements Runnable {

	int nrofcubes = 6;
	public int cubes[] = new int[6];
	int x;
	int y;

	private Thread thread;

	/*
	 * Snake snake;
	 */

	public Spelplan() {
		// super("ant");
		// snake = new Snake(200,200);
		thread = new Thread(this);
		thread.start();
	}

	public void paint(Graphics g) {

		Image bild = createImage(this.getWidth(), this.getHeight());
		Graphics page = bild.getGraphics();
		page.setColor(new Color(0, 0, 0));
		page.fillRect(0, 0, this.getWidth(), getHeight());

		/*
		 * snake.drawOrm(page); snake.makePill(page);
		 */
		g.drawImage(bild, 0, 0, this);

	}

	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

	public void update(Graphics page) {
		paint(page);
	}

}
