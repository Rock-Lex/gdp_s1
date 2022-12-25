package Lifegame;

import java.awt.*;
import javax.swing.*;


public class GUI {
	private DrawFrame frame; 
	
	public void init(boolean [][] matrix) {	
		frame = new DrawFrame(matrix);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}
	
	public void zeige(boolean [][] matrix){
		frame.zeige(matrix);
	}
}

class DrawFrame extends JFrame {
	DrawPanel panel;
	
	public DrawFrame(boolean [][] matrix){
		setTitle("Spiel des Lebens");
		setSize(4*matrix.length+100, 4*matrix[0].length+100);
		panel = new DrawPanel(matrix);
		Container contentPane = getContentPane();
		contentPane.add(panel);
	}
	
	public void zeige(boolean [][] matrix){
		panel.setMatrix(matrix);
		panel.repaint();
	}
}

class DrawPanel extends JPanel {
	boolean [][] panelMatrix;
	
	DrawPanel(boolean [][] panelMatrix){
		this.panelMatrix = panelMatrix;
	}
	void setMatrix(boolean [][] matrix){
		panelMatrix = matrix;
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i=0; i<panelMatrix.length; i++){
			for(int j=0; j<panelMatrix[0].length; j++){
				if(panelMatrix[i][j]==true){
					if(Lifegame.zaehleNachbarn(panelMatrix,i,j)>3){
						g.setColor(Color.RED);
					}else{
						g.setColor(Color.BLACK);
					}
				}else{
					g.setColor(Color.white);
				}
				g.fillRect(50+i*4,50+j*4, 3, 3);
			}
		}
	}
}
