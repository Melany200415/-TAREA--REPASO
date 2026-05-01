public class BecadoExcelencia extends EstudianteBecado {

    private double bonoExcelencia;

    public BecadoExcelencia(String codigo, String nombre, double promedio,
                            double valorMatricula, double porcentajeBeca,
                            double bonoExcelencia) {
        super(codigo, nombre, promedio, valorMatricula, porcentajeBeca);
        setBonoExcelencia(bonoExcelencia);
    }

    public void setBonoExcelencia(double bonoExcelencia) {
        if (bonoExcelencia >= 0) {
            this.bonoExcelencia = bonoExcelencia;
        } else {
            System.out.println("El bono de excelencia no puede ser negativo");
            this.bonoExcelencia = 0;
        }
    }

    public double getBonoExcelencia() {
        return bonoExcelencia;
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bonoExcelencia;
        return Math.max(pago, 0); // El Math.max(nombre de variable,0)para no permitir valores negativos
    }
}