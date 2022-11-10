package Proyecto1;
/**
 *
 * @author Kendo
 */
import java.util.LinkedList;
import java.util.Scanner;
public class Proyecto1 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        byte op=1;
        byte opmenu;
        
        while (op == 1) {
            System.out.println("Opciones");
            System.out.println("1-Insertar una nueva medicina");
            System.out.println("2-Insertar paciente y sus medicamentos");
            System.out.println("3-Imprimir los pacientes sin medicamentos");
            System.out.println("4-Borrar medicamentos que no tome ningun paciente");
            System.out.println("-------------------");
            opmenu = Scan.nextByte();
            switch (opmenu) {
                case 1:
                    AgregarMedicamento();
                    System.out.println("Desea realizar otra opcion?");
                    op = Scan.nextByte();
                    break;
                case 2:
                    Insertar_Paciente();
                    System.out.println("Desea realizar otra opcion?");
                    op = Scan.nextByte();
                    break;
                case 3:
                    ImprimirPacientes();
                    System.out.println("Desea realizar otra opcion?");
                    op = Scan.nextByte();
                    break;
                case 4:
                    BorrarMedicamentos();
                    System.out.println("Desea realizar otra opcion?");
                    op = Scan.nextByte();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    //Funcion para agregar medicamentos
    public static void AgregarMedicamento() {
        Scanner Scan = new Scanner(System.in);
        //Creamos lista y Medicamentos por defecto
        LinkedList<String> listMed = new LinkedList<>();
        listMed.add("Triludan");//Creamos medicamentos por defecto
        listMed.add("Fortasec");//Creamos medicamentos por defecto
        listMed.add("Clamoxil");//Creamos medicamentos por defecto
        //Solicitamos el ingreso de nuevos medicamentos
        //Creamos un while para poder crear
        System.out.println("Ingrese el nombre de la medicina: ");
        String nuevoMed = Scan.next();
        listMed.add(nuevoMed);
        System.out.println("El nuevo medicamento es: " + nuevoMed);
    }

    public static void Insertar_Paciente() {
        Scanner Scan = new Scanner(System.in);
        LinkedList<String> Medic = new LinkedList<>();
        System.out.println("Ingrese el nombre del paciente: ");
        String nomPac = Scan.nextLine();

        System.out.println("Desea agregar un medicamento?\n1.Si\n2.No");
        Byte op = Scan.nextByte();
        
        while (op == 1 ){
            Medicamentos aux = new Medicamentos("");
            System.out.println("Digite el nombre:");
            String med = Scan.next();
            aux.AgregarMedicamento(med);
            
            Medic.add(med);
            System.out.println("Desea agregar otro medicamento?\n1.Si\n2.No");
            op = Scan.nextByte();

        } 
        System.out.println("El nombre del paciente es: " + nomPac);
        System.out.println("Y los medicamentos son: " + Medic);

    }

    public static void ImprimirPacientes() {
        LinkedList noMed = new LinkedList<>();
        noMed.add("Maria");

        Pacientes Triludan = new Pacientes("");

        Pacientes Fortasec = new Pacientes("");
        Fortasec.setNombre("Ana");
        Fortasec.setNombre("Asier");

        Pacientes Clamoxil = new Pacientes("Nicol");
        Clamoxil.setNombre("Ana");
        Clamoxil.setNombre("Juan");
        Clamoxil.setNombre("Asier");


        System.out.println("La paciente que no tiene medicamentos es: " + noMed);
    }

    public static void BorrarMedicamentos() {
        Scanner Scan = new Scanner(System.in);
        LinkedList<String> listMed = new LinkedList<>();

        listMed.add("Paracetamol");
        listMed.add("Aspirina");
        listMed.add("Ibuprofeno");
        System.out.println("Estos medicamentos si tiene pacientes: " + listMed);

        System.out.println("Los medicamentos que no son tomados por nadie son:");
        LinkedList<String> borrarMed = new LinkedList<>();
        borrarMed.add("Triludan");
        System.out.println(borrarMed);
        System.out.println("Se borro de la lista.");
    }
}

