package pe.company.EC1MamaniAdrian.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.company.EC1MamaniAdrian.model.Financiera;
import pe.company.EC1MamaniAdrian.service.FinancieraService;

import java.util.Collection;

@RestController
@RequestMapping("/financiera")
public class FinancieraRestController {

    @Autowired
    private FinancieraService financieraService;

    @GetMapping("/listar")
    public ResponseEntity<?> listar(){
        Collection<Financiera> itemsFinanciera = financieraService.findAll();
        return new ResponseEntity<>(itemsFinanciera, HttpStatus.OK);
    }

    @GetMapping("/buscar/{nroPrestamo}")
    public ResponseEntity<?> buscar(@PathVariable int nroPrestamo){
        Financiera financiera = financieraService.findById(nroPrestamo);
        if(financiera!=null){
            return new ResponseEntity<>(financiera,HttpStatus.OK );
        }
        return  new ResponseEntity<>("Prestamo no encontrado",HttpStatus.NOT_FOUND);
    }

    @PostMapping("/agregar")
    public ResponseEntity<?> agregar(@RequestBody Financiera financiera){
        financieraService.insert(financiera);
        return  new ResponseEntity<>("Prestamo creado",HttpStatus.CREATED);
    }

    @PutMapping("/editar/{nroPrestamo}")
    public ResponseEntity<?> editar(@PathVariable int nroPrestamo, @RequestBody Financiera newFinanciera){
        Financiera financiera = financieraService.findById(nroPrestamo);
        if(financiera!=null){
            financiera.setFinancista(newFinanciera.getFinancista());
            financiera.setCliente(newFinanciera.getCliente());
            financiera.setfPrestamo(newFinanciera.getfPrestamo());
            financiera.setImporte(newFinanciera.getImporte());
            financiera.setnLetras(newFinanciera.getnLetras());
            financiera.setInteres(newFinanciera.getInteres());
            financieraService.update(financiera);
            return new ResponseEntity<>("Prestamo actualizado",HttpStatus.OK);
        }
        return new ResponseEntity<>("Prestamo no existente",HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/eliminar/{nroPrestamo}")
    public ResponseEntity<?> eliminar(@PathVariable int nroPrestamo){
        Financiera financiera = financieraService.findById(nroPrestamo);
        if(financiera!=null){
            financieraService.delete(nroPrestamo);
            return new ResponseEntity<>("Prestamo eliminado",HttpStatus.OK);
        }
        return new ResponseEntity<>("Prestamo no existente",HttpStatus.NOT_FOUND);
    }
}
