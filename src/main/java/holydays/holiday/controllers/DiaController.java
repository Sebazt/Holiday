package holydays.holiday.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import holydays.holiday.models.Dia;
import holydays.holiday.services.FestivoService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DiaController {

  private final FestivoService festivoService;

  @Autowired
  public DiaController(FestivoService festivoService) {
    this.festivoService = festivoService;
  }

  // ... (método anterior)

  @GetMapping("/calendario/{anio}")
  public ResponseEntity<List<Dia>> obtenerCalendario(@PathVariable int anio) {
    List<Dia> calendario = festivoService.obtenerCalendarioDelAnio(anio);
    return ResponseEntity.ok(calendario);
  }
}
