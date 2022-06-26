package archivos;

public class Main {

    public static void main(String [] args){
        FileManager fileManager = new FileManager();
        //fileManager.leerArchivo();

        //fileManager.escribirArchivo();

        try{
            fileManager.crearConTexto();
        }catch (Exception e){
            System.out.println("Algo salió mal puto");
        }
    }

}
