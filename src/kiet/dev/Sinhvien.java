package kiet.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Sinhvien {

	public static void main (String[]args) {
		try {
			FileInputStream fis = new FileInputStream("in.txt");

			BufferedReader br = new BufferedReader (new InputStreamReader(fis));
			
			String line ;
			
			while ((line = br.readLine()) !=null) {
				System.out.println(line);
			}
			br.close ();
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}

}
