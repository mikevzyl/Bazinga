/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bazinga;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Michael
 */
public class Cartman {
   private Point position = new Point(100, 100);
   private Dimension size = new Dimension(450,450);
   
    public void draw(Graphics graphics){
        //put all code to draw Cartman here!
        System.out.println("here");
        graphics.setColor(Color.RED);
        graphics.fillOval(position.x, position.y + (size.height /10), size.width, size.height * 4 / 5);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(position.x, position.y + (size.height /10), size.width, size.height * 4 / 5);
 
        
        //mouth
        graphics.setColor(Color.BLACK);
        graphics.fillOval(position.x + (size.width * 2 / 7), position.y + (size.height * 4 / 7), size.width * 2 / 4 , size.height / 4);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(position.x + (size.width / 4), position.y + (size.height / 20), size.width / 4 , size.height / 4);
        
        
        
        //upper mouth
        graphics.setColor(Color.red);
        graphics.fillOval(position.x + (size.width * 2 / 10), position.y + (size.height * 2 / 5), size.width * 6 / 9 , size.height * 1 / 4);
        
        //right side mouth
        graphics.setColor(Color.red);
        graphics.fillOval(position.x + (size.width *  7 / 10), position.y + (size.height * 3 / 5), size.width *1 / 8 , size.height * 1 / 6);
        
        
        
//        nose
        graphics.setColor(Color.ORANGE);
        graphics.fillOval(position.x + (size.width * 3 / 8), position.y + (size.height *1 / 4), size.width / 4 , size.height / 4);
        
//        right eye
        graphics.setColor(Color.WHITE);
        graphics.fillOval(position.x + (size.width / 4), position.y + (size.height / 20), size.width / 4 , size.height / 4);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(position.x + (size.width / 4), position.y + (size.height / 20), size.width / 4 , size.height / 4);
//        graphics.drawOval(200, 200, 300, 300);
 
        //left eye
 
        graphics.setColor(Color.WHITE);
        graphics.fillOval(position.x + (size.width / 2), position.y + (size.height / 20), size.width / 4 , size.height / 4);
        graphics.setColor(Color.BLACK);
        graphics.drawOval(position.x + (size.width / 2), position.y + (size.height / 20), size.width / 4 , size.height / 4);
 
        //left inside eye
        graphics.setColor(Color.black);
        graphics.fillOval(position.x + (size.width * 1 / 3), position.y + (size.height * 1 / 8), size.width *1 / 8 , size.height * 1 / 8);
        
        //right inside eye
        graphics.setColor(Color.black);
        graphics.fillOval(position.x + (size.width * 4 / 7), position.y + (size.height * 1 / 8), size.width *1 / 8 , size.height * 1 / 8);
         
      
    }
    
}
