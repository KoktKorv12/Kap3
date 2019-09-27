import javax.swing.*;
import java.util.Scanner;
 
 public class Uppgift3 {
	public static void main (String[] args) {
		
		double d = 100;
		double pi = 3.1415;
		double r = d/2;
		double a = r*r*pi;
		double o = d*pi;
		
			JOptionPane.showMessageDialog(null, "diameter =" + d + "cm"  + "\nradie =" + r + "cm");
			JOptionPane.showMessageDialog(null, "area =" + a + "cm"  + "\nomrekts =" + o + "cm");	
	}
 }