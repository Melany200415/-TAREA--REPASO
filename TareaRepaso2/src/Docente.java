public class Docente extends PersonaAcademica {
    private int horasClase;
    private double valorHora;
    public Docente(String codigo, String nombre, int edad,
                   int horasClase, double valorHora) {

        super(codigo, nombre, edad);
        setHorasClase(horasClase);
        setValorHora(valorHora);
    }
    public void setHorasClase(int horasClase) {
        if (horasClase >= 1 && horasClase <= 40) {
            this.horasClase = horasClase;
        } else {
            this.horasClase = 1;
        }
    }
    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;
        } else {
            this.valorHora = 1;
        }
    }
    public int getHorasClase() {
        return horasClase;
    }
    public double getValorHora() {
        return valorHora;
    }
    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Valor por hora: " + valorHora);
    }
    @Override
    public void describirRol() {
        System.out.println("Rol: Docente.");
    }
    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }
}