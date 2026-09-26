import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException {

        Scanner scanner = new Scanner (System.in);

        //Primero guardamos la ruta en un String:
        String rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");


        //Creamos miDirectorio (tipo File) con el constructor
        File miDirectorio = new File (rutaAbsoluta, "miDirectorio"); //parámetros: ruta y nombre del directorio o archivo

        //Si no existe ya, creamos un directorio con el método mkdirs()
        if (miDirectorio.exists()){
            System.out.println("El directorio ya existe");
        } else {
            miDirectorio.mkdirs();
            System.out.println("Directorio creado con éxito");
        }

        rutaAbsoluta += File.separator + "miDirectorio"; //actualizamos la ruta para entrar en la carpeta nueva miDirectorio

        //Creamos ficheroTexto con el constructor, de nuevo
        File ficheroTexto = new File (rutaAbsoluta,"fichero_de_texto.txt");

        //Si no existe ya, creamos el fichero con createNewFile()
        if (ficheroTexto.exists()){
            System.out.println("El fichero ya existe");
        } else {
            ficheroTexto.createNewFile();
            System.out.println("Fichero creado con éxito");
        }

        //PARTE 2: Ampliar el programa

        while(true){

            System.out.println("Ficheros y directorios");
            System.out.println("----------------------");
            System.out.println("teclea el número de la opción deseada:");
            System.out.println("1 -Crear un directorio nuevo 'nuevoDirectorio'");
            System.out.println("2 -Crear un fichero nuevo");
            System.out.println("3 -Borrar 'fichero_de_texto.txt'");
            System.out.println("4 -Eliminar la carpeta 'nuevoDirectorio'");
            System.out.println("5 -Salir");

            String inputUsuario = scanner.nextLine();

            if (inputUsuario == "1"){

                //Creamos nuevoDirectorio

                //Ruta:
                rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");

                //Creamos el File:
                File nuevoDirectorio = new File (rutaAbsoluta, "nuevoDirectorio");

                //Si no existe, mkdirs():
                if (nuevoDirectorio.exists()){
                    System.out.println("El directorio ya existe");
                } else {
                    nuevoDirectorio.mkdirs();
                    System.out.println("Directorio 'nuevoDirectorio' creado con éxito");
                }

            }else{

                break;
            }

        }









    }
}
