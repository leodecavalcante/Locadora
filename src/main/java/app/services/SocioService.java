package app.services;

import app.repository.SocioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocioService {

    @Autowired
    SocioRepository socioRepository;
}
