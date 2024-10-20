package holydays.holiday.models;

import java.util.Date;

public class Festivo {
  private String nombre;
  private Date fecha;

  // Constructor, Getters y Setters
  public Festivo(String nombre, Date fecha) {
    this.nombre = nombre;
    this.fecha = fecha;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Date getFecha() {
    return fecha;
  }

  public void setFecha(Date fecha) {
    this.fecha = fecha;
  }
}
