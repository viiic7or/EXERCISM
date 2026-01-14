import java.time.LocalDate;
import java.time.LocalDateTime;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        String[] divFecha = appointmentDateDescription.split(" ");
        String[] fechas = divFecha[0].split("/");
        String[] horas = divFecha[1].split(":");

        return LocalDateTime.of(Integer.parseInt(fechas[2]), Integer.parseInt(fechas[0]), Integer.parseInt(fechas[1]), Integer.parseInt(horas[0]), Integer.parseInt(horas[1]), Integer.parseInt(horas[2]));
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime fechaActual = LocalDateTime.now();
        if(fechaActual.isAfter(appointmentDate)){
            return true;
        }
        return false;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        int hora = appointmentDate.getHour() % 12;
        if (hora == 0) hora = 12;
        String ampm = (appointmentDate.getHour() < 12) ? "AM." : "PM.";

        String minuto = String.format("%02d", appointmentDate.getMinute());
        
        String noMayMes = appointmentDate.getMonth().toString().substring(1).toLowerCase();
        String MayMes = appointmentDate.getMonth().toString().substring(0, 1).toUpperCase();
        String month = MayMes + noMayMes;

        String noMayWeek = appointmentDate.getDayOfWeek().toString().substring(1).toLowerCase();
        String MayWeek = appointmentDate.getDayOfWeek().toString().substring(0, 1).toUpperCase();
        String day = MayWeek + noMayWeek;
        
        return "You have an appointment on " + day + ", " + month + " " + appointmentDate.getDayOfMonth() + ", " + appointmentDate.getYear() + ", at " + hora + ":" + minuto + " " +  ampm;
    }

    public LocalDate getAnniversaryDate() {
        LocalDateTime fechaActual = LocalDateTime.now();
        return LocalDate.of(fechaActual.getYear(), 9, 15);
    }
}
