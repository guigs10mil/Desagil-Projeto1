package br.pro.hashi.ensino.desagil.tequilada;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements ActionListener, KeyListener {
	
	private Model model;
	private View view;
	
	
	public Controller (Model model, View view) {
		this.model = model;
		this.view = view;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		model.update();
		view.repaint();
	}
	@Override
	public void keyPressed(KeyEvent event) {
		if(event.getKeyCode() == KeyEvent.VK_D) {
			model.getHumanPlayer().move(0, 1);
		}
		if(event.getKeyCode() == KeyEvent.VK_A) {
			model.getHumanPlayer().move(0, -1);
		}
		if(event.getKeyCode() == KeyEvent.VK_W) {
			model.getHumanPlayer().move(-1, 0);
		}
		if(event.getKeyCode() == KeyEvent.VK_S) {
			model.getHumanPlayer().move(1, 0);
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
