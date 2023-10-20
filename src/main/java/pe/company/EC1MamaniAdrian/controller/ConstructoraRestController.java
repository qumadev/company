package pe.company.EC1MamaniAdrian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.company.EC1MamaniAdrian.model.Constructora;
import pe.company.EC1MamaniAdrian.service.ConstructoraService;

import java.util.Collection;

@RestController
@RequestMapping("/constructora")
public class ConstructoraRestController {
    @Autowired
    private ConstructoraService constructoraService;

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        Collection<Constructora> itemsConstructora = constructoraService.findAll();
        return new ResponseEntity<>(itemsConstructora, HttpStatus.OK);
    }

    @GetMapping("/buscar/{codProyecto}")
    public ResponseEntity<?> buscar(@PathVariable int codProyecto){
        Constructora constructora = constructoraService.findById(codProyecto);

        if(constructora!=null) {
            return new ResponseEntity<>(constructora, HttpStatus.OK);
        }

        return new ResponseEntity<>("Proyecto no encontrado",HttpStatus.NOT_FOUND);

    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregar(@RequestBody Constructora constructora){
        constructoraService.insert(constructora);
        return new ResponseEntity<>("Proyecto creado",HttpStatus.CREATED);
    }

    @PutMapping("/editar/{codProyecto}")
    public ResponseEntity<?> editar(@PathVariable int codProyecto,
                                    @RequestBody Constructora newConstructora){

        Constructora constructora = constructoraService.findById(codProyecto);

        if(constructora!=null) {
            constructora.setnProyecto(newConstructora.getnProyecto());
            constructora.setUbicacion(newConstructora.getUbicacion());
            constructora.setMunicipalidad(newConstructora.getMunicipalidad());
            constructora.setfAprobacion(newConstructora.getfAprobacion());
            constructora.setfEjecucion(newConstructora.getfEjecucion());
            constructora.setImporte(newConstructora.getImporte());
            constructora.setTiempoDias(newConstructora.getTiempoDias());
            constructora.setIngeniero(newConstructora.getIngeniero());
            constructora.setFinancieraRespaldo(newConstructora.getFinancieraRespaldo());
            constructora.setDescripcion(newConstructora.getDescripcion());
            constructoraService.update(constructora);
            return new ResponseEntity<>("Proyecto actualizado",HttpStatus.OK);
        }

        return new ResponseEntity<>("Proyecto no existente",HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/eliminar/{codProyecto}")
    public ResponseEntity<?> eliminar(@PathVariable int codProyecto){
        Constructora instructor = constructoraService.findById(codProyecto);
        if(instructor!=null) {
            constructoraService.delete(codProyecto);
            return new ResponseEntity<>("Proyecto eliminado",HttpStatus.OK);
        }
        return new ResponseEntity<>("Proyecto no existente",HttpStatus.NOT_FOUND);
    }


}
