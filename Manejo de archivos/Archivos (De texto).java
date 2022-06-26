//Archivos

//Primero se necesita un path 
String path;   
Scanner scanner = new Scanner(System.in);       //System.in es el flujo de texto que llega desde el teclado
System.out.println("Ingrese un path para el archivo");
path = scanner.nextLine();

File file = new File(path); //File acepta parámetro string con path del archivo que va a contener || REPRESENTA AL CONTENEDOR, NO AL CONTENIDO 

    Métodos que pueden servir: file.canWtite("Devuelve un boolean de si se puede escribir en ese arvhivo") 
                               file.getAbsolutePath("Devuelve un string con el path absoluto de ese archivo") 
                               file.getParent("Devuelve la carpeta que contiene al archivo") 
                               file.isDirectory("Devuelve un boolean que indica si es una carpeta o no")

//Ahora generar conexión (stream) entre el archivo y el program. Se puede generar a mano o se puede "Delegar" a alguien que genere el flujo
//Es diferente un flujo de entrada de archivos de texto que un flujo de otro tipo de archivos 

FileReader reader = new FileReader(file); //file reader necesita que se le pase como parámetro un file, le pasamos el generado arriba
Scanner scannerFile = new Scanner(file);  //scanner también se puede usar para leer un archivo, en ese caso se le pasa un file - LANZA EXCEPCION

scannerFile.nextLine(); //Lee una línea entera
scannerFile.hasNextLine(); boolean que indica si hay una siguiente línea 
scanner.close(); //Se necesitan cerrar los flujos de entrada

//ESCRIBIR A UN ARCHIVO DE TEXTO
FileOutputStream fos = new FileOutputStream(file); //Nuevamente se le pasa el archivo de arriba

PrintWriter printer = new PrintWriter(file); //Otra forma de escribir archivos más directa dice
printer.println("Este es un texto");
printer.println(String.format("CUI: %s, Nombre: %s, Promedio: %f", alumno.getCui, alumno.getNombre, alumno.getPromedio));
printer.closer(); //TODOS LOS QUE CREAN UN FLUJO DE ESCRITURA HAY QUE CERRARLOS
