package holydays.holiday.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import holydays.holiday.models.Dia;
import holydays.holiday.repositories.DiaRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class FestivoService {

  private final RestTemplate restTemplate;
  private final DiaRepository diaRepository;

  @Autowired
  public FestivoService(RestTemplate restTemplate, DiaRepository diaRepository) {
    this.restTemplate = restTemplate;
    this.diaRepository = diaRepository;
  }

  // ... (código anterior)

  public List<Dia> obtenerCalendarioDelAnio(int anio) {
    return diaRepository.findAll().stream()
        .filter(dia -> dia.getFecha().getYear() == anio)
        .toList();
  }
}
