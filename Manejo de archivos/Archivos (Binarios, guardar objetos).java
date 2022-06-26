//Archivos objetos

//Declaración del objeto de ejemplo e instanciación del objeto de ejemplo
public class ObjEjemplo implements serializable(){
    private static final long serialVersionUID = 121L; 
}
ObjEjemplo ejemplo = new ObjEjemplo();



File binario = new File(path + alumno.getNombre + ".bin");              //Creamos un archivo con extensión .bin (contendrá al objeto instanciado) 

FileOutputStream outputStream = new FileOutputStream(binario);              //Creamos un output stream que necesitará el object output stream 
ObjectOutputStream objectStream = new ObjectOutputStream(outputStream);     //Object output stream grabará el objeto instanciado

objectStream.writeObject(ejemplo);                                          //graba el objeto y luego se cierra     
objectStream.close();



//AHORA LEEMOS ESOS OBJETOS 
File ejemploFile
FileInputStream inputStream = new FileInputStream(ejemploFile);             //Necesita un archivo para generar el flujo de entrada 
ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);   //Necesita un flujo de entrada para cargar el objeto 

Object ejemploObject = objectInputStream.readObject();      //Creamos instancia de OBJECT (Padre de todos los objetos) donde cargar lo leído
ObjEjemplo ejemplo = (ObjEjemplo)ejemploObject;             //Casteamos explícitamente lo que leemos al tipo de objeto que queremos 

