
package flib;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

import flib.constants.constants;


@SuppressWarnings({ "unused", "serial" })

public class flib extends Canvas
{		/*
		 * @author Mariusss Sebastian
		 *
		 */
	static constants c = new constants();
	static Image img;
	private  final long serialVersionUID = 1L;
	public static void frameTitle(String f)
    {
    c.e.setTitle(f);
    }
	public static void debugging(boolean debg) throws IOException {
    	c.debg = debg;
		if(c.debg == true) {
			System.err.println("You activated debugging.");
    		debug();
    	}
    }
    public static void isVis(boolean isvi)
    {
    	String e = "";
        c.e.setVisible(isvi);
       if(isvi == false) {
    	   e = "x";
       }
       switch(e) {
       case "x":
    	   System.err.println("Your window is not visible!");
    	   System.out.println("To close the window type 1 below: ");
    	   Scanner re = new Scanner(System.in);
    	   String choice = re.nextLine();
    	   if(choice.equals("1")) {
    		   System.exit(3);
    	   }
       }
    
    }
    public static void setSiz(int si1, int si2)
    {
    	flib er = new flib();
    	flib.init();
    	  if (si1 < 0 || si1> 999999) {
              throw new IllegalArgumentException(
                                  "Width out of range or too low...");
          }
    	  if(si2 < 0 || si2> 999999) {
    		  throw new IllegalArgumentException("Height out of range or too low. . .")
    		  ;
    	  }
        c.e.setSize(si1, si2);
    }
    public static void closeOp(int closeop)
    {    
    	try {
    		  c.e.setDefaultCloseOperation(closeop);
    		   
    	}catch(IllegalArgumentException e) {
    		
    	}finally {
    		
    	}
       }
    
    @SuppressWarnings("deprecation")
    public static void setCur(int cursortype)
    {
    	c.cursortype = cursortype;
    	c.e.setCursor(cursortype);
    	System.err.println("setCur is deprecated, please use Component.setCursor();");
    }
    public static void draw3DRec(int i1, int i2, int i3, int i4, boolean raised)
    {
        c.i1 = i1;
        c.i2 = i2;
        c.i3 = i3;
        c.i4 = i4;
        c.raised = raised;
    }
    
    public static void setBackg(int r, int g, int b)
    {
    	  c.r = r;
    	  c.g = g;
    	  c.b = b;
	      c.e.getContentPane().setBackground(new Color(c.r, c.g, c.b));
	}
    
    
  
