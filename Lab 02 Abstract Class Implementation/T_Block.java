/*
 * Created by Jasque Saydyk and Duxing Chen
 * Lab 02 - Drawing Blocks
 * CS 136L Section 3801
 * 5 February, 2017
 * Description - This class describes the T block in Tetris, with each square being 20 by 20 pixels.
 * The T is composed of 3 blocks horizontal, and 1 block 20 pixels down and across forming a squashed T
 * The blockArray is used to store the different Rectangles needed to construct the shape
 * The rotate methods redraw the shape to describe how it looks in those various positions
 * The rotate methods rotate the shape counter clock-wise
*/
import java.awt.Color;
import java.awt.Rectangle;

public class T_Block extends Tetromino{

	private Rectangle block2;
	
	public T_Block() {
		super();
		x = 0;
		y = 0;
		blockColor = new Color(128, 0, 128);
		blockArray = new Rectangle[2];
		block = new Rectangle(x, y, 3 * 20, 1 * 20);
		block2 = new Rectangle(x + 20, y + 20, 1 * 20, 1 * 20);
		blockArray[0] = block;
		blockArray[1] = block2;
	}
	
	public T_Block(int x, int y) {
		this.x = x;
		this.y = y;
		blockColor = new Color(128, 0, 128);
		blockArray = new Rectangle[2];
		block = new Rectangle(this.x, this.y, 3 * 20, 1 * 20);
		block2 = new Rectangle(this.x + 20, this.y + 20, 1 * 20, 1 * 20);
		blockArray[0] = block;
		blockArray[1] = block2;
	}

	@Override
	public void rotate0() {
		block.setBounds(x, y, 3 * 20, 1 * 20);
		block2.setBounds(x + 20, y + 20, 1 * 20, 1 * 20);
	}
	
	@Override
	public void rotate90() {
		block.setBounds(x, y, 1 * 20, 3 * 20);
		block2.setBounds(x + 20, y + 20, 1 * 20, 1 * 20);
	}

	@Override
	public void rotate180() {
		block.setBounds(x, y + 20, 3 * 20, 1 * 20);
		block2.setBounds(x + 20, y, 1 * 20, 1 * 20);
	}

	@Override
	public void rotate270() {
		block.setBounds(x + 20, y, 1 * 20, 3 * 20);
		block2.setBounds(x, y + 20, 1 * 20, 1 * 20);
	}
}
