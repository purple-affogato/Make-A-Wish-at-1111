/*
Kailey and Ivy
Date: Dec 20, 2021
Teacher: Krasteva
Assignment: ISP Make A Wish at 11:11 - class for animating stars falling
*/
import java.awt.*;
import java.lang.*; //for threads
import hsa.Console;
import java.util.*;

/*
Variables
Name        Type        Purpose
c           Console     output console
level       int         difficulty level of game
speed       int         how fast stars fall
ctr         int         total amount of stars that have fallen
amount      int         number of stars that fall at a time
letter      char[]      letter on each star falling
xVal        int[]       x-coordinate of star falling
height      int[]       y-coordinate of star falling

*/
public class FallingStars extends Thread
{
    Console c;
    int level, speed, ctr;
    final int amount;
    char letter[];
    int xVal[], height[];

    public FallingStars (Console q, int l)
    {
	c = q;
	level = l;
	ctr = 0;
	speed = 80 - level*10;
	//decides amount of stars falling at once based on level.
	if (level == 1)
	{
	    amount = 3;
	}
	else if (level == 2)
	{
	    amount = 4;
	}
	else
	{
	    amount = 5;
	}
    }


    //animates stars falling
    public void animateStars ()
    {
	letter = new char [amount];
	xVal = new int [amount];
	height = new int [amount];
	for (int i = 0 ; i < amount ; i++)
	{
	    letter [i] = (char) (Math.random () * 26 + 97);
	    height [i] = (int) (Math.random () * 20 + 45);
	    xVal [i] = (int) (Math.random () * 430 + 95);
	}
	Color bg; //colour of background
	if (level == 1)
	    bg = new Color (173, 235, 247);
	else if (level == 2)
	    bg = new Color (239, 208, 242);
	else
	    bg = new Color (7, 22, 99);
	while (ctr < level * 20)
	{
	    for (int i = 0 ; i < amount ; i++)
	    {
		if ((letter [i] == '0' || height [i] + 45 >= 280) && ctr < level * 20)
		{
		    //randomizes values for new stars.
		    letter [i] = (char) (Math.random () * 26 + 97);
		    height [i] = (int) (Math.random () * 20 + 45);
		    xVal [i] = (int) (Math.random () * 404 + 98);
		}
		//draws stars
		c.setColor (new Color (212, 143, 33));
		c.fillStar (xVal [i], height [i], 40, 40);
		c.setColor (Color.black);
		//letter on star
		c.setFont (new Font ("Castellar", Font.PLAIN, 13));
		c.drawString (letter [i] + "", xVal [i] + 14, height [i] + 28);
		if (ctr >= level * 20)
		{
		    break;
		}
	    }
	    if (ctr >= level * 20)
	    {
		break;
	    }
	    try
	    {
		sleep (speed);
	    }
	    catch (Exception e)
	    {
	    }
	    //covers stars for animation.
	    for (int i = 0 ; i < amount ; i++)
	    {
		c.setColor (bg);
		c.fillStar (xVal [i], height [i], 40, 40);
		height [i]++;
	    }
	}
    }


    public void run ()
    {
	animateStars ();
    }
}
