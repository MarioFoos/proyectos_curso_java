package com.cursojava;

@SuppressWarnings("unused")
public class StringApp
{
	public static void main(String[] args)
	{
		/*{
			String str;
			
			str = "A";
			str = "Texto largo";
			str = "user@mail.com";
		}
		{
			String str1 = new String("Algún texto");
			String str2 = "Algún otro texto";
		}*/
		/*{
			String str1 = new String("Hola ");
			String str2 = "Mundo";
			String str3 = str1 + str2;
			
			//System.out.println(str3);
			
			// Es equivalente a hacer lo siguiente
			System.out.println("Hola " + str2);
			System.out.println(str1 + "mundo");
			System.out.println("Hola " + "mundo");
			
			str3 = str1.concat(str2);
			// Guardando el resultado en str3
			System.out.println(str3);
			// O mostrando directamente
			System.out.println(str1.concat(str2));
		}*/
		/*{
			String str1 = "usuario@dominio.com";
			String str2 = "usuario@dominio2.com";
			String str3 = "usuario@dominio.com";
			String str4 = "";
			
			// Cantidad de caracteres
			System.out.println("str1 tiene " + str1.length() + " caracteres");
			System.out.println("str2 tiene " + str2.length() + " caracteres");
			// Comprobación de contenido vacío
			System.out.println("str3 vacía: " + str3.isEmpty());
			System.out.println("str4 vacía: " + str4.isEmpty());
			// Comprobación de igualdad
			System.out.println("str1 es igual a str2: " + str1.equals(str2));
			System.out.println("str1 es igual a str3: " + str1.equals(str3));
		}*/
		/*{
			String str1 = "Almendras";
			String str2 = "Banana";
			String str3 = "Calabaza";
			
			System.out.println("str1 comparad con str2: " + str1.compareTo(str2));
			System.out.println("str3 comparad con str2: " + str3.compareTo(str2));
			System.out.println("str1 comparad con str1: " + str1.compareTo(str1));
		}*/
		/*{
			String str1 = "Catarata";
			
			System.out.println(str1 + " contine 'rata': " + str1.contains("rata"));
			System.out.println("Posición de 'rata' en " + str1 + ": "+ str1.indexOf("rata"));
			System.out.println(str1 + " contine 'gato': " + str1.contains("gato"));
			System.out.println("Posición de 'gato' en " + str1 + ": "+ str1.indexOf("gato"));
			System.out.println("Posición de 'a'" + str1 + ": "+ str1.indexOf('a'));

		}*/
		{
			String str1 = "Jirafa";
			
			System.out.println(str1 + " en mayúsculas: " + str1.toUpperCase());
			System.out.println(str1 + " en minúsculas: " + str1.toLowerCase());
			
			System.out.println(str1 + " sub cadena 1: " + str1.substring(2));
			System.out.println(str1 + " sub cadena 2: " + str1.substring(2, 6));
			
			System.out.println(str1 + " reemplazo de cadena: " + str1.replace("Ji", "Gar"));
			
		}
	}
}


