package archivos;

import java.io.*;
import java.util.Scanner;

public class FileManager {

    String path;
    Scanner scanner = new Scanner(System.in);

    public void leerArchivo(){
        System.out.println("Ingrese un path para leer");
        path = scanner.nextLine();
        File file = new File(path);

        try{
            Scanner fileScanner = new Scanner(file);
            System.out.println("Aquí comienza la lectura del archivo");
            do {
                System.out.println(fileScanner.nextLine());
            }while(fileScanner.hasNextLine());
            fileScanner.close();
        }catch (FileNotFoundException e){

            System.out.println("El archivo no existe");

        }
    }

    public void escribirArchivo(){
        System.out.println("Ingrese un path para escribir");
        path = scanner.nextLine();
        File file = new File(path);

        try{
            PrintWriter printWriter;
            if(!file.exists()){
                System.out.println("El archivo no existe así que se creará uno");
                printWriter = new PrintWriter(path);
                file = new File(path);
            }else{
                System.out.println("El archivo indicado si existe y se escribirá en él");
                printWriter = new PrintWriter(file);
            }

            for (int i = 50; i<60; i++){
                printWriter.println(i);
            }
            printWriter.close();
        }catch (FileNotFoundException e){
            System.out.println("Algo falló");
        }

    }

    public void crearConTexto() throws Exception {
        int size;

        System.out.println("Ingrese un path para crear objetos desde ese archivo");
        path = scanner.nextLine();
        File file = new File(path);


        Scanner fileScanner = new Scanner(file);
        //Primera línea para especificar el tamaño del array
        size = Integer.parseInt(fileScanner.nextLine());
        Alumno [] alumno = new Alumno[size];

        for (int i = 0; i <alumno.length; i++){
            alumno[i] = new Alumno(fileScanner.nextLine(),
                                    Integer.parseInt(fileScanner.nextLine()),
                                    Integer.parseInt(fileScanner.nextLine()));

        }

        for (int i = 0; i < alumno.length; i++) {
            System.out.println(alumno[i].hablar());
            GuardarObjEnArchivos(alumno[i]);
        }

    }

    public void GuardarObjEnArchivos(Alumno alumo) throws Exception{
        Alumno alumno = alumo;
        File binario = new File("/home/jorge/Escritorio/Practice/Manejo de archivos/" + alumno.getCUI() + ".bin" );
        FileOutputStream fos = new FileOutputStream(binario);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(alumno);
        oos.close();
    }

}
