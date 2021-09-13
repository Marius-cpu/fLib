package flib;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import flib.constants.constants;
/*
 * set of methods to simplify JFrame handling, customizing and so on.
 * early development
 * it was my personal choice to use brackets in that way, please don't send hate.
  @author Marius Sebastian
 */
@SuppressWarnings("unused")
public class flib
extends Canvas{
	private static final long serialVersionUID = 1L;

	public static void frameTitle(String f)
    {
    constants.e.setTitle(f);
    }
    
    public static void isVis(boolean isvi)
    {
        constants.e.setVisible(isvi);
    
            System.err.println("Suggestion: If you typed a close operation\n other than 3 your frame will not close.\n End the process as soon as you are done.");    
    }
    
    public static void setSiz(int si1, int si2)
    {
        constants.e.setSize(si1, si2);
    }
    
    public static void closeOp(int closeop)
    {    
        constants.e.setDefaultCloseOperation(closeop);
    }
    
    @SuppressWarnings("deprecation")
    public static void setCur(int cursortype) {
        System.err.println("setCur is deprecated. We suggest using\n Component.getCursor() for better performance.");
        constants.e.setCursor(cursortype);
    }
    
    public static void draw3DRec(int i1, int i2, int i3, int i4, boolean raised) {
        constants.i1 = i1;
        constants.i2 = i2;
        constants.i3 = i3;
        constants.i4 = i4;
        constants.raised = raised;
    }
    
    public static void setBackg(int r, int g, int b, boolean debugging) {
    	//Method to quickly change frame color in only one line//
    	// 							R G B                     //
    	  constants.r = r;
    	  constants.g = g;
    	  constants.b = b;
    	  if(debugging == true) {
    		  System.out.println("Since you enabled seeing rgb values,");
	      System.out.println("Your RGB constants are: ");
	      System.out.println(constants.r);
	      System.out.println(constants.g);
	      System.out.println(constants.b);
    	}
	      constants.e.getContentPane().setBackground(new Color(constants.r, constants.g, constants.b));
	     }
 
//    public void sBounds(int r1, int r2, int r3, int r4) {
//        constants.r1 = r1;
//        constants.r2 = r2;
//        constants.r3 = r3;
//        constants.r4 = r4;
//        constants.e.setBounds(r1,r2,r3,r4);
//    }
//    
    
    // Method that draws an oval when it's called
    public static void drawOval(int ov1, int ov2, int ov3, int ov4)
    {
    	constants.ov1 = ov1;
    	constants.ov2 = ov2;
    	constants.ov3 = ov3;
    	constants.ov4 = ov4;
    }
    // Method that draws a round rectangle when it's calles
    public static void drawRoundRect(int rec1, int rec2, int rec3, int rec4, int rec5, int rec6)
    {
    	constants.rec1 = rec1;
    	constants.rec2 = rec2;
    	constants.rec3 = rec3;
    	constants.rec4 = rec4;
    	constants.rec5 = rec5;
    	constants.rec6 = rec6;
    }
    // Method that draws an arc
    public static void drawArc(int ar1, int ar2, int ar3, int ar4, int ar5, int ar6)
    {
    	constants.ar1 = ar1;
    	constants.ar2 = ar2;
    	constants.ar3 = ar3;
    	constants.ar4 = ar4;
    	constants.ar5 = ar5;
    	constants.ar6 = ar6;
    }
    public static void drawLine(int x1, int x2, int y1, int y2)
    {
    	constants.x1 = x1;
    	constants.x2 = x2;
    	constants.y1 = y1;
    	constants.y2 = y2;
    }
    // Method to paint the above with the constants, if any of those are null, the method goes on and continues
    public void paint(Graphics g) {
        g.draw3DRect(constants.i1,constants.i2,constants.i3,constants.i4,constants.raised);
        g.drawOval(constants.ov1, constants.ov2, constants.ov3, constants.ov4);
       g.drawArc(constants.ar1, constants.ar2, constants.ar3, constants.ar4, constants.ar5, constants.ar6);
        g.drawLine(constants.x1, constants.x2, constants.y1, constants.y2);
       g.drawRoundRect(constants.rec1,constants.rec2,constants.rec3, constants.rec4, constants.rec5, constants.rec6);
    }
    
    public static void main(String[]args)
    {
    constants.e2 = new JPanel();
//   constants.e2.setBackground(new Color(233,222,100));
    constants.e.add(constants.e2);
    constants.e.setLocationRelativeTo(null);
        flib i = new flib();
//         i.setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
        constants.e.add(i);  
     }
}
