package luchadorJapones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Luchadores {

	public static void main(String[] args) throws IOException {
		LeerArchivo("E:\\workSpace22\\novenaSemana\\src\\luchadorJapones\\luchadores");
		leerEnteros("E:\\workSpace22\\novenaSemana\\src\\luchadorJapones\\luchadores");
		System.out.println("cantidad de luchadores: "+ contarLuchadores("E:\\workSpace22\\novenaSemana\\src\\luchadorJapones\\luchadores"));
//		File luchadores = new File ("E:\\workSpace22\\novenaSemana\\src\\luchadorJapones\\luchadores");
//		FileReader fr = new FileReader(luchadores);
	}
	public static void LeerArchivo(String rutaDeAcceso) throws FileNotFoundException {
		File luchadores = new File (rutaDeAcceso);
		FileReader fr = new FileReader(luchadores);
			BufferedReader bfr = new BufferedReader(fr);
			// line = new Scanner(luchadores);
			String linea; 
			try {
				while((linea = bfr.readLine())!=null) {
					System.out.println(linea);
				}
			}catch(IOException e){
				e.printStackTrace();
			}
			
	}
	public static int contarLuchadores ( String rutaDeAcceso) throws IOException{
		File luchadores = new File (rutaDeAcceso);
		FileReader fr = new FileReader(luchadores);
			BufferedReader bfr = new BufferedReader(fr);
			String linea;
			int ctd=0;
			 try {
				Scanner line = new Scanner(luchadores);
			
				while ((linea = bfr.readLine())!=null){
					ctd ++;
						
				}					}
				catch (FileNotFoundException e) {
					
					e.printStackTrace();
			 }
	           finally {
		return ctd;
	               }
	}	
			 
				 // TODO Auto-generated catch block
				 //e.printStackTrace();
	
	
//				}
	
	public static void leerEnteros (String rutaDeAcceso) throws IOException {
		File luchadores = new File (rutaDeAcceso);
		FileReader fr = new FileReader(luchadores);
			BufferedReader bfr = new BufferedReader(fr);
			// line = new Scanner(luchadores);
			String linea; 
			int peso =0 ;
			int peso_bug = 0;
			int altura=0;
			int altura_bug=0;
			int str =0;
			int sg=0;
//			(line.hasNextInt())
			 
			try (Scanner line = new Scanner(luchadores)){
				
			while ((linea = bfr.readLine())!=null){
				
//					if(line.hasNextInt()) {
//					altura=peso;
				
					peso = line.nextInt();
				
					if(peso!=0) {
						sg=line.nextInt();
					}
				if (sg>900) {
					altura=sg;
				}
				if(sg<900) {
					altura=peso;
				}
					
				
//				for (int i =0;i <=linea.length()-1;i++) {
//						if(linea.substring(i)=="") {
//							
//							altura=line.nextInt();
//							altura_bug=1;
//						}else {
//							altura = peso;
//						}
//									
				System.out.println("peso = "+peso+
						"\naltura= "+altura
						+"sg ="+ sg);
//				peso_bug=0;
//				altura_bug=0;
			line.close();
								}
			}
							
					
					
				
					
//					altura= line.nextInt();
//					altura = Integer.parseInt(linea);
//					}
			 catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e.toString());
				 //e.printStackTrace();
			}
}
}
