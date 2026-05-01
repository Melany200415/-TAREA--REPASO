public class EstudianteBecado extends Estudiante {
private double porcentajeBeca;
    public EstudianteBecado(String codigo, String nombre, double promedio,
                            double valorMatricula, double porcentajeBeca) {
        super(codigo, nombre, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBeca);
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        } else {
            this.porcentajeBeca = 0;
        }
    }

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() - (getValorMatricula() * porcentajeBeca / 100);
    }
}
