public class PersonaAcademica {

    private String codigo;
    private String nombre;
    private int edad;

    public PersonaAcademica(String codigo, String nombre, int edad) {
        setCodigo(codigo);
        setNombre(nombre);
        setEdad(edad);
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("El código no debe estar vacío");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no debe estar vacío");
        }
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        } else {
            System.out.println("La edad debe ser mayor o igual a 18");
            this.edad = 18;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public void describirRol() {
        System.out.println("Rol: Personal académico.");
    }

    public double calcularPago() {
        return 0;
    }
}
}
