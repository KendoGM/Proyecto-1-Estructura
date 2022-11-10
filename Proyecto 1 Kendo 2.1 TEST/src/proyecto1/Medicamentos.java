package proyecto1;
//autor Kendo

public class Medicamentos {
    private String nombreMed;

    public Medicamentos(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    public String getNombreMed() {
        return nombreMed;
    }

    public void setNombreMed(String nombreMed) {
        this.nombreMed = nombreMed;
    }

    @Override
    public String toString() {
        return "Medicamentos: " + "Nombre = " + nombreMed + "\n";
    }

   
}
