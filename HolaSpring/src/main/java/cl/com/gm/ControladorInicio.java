package cl.com.gm;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author valeria
 */
@RestController
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio() {
        log.info("ejecutando el controlador rest");
        log.debug("más detalle del controlador");
        return "Hola Mundo con Spring Boot";
    }
}
