package dinopark.controller;

import dinopark.dto.DinosaurCreateCommand;
import dinopark.dto.DinosaurInfo;
import dinopark.dto.VisitorCreateCommand;
import dinopark.dto.VisitorInfo;
import dinopark.service.DinoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dinopark")
public class DinoParkController {

    private final DinoService dinoService;

    public DinoParkController(DinoService dinoService) {
        this.dinoService = dinoService;
    }

    @PostMapping("/dino")
    public ResponseEntity<DinosaurInfo> save(@RequestBody DinosaurCreateCommand command) {
        return new ResponseEntity<>(dinoService.saveDino(command), HttpStatus.OK);
    }

    @GetMapping("/dino")
    public ResponseEntity<List<DinosaurInfo>> findAllDino() {
        return new ResponseEntity<>(dinoService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/dino/{eatingHabit}")
    public ResponseEntity<List<DinosaurInfo>> findByEatingHabit(@PathVariable String eatingHabit) {
        return new ResponseEntity<>(dinoService.findByEatingHabit(eatingHabit), HttpStatus.OK);
    }

    @PostMapping("/visitor")
    public ResponseEntity<VisitorInfo> saveVisitor(@RequestBody VisitorCreateCommand command) {
        return new ResponseEntity<>(dinoService.saveVisitor(command), HttpStatus.OK);
    }

    @GetMapping("/visitor")
    public ResponseEntity<List<VisitorInfo>> findAllVisitor() {
        return new ResponseEntity<>(dinoService.findAllVisitor(), HttpStatus.OK);
    }

    // park rating, getAverageRating
    @GetMapping("/park")
    public ResponseEntity<String> getAverageParkRating() {
        return new ResponseEntity<>(dinoService.getAverageParkRating(), HttpStatus.OK);
    }


}
