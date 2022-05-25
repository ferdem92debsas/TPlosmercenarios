package luchadorJapones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Categorias {

	public static void main(String[] args) throws FileNotFoundException {

		categorizar("E:\\workSpace22\\novenaSemana\\src\\luchadorJapones\\Altura");
	}

	public static void categorizar (String rutadeAcceso) throws FileNotFoundException {
		String categorias = null;
		  File archivo = new File (rutadeAcceso);
		  FileReader fr = new FileReader(archivo);
		  BufferedReader bfr = new BufferedReader(fr);
		  String linea; 

		  int peso=0;
		  int altura=0;
		  int numerodeLinea=0;
		  boolean pesados;
		  String espesado ="es pesado";
		  String esliviano = "es liviano";

		  try( Scanner reader = new Scanner (archivo)) {
			  while ((linea = bfr.readLine())!=null) {
				  peso = reader.nextInt();
				  altura = (int) reader.nextDouble();
				  numerodeLinea++;
			  if(peso>=70) {
				  pesados=true;
				  categorias = ("luchador "+numerodeLinea+": "+espesado+"\n");
			  }else {
				  pesados=false;
				  categorias = ("luchador "+numerodeLinea+": "+esliviano+"\n");
			  }
//			  categorias +=categorias;
			  System.out.println(categorias);
			  }
		  }catch(IOException e) {
			  e.printStackTrace();
		  }finally {

		  }

	}  

}
