
package com.portafoliowebsrc.src.Security.Service;

import com.portafoliowebsrc.src.Security.Entity.Rol;
import com.portafoliowebsrc.src.Security.Enums.RolNombre;
import com.portafoliowebsrc.src.Security.Repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
// si una operación falla lo que hace esta anotation es hacer un rollback y q no impacte en la base de datos (estado anterior)
public class RolService {
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol) {
        rolRepository.save(rol);
    }
}
