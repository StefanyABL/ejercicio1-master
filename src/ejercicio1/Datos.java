package ejercicio1;
import java.util.Scanner;

public class Datos {

	public static void main (String []args){
		
		String chainOne = new String ("uptc"); //es diferente por se estan comparando objetos no variables normales
		String chainTwo = new String ("u");
		
		System.out.println(chainOne.equals(chainTwo)  ? "Iguales" : "Diferentes");
		System.out.println(chainOne.compareTo(chainTwo)); //CHAIN TWO ES MENOR QUE CHAIN ONE
		}
	

//	public static void main (String []args){
//			
//			String cad = "En el mundo existen 10 tipos de personas las que leen binario y las que NO";
//			for (int i = 0; i < cad.length(); i++) {
//				System.out.println(cad.charAt(i));
//				
//			}
//			System.out.println(cad.indexOf("x")); //muestra la primera x de la cadena es decir la posicion 13 
//			                                      // 14 = -1
//		}
//			
//		}
//
//
//	public static void main (String []args){
//		
//
//			String cad = "En el mundo existen 10 tipos de personas las que leen binario y las que NO";
//			for (int i = 0; i < cad.length(); i++) {
//				System.out.println(cad.charAt(i));
//				
//			}
//			
//			//System.out.println(cad.indexOf("x")); //muestra la primera x de la cadena es decir la posicion 13 
//			                                      // 14 = -1
//		
//		String [] tokens =cad.split(" ");   //DIVIDIR EN TOKENS LA CADENA
//		for (String S : tokens){
//			System.out.println(S);
//			
//		}
//		}
//			
//		}


	}