package proyecto1;
//autor Kendo
import java.util.LinkedList; //Importamos librearia LinkedList
import java.util.Scanner; // Importamos libreria Scanner
public class Poyecto1 {
    public static void main(String[] args) {
        LinkedList<Pacientes> listapac = new LinkedList();//Lista pacientes
        LinkedList<Medicamentos> listamed = new LinkedList();//Lista medicina
        Scanner Scan = new Scanner(System.in);
        byte  op; //Opcion para entrar al while
        byte opmenu ; //Opcion para seleccionar en el menu  
        //CREAMOS MEDICINAS Y NOMBRES POR DEFECTO
        listamed.add(new Medicamentos("Triludan")); //Creamos medicamentos por defeto
        listamed.add(new Medicamentos("Fortasec")); //Creamos medicamentos por defeto
        listamed.add(new Medicamentos("Clamoxil")); //Creamos medicamentos por defeto
        listapac.add(new Pacientes("Ana")); //Creamos nombres por defecto
        listapac.add(new Pacientes("Juan")); //Creamos nombres por defecto
        listapac.add(new Pacientes("Maria")); //Creamos nombres por defecto
        listapac.add(new Pacientes("Asier")); //Creamos nombres por defecto
        //================///
        //Damos bienvenida al programa y consulta para ingresar
        System.out.println("Bienvenido a al clinica.\nDesea ingresar?\n1.SI\n2.NO");
        op = Scan.nextByte();
        while (op == 1) {
            //Creamos menu y solicitamos sleecionar opcion
            System.out.println("Opciones");
            System.out.println("1-Insertar una nueva medicina");
            System.out.println("2-Insertar paciente y sus medicamentos");
            System.out.println("3-Imprimir los pacientes sin medicamentos");
            System.out.println("4-Borrar medicamentos");
            System.out.println(" ");
            opmenu = Scan.nextByte();
            switch (opmenu) {
                case 1://Utilizamos la funcion para agregar medicinas
                    AgregarMedicina(listamed,Scan); 
                    System.out.println("Desea realizar otra accion?\n1.Si\n2.No");
                    op = Scan.nextByte();
                    break;
                case 2://Utilizamos la funcion para agregar pacientes
                    AgregarPaciente(listapac,listamed,Scan);
                    System.out.println("Desea realizar otra accion?\n1.Si\n2.No");
                    op = Scan.nextByte();
                    break;
                case 3://Utilizamos la funcion para imprimir pacientes sin med
                    ImprimirPacientes(listapac, listamed);
                    System.out.println("Desea realizar otra accion?\n1.Si\n2.No");
                    op = Scan.nextByte();
                    break;
                case 4://Utilizamos la funcion para borrar medicinas sin paciente
                    BorrarMedicamentos(listapac,listamed, Scan);
                    System.out.println("Desea realizar otra accion?\n1.Si\n2.No");
                    op = Scan.nextByte();
                    break;
                default:
                    System.out.println("Por favor elija una opcion valida");
                    break;
            }
        }
    }
     //======================// 
    //Funcion para Agergar Medicinas
    public static void AgregarMedicina(LinkedList listamed, Scanner Scan) {
        //Agregamos la induccion de medicinas
        System.out.println("Ingrese el nombre de la medicina: ");
        String nombreMed = Scan.next();
        
        listamed.add(new Medicamentos(nombreMed));
        System.out.println("El nuevo medicamento es: " + listamed+"\n");
    }
    
    //Funcion para Agergar Pacientes
    public static void AgregarPaciente(LinkedList<Pacientes> listapac,LinkedList<Medicamentos> listamed, Scanner Scan) {
    Pacientes pac = new Pacientes("");
    Medicamentos med = new Medicamentos("");
        System.out.println("Ingrese el nombre del paciente: ");
        String nombrePaciente = Scan.next();
        pac.setNombrePaciente(nombrePaciente);
        
        System.out.println("Desea ingresar medicamentos para el paciente?\n1.Si\n2.No");
        byte opmenu = Scan.nextByte();
        
        while (opmenu == 1){
            System.out.println("Ingrese el nombre de la medicina: ");
            String nombreMed = Scan.next();
            med.setNombreMed(nombreMed);
            System.out.println("Desea ingresar medicamentos para el paciente?\n1.Si\n2.No");
            opmenu = Scan.nextByte();
        
        System.out.println("Se ha asignado "+nombreMed+" al paciente "+nombrePaciente);

        }
    }
    //Funcion para Imprimir Pacientes sin medicamento
    public static void ImprimirPacientes(LinkedList<Pacientes> listapac, LinkedList<Medicamentos> listamed) {
        for(int i = 0; listapac.size()>i; i++){
            
             System.out.println(""+listapac+listamed);
        }
       
    }
    //Funcion para eliminar medicinas sin pacientes
    public static void BorrarMedicamentos(LinkedList<Pacientes> listapac, LinkedList<Medicamentos> listamed, Scanner Scan) {
        System.out.println("Digite el nombre del medicamento a eliminar");
        String nombreMed = Scan.next();
       if (listamed.contains(nombreMed)){
           listamed.remove(nombreMed);
           System.out.println("Medicamento "+ nombreMed +" eliminado");
       }else{
           System.out.println("No encontrado");
       }
    }
}

