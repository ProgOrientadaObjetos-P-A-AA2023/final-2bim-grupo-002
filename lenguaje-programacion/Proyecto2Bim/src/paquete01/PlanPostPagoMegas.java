/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

/**
 *
 * @author Italo
 */
public class PlanPostPagoMegas extends PlanCelular {

    private double gigasInternet;
    private double costoGigasInternet;
    private double tarifaBase;

    public PlanPostPagoMegas(double gI, double cGI,
            double tB, String nombrePropietario, String apellidoPropietario,
            String pasaportePropietario, String ciudadPropietario, String barrioPropietario,
            String marcaCelular, String modeloCelular, String numeroCelular) {
        super(nombrePropietario, apellidoPropietario, pasaportePropietario,
                ciudadPropietario, barrioPropietario, marcaCelular,
                modeloCelular, numeroCelular);
        gigasInternet = gI;
        costoGigasInternet = cGI;
        tarifaBase = tB;
    }


    public double obtenerGigasInternet() {
        return gigasInternet;
    }

    public void establecerGigasInternet(double gnet) {
        gigasInternet = gnet / 1000;
    }

    public double obtenerCostoGigasInternet() {
        return costoGigasInternet;
    }

    public void establecerCostoGigasInternet(double c) {
        costoGigasInternet = c;
    }

    public double obtenerTarifaBase() {
        return tarifaBase;
    }

    public void establecerTarifaBase(double t) {
        tarifaBase = t;
    }

    @Override
    public void establecerPagoMensual() {
        pagoMensual = (costoGigasInternet * gigasInternet) + tarifaBase;
    }

    @Override
    public String toString() {
        String reporte = String.format("PLAN POST PAGO MEGAS\n%s"
                + "Gigas de internet: %.2f\n"
                + "Costo por giga: %.2f\n"
                + "Tarifa base: %.2f\n"
                + "Pago mensual: %.2f\n",
                super.toString(), gigasInternet, costoGigasInternet, tarifaBase, pagoMensual);
        return reporte;
    }

}
