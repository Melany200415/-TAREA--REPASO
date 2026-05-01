import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== ESTUDIANTE BECADO EXCELENCIA =====");
        System.out.print("Código: ");
        String codigo1 = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Promedio: ");
        double promedio1 = sc.nextDouble();
        System.out.print("Valor matrícula: ");
        double matricula1 = sc.nextDouble();
        System.out.print("Porcentaje beca: ");
        double beca = sc.nextDouble();
        System.out.print("Bono excelencia: ");
        double bono = sc.nextDouble();
        sc.nextLine();
        Estudiante e1 = new BecadoExcelencia(codigo1, nombre1, promedio1, matricula1, beca, bono);

        System.out.println("\n===== ESTUDIANTE REGULAR CON RECARGO =====");
        System.out.print("Código: ");
        String codigo2 = sc.nextLine();
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Promedio: ");
        double promedio2 = sc.nextDouble();
        System.out.print("Valor matrícula: ");
        double matricula2 = sc.nextDouble();
        System.out.print("Número materias: ");
        int materias = sc.nextInt();
        System.out.print("Recargo pendiente: ");
        double recargo = sc.nextDouble();
        Estudiante e2 = new RegularConRecargo(codigo2, nombre2, promedio2, matricula2, materias, recargo);

        System.out.println("\n========= RESULTADOS =========\n");
        e1.mostrarDatos();
        System.out.println("Pago final: $" + e1.calcularPagoFinal());
        System.out.println();
        e2.mostrarDatos();
        System.out.println("Pago final: $" + e2.calcularPagoFinal());
    }
}