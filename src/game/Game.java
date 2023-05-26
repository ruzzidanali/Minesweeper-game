/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author HP
 */
public class Game implements Runnable {

  GUI gui = new GUI();
    public static void main(String[] args) {
        new Thread(new Game()).start();
       
        
    }

    @Override
    public void run() {
        while(true){
            gui.repaint();
            if (gui.resetter == false){
                gui.checkVictoryStatus();
               // System.out.println("Victory: "+ gui.victory + ", Defeat: "+ gui.defeat);
        }
       
    }
    
}
}
