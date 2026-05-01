public class Estudiante {

    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante (String codigo,String nombre,double promedio,double valorMatricula){
        setCodigo(codigo);
        setNombre(nombre);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }
    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            this.codigo = "Codigo vacio ";
        }
    }
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            this.nombre = "El nombre esta vacio ";
        }
    }
    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio=promedio;
        } else {
            this.promedio = 0;

        }
    }
    public double getValorMatricula() {
        return valorMatricula;
    }
    public void setValorMatricula(double valorMatricula) {
       if (valorMatricula>0){
           this.valorMatricula=valorMatricula;
       }
    }
    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matrícula: $" + valorMatricula);
    }
    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }
    public double calcularPagoFinal() {
        return valorMatricula;
    }

    public double calcularPagoFinal(double descuentoExtra) {
        double total = calcularPagoFinal() - descuentoExtra;
        return Math.max(total, 0);
    }

}
