package tech.leandroportugal.helpdesk.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.leandroportugal.helpdesk.domain.Technical;
import tech.leandroportugal.helpdesk.domain.dtos.TechnicalDTO;
import tech.leandroportugal.helpdesk.repositories.TechnicalRepository;
import tech.leandroportugal.helpdesk.servicies.exceptions.ObjectNotFoundException;

@Service
public class TechnicalService {

@Autowired
private TechnicalRepository repository;

public Technical findById(Long id){
    Optional<Technical> obj = repository.findById(id);
    return obj.orElseThrow(()-> new ObjectNotFoundException("Object not found! Id: " + id));
}

public List<Technical> findAll() {
    return repository.findAll();
}

public Technical create(TechnicalDTO objDTO) {
    objDTO.setId(null);
    Technical obj = new Technical(objDTO);
    return repository.save(obj);
}

}



