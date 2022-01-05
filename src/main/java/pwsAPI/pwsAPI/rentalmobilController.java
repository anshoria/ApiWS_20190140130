/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwsAPI.pwsAPI;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author msi gf75
 */
@CrossOrigin
@RestController
@RequestMapping("/mobil")


public class rentalmobilController {
    @Autowired
    private rentalmobilrepo rentalmobil;
    
    @GetMapping("/rentalmobil")
    public List<Mobil> getAllMobil(){
    return rentalmobil.findAll();
    }
    
    @GetMapping ("/rentalmobil/{idmobil}")
    public Mobil getErialbById(@PathVariable String idmobil){
    return rentalmobil.findById(idmobil).get();
    }
    
    @PostMapping ("/rentalmobil")
    public Mobil saveMobilDetails(@RequestBody Mobil c){
    return rentalmobil.save(c);
    }
    
    @PutMapping("/rentalmobiljogja")
    public Mobil updateMobil(@RequestBody Mobil c){
    return rentalmobil.save(c);
    }
    
    @DeleteMapping("/rentalmobiljogja/{idmobil}")
    public ResponseEntity<HttpStatus> deleteMobilById(@PathVariable String idmobil){
    rentalmobil.deleteById(idmobil);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
