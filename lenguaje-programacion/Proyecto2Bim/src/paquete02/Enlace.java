/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import paquete01.*;

/**
 *
 * @author Italo
 */
public class Enlace {

    private Connection conn;

    public void establecerConexion() {

        try {
            // db parameters  
            String url = "jdbc:sqlite:bd/PlanCelular.bd";
            // create a connection to the database  
            conn = DriverManager.getConnection(url);
            // System.out.println(conn.isClosed());
            // System.out.println("Connection to SQLite has been established.");  

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public Connection obtenerConexion() {
        return conn;
    }

    public void insertarPlanPostPagoMegas(PlanPostPagoMegas p1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMegas (nombrePropietario,apellidoPropietario,pasaportePropietario,"
                    + "ciudadPropietario,barrioPropietario,marcaCelular,modeloCelular,numeroCelular,gigasInternet,"
                    + "costoGigasInternet,tarifaBase) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f')",
                    p1.obtenerNombrePropietario(), p1.obtenerApellidoPropietario(),
                    p1.obtenerPasaportePropietario(), p1.obtenerCiudadPropietario(),
                    p1.obtenerBarrioPropietario(), p1.obtenerMarcaCelular(),
                    p1.obtenerModeloCelular(), p1.obtenerNumeroCelular(),
                    p1.obtenerGigasInternet(), p1.obtenerCostoGigasInternet(), p1.obtenerTarifaBase());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutos(PlanPostPagoMinutos p1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutos (nombrePropietario,apellidoPropietario,pasaportePropietario,"
                    + "ciudadPropietario,barrioPropietario,marcaCelular,modeloCelular,numeroCelular,minutosNacionales,costoMinutoNacional,"
                    + "minutosInternacionales,costoMinutoInternacional) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f', '%.2f')",
                    p1.obtenerNombrePropietario(), p1.obtenerApellidoPropietario(),
                    p1.obtenerPasaportePropietario(), p1.obtenerCiudadPropietario(),
                    p1.obtenerBarrioPropietario(), p1.obtenerMarcaCelular(),
                    p1.obtenerModeloCelular(), p1.obtenerNumeroCelular(),
                    p1.obtenerMinutosNacionales(), p1.obtenerCostoMinutoNacional(),
                    p1.obtenerMinutosInternacionales(), p1.obtenerCostoMinutoInternacional());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegasEconomico(PlanPostPagoMinutosMegasEconomico p1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegasEconomico (nombrePropietario,apellidoPropietario,pasaportePropietario,"
                    + "ciudadPropietario,barrioPropietario,marcaCelular,modeloCelular,numeroCelular,minutosSaldo,costoMinutosSaldo,"
                    + "gigasInternet,costoGiga,porcentajeDescuento) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f', '%.2f', '%.2f')",
                    p1.obtenerNombrePropietario(), p1.obtenerApellidoPropietario(),
                    p1.obtenerPasaportePropietario(), p1.obtenerCiudadPropietario(),
                    p1.obtenerBarrioPropietario(), p1.obtenerMarcaCelular(),
                    p1.obtenerModeloCelular(), p1.obtenerNumeroCelular(),
                    p1.obtenerMinutosSaldo(), p1.obtenerCostoMinutosSaldo(),
                    p1.obtenerGigasInternet(), p1.obtenerCostoGiga(),
                    p1.obtenerPorcentajeDescuento());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public void insertarPlanPostPagoMinutosMegas(PlanPostPagoMinutosMegas p1) {

        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = String.format("INSERT INTO planPostPagoMinutosMegas (nombrePropietario,apellidoPropietario,cedulaPropietario,"
                    + "ciudadPropietario,barrioPropietario,marcaCelular,modeloCelular,numeroCelular,minutosSaldo,costoMinutosSaldo,"
                    + "gigasInternet,costoGiga) values "
                    + "('%s', '%s', '%s', '%s','%s', '%s', '%s', '%s', '%.2f', '%.2f', '%.2f', '%.2f')",
                    p1.obtenerNombrePropietario(), p1.obtenerApellidoPropietario(),
                    p1.obtenerPasaportePropietario(), p1.obtenerCiudadPropietario(),
                    p1.obtenerBarrioPropietario(), p1.obtenerMarcaCelular(),
                    p1.obtenerModeloCelular(), p1.obtenerNumeroCelular(), p1.obtenerMinutosSaldo(),
                    p1.obtenerCostoMinutosSaldo(), p1.obtenerGigasInternet(), p1.obtenerCostoGiga());
            System.out.println(data);
            statement.executeUpdate(data);
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception:");
            System.out.println(e.getMessage());

        }
    }

    public ArrayList<PlanPostPagoMegas> obtenerDataPlanPostPagoMegas() {
        ArrayList<PlanPostPagoMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMegas pm = new PlanPostPagoMegas(rs.getDouble("gigasInternet"),
                        rs.getDouble("costoGigasInternet"),
                        rs.getDouble("tarifaBase"),
                        rs.getString("nombrePropietario"),
                        rs.getString("apellidoPropietario"),
                        rs.getString("pasaportePropietario"),
                        rs.getString("ciudadPropietario"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));

                pm.establecerPagoMensual();
                lista.add(pm);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutos> obtenerDataPlanPostPagoMinutos() {
        ArrayList<PlanPostPagoMinutos> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutos;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                
                PlanPostPagoMinutos pm1 = new PlanPostPagoMinutos(rs.getDouble("minutosNacionales"),
                        rs.getDouble("costoMinutoNacional"),
                        rs.getDouble("minutosInternacionales"),
                        rs.getDouble("costoMinutoInternacional"),
                        rs.getString("nombrePropietario"),
                        rs.getString("apellidoPropietario"),
                        rs.getString("pasaportePropietario"),
                        rs.getString("ciudadPropietario"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));

                pm1.establecerPagoMensual();
                lista.add(pm1);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutos");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutosMegas> obtenerDataPlanPostPagoMinutosMegas() {
        ArrayList<PlanPostPagoMinutosMegas> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegas;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegas pm2 = new PlanPostPagoMinutosMegas(rs.getDouble("minutosSaldo"), 
                        rs.getDouble("costoMinutosSaldo"), 
                        rs.getDouble("gigasInternet"), 
                        rs.getDouble("costoGiga"), 
                        rs.getString("nombrePropietario"),
                        rs.getString("apellidoPropietario"),
                        rs.getString("pasaportePropietario"),
                        rs.getString("ciudadPropietario"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));

                pm2.establecerPagoMensual();
                lista.add(pm2);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegas");
            System.out.println(e.getMessage());

        }
        return lista;
    }

    public ArrayList<PlanPostPagoMinutosMegasEconomico> obtenerDataPlanPostPagoMinutosMegasEconomico() {
        ArrayList<PlanPostPagoMinutosMegasEconomico> lista = new ArrayList<>();
        try {
            establecerConexion();
            Statement statement = obtenerConexion().createStatement();
            String data = "Select * from planPostPagoMinutosMegasEconomico;";

            ResultSet rs = statement.executeQuery(data);
            while (rs.next()) {
                PlanPostPagoMinutosMegasEconomico pm3 = new PlanPostPagoMinutosMegasEconomico(rs.getDouble("minutosSaldo"), 
                        rs.getDouble("costoMinutosSaldo"), 
                        rs.getDouble("gigasInternet"), 
                        rs.getDouble("costoGiga"),     
                        rs.getDouble("porcentajeDescuento"), 
                        rs.getString("nombrePropietario"),
                        rs.getString("apellidoPropietario"),
                        rs.getString("pasaportePropietario"),
                        rs.getString("ciudadPropietario"),
                        rs.getString("barrioPropietario"),
                        rs.getString("marcaCelular"),
                        rs.getString("modeloCelular"),
                        rs.getString("numeroCelular"));

                pm3.establecerPagoMensual();
                lista.add(pm3);
            }

            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println("Exception: insertarPlanPostPagoMinutosMegasEconomico");
            System.out.println(e.getMessage());

        }
        return lista;
    }

}
