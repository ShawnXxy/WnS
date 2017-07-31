package UI;

import java.awt.Frame;
import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainFrame extends Frame implements KeyListener {
	
	public MainFrame() {
		boxInit();
		wolfInit();
		sheepInit();
		sheepInit();
		sheepInit();
		treeInit();
		backgroundInit();
		setMainFrameUI();
		this.addKeyListener(this);
	}
	
	// setting game window
	private void setMainFrameUI() {
		this.setLocation(150, 50);
		this.setSize(800, 600);
		this.setResizable(false);
		this.setTitle("Woft & Sheep");
		this.setLayout(null);
		this.setVisible(true);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void backgroundInit() {
		Icon i = new ImageIcon("background.png");
		JLabel backgroundImg = new JLabel(i);
		backgroundImg.setBounds(5, 0, 800, 600);
		this.add(backgroundImg);
	}
	
	// setting game board
	// 0 represents empty
	// 1 represents tree
	// 2 represents wolf
	// 4 represents sheep
	int[][] datas = {
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
			{1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1},
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
			{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	};
	int row; // represents character's x
	int col; // represents character's y
	private void treeInit() {
		Icon i = new ImageIcon("tree.png");
		for (int r = 0; r < datas.length; r++) {
			for (int c = 0; c < datas[0].length; c++) {
				if (datas[r][c] == 1) {
					JLabel tree = new JLabel(i);
					tree.setBounds(12 + 50 * c, 36 + 50 * r, 50, 50); // ????????????
					this.add(tree);
				}
			}
		}
	}
//	private void treeInit() {
//		int rows = 16;
//		int cols = 12;
//		int[][] datas = new int[rows][cols];
//		Random rand = new Random();
//		int x;
//		int y;
//		int count = 0;
//		while (count < 50) {
//			x = rand.nextInt(15) + 1;
//			y = rand.nextInt(11) + 1;
//			if (datas[x][y] == 1) {
//				count--;
//				Icon i = new ImageIcon("tree.png");
//				JLabel tree = new JLabel(i);
//				tree.setBounds(x, y, 50, 50);
//				this.add(tree);
//			} else {
//				datas[x][y] = 1;
//				count++;
//				Icon i = new ImageIcon("tree.png");
//				JLabel tree = new JLabel(i);
//				tree.setBounds(x, y, 50, 50);
//				this.add(tree);
//			}
//		}
//	}
	
	// setting game characters
	JLabel wolf;
	private void wolfInit() {
		Icon i = new ImageIcon("wolf.png");
		// create wolf randomly
//		Random rand = new Random();
//		int x = rand.nextInt(14) * 50 + 50;
//		int y = rand.nextInt(10) * 50 + 50;
		row = 4;
		col = 6;
		// insert sprite/image
		wolf = new JLabel(i);
		wolf.setBounds(12 + row * 50, 36 + col * 50, 50, 50);
		this.add(wolf);
		
	}
	private void sheepInit() {
		Icon i = new ImageIcon("sheep.png");
		// create sheeps randomly
		Random rand = new Random();
		int x = rand.nextInt(14) * 50 + 50;
		int y = rand.nextInt(10) * 50 + 50;
		
		JLabel sheep1 = new JLabel(i);
		sheep1.setBounds(x, y, 50, 50);
		this.add(sheep1);
		datas[x / 50][ y / 50] = 4;
		
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
			if (datas[row - 1][col] == 1) { // meeting tree
				return;
			}
			if (datas[row - 1][col] == 4) { // moving sheep
				
				datas[row - 1][col] = 0;
				datas[row - 2][col] = 4;
				sheep1.setLocation();
				
				row -= 1;
				int x = (int) wolf.getLocation().getX();
				int y = (int) wolf.getLocation().getY();
				wolf.setLocation(x - 50, y);
				Icon i = new ImageIcon("wolfLeft.png");
				wolf.setIcon(i);
				
				return;
				
			}
			row -= 1;
			int x = (int) wolf.getLocation().getX();
			int y = (int) wolf.getLocation().getY();
			wolf.setLocation(x - 50, y);
			Icon i = new ImageIcon("wolfLeft.png");
			wolf.setIcon(i);
		}
		// right
		if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
			if (datas[row + 1][col] == 1) { // meeting tree
				return;
			}
			if (datas[row + 1][col] == 4) { // moving sheep
				
				datas[row + 1][col] = 0;
				datas[row + 2][col] = 4;
				
				row += 1;
				int x = (int) wolf.getLocation().getX();
				int y = (int) wolf.getLocation().getY();
				wolf.setLocation(x + 50, y);
				Icon i = new ImageIcon("wolfRight.png");
				wolf.setIcon(i);
				return;
			}
			row += 1;
			int x = (int) wolf.getLocation().getX();
			int y = (int) wolf.getLocation().getY();
			wolf.setLocation(x + 50, y);
			Icon i = new ImageIcon("wolfRight.png");
			wolf.setIcon(i);
		}
		// up
		if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
			if (datas[row][col - 1] == 1) { // meeting tree
				return;
			}
			if (datas[row][col - 1] == 4) { // moving sheep
				
				datas[row][col - 1] = 0;
				datas[row][col - 2] = 4;
				
				col -= 1;
				int x = (int) wolf.getLocation().getX();
				int y = (int) wolf.getLocation().getY();
				wolf.setLocation(x, y - 50);
				Icon i = new ImageIcon("wolfUp.png");
				wolf.setIcon(i);
				return;
			}
			col -= 1;
			int x = (int) wolf.getLocation().getX();
			int y = (int) wolf.getLocation().getY();
			wolf.setLocation(x, y - 50);
			Icon i = new ImageIcon("wolfUp.png");
			wolf.setIcon(i);
		}
		// down
		if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
			if (datas[row][col + 1] == 1) {
				return;
			}
			if (datas[row][col + 1] == 4) { // moving sheep
				
				datas[row][col + 1] = 0;
				datas[row][col + 2] = 4;
				
				col += 1;
				int x = (int) wolf.getLocation().getX();
				int y = (int) wolf.getLocation().getY();
				wolf.setLocation(x, y + 50);
				Icon i = new ImageIcon("wolf.png");
				wolf.setIcon(i);
				
				return;
			}
			col += 1;
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
