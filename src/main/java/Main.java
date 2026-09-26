import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException {

        //Creamos variables a usar en el ejercicio
        String rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");

        Scanner scanner = new Scanner (System.in);

        menuEjercicios();

        while(true) {

            String input1 = scanner.nextLine();

            if (input1.equals("1")) {

                ejercicio1();

            } else if (input1.equals("2")) {

                ejercicio2(scanner);


            } else if (input1.equalsIgnoreCase("exit")) {

                System.out.println("Bye-bye!");
                break;

            } else {

                System.out.println("Inténtalo de nuevo o escribe 'exit'");

            }
        }

    }

    public static void menu(){
        System.out.println("----------------------");
        System.out.println("Ficheros y directorios");
        System.out.println("----------------------");
        System.out.println("teclea el número de la opción deseada:");
        System.out.println("1 -Crear un directorio nuevo 'nuevoDirectorio'");
        System.out.println("2 -Crear un fichero nuevo");
        System.out.println("3 -Borrar 'fichero_de_texto2.txt'");
        System.out.println("4 -Eliminar la carpeta 'nuevoDirectorio'");
        System.out.println("5 -Salir");
        System.out.println("----------------------");
    }

    public static void menuEjercicios(){
        System.out.println("-----------");
        System.out.println("Elige un ejercicio. Ejercicios 1 y 2 disponibles.");
        System.out.println();
        System.out.println("Introduce el número del ejercicio y presiona 'Enter'");
        System.out.println("------------");
    }

    public static void ejercicio1(){




        //Creamos miDirectorio (tipo File) con el constructor
        File miDirectorio = new File (rutaAbsoluta, "miDirectorio"); //parámetros: ruta y nombre del directorio o archivo

        //Si no existe ya, creamos un directorio con el método mkdirs()
        if (miDirectorio.mkdirs()){
            System.out.println("Directorio creado con éxito");
        } else {
            System.out.println("El directorio ya existe");
        }

        rutaAbsoluta += File.separator + "miDirectorio"; //actualizamos la ruta para entrar en la carpeta nueva miDirectorio

        //Creamos ficheroTexto con el constructor, de nuevo
        File ficheroTexto = new File (rutaAbsoluta,"fichero_de_texto.txt");

        //Si no existe ya, creamos el fichero con createNewFile()
        if (ficheroTexto.createNewFile()){
            System.out.println("Fichero creado con éxito");
        } else {
            System.out.println("El fichero ya existe");

        }

    }

    public static void ejercicio2 (Scanner scanner) {

    //PARTE 2: Ampliar el programa

        System.out.println();
        menu();
        System.out.println();

        File nuevoDirectorio;
        File ficheroTexto2;


        while(true){

            String inputUsuario = scanner.nextLine();

            if (inputUsuario.equals("1")) {

                //Creamos nuevoDirectorio

                //Ruta:
                rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");

                nuevoDirectorio = new File(rutaAbsoluta, "nuevoDirectorio");

                //Si no existe, mkdirs():
                if (nuevoDirectorio.mkdirs()) {

                    System.out.println("Directorio 'nuevoDirectorio' creado con éxito");
                } else {

                    System.out.println("El directorio ya existe");
                }

            }else if ((inputUsuario.equals("2"))) {

                //Creamos fichero_de_texto_2

                rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");

                //Comprobamos que existe el directorio para proceder:

                nuevoDirectorio = new File(rutaAbsoluta, "nuevoDirectorio");

                if (nuevoDirectorio.exists()) {

                    ficheroTexto2 = new File(nuevoDirectorio, "fichero_de_texto2.txt");

                    if (ficheroTexto2.createNewFile()) {

                        System.out.println("Fichero 'fichero_de_texto2.txt' creado con éxito");
                    } else {

                        System.out.println("El fichero ya existe");
                    }

                } else {

                    System.out.println("El directorio de destino no existe, crea primero el directorio padre");
                }


            }else if ((inputUsuario.equals("3"))) {

                rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");
                nuevoDirectorio = new File(rutaAbsoluta, "nuevoDirectorio");
                ficheroTexto2 = new File(nuevoDirectorio, "fichero_de_texto2.txt");

                //Eliminamos fichero_de_texto2.txt

                //Comprobamos que existe:
                if (ficheroTexto2.exists()) {
                    ficheroTexto2.delete();

                    System.out.println("Fichero borrado con éxito");
                } else {

                    System.out.println("El fichero 'fichero_de_texto2.txt' no se encuentra en el directorio");
                }

            } else if ((inputUsuario.equals("4"))) {

                rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");
                nuevoDirectorio = new File(rutaAbsoluta, "nuevoDirectorio");
                ficheroTexto2 = new File(nuevoDirectorio, "fichero_de_texto2.txt");

                //Eliminamos el directorio

                //Comprobamos que existe y que está vacío:

                if (nuevoDirectorio.exists()) {

                    if (ficheroTexto2.exists()){

                        System.out.println("El directorio no está vacío. Elimina el contenido para proceder al borrado");

                    }else{
                        nuevoDirectorio.delete();

                        System.out.println("Directorio borrado con éxito");
                    }
                } else {

                    System.out.println("El directorio no existe");
                }

            }else if (inputUsuario.equals("5") || inputUsuario.equalsIgnoreCase("exit")){

                System.out.println("Bye!");
                break;

            } else {

                System.out.println("Comando no válido. Inténtalo de nuevo");
            }

            System.out.println();
            menu();
            System.out.println();
        }


    }


}
