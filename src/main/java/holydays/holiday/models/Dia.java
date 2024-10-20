package holydays.holiday.models;

import java.time.LocalDate;

public class Dia {
  private LocalDate fecha;
  private String tipo; // "Laboral", "Fin de Semana", "Festivo"

  // Constructor
  public Dia(LocalDate fecha, String tipo) {
    this.fecha = fecha;
    this.tipo = tipo;
  }

  // Getters y Setters
  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
}
