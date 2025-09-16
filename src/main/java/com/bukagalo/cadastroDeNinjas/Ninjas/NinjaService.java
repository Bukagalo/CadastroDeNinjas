package com.bukagalo.cadastroDeNinjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRespository ninjaRepository;

    public NinjaService(NinjaRespository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    @Autowired

    // LISTAR TODOS OS NINJAS

    public List<NinjaModel> listarNinjas() {

        return ninjaRepository.findAll();


    }

    public NinjaModel listarPorId(Long id) {

        Optional<NinjaModel> ninjaModel = ninjaRepository.findById(id);
        return ninjaModel.orElse(null);

    }
}