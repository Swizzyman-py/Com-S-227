package lab6;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

import plotter.Plotter;
import plotter.Polyline;

public class TestPlotter
{
	  private static Polyline parseOneLine(String line)
	  {
		  
		  int first, second;
		  //File file = new File("../project5/src/lab5/Initials.java");
		  //Scanner scanner = new Scanner(file);
		  String[] howMany = line.split(" ");
		  Point[] linePoints;
		  System.out.println(howMany.length);
		  
		  Polyline mrLine = new Polyline(howMany[0]);
		  
		  for(int i = 1; i > howMany.length / 2; i++){
			  first = Integer.parseInt(howMany[2 * i + 1]);
			  second = Integer.parseInt(howMany[2 * i + 2]);
			  System.out.println(first);
			  System.out.println(second);
			 // linePoints[i] = (new Point())
		  }
		  
		 return mrLine;
	  }
	  
	  public static void main(String[] args)
	  {
	    //Plotter plotter = new Plotter();
	    Polyline p = parseOneLine("red 100 100 200 100 200 200 100 200 100 100");
	    //plotter.plot(p);
	    
	    p = parseOneLine("2 blue 250 100 400 350 100 350 250 100");
	    //plotter.plot(p);
	  }
	  /*
	  public static void main(String[] args) throws FileNotFoundException
	  {
	    ArrayList<Polyline> list = readFile("hello.txt");
	    Plotter plotter = new Plotter();

	    for (Polyline p : list)
	    {
	      plotter.plot(p);
	    }
	  }
	
  public static void main(String[] args)
  {    
    // make a red square using default line width of one pixel
    Polyline pl = new Polyline("red");
    pl.addPoint(new Point(100, 100));
    pl.addPoint(new Point(200, 100));
    pl.addPoint(new Point(200, 200));
    pl.addPoint(new Point(100, 200));
    pl.addPoint(new Point(100, 100));
    
    // make a blue triangle with a line width of 2 pixels
    Polyline pl2 = new Polyline("blue", 2);
    pl2.addPoint(new Point(250, 100));
    pl2.addPoint(new Point(400, 350));
    pl2.addPoint(new Point(100, 350));
    pl2.addPoint(new Point(250, 100));
    
    // make some green zig-zags with a thick line
    Polyline pl3 = new Polyline("green", 6);
    pl3.addPoint(new Point(100, 400));
    pl3.addPoint(new Point(200, 450));
    pl3.addPoint(new Point(300, 400));
    pl3.addPoint(new Point(400, 450));
    pl3.addPoint(new Point(300, 250));
    pl3.addPoint(new Point(100, 400));
    
    Polyline mrLine = new Polyline("magenta");
    mrLine.addPoint(new Point(10, 10));
    mrLine.addPoint(point);
    
    
    
    
    
    // plot the three polylines using the plotter
    Plotter plotter = new Plotter();
    plotter.plot(pl);
    plotter.plot(pl2);
    plotter.plot(pl3);
  }
  */

}
