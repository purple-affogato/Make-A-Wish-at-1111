/*
Kailey Cheng and Ivy Zhuang
Dec 17, 2021
Teacher: Krasteva
Assignment: ISP Make A Wish at 11:11 - main class that runs everything
*/

import hsa.*;

import javax.swing.*;
import java.awt.*;
import java.io.*;
/*
Variables
Name        Type        Purpose
c           Console     output console
f           JFrame      error messages and username input
level       int         stores level user chooses
score       int         stores user's total score of game
username    String      stores name the user's enters
choice      char        stores option on main menu that the user chooses
*/
public class MakeAWish1111
{

    Console c;
    JFrame f;
    public int level, score;
    public String username;
    public char choice;

    public MakeAWish1111 ()
    {
	c = new Console ("Make A Wish at 11:11!");
	f = new JFrame ();
    }


    //main method
    public static void main (String args[]) throws IOException
    {
	MakeAWish1111 m = new MakeAWish1111 ();
	m.splashScreen ();
	while (m.choice != '4')
	{
	    m.mainMenu ();
	    if (m.choice == '1')
	    {
		m.instructions ();
	    }
	    else if (m.choice == '2')
	    {
		m.playGame ();
		m.scoreUpdate ();
	    }
	    else if (m.choice == '3')
	    {
		m.leaderboard ();
	    }
	    else
		break;
	}
	m.goodbye ();
    }


