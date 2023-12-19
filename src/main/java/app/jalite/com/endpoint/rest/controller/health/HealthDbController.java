package app.jalite.com.endpoint.rest.controller.health;

import static app.jalite.com.endpoint.rest.controller.health.PingController.KO;
import static app.jalite.com.endpoint.rest.controller.health.PingController.OK;

import app.jalite.com.PojaGenerated;
import app.jalite.com.repository.DummyRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@PojaGenerated
@RestController
@AllArgsConstructor
public class HealthDbController {

  DummyRepository dummyRepository;

  @GetMapping("/health/db")
  public ResponseEntity<String> dummyTable_should_not_be_empty() {
    return dummyRepository.findAll().isEmpty() ? KO : OK;
  }
}
