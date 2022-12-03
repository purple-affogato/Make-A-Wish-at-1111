/*
Kailey & Ivy
Date: Dec 22, 2021
Teacher: Krasteva
Assignment: ISP Make A Wish at 11:11 - takes input as user plays game.
*/
import java.awt.*;
import hsa.Console;

/*
Variables
Name        Type        Purpose
c           Console     output console
input       int         letter that user clicks
*/
public class KeyInput {
    Console c;
    char input;
    public KeyInput(Console q){
	c = q;
    }
    public void keyClick(){
	input = c.getChar(); //letter user clicks
	
	//letter box - shows which key user clicked.
	c.setColor(Color.black);
	c.fillRect(3, 32, 29, 29);
	c.setColor (new Color (255, 238, 82));
	c.fillRect(5, 34, 25, 25);
	c.setColor(Color.black);
	c.setFont (new Font ("Castellar", Font.PLAIN, 13));
	c.drawString(input+"", 12, 52);
    }
}
