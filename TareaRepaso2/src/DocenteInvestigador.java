public class DocenteInvestigador extends Docente {

    private int publicaciones;

    public DocenteInvestigador(String codigo, String nombre, int edad,
                               int horasClase, double valorHora,
                               int publicaciones) {
        super(codigo, nombre, edad, horasClase, valorHora);
        setPublicaciones(publicaciones);
    }

    public void setPublicaciones(int publicaciones) {
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        } else {
            System.out.println("Las publicaciones no pueden ser negativas");
            this.publicaciones = 0;
        }
    }

    @Override
    public double calcularPago() {
        return super.calcularPago() + (publicaciones * 20);
    }
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con producción académica.");
    }
}