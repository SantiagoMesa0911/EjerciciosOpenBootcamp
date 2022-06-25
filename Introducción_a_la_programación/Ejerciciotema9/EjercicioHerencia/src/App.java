public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.setEdad(18);
        cliente.setNombre("Santiago");
        cliente.setTelefono("3113758440");
        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(45);
        trabajador.setNombre("Santiago Mesa");
        trabajador.setTelefono("3145608927");
        trabajador.setSalario("4.000.000");
        System.out.println("El nombre del cliente es " + cliente.getNombre() + " y tiene " + cliente.getEdad()
                + " años y su numero de contacto es " + cliente.getTelefono()
                + ",el empleado encargado de contactar el cliente es " + trabajador.getNombre() + " y su telefono es "
                + trabajador.getTelefono() + " y su salario es de " + trabajador.getSalario() + " y su edad  "
                + trabajador.getEdad());
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;

}

class Cliente extends Persona {
    String credito;

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

    public String getCredito() {
        return credito;
    }

    public void getCredito(String cCliente) {
        this.credito = cCliente;
    }
}

class Trabajador extends Persona {
    String salario;

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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String tSalario) {
        this.salario = tSalario;
    }

}