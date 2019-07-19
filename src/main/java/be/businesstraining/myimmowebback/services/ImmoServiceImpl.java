package be.businesstraining.myimmowebback.services;

import be.businesstraining.myimmowebback.domain.Immo;
import be.businesstraining.myimmowebback.repository.ImmoRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
// @AllArgsConstructor : pas besoin de coder les constructeurs ni autowire (lombok)
public class ImmoServiceImpl implements ImmoService {

    private ImmoRepository repository;
    //si @Autowired (à placer au dessus) : pas de constructeur à coder ci dessous
    public ImmoServiceImpl(ImmoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Immo> allImmo() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public Immo getImmoById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
