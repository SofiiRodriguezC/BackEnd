
package com.portafoliowebsrc.src.Security.Repository;

import com.portafoliowebsrc.src.Security.Entity.Rol;
import com.portafoliowebsrc.src.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
