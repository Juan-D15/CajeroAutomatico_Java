package modelo.beans;

import java.util.Calendar;

/**
 *
 * @author Juan Diaz
 */
public class FechaHora {

    static Calendar Hora = Calendar.getInstance();
    static Calendar Fecha = Calendar.getInstance();
    private String HoraActual = "";
    private String FechaActual = "";

    public String FechaAcceso() {
        int dia, mes, anio;

        dia = Fecha.get(Calendar.DATE);
        mes = Fecha.get(Calendar.MONTH);
        anio = Fecha.get(Calendar.YEAR);

        return FechaActual = dia + "/" + (mes + 1) + "/" + anio;
    }

    public String HoraAcceso() {
        int hora, minutos, segundos;

        hora = Hora.get(Calendar.HOUR_OF_DAY);
        minutos = Hora.get(Calendar.MINUTE);
        segundos = Hora.get(Calendar.SECOND);

        return HoraActual = hora + ":" + minutos + ":" + segundos;
    }
    
}
