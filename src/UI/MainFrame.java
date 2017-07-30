package UI;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MainFrame extends Frame implements KeyListener {
	
	public MainFrame() {
		boxInit();
		wolfInit();
		sheepInit();
		sheepInit();
		sheepInit();
		
		backgroundInit();
		setMainFrameUI();
		this.addKeyListener(this);
	}
	
	// setting game window
	private void setMainFrameUI() {
		this.setLocation(150, 50);
		this.setSize(800, 600);
		this.setTitle("Woft & Sheep");
		this.setLayout(null);
		this.setVisible(true);
	}
	private void backgroundInit() {
		Icon i = new ImageIcon("background.png");
		JLabel backgroundImg = new JLabel(i);
		backgroundImg.setBounds(10, 31, 800, 600);
		this.add(backgroundImg);
	}
	
	// setting game characters
	JLabel wolf;
	private void wolfInit() {
		Icon i = new ImageIcon("wolf.png");
		
		Random rand = new Random();
		int x = rand.nextInt(14) * 50 + 50;
		int y = rand.nextInt(10) * 50 + 50;
		
		wolf = new JLabel(i);
		wolf.setBounds(x, y, 50, 50);
		this.add(wolf);
	}
	private void sheepInit() {
		Icon i = new ImageIcon("sheep.png");
		
		Random rand = new Random();
		int x = rand.nextInt(14) * 50 + 50;
		int y = rand.nextInt(10) * 50 + 50;
		
		JLabel sheep1 = new JLabel(i);
		sheep1.setBounds(x, y, 50, 50);
		this.add(sheep1);
		
//		JLabel sheep2 = new JLabel(i);
//		sheep2.setBounds(x, y, 50, 50);
//		this.add(sheep2);
//		
//		JLabel sheep3 = new JLabel(i);
//		sheep3.setBounds(x, y, 50, 50);
//		this.add(sheep3);
	}
	private void boxInit() {
		Icon i = new ImageIcon("box.png");
		
		Random rand = new Random();
		int x = rand.nextInt(14) * 50 + 50;
		int y = rand.nextInt(10) * 50 + 50;
		
		JLabel box1 = new JLabel(i);
		box1.setBounds(x, y, 50, 50);
		this.add(box1);
		
		JLabel box2 = new JLabel(i);
		box2.setBounds(x + 50, y, 50, 50);
		this.add(box2);
		
		JLabel box3= new JLabel(i);
		box3.setBounds(x + 100, y, 50, 50);
		this.add(box3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		// left
		if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
			int x = (int) wolf.getLocation().getX();
			int y = (int) wolf.getLocation().getY();
			wolf.setLocation(x - 50, y);
			Icon i = new ImageIcon("wolfLeft.png");
			wolf.setIcon(i);
		}
		// right
		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
			int x = (int) wolf.getLocation().getX();
			int y = (int) wolf.getLocation().getY();
			wolf.setLocation(x + 50, y);
			Icon i = new ImageIcon("wolfRight.png");
			wolf.setIcon(i);
		}
		// up
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
			int x = (int) wolf.getLocation().getX();
			int y = (int) wolf.getLocation().getY();
			wolf.setLocation(x, y - 50);
			Icon i = new ImageIcon("wolfUp.png");
			wolf.setIcon(i);
		}
		// down
		if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
			int x = (int) wolf.getLocation().getX();
			int y = (int) wolf.getLocation().getY();
			wolf.setLocation(x, y + 50);
			Icon i = new ImageIcon("wolf.png");
			wolf.setIcon(i);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
