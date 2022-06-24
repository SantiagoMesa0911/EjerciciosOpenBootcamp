public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        persona.setNombre("Santiago mesa");
        persona.setEdad(18);
        persona.setTelefono("3113758440");
        System.out.println("El nombre de la persona es " + persona.getNombre() + " su edad es " + persona.getEdad()
                + " y su telefono es " + persona.getTelefono());
    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int pedad) {
        this.edad = pedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String pnombre) {
        this.nombre = pnombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String ptelefono) {
        this.telefono = ptelefono;
    }

}
