import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
/*
 * set of methods to simplify JFrame handling, customizing and so on.
 * early development
 * it was my personal choice to use brackets in that way, please don't send hate.
 */
public class flib
extends Canvas{

    
    /*
     * Variables that the library will use     */
    static JFrame e;
    static int i1;
    static int i2;
    static int i3;
    static int i4;
    static boolean raised;
    public static Color c;
    static int r;
    static int g;
    static int b;
    static int r1;
    static int r2;
    static int r3;
    static int r4;
    public void setName(String f)
    {
    e.setTitle(f);
    }
    
    @SuppressWarnings("unlikely-arg-type")
    public static void isVis(boolean isvi)
    {
        e.setVisible(isvi);
    
            System.err.println("Suggestion: If you typed a close operation\n other than 3 your frame will not close.\n End the process as soon as you are done.");    }
    
    public static void setSiz(int si1, int si2)
    {
        e.setSize(si1, si2);
    }
    
    public static void closeOp(int closeop)
    {    
        e.setDefaultCloseOperation(closeop);
    }
    
    @SuppressWarnings("deprecation")
    public static void setCur(int cursortype) {
        System.err.println("setCur is deprecated. We suggest using\n Component.getCursor() for better performance.");
        e.setCursor(cursortype);
    }
    public void draw3DRec(int i1, int i2, int i3, int i4, boolean raised) {
        flib.i1 = i1;
        flib.i2 = i2;
        flib.i3 = i3;
        flib.i4 = i4;
        flib.raised = raised;
    }
    public void setBackg(int r, int g, int b) {
        flib.r = r;
        flib.g = g;
        flib.b = b;
        e.getContentPane().setBackground(new Color(r,g,b));
    }
    public void sBounds(int r1, int r2, int r3, int r4) {
        flib.r1 = r1;
        flib.r2 = r2;
        flib.r3 = r3;
        flib.r4 = r4;
        e.setBounds(r1,r2,r3,r4);
    }
    
    public void paint(Graphics g) {
        g.draw3DRect(i1,i2,i3,i4,raised);
    }
    public static void main(String[]args)
    {
    e = new JFrame();    
    e.setLocationRelativeTo(null);
        flib i = new flib();
        e.add(i);
        
        }
}
