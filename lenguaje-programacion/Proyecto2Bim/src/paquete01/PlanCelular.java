package paquete01;

/**
 *
 * @author Italo
 */
public abstract class PlanCelular {

    protected String nombrePropietario;
    protected String apellidoPropietario;
    protected String pasaportePropietario;
    protected String ciudadPropietario;
    protected String barrioPropietario;
    protected String marcaCelular;
    protected String modeloCelular;
    protected String numeroCelular;
    protected double pagoMensual;

    public PlanCelular(String n, String a, String p, String ci, String b,
            String mC, String mdC, String nC) {
        nombrePropietario = n;
        apellidoPropietario = a;
        pasaportePropietario = p;
        ciudadPropietario = ci;
        barrioPropietario = b;
        marcaCelular = mC;
        modeloCelular = mdC;
        numeroCelular = nC;
    }

    public void establecerNombrePropietario(String n) {
        nombrePropietario = n;
    }

    public void establecerApellidoPropietario(String a) {
        apellidoPropietario = a;
    }

    public void establecerPasaportePropietario(String c) {
        pasaportePropietario = c;
    }

    public void establecerCiudadPropietario(String cd) {
        ciudadPropietario = cd;
    }

    public void establecerBarrioPropietario(String b) {
        barrioPropietario = b;
    }

    public void establecerMarcaCelular(String m) {
        marcaCelular = m;
    }

    public void establecerModeloCelular(String mc) {
        modeloCelular = mc;
    }

    public void establecerNumeroCelular(String n) {
        numeroCelular = n;
    }

    public abstract void establecerPagoMensual();

    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public String obtenerApellidoPropietario() {
        return apellidoPropietario;
    }

    public String obtenerPasaportePropietario() {
        return pasaportePropietario;
    }

    public String obtenerCiudadPropietario() {
        return ciudadPropietario;
    }
    public String obtenerBarrioPropietario() {
        return barrioPropietario;
    }

    public String obtenerMarcaCelular() {
        return marcaCelular;
    }

    public String obtenerModeloCelular() {
        return modeloCelular;
    }

    public String obtenerNumeroCelular() {
        return numeroCelular;
    }

    public double obtenerPagoMesual() {
        return pagoMensual;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombre del propietario: %s\n"
                + "Apellido del propietario%s\n"
                + "Pasaporte del propietario: %s\n"
                + "Ciudad del propietario: %s\n"
                + "Barrio del propietario: %s\n"
                + "Marca celular: %s\n"
                + "Modelo celular: %s\n"
                + "Número de celular: %d\n",
                nombrePropietario, apellidoPropietario,
                pasaportePropietario, ciudadPropietario,
                barrioPropietario, marcaCelular, modeloCelular,
                numeroCelular);
        return reporte;
    }
}