    public static void drawOval(int ov1, int ov2, int ov3, int ov4)
    {
    	c.ov1 = ov1;
    	c.ov2 = ov2;
    	c.ov3 = ov3;
    	c.ov4 = ov4;
    }
    public static void drawRoundRect(int rec1, int rec2, int rec3, int rec4, int rec5, int rec6)
    {
    	init();
    	c.rec1 = rec1;
    	c.rec2 = rec2;
    	c.rec3 = rec3;
    	c.rec4 = rec4;
    	c.rec5 = rec5;
    	c.rec6 = rec6;
    	
    }
    public static void drawArc(int ar1, int ar2, int ar3, int ar4, int ar5, int ar6)
    {
    	init();
    	c.ar1 = ar1;
    	c.ar2 = ar2;
    	c.ar3 = ar3;
    	c.ar4 = ar4;
    	c.ar5 = ar5;
    	c.ar6 = ar6;
    	
    }
    public static void drawLine(int x1, int x2, int y1, int y2)
    {
    	init();
    	c.x1 = x1;
    	c.x2 = x2;
    	c.y1 = y1;
    	c.y2 = y2;
    	
    }
  public static void create(int x11, int x22, int y11, int y22)
  {
	  init();
	  c.x11 = x11;
	  c.x22 = x22;
	  c.y11 = y11;
	  c.y22 = y22;
  }
   public static void setFrameIcon(String path)
  {
	  ImageIcon img2 = new ImageIcon(path);
	  c.e.setIconImage(img2.getImage());
  }
  	public static void backgroundImg(String path, int x111, int y111)
  	{
  		c.x111 = x111;
  		c.y111 = y111;
  		if(path ==null) {
  			System.err.println("You did not input a path for a background. \n use flib.backgroundImg(path, 200, 200); \n Your path is: " + path);
  		}else if(path =="") {
  			System.err.println("You did not input a path for a background. \n use flib.backgroundImg(path, 200, 200); \n Your path is: " + path);
  	  		
  		}
	     img = Toolkit.getDefaultToolkit().getImage(path);
	}
  public static void drawStr(String str, int x, int y) {
	  c.str = str;
	  c.x33 = x;
	  c.y33 = y;
  }
  public static void playSound(String clipFile, int looptime) throws LineUnavailableException, IOException, UnsupportedAudioFileException {
	  if(clipFile.contains("mp3")) {
			System.err.println("mp3 filetype is not supported by fLib!");
		}else if(clipFile.contains("oog")) {
			System.err.println("oog filetype is not supported by fLib!");
		}
		c.audioInputStream = AudioSystem.getAudioInputStream(new File(clipFile).getAbsoluteFile());
		c.clip = AudioSystem.getClip();
		c.clip.open(c.audioInputStream);
		c.clip.loop(looptime);	
  }
  public static void play() {
	  c.clip.start();
  }
  public void paint(Graphics g){
        g.draw3DRect(c.i1,c.i2,c.i3,c.i4,c.raised);
        g.drawOval(c.ov1, c.ov2, c.ov3, c.ov4);
        g.drawArc(c.ar1, c.ar2, c.ar3, c.ar4, c.ar5, c.ar6);
        g.drawLine(c.x1, c.x2, c.y1, c.y2);
        g.drawRoundRect(c.rec1,c.rec2,c.rec3, c.rec4, c.rec5, c.rec6);
        g.create(c.x11, c.x22, c.y11, c.y22);
        g.drawImage(img, c.x111, c.y111, null);
        g.drawString(c.str, c.x33, c.y33);
    }
    public static void setResizable(boolean resizable)
    {
    	c.e.setResizable(resizable);
    }
   public static void setbounds(int i1, int i2, int i3, int i4)
   {
	   c.e.setBounds(i1,i2,i3,i4);
   }
    private static  void debug()
    {
    	 System.out.println("Your cursortype is: "+ c.cursortype);
    	 System.err.println("Suggestion: If you typed a close operation\n other than 3 your frame will not close.\n End the process as soon as you are done.");    
    	 System.out.println("Your RGB c are: ");
         System.out.println(c.r);
         System.out.println(c.g);
         System.out.println(c.b);
	    // ****************************************************//
         System.out.println("fLib uses the following libraries:");
         System.out.println("java.awt.Canvas;                                  \r\n"
         		+ "java.awt.Color;                                   \r\n"
         		+ "java.awt.Graphics;                                \r\n"
         		+ "java.awt.Image;                                   \r\n"
         		+ "java.awt.Toolkit;                                 \r\n"
         		+ "java.awt.geom.Ellipse2D;                          \r\n"
         		+ "java.awt.image.BufferedImage;                     \r\n"
         		+ "java.io.File;                                     \r\n"
         		+ "java.io.IOException;                              \r\n"
         		+ "java.util.Scanner;                                \r\n"
         		+ "javax.sound.sampled.AudioInputStream;             \r\n"
         		+ "javax.sound.sampled.AudioSystem;                  \r\n"
         		+ "javax.sound.sampled.Clip;                         \r\n"
         		+ "javax.sound.sampled.LineUnavailableException;     \r\n"
         		+ "javax.sound.sampled.UnsupportedAudioFileException;\r\n"
         		+ "javax.swing.ImageIcon;                            \r\n"
         		+ "flib.c.c;                         ");
    }
    public static void setFrameShape(int sh1, int sh2, int sh3, int sh4)
    {
    	c.e.setShape(new Ellipse2D.Double(sh1, sh2, sh3, sh4));
    }
   public static void getBackgr()
   {
	   c.e2.getBackground();
   }
   public static void addButton(String text, String layout, int x, int y, int xx, int yy) {
	  c.e0.setText(text);
	  if(layout.equals("flow")) {
	  c.e.getContentPane().setLayout(new FlowLayout());
	  }
	  c.e0.setBounds(x, y, xx, yy);
	  c.e2.add(c.e0);
   }
   // Main entry point of library
    public static void init()
    {
    c.e.add(c.e2);
    c.e.setLocationRelativeTo(null);
    flib i = new flib();
    c.e.add(i);  
   }
}