    //animates splashscreen.
    public void splashScreen ()
    {
	c.setColor (new Color (255, 228, 225)); //background color
	c.fillRect (0, 0, c.getWidth (), c.getHeight ());

	c.setColor (new Color (244, 150, 78)); //font
	c.setFont (new Font ("Brush Script MT", Font.BOLD, 78));
	c.drawString ("Make A Wish", 20, 80);
	c.drawString ("At 11:11", 50, 160);
	int[] ex = {300, 330, 320, 310};  //exclamation mark
	int[] ey = {100, 100, 145, 145};
	c.fillPolygon (ex, ey, 4);
	c.fillStar (305, 150, 20, 20);
	c.setFont (new Font ("Calibri", Font.PLAIN, 20)); //our names
	c.drawString ("By Kailey and Ivy", 450, 480);

	c.setColor (Color.white); //jar
	c.fillRect (190, 210, 220, 40);
	c.fillOval (160, 210, 280, 260);
	c.fillRect (210, 430, 180, 40);

	//stars
	c.setColor (new Color (253, 94, 83)); //red
	c.fillStar (180, 350, 40, 40);
	c.fillStar (355, 400, 35, 35);
	c.fillStar (320, 360, 40, 40);
	c.fillStar (380, 380, 30, 30);
	c.fillStar (220, 400, 45, 45);
	c.setColor (new Color (25, 25, 112)); //blue
	c.fillStar (200, 370, 40, 40);
	c.fillStar (290, 350, 35, 35);
	c.fillStar (350, 380, 40, 40);
	c.fillStar (390, 365, 30, 30);
	c.fillStar (278, 396, 45, 45);
	c.setColor (new Color (255, 153, 153)); //pink
	c.fillStar (250, 375, 40, 40);
	c.fillStar (215, 345, 30, 30);
	c.fillStar (330, 408, 35, 35);
	c.fillStar (205, 390, 30, 30);
	c.fillStar (310, 390, 25, 25);
	c.setColor (new Color (167, 107, 207)); //purple
	c.fillStar (250, 360, 30, 30);
	c.fillStar (325, 370, 45, 45);
	c.fillStar (365, 355, 40, 40);
	c.fillStar (265, 400, 30, 30);
	c.fillStar (285, 380, 35, 35);
	c.setColor (new Color (135, 206, 235)); //light blue
	c.fillStar (250, 400, 40, 40);
	c.fillStar (315, 360, 35, 35);
	c.fillStar (230, 370, 40, 40);
	c.fillStar (280, 365, 35, 35);
	c.fillStar (300, 400, 45, 45);

	//curves + lightings
	c.setColor (Color.black);
	c.drawLine (230, 440, 370, 440);
	c.drawArc (295, 250, 135, 180, 280, 80);

	c.setColor (new Color (216, 191, 216)); //ribbon - very light
	c.fillRect (180, 240, 240, 25);
	c.setColor (new Color (221, 160, 221)); //ribbon - dark light
	int[] rbx1 = {215, 235, 220, 195};
	int[] rby1 = {250, 260, 340, 310};
	c.fillPolygon (rbx1, rby1, 4);
	int[] lbx1 = {195, 215, 180, 155};
	int[] lby1 = {230, 250, 310, 340};
	c.fillPolygon (lbx1, lby1, 4);
	c.setColor (new Color (216, 191, 216)); //ribbon - medium light
	int[] rbx2 = {220, 195, 200, 220, 240};
	int[] rby2 = {340, 310, 360, 400, 430};
	c.fillPolygon (rbx2, rby2, 5);
	int[] lbx2 = {180, 155, 160, 180};
	int[] lby2 = {310, 340, 400, 360};
	c.fillPolygon (lbx2, lby2, 4);
	c.setColor (new Color (230, 232, 250)); //ribbon - light light
	int[] rbx3 = {220, 240, 230, 210};
	int[] rby3 = {400, 430, 500, 445};
	c.fillPolygon (rbx3, rby3, 4);
	int[] lbx3 = {156, 132, 160};
	int[] lby3 = {360, 390, 400};
	c.fillPolygon (lbx3, lby3, 3);
	c.setColor (new Color (128, 0, 128)); //ribbon - dark
	c.fillRect (205, 240, 20, 20);
	c.setColor (new Color (186, 85, 211)); //ribbon - medium
	int[] rx = {225, 255, 270, 260, 240, 225};  //right bowtie
	int[] ry = {240, 220, 240, 280, 290, 260};
	c.fillPolygon (rx, ry, 6);
	int[] lx = {205, 190, 175, 180, 205};
	int[] ly = {240, 220, 225, 280, 260};
	c.fillPolygon (lx, ly, 5);

	//animation
	for (int i = 100 ; i > 0 ; i--)
	{
	    c.setColor (new Color (167, 107, 207));
	    c.fillStar (340 + i * 3, 170 - i, 35, 35);
	    try
	    {
		Thread.sleep (60);
	    }
	    catch (Exception e)
	    {
	    }
	    c.setColor (new Color (255, 228, 225));
	    c.fillStar (340 + i * 3, 170 - i, 35, 35);
	}
	for (int i = 160 ; i > 0 ; i--)
	{
	    c.setColor (new Color (167, 107, 207));
	    c.fillStar (340, 330 - i, 35, 35);
	    c.setColor (new Color (216, 191, 216));
	    c.fillRect (340, 240, 40, 25);
	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }
	    c.setColor (new Color (255, 228, 225));
	    c.fillRect (340, 170, 40, 40);
	    c.setColor (Color.white);
	    c.fillRect (340, 210, 40, 30);
	    c.fillRect (340, 265, 40, 100);
	}
	c.setColor (new Color (167, 107, 207));
	c.fillStar (340, 330, 35, 35);
	try
	{
	    Thread.sleep (2000);
	}
	catch (Exception e)
	{
	}
    }


    //draws the main menu and takes input from user
    public void mainMenu ()
    {
	//background
	c.setColor (new Color (255, 228, 225));
	c.fillRect (0, 0, 640, 500);
	//white pages
	c.setColor (Color.white);
	c.fillRect (50, 40, 245, 420);
	c.fillRect (345, 40, 245, 420);
	//title
	c.setColor (new Color (242, 0, 101));
	c.setFont (new Font ("Brush Script MT", Font.BOLD, 50));
	c.drawString ("Main Menu", 60, 80);
	//text
	c.setColor (new Color (157, 32, 176));
	c.setFont (new Font ("Calibri", Font.PLAIN, 20));
	c.drawString ("Press:", 60, 120);
	c.drawString ("1 for instructions", 120, 165);
	c.drawString ("2 to play game", 120, 235);
	c.drawString ("3 for leaderboard", 120, 305);
	c.drawString ("4 to say goodbye", 120, 375);
	//star bullet points
	c.setColor (new Color (253, 253, 150));
	c.fillStar (60, 130, 50, 50);
	c.fillStar (60, 200, 50, 50);
	c.fillStar (60, 270, 50, 50);
	c.fillStar (60, 340, 50, 50);
	//shooting stars
	c.setColor (new Color (140, 242, 255));
	//star 1
	c.fillStar (370, 125, 50, 50);
	c.drawLine (403, 132, 455, 110);
	c.drawLine (410, 140, 460, 120);
	c.drawLine (410, 157, 460, 133);
	//star 2
	c.fillStar (470, 70, 50, 50);
	c.drawLine (503, 77, 555, 55);
	c.drawLine (510, 85, 560, 65);
	c.drawLine (510, 102, 560, 78);
	//star 3
	c.fillStar (420, 250, 50, 50);
	c.drawLine (453, 257, 505, 235);
	c.drawLine (460, 265, 510, 245);
	c.drawLine (460, 282, 510, 258);
	//star 4
	c.fillStar (460, 360, 50, 50);
	c.drawLine (493, 367, 545, 345);
	c.drawLine (500, 375, 550, 355);
	c.drawLine (500, 392, 550, 368);

	//input
	boolean valid = false;
	while (!valid)
	{
	    try
	    {
		choice = c.getChar ();
		if (choice != '1' && choice != '2' && choice != '3' && choice != '4')
		{
		    throw new IllegalArgumentException ("invalid choice");
		}
		valid = true;
	    }
	    catch (IllegalArgumentException e)
	    {
		JOptionPane.showMessageDialog (f, "Please enter either 1, 2, 3, or 4.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	    }
	}
    }


    //draws instruction screen.
    public void instructions ()
    {
	//background
	c.setColor (new Color (255, 228, 225));
	c.fillRect (0, 0, 640, 500);
	//white pages
	c.setColor (Color.white);
	c.fillRect (50, 40, 245, 420);
	c.fillRect (345, 40, 245, 420);
	//title
	c.setColor (new Color (242, 0, 101));
	c.setFont (new Font ("Brush Script MT", Font.BOLD, 50));
	c.drawString ("Instructions", 60, 100);
	//text
	c.setColor (new Color (157, 32, 176));
	c.setFont (new Font ("Calibri", Font.PLAIN, 19));
	c.drawString ("Stars will fall from the sky.", 60, 140);
	c.drawString ("To catch the stars, press", 60, 165);
	c.drawString ("the letter indicator on each", 60, 190);
	c.drawString ("star. The faster you press,", 60, 215);
	c.drawString ("the higher your score! There", 60, 240);
	c.drawString ("are 3 levels: easy, medium,", 60, 265);
	c.drawString ("and hard.", 60, 290);
	c.drawString ("Have fun! :)", 60, 315);
	c.drawString ("P.S. It is a myth that if", 60, 365);
	c.drawString ("you play this game at", 60, 390);
	c.drawString ("11:11, your wish shall be", 60, 415);
	c.drawString ("granted. Best of luck!", 60, 440);
	//graphics
	c.setColor (new Color (185, 242, 255));
	c.fillOval (355, 80, 140, 140);
	c.setColor (new Color (224, 255, 255));
	c.fillOval (435, 125, 45, 35);
	c.fillOval (420, 170, 30, 25);
	c.fillOval (460, 170, 20, 20);
	c.setColor (new Color (253, 253, 150));
	c.fillStar (380, 330, 70, 70);
	c.fillStar (520, 160, 60, 60);

	pauseProgram ();
    }


    //allows user to enter name and select level. Then, runs the game after taking input.
    /*
    Variables
    Name        Type            Purpose
    game        FallingStars    class instance that runs the main game
    k           KeyInput        class instance that takes input from the user for main game
    restart     boolean         checks if user wants to restart.
    */
    public void playGame ()
    {
	//background
	c.setColor (new Color (255, 228, 225));
	c.fillRect (0, 0, 640, 500);
	//white pages
	c.setColor (Color.white);
	c.fillRect (50, 40, 245, 420);
	c.fillRect (345, 40, 245, 420);
	//title
	c.setColor (new Color (242, 0, 101));
	c.setFont (new Font ("Brush Script MT", Font.BOLD, 50));
	c.drawString ("Play Game", 60, 80);
	//text
	c.setColor (new Color (157, 32, 176));
	c.setFont (new Font ("Calibri", Font.PLAIN, 20));
	c.drawString ("Choose a difficulty:", 60, 120);
	c.drawString ("Press:", 60, 140);
	c.drawString ("1 for easy mode", 120, 185);
	c.drawString ("2 to medium mode", 120, 255);
	c.drawString ("3 for hard mode", 120, 325);
	//c.drawString ("4 to say goodbye", 120, 375);
	//star bullet points
	c.setColor (new Color (253, 253, 150));
	c.fillStar (60, 150, 50, 50);
	c.fillStar (60, 220, 50, 50);
	c.fillStar (60, 290, 50, 50);
	//books
	c.setColor (new Color (3, 37, 158)); //blue
	c.fillRect (360, 430, 110, 30);
	c.setColor (new Color (94, 7, 50)); //dark red
	c.fillRect (390, 390, 80, 40);
	c.setColor (new Color (212, 143, 33)); //yellow
	c.fillRect (365, 370, 120, 20);
	c.setColor (Color.black); //black
	c.fillRect (380, 345, 60, 25);
	c.setColor (Color.white); //pages in books
	c.fillRect (405, 405, 65, 10);
	c.fillRect (390, 353, 50, 9);
	//text and page lines
	c.setFont (new Font ("Bradley Hand ITC", Font.PLAIN, 12));
	c.drawString ("A Book of Stars", 375, 448);
	c.setColor (Color.black);
	c.drawString ("You Are My Star", 380, 383);
	c.drawLine (455, 405, 455, 415);
	c.drawLine (430, 353, 430, 362);
	//potted plant
	c.setColor (new Color (5, 77, 4)); //dark green leaf
	c.fillArc (535, 310, 60, 60, 50, 180);
	c.setColor (new Color (10, 171, 7)); //light green leaf
	c.fillArc (475, 320, 60, 60, 340, 180);
	c.setColor (new Color (19, 122, 17)); //green leaf
	c.fillArc (525, 280, 30, 80, 90, 180);
	c.setColor (new Color (209, 157, 119)); //pot
	c.fillRect (490, 370, 85, 90);
	c.setColor (new Color (89, 60, 39)); //pot rim
	c.fillRect (480, 350, 105, 20);

	//input for username and difficulty.
	boolean valid = false;
	while (!valid)
	{
	    try
	    {
		username = JOptionPane.showInputDialog (f, "Enter your name:", "Username?", JOptionPane.QUESTION_MESSAGE);
		if (username.indexOf (" ") > -1 || username.length () > 10 || username.length () == 0)
		{
		    throw new IllegalArgumentException ("no spaces or too long or empty");
		}
		valid = true;
	    }
	    catch (IllegalArgumentException e)
	    {
		JOptionPane.showMessageDialog (f, "Your name cannot have any spaces, and have more than 10 characters. It also cannot be empty.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	    }
	}
	valid = false;
	while (!valid)
	{
	    try
	    {
		level = Integer.parseInt (c.getChar () + "");
		if (level != 1 && level != 2 && level != 3)
		{
		    throw new IllegalArgumentException ("invalid level");
		}
		valid = true;
	    }
	    catch (Exception e)
	    {
		JOptionPane.showMessageDialog (f, "Please enter either 1, 2, or 3.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
	    }
	}

	//game start
	score = 0; //resets score every new playthrough
	//background + game screen
	background ();
	foreground ();

	FallingStars game = new FallingStars (c, level); //main game
	KeyInput k = new KeyInput (c); //for input
	boolean restart = false;
	game.start ();
	while (game.ctr < level * 20 && !restart)
	{
	    k.keyClick (); //input
	    for (int i = 0 ; i < game.amount ; i++)
	    {
		//checking for input and updating score.
		if (game.letter [i] == k.input)
		{
		    game.letter [i] = '0';
		    game.ctr++;
		    if (game.height [i] < 120)
			score += 3;
		    else if (game.height [i] < 200)
			score += 2;
		    else
			score++;
		    //puts new score on score box
		    c.setColor (new Color (255, 238, 82));
		    c.fillRect (5, 5, 100, 20);
		    c.setColor (Color.black);
		    c.setFont (new Font ("Calibri", Font.PLAIN, 20));
		    c.drawString ("Score: " + score, 8, 21);
		}
		else if (k.input == ' ')
		{
		    restart = true;
		    break;
		}
		else if (game.height [i] + 45 >= 280)
		{
		    game.letter [i] = '0';
		    game.ctr++;
		}
		if (game.ctr >= level * 20)
		{
		    break;
		}
	    }

	}
	game.stop ();
	if (restart == true)
	    score = -1;
    }


    //draws the background of the game screen
    private void background ()
    {
	//wall
	c.setColor (new Color (252, 234, 162));
	c.fillRect (0, 0, 640, 500);
	//sky based on level
	if (level == 1)
	{
	    c.setColor (new Color (173, 235, 247));
	}
	else if (level == 2)
	{
	    c.setColor (new Color (239, 208, 242));
	}
	else
	{
	    c.setColor (new Color (7, 22, 99));
	}
	c.fillRect (80, 40, 480, 240);
	c.setColor (new Color (209, 157, 119)); //window frame
	c.fillRect (60, 30, 520, 10);
	c.fillRect (60, 280, 520, 10);
	c.fillRect (70, 40, 10, 240);
	c.fillRect (560, 40, 10, 240);
    }


    //draws foreground of the game screen.
    private void foreground ()
    {
	//curtains
	c.setColor (new Color (153, 73, 132));
	int lcx[] = {0, 90, 90, 50, 0};  //left curtains
	int lcy[] = {0, 0, 80, 200, 200};
	c.fillPolygon (lcx, lcy, 5);
	int lbcx[] = {0, 50, 90, 90, 0};  //left bottom curtains
	int lbcy[] = {220, 220, 300, 500, 500};
	c.fillPolygon (lbcx, lbcy, 5);
	int rcx[] = {640, 550, 550, 590, 640}; //right curtains
	int rcy[] = {0, 0, 80, 200, 200};
	c.fillPolygon (rcx, rcy, 5);
	int rbcx[] = {640, 590, 550, 550, 640};  //right bottom curtains
	int rbcy[] = {220, 220, 300, 500, 500};
	c.fillPolygon (rbcx, rbcy, 5);
	c.setColor (new Color (212, 143, 23));
	c.fillRect (0, 200, 50, 20); //left
	c.fillRect (590, 200, 50, 20); //right

	//lamp
	c.setColor (Color.darkGray);
	c.fillRect (0, 480, 80, 20);
	c.fillRect (130, 290, 20, 25);
	c.setColor (Color.gray);
	c.fillRect (20, 370, 10, 110);
	int lx[] = {20, 120, 30};
	int ly[] = {370, 300, 370};
	c.fillPolygon (lx, ly, 3);
	int lrx[] = {80, 210, 215, 85};
	int lry[] = {375, 335, 355, 395};
	c.fillPolygon (lrx, lry, 4);
	c.setColor (Color.lightGray);
	c.fillRect (30, 370, 20, 110); //bottom
	int lrx1[] = {120, 30, 50, 140};  //top
	int lry1[] = {300, 370, 370, 300};
	c.fillPolygon (lrx1, lry1, 4);
	int lbx[] = {130, 150, 210, 80};  //lamp shield part
	int lby[] = {315, 315, 335, 375};
	c.fillPolygon (lbx, lby, 4);

	//books
	c.setColor (new Color (3, 37, 158)); //blue
	c.fillRect (120, 470, 110, 30);
	c.setColor (new Color (94, 7, 50)); //dark red
	c.fillRect (150, 430, 80, 40);
	c.setColor (new Color (212, 143, 33)); //yellow
	c.fillRect (125, 410, 120, 20);
	c.setColor (Color.black); //black
	c.fillRect (140, 385, 60, 25);
	c.setColor (Color.white); //pages in books
	c.fillRect (165, 445, 65, 10);
	c.fillRect (150, 393, 50, 9);
	c.setColor (new Color (252, 234, 162)); //cuts off pages
	c.fillRect (215, 445, 15, 10);
	c.fillRect (190, 393, 10, 9);
	//text and page lines
	c.setFont (new Font ("Bradley Hand ITC", Font.PLAIN, 12));
	c.drawString ("A Book of Stars", 135, 488);
	c.setColor (Color.black);
	c.drawString ("You Are My Star", 140, 423);
	c.drawLine (215, 445, 215, 455);
	c.drawLine (190, 393, 190, 402);

	//potted plant
	c.setColor (new Color (5, 77, 4)); //dark green leaf
	c.fillArc (565, 350, 60, 60, 50, 180);
	c.setColor (new Color (10, 171, 7)); //light green leaf
	c.fillArc (505, 360, 60, 60, 340, 180);
	c.setColor (new Color (19, 122, 17)); //green leaf
	c.fillArc (555, 320, 30, 80, 90, 180);
	c.setColor (new Color (209, 157, 119)); //pot
	c.fillRect (520, 410, 85, 90);
	c.setColor (new Color (89, 60, 39)); //pot rim
	c.fillRect (510, 390, 105, 20);

	//jar
	c.setColor (Color.white);
	c.fillRect (250, 280, 220, 40);
	c.fillOval (240, 280, 260, 240);
	c.fillRect (270, 480, 180, 40);

	//stars
	c.setColor (new Color (253, 94, 83)); //red
	c.fillStar (240, 400, 40, 40);
	c.fillStar (415, 450, 35, 35);
	c.fillStar (380, 410, 40, 40);
	c.fillStar (440, 430, 30, 30);
	c.fillStar (280, 450, 45, 45);
	c.setColor (new Color (25, 25, 112)); //blue
	c.fillStar (260, 420, 40, 40);
	c.fillStar (350, 400, 35, 35);
	c.fillStar (410, 430, 40, 40);
	c.fillStar (450, 415, 30, 30);
	c.fillStar (338, 446, 45, 45);
	c.setColor (new Color (255, 153, 153)); //pink
	c.fillStar (310, 425, 40, 40);
	c.fillStar (275, 395, 30, 30);
	c.fillStar (390, 458, 35, 35);
	c.fillStar (265, 440, 30, 30);
	c.fillStar (370, 440, 25, 25);
	c.setColor (new Color (167, 107, 207)); //purple
	c.fillStar (310, 410, 30, 30);
	c.fillStar (385, 420, 45, 45);
	c.fillStar (425, 405, 40, 40);
	c.fillStar (325, 450, 30, 30);
	c.fillStar (345, 430, 35, 35);
	c.setColor (new Color (135, 206, 235)); //light blue
	c.fillStar (310, 450, 40, 40);
	c.fillStar (375, 410, 35, 35);
	c.fillStar (290, 420, 40, 40);
	c.fillStar (340, 415, 35, 35);
	c.fillStar (360, 450, 45, 45);

	//curves + lightings
	c.setColor (Color.black);
	c.drawLine (290, 490, 430, 490);
	c.drawArc (355, 300, 135, 180, 280, 80);

	c.setColor (new Color (216, 191, 216)); //ribbon - very light
	c.fillRect (240, 290, 240, 25);
	c.setColor (new Color (221, 160, 221)); //ribbon - dark light
	int[] rbx11 = {275, 295, 280, 255};
	int[] rby11 = {300, 310, 390, 360};
	c.fillPolygon (rbx11, rby11, 4);
	int[] lbx11 = {255, 275, 240, 215};
	int[] lby11 = {285, 300, 360, 390};
	c.fillPolygon (lbx11, lby11, 4);
	c.setColor (new Color (216, 191, 216)); //ribbon - medium light
	int[] rbx21 = {280, 255, 260, 280, 300};
	int[] rby21 = {390, 360, 410, 450, 480};
	c.fillPolygon (rbx21, rby21, 5);
	int[] lbx21 = {240, 215, 220, 240};
	int[] lby21 = {360, 390, 450, 410};
	c.fillPolygon (lbx21, lby21, 4);
	c.setColor (new Color (230, 232, 250)); //ribbon - light light
	int[] rbx31 = {280, 300, 290, 270};
	int[] rby31 = {450, 480, 550, 495};
	c.fillPolygon (rbx31, rby31, 4);
	int[] lbx31 = {217, 192, 222};
	int[] lby31 = {410, 440, 450};
	c.fillPolygon (lbx31, lby31, 3);
	c.setColor (new Color (128, 0, 128)); //ribbon - dark
	c.fillRect (265, 290, 20, 20);
	c.setColor (new Color (186, 85, 211)); //ribbon - medium
	int[] rx1 = {285, 315, 330, 320, 300, 285};  //right bowtie
	int[] ry1 = {290, 280, 290, 330, 340, 310};
	c.fillPolygon (rx1, ry1, 6);
	int[] lx1 = {265, 250, 235, 240, 265};
	int[] ly1 = {290, 280, 285, 330, 310};
	c.fillPolygon (lx1, ly1, 5);

	//score box and restart box
	c.setColor (Color.black);
	c.fillRect (3, 3, 104, 24);
	c.fillRect (458, 468, 174, 24);
	c.setColor (new Color (255, 238, 82));
	c.fillRect (5, 5, 100, 20);
	c.fillRect (460, 470, 170, 20);
	c.setColor (Color.black);
	c.setFont (new Font ("Calibri", Font.PLAIN, 20));
	c.drawString ("Score: " + score, 8, 23);
	c.drawString ("Press SPACE to exit", 463, 488);
    }


    //shows user final score, medal, and placing
    public void scoreUpdate () throws IOException
    {
	if (score == -1)
	    return;
	//background
	c.setColor (new Color (255, 228, 225));
	c.fillRect (0, 0, 640, 500);
	//design left up corner
	c.setColor (Color.red);
	int[] ltx = {0, 80, 0};
	int[] lty = {0, 0, 100};
	c.fillPolygon (ltx, lty, 3);
	c.setColor (Color.white);
	int[] lrx1 = {80, 100, 0, 0};
	int[] lry1 = {0, 0, 120, 100};
	c.fillPolygon (lrx1, lry1, 4);
	c.setColor (new Color (230, 168, 215)); //light purple
	int[] lrx2 = {100, 120, 0, 0};
	int[] lry2 = {0, 0, 140, 120};
	c.fillPolygon (lrx2, lry2, 4);
	c.setColor (new Color (255, 228, 225)); //light pink
	int[] lrx3 = {140, 260, 0, 0};
	int[] lry3 = {0, 0, 260, 140};
	c.fillPolygon (lrx3, lry3, 4);
	c.setColor (new Color (230, 168, 215)); //light purple
	int[] lrx4 = {260, 280, 0, 0};
	int[] lry4 = {0, 0, 280, 260};
	c.fillPolygon (lrx4, lry4, 4);
	c.setColor (Color.white);
	int[] lrx5 = {280, 300, 0, 0};
	int[] lry5 = {0, 0, 300, 280};
	c.fillPolygon (lrx5, lry5, 4);
	//text
	c.setColor (Color.red);
	c.fillRect (20, 100, 240, 80); //score
	c.fillRect (280, 60, 320, 10); //border top
	c.fillRect (120, 260, 480, 10); //border bottom
	int tx1[] = {440, 600, 600};  //border triangle
	int ty1[] = {60, 60, 120};
	c.fillPolygon (tx1, ty1, 3);
	c.setFont (new Font ("MonoSpaced", Font.BOLD, 60)); //points
	c.drawString (score + " POINTS", 80, 400);

	int place = userPlace (); //user's place
	if (place % 10 == 1)
	{
	    c.drawString (place + "st PLACE", 80, 450);
	}
	else if (place % 10 == 2)
	{
	    c.drawString (place + "nd PLACE", 80, 450);
	}
	else if (place % 10 == 3)
	{
	    c.drawString (place + "rd PLACE", 80, 450);
	}
	else
	{
	    c.drawString (place + "th PLACE", 80, 450);
	}

	c.setColor (Color.white);
	c.fillRect (280, 30, 345, 10); //white border top
	c.fillRect (615, 30, 10, 270); //white border side
	c.fillRect (100, 290, 520, 10); //white border bottom
	c.drawString ("SCORE", 50, 158);
	c.setFont (new Font ("MonoSpaced", Font.BOLD, 90));
	c.drawString ("UPDATE", 270, 180);

	//medals
	c.setColor (Color.red);
	int[] rrx1 = {540, 560, 625, 580};
	int[] rry1 = {400, 450, 470, 380};
	int[] lrxf1 = {490, 535, 520, 470};
	int[] lryf1 = {380, 400, 450, 480};
	c.fillPolygon (rrx1, rry1, 4);
	c.fillPolygon (lrxf1, lryf1, 4);
	//gold medal
	if ((level == 1 && score >= 50) || (level == 2 && score >= 110) || (level == 3 && score >= 170))
	{
	    c.setColor (new Color (184, 134, 11)); //bigger circle
	    c.fillOval (465, 290, 140, 140);
	    c.setColor (new Color (244, 196, 48)); //smaller circle
	    c.fillOval (475, 300, 120, 120);
	    c.setColor (new Color (184, 134, 11));
	    c.setFont (new Font ("Engravers MT", Font.BOLD, 29));
	    c.drawString ("GOLD", 476, 370);
	}
	//silver medal
	else if ((level == 1 && score >= 35) || (level == 2 && score >= 75) || (level == 3 && score >= 115))
	{
	    c.setColor (Color.darkGray); //bigger circle
	    c.fillOval (465, 290, 140, 140);
	    c.setColor (Color.lightGray); //smaller circle
	    c.fillOval (475, 300, 120, 120);
	    c.setColor (Color.darkGray);
	    c.setFont (new Font ("Engravers MT", Font.PLAIN, 24));
	    c.drawString ("SILVER", 477, 370);
	}
	//bronze medal
	else if ((level == 1 && score >= 20) || (level == 2 && score >= 40) || (level == 3 && score >= 60))
	{
	    c.setColor (new Color (244, 196, 48)); //bigger circle
	    c.fillOval (465, 310, 120, 120);
	    c.setColor (Color.yellow); //smaller circle
	    c.fillOval (475, 320, 100, 100);
	    c.setColor (new Color (244, 196, 48));
	    c.setFont (new Font ("Engravers MT", Font.PLAIN, 21));
	    c.drawString ("BRONZE", 477, 370);
	}

	pauseProgram ();
    }


    //updates top scores and returns placing of user. called in scoreUpdate
    /*
    Variables
    Name        Type        Purpose
    cnt         int         number of scores in file
    scores      int[]       storea player scores in file
    names       String[]    stores player names in file
    printed     boolean     checks is new score has been printed in file
    place       int         stores final placing of user.
    */
    private int userPlace () throws IOException
    {
	BufferedReader br = new BufferedReader (new FileReader ("scores.txt"));
	int cnt = Integer.parseInt (br.readLine ()), scores[] = new int [cnt];
	String names[] = new String [cnt];
	for (int i = 0 ; i < cnt ; i++)
	{
	    String line[] = br.readLine ().split (" ");
	    names [i] = line [0];
	    scores [i] = Integer.parseInt (line [1]);
	}
	PrintWriter pw = new PrintWriter (new FileWriter ("scores.txt"));
	pw.println (1 + cnt);
	boolean printed = false;
	int place = cnt + 1;
	for (int i = 0 ; i < cnt ; i++)
	{
	    if (score > scores [i] && !printed)
	    {
		place = i + 1;
		pw.println (username + " " + score);
		printed = true;
	    }
	    pw.println (names [i] + " " + scores [i]);
	}
	if (!printed)
	    pw.println (username + " " + score);
	pw.close ();
	return place;
    }


    //shows top 10 scores on leaderboard.
    public void leaderboard () throws IOException
    {
	//background
	c.setColor (new Color (255, 228, 225));
	c.fillRect (0, 0, 640, 500);
	//white pages
	c.setColor (Color.white);
	c.fillRect (50, 40, 245, 420);
	c.setColor (new Color (250, 218, 94));
	c.fillRect (345, 40, 245, 420);
	//title
	c.setColor (new Color (242, 0, 101));
	c.setFont (new Font ("Brush Script MT", Font.BOLD, 40));
	c.drawString ("Leaderboard", 60, 80);
	//text
	c.setColor (new Color (157, 32, 176));
	c.setFont (new Font ("Calibri", Font.PLAIN, 20));
	c.drawString ("Name         Score       Place", 60, 120);
	//graphics
	c.setColor (new Color (171, 205, 239));
	c.fillRect (365, 130, 65, 240);
	c.fillRect (485, 70, 70, 300);
	c.setColor (new Color (65, 105, 225));
	c.fillRect (555, 100, 35, 360);
	c.setColor (new Color (25, 25, 112));
	c.fillRect (345, 250, 45, 210);
	c.fillRect (450, 200, 65, 260);
	c.fillRect (480, 330, 100, 130);
	c.setColor (new Color (65, 105, 225));
	c.fillRect (375, 340, 160, 120);
	c.setColor (new Color (255, 255, 102)); //windows
	//left dark blue
	for (int i = 0 ; i < 4 ; i++)
	{
	    c.fillRect (352, 255 + i * 15, 10, 10);
	    c.fillRect (372, 255 + i * 15, 10, 10);
	}
	c.fillRect (380, 145, 15, 25); //left light blue
	c.fillRect (390, 355, 100, 15); //bottom blue
	c.fillRect (390, 380, 100, 15);
	//right dark blue
	for (int i = 0 ; i < 4 ; i++)
	{
	    c.fillRect (460, 210 + i * 15, 10, 10);
	    c.fillRect (480, 210 + i * 15, 10, 10);
	}
	c.fillRect (495, 85, 30, 15); //right light blue
	c.fillRect (495, 107, 30, 15);
	for (int i = 0 ; i < 2 ; i++)
	{
	    c.fillRect (560, 115 + i * 15, 10, 10); //right blue
	    c.fillRect (575, 115 + i * 15, 10, 10);
	}
	//prints names and scores on leaderboard
	BufferedReader br = new BufferedReader (new FileReader ("scores.txt"));
	int cnt = Integer.parseInt (br.readLine ());
	c.setColor (new Color (157, 32, 176));
	for (int i = 0 ; i < Math.min (cnt, 10) ; i++)
	{
	    String line[] = br.readLine ().split (" ");
	    c.drawString (line [0], 60, 160 + i * 30);
	    c.drawString (line [1], 175, 160 + i * 30);
	    c.drawString ((i + 1) + "", 240, 160 + i * 30);
	}
	pauseProgram ();
    }


    //shows goodbye screen.
    public void goodbye ()
    {
	//background
	c.setColor (new Color (255, 228, 225));
	c.fillRect (0, 0, 640, 500);
	c.setColor (Color.white);
	c.fillRect (0, 60, 640, 380);
	//script
	c.setColor (new Color (253, 253, 150));
	c.fillRect (100, 155, 440, 140);
	c.setColor (new Color (250, 218, 94));
	c.fillRect (40, 185, 60, 140); //left
	c.fillRect (50, 165, 30, 30);
	c.fillRect (60, 145, 20, 20);
	c.fillRect (540, 185, 60, 140); //right
	c.fillRect (550, 165, 30, 30);
	c.fillRect (570, 165, 20, 20);
	c.fillRect (560, 145, 20, 20);
	c.setColor (new Color (245, 222, 179));
	c.fillRect (80, 145, 20, 50); //left
	int[] lutx = {60, 60, 50};
	int[] luty = {155, 165, 165};
	c.fillPolygon (lutx, luty, 3);
	int[] ldtx = {50, 50, 40};
	int[] ldty = {165, 185, 185};
	c.fillPolygon (ldtx, ldty, 3);
	c.fillRect (540, 145, 20, 50); //right
	int[] rutx = {580, 580, 590};
	int[] ruty = {155, 165, 165};
	c.fillPolygon (rutx, ruty, 3);
	int[] rdtx = {590, 590, 600};
	int[] rdty = {165, 185, 185};
	c.fillPolygon (rdtx, rdty, 3);
	//feather quill
	c.setColor (new Color (255, 255, 224));
	int[] lfx = {570, 580, 615};  //left
	int[] lfy = {270, 245, 237};
	c.fillPolygon (lfx, lfy, 3);
	int[] lsx = {565, 572, 550, 535};
	int[] lsy = {275, 240, 250, 310};
	c.fillPolygon (lsx, lsy, 4);
	int[] ltx = {545, 540, 520, 525};
	int[] lty = {297, 260, 280, 322};
	c.fillPolygon (ltx, lty, 4);
	int[] rfx = {570, 600, 615};  //right
	int[] rfy = {270, 265, 237};
	c.fillPolygon (rfx, rfy, 3);
	int[] rsx = {535, 565, 595, 580};
	int[] rsy = {300, 275, 275, 295};
	c.fillPolygon (rsx, rsy, 4);
	int[] rtx = {525, 545, 575, 560};
	int[] rty = {322, 297, 305, 325};
	c.fillPolygon (rtx, rty, 4);
	c.setColor (Color.black); //arc
	c.drawArc (510, 235, 300, 320, 110, 50);
	//title
	c.setColor (Color.black);
	c.setFont (new Font ("Brush Script MT", Font.BOLD, 50));
	c.drawString ("Thank you for playing", 110, 210);
	c.drawString ("See you at 11:11 again", 110, 260);

	//2 seconds of pause
	try
	{
	    Thread.sleep (2000);
	}


	catch (Exception e)
	{
	}


	c.close (); //close the program
    }


    //pauses program.
    private void pauseProgram ()
    {
	//message to user to go back to main menu.
	c.setColor (new Color (157, 32, 176));
	c.setFont (new Font ("Calibri", Font.PLAIN, 12));
	c.drawString ("Press any key to go back to menu.", 450, 495);
	c.getChar ();
    }
}


