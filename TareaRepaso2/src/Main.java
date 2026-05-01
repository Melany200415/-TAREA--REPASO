import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== REGISTRO DOCENTE INVESTIGADOR =====");
        System.out.print("Código: ");
        String codigo = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Horas de clase: ");
        int horasClase = sc.nextInt();
        System.out.print("Valor por hora: ");
        double valorHora = sc.nextDouble();
        System.out.print("Publicaciones: ");
        int publicaciones = sc.nextInt();
        PersonaAcademica persona = new DocenteInvestigador(
                codigo,
                nombre,
                edad,
                horasClase,
                valorHora,
                publicaciones
        );
        System.out.println("\n===== RESULTADOS =====");
        persona.mostrarDatos();
        persona.describirRol();
        System.out.println("Pago final: $" + persona.calcularPago());
        DocenteInvestigador investigador = (DocenteInvestigador) persona;
        System.out.println("Pago con bono extra: $" + investigador.calcularPago(50));
    }
}
