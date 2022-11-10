package Proyecto1;
/**
 *
 * @author Kendo
 */
import java.util.LinkedList;

public class Medicamentos {
    private String Nombre; //Creamos la variable nombre
    LinkedList<String> Medicamentos = new LinkedList<>();//Creamos la lista
//Constructor
    public Medicamentos(String Nombre) {
        this.Nombre = Nombre;
    }
//Gettres y setters
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void AgregarMedicamento(String Nombre) {
        Medicamentos.add(Nombre);
    }

    public int CantidadMedicamentos() {
        return Medicamentos.size();
    }

    public void setMedicamentos(LinkedList<String> Medicamentos) {
        this.Medicamentos = Medicamentos;
    }

}
