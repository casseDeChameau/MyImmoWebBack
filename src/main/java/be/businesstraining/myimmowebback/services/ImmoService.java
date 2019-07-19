package be.businesstraining.myimmowebback.services;

import be.businesstraining.myimmowebback.domain.Immo;

import java.util.Set;

public interface ImmoService {

    Set<Immo> allImmo();
    Immo getImmoById(Long id);
}
