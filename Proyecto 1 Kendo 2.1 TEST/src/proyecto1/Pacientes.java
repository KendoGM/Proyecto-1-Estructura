package proyecto1;
//autor Kendo

import java.util.LinkedList;


public class Pacientes {

    private String nombrePaciente;

    public Pacientes(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    
    
    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    @Override
    public String toString() {
        return "Pacientes{" + "Nombre =" + nombrePaciente + '}';
    }

}
