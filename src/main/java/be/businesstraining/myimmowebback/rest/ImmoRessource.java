package be.businesstraining.myimmowebback.rest;

import be.businesstraining.myimmowebback.domain.Immo;
import be.businesstraining.myimmowebback.services.ImmoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/immo")
public class ImmoRessource {

    public ImmoRessource(ImmoService service) {
        this.service = service;
    }

    private ImmoService service;


    @GetMapping
    public Set<Immo> allImmo() {
        return service.allImmo();
    }

    @GetMapping("/{id")
    public Immo getImmoById(@PathVariable Long id) {
        return service.getImmoById(id);
    }
}
