package archivos;

import java.io.Serializable;

public class Alumno implements Serializable {

    private String nombre;
    private int CUI;
    private int nota;

    public Alumno(String nombre, int CUI, int nota){
        this.nombre = nombre;
        this.CUI = CUI;
        this. nota = nota;
    }

    public String hablar(){
        return "Mi nombre es: " + nombre + " con CUI: " + CUI + " y nota " + nota;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCUI() {
        return CUI;
    }

    public int getNota() {
        return nota;
    }
}
