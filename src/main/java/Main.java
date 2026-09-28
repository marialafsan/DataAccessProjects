import java.io.*;
import java.util.*;
import java.io.IOException;

public class Main {

    public static void main(String [] args) throws IOException {

        //Creamos variables a usar en el ejercicio
        /*String rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");
        File miDirectorio = new File (rutaAbsoluta, "miDirectorio");
        File ficheroTexto = new File (rutaAbsoluta,"fichero_de_texto.txt");*/

        Scanner scanner = new Scanner (System.in);

        menuEjercicios();

        while(true) {

            String input1 = scanner.nextLine();

            if (input1.equals("1")) {

                ejercicio1();

            } else if (input1.equals("2")) {

                ejercicio2(scanner);

            } else if (input1.equals("3")){

                ejercicio3(scanner);

            } else if (input1.equals("4")){

                ejercicio4(scanner);

            }

            } else if (input1.equalsIgnoreCase("exit")) {

                System.out.println("Bye-bye!");
                break;
                        } else {

                System.out.println("Inténtalo de nuevo o escribe 'exit'");
                System.out.println();
                menuEjercicios();
            }
        }

    }

    public static void menuEjercicios(){
        System.out.println("---------------------------------------");
        System.out.println("--TAREA 1 RA1 -Ficheros y directorios--");
        System.out.println("---------------------------------------");

        System.out.println("Ejercicios 1, 2 y 3 disponibles.");
        System.out.println();
        System.out.println("Introduce el número del ejercicio y presiona 'Enter'. \n \nTeclea 'exit' para finalizar el programa");
        System.out.println("-----------");
    }

    public static void menuEj2(){
        System.out.println("---------------------------------------");
        System.out.println("--            Ejercicio 2            --");
        System.out.println("---------------------------------------");
        System.out.println("teclea el número de la opción deseada:");
        System.out.println("1 -Crear un directorio nuevo 'nuevoDirectorio'");
        System.out.println("2 -Crear un fichero nuevo");
        System.out.println("3 -Borrar 'fichero_de_texto2.txt'");
        System.out.println("4 -Eliminar la carpeta 'nuevoDirectorio'");
        System.out.println("5 -Salir");
        System.out.println("---------------------------------------");
    }

    public static void menuEj3(){
        System.out.println("---------------------------------------");
        System.out.println("--            Ejercicio 3            --");
        System.out.println("---------------------------------------");
        System.out.println("teclea el número de la opción deseada:");
        System.out.println("1 -Crear un directorio nuevo 'nuevoDirectorio'");
        System.out.println("2 -Crear un fichero nuevo 'fichero_de_texto_2'");
        System.out.println("3 -Borrar 'fichero_de_texto2.txt'");
        System.out.println("4 -Eliminar la carpeta 'nuevoDirectorio'. \n***Se eliminarán los ficheros guardados en su interior");
        System.out.println("5 -Guardar las provincias de Andalucía en 'fichero_de_texto_2'");
        System.out.println("6 -Salir");
        System.out.println("---------------------------------------");
    }



    public static void ejercicio1() throws IOException {

        System.out.println("---------------------------------------");
        System.out.println("--            Ejercicio 1            --");
        System.out.println("---------------------------------------");
        System.out.println();

        //Creamos variables a usar en el ejercicio
        String rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");
        File miDirectorio = new File (rutaAbsoluta, "miDirectorio");
        File ficheroTexto = new File (miDirectorio,"fichero_de_texto.txt");

        System.out.println("Creando directorio 'miDirectorio' y fichero 'fichero_de_texto...");
        System.out.println();

        //Si no existe ya, creamos un directorio con el método mkdirs()
        if (miDirectorio.mkdirs()){
            System.out.println("Directorio creado con éxito");
        } else {
            System.out.println("El directorio ya existe");
        }

        rutaAbsoluta += File.separator + "miDirectorio"; //actualizamos la ruta para entrar en la carpeta nueva miDirectorio

        //Si no existe ya, creamos el fichero con createNewFile()
        if (ficheroTexto.createNewFile()){
            System.out.println("Fichero creado con éxito");
        } else {
            System.out.println("El fichero ya existe");

        }
        System.out.println();
        menuEjercicios();

    }

    public static void ejercicio2(Scanner scanner) throws IOException {

        //PARTE 2: Ampliar el programa

        System.out.println();
        menuEj2();
        System.out.println();

        File nuevoDirectorio;
        File ficheroTexto2;
        String rutaAbsoluta;


        while (true) {

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

            } else if ((inputUsuario.equals("2"))) {

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


            } else if ((inputUsuario.equals("3"))) {

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

                    if (ficheroTexto2.exists()) {

                        System.out.println("El directorio no está vacío. Elimina el contenido para proceder al borrado");

                    } else {
                        nuevoDirectorio.delete();

                        System.out.println("Directorio borrado con éxito");
                    }
                } else {

                    System.out.println("El directorio no existe");
                }

            } else if (inputUsuario.equals("5") || inputUsuario.equalsIgnoreCase("exit")) {

                break;

            } else {

                System.out.println("Comando no válido. Inténtalo de nuevo");
            }

            System.out.println();
            menuEj2();
            System.out.println();
        }

        menuEjercicios();

    }

    public static void ejercicio3(Scanner scanner) throws IOException {

        //PARTE 2: Ampliar el programa

        System.out.println();
        menuEj3();
        System.out.println();

        File nuevoDirectorio;
        File ficheroTexto2;
        String rutaAbsoluta;


        while (true) {

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

            } else if ((inputUsuario.equals("2"))) {

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


            } else if ((inputUsuario.equals("3"))) {

                rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");
                nuevoDirectorio = new File(rutaAbsoluta, "nuevoDirectorio");
                ficheroTexto2 = new File(nuevoDirectorio, "fichero_de_texto2.txt");

                //Eliminamos fichero_de_texto2.txt

                //Comprobamos que existe:
                if (ficheroTexto2.exists()) {
                    ficheroTexto2.delete();

                    System.out.println("Fichero borrado con éxito");
                } else {

                    System.out.println("El fichero 'fichero_de_texto2.txt' no existe");
                }

            } else if ((inputUsuario.equals("4"))) {

                rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");
                nuevoDirectorio = new File(rutaAbsoluta, "nuevoDirectorio");
                ficheroTexto2 = new File(nuevoDirectorio, "fichero_de_texto2.txt");

                //Eliminamos el directorio

                //Comprobamos que existe y que está vacío:

                if (nuevoDirectorio.exists()) {

                    if (ficheroTexto2.exists()) {

                        ficheroTexto2.delete();

                    }
                    nuevoDirectorio.delete();
                    System.out.println("Directorio borrado con éxito");

                } else {

                    System.out.println("El directorio no existe");
                }
            } else if (inputUsuario.equals("5")){

                rutaAbsoluta = ("C:" + File.separator + "AD" + File.separator + "Ejercicios");
                nuevoDirectorio = new File(rutaAbsoluta, "nuevoDirectorio");
                ficheroTexto2 = new File(nuevoDirectorio, "fichero_de_texto2.txt");

                if (ficheroTexto2.exists()) {

                    FileWriter fw = new FileWriter(ficheroTexto2);
                    PrintWriter printer = new PrintWriter(fw);

                    printer.write("Almería\nCádiz\nCórdoba\nGranada\nHuelva\nJaén\nMálaga\nSevilla");

                    System.out.println("Acción completada");

                } else {

                    System.out.println("El fichero 'fichero_de_texto2.txt' no existe");
                }

            } else if (inputUsuario.equals("6") || inputUsuario.equalsIgnoreCase("exit")) {

                break;

            } else {

                System.out.println("Comando no válido. Inténtalo de nuevo");
            }

            System.out.println();
            menuEj3();
            System.out.println();
        }

        menuEjercicios();

    }

public static void ejercicio4(Scanner scanner) throws IOException {

    //PARTE 4: Fichero que escriba en Empleados.txt un listado de empleados con 10 empleados.





    File nuevoDirectorio;
    File empleados;
    String rutaAbsoluta;


    while (true) {

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

        } else if ((inputUsuario.equals("2"))) {

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


        } else if ((inputUsuario.equals("3"))) {

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

                if (ficheroTexto2.exists()) {

                    System.out.println("El directorio no está vacío. Elimina el contenido para proceder al borrado");

                } else {
                    nuevoDirectorio.delete();

                    System.out.println("Directorio borrado con éxito");
                }
            } else {

                System.out.println("El directorio no existe");
            }

        } else if (inputUsuario.equals("5") || inputUsuario.equalsIgnoreCase("exit")) {

            break;

        } else {

            System.out.println("Comando no válido. Inténtalo de nuevo");
        }

        System.out.println();
    }

    menuEjercicios();

}

}
