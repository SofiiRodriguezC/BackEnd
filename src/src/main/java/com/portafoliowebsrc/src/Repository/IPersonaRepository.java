
package com.portafoliowebsrc.src.Repository;
import com.portafoliowebsrc.src.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
