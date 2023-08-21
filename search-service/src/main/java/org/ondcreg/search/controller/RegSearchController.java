package org.ondcreg.search.controller;

import org.ondcreg.search.persistence.entity.NetworkParticipant;
import org.ondcreg.search.persistence.entity.Product;
import org.ondcreg.search.service.ProdService;
import lombok.extern.slf4j.Slf4j;
import org.ondcreg.search.service.RegSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

// For simplicity, have clubbed all methods in this controller
@RestController
@Slf4j
@RequestMapping("/demo/search")
public class RegSearchController {

    @Autowired
    private ProdService prodService;

    @Autowired
    private RegSearchService searchService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/product/{prodId}")
    public ResponseEntity<Product> getProduct(@PathVariable("prodId") Integer prodId) {
        log.info("Start getProduct : "+ prodId);
        Product getResponse = null;
        ResponseEntity<Product> ret = null;
        Optional<Product> prod = null;

        if(prodId != null ) {
            prod = prodService.getProduct(prodId);
            if (prod.isPresent()) {
                getResponse = prod.get();
                log.info("Product info " +getResponse.getProdName());
                ret = new ResponseEntity<>(getResponse, HttpStatus.OK);
            }
            else {
                ret = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        }
        return ret;
    }

    @GetMapping("/np/{npId}")
    public ResponseEntity<NetworkParticipant> getNP(@PathVariable("npId") String npId) {
        log.info("Start getNP : " + npId);
        Optional<NetworkParticipant> np;
        ResponseEntity<NetworkParticipant> response = null;
        long ts = System.currentTimeMillis();

        if(npId != null ) {
            np = searchService.getNP(npId);
            if (np.isPresent()) {
                //getResponse = EmpGetResponse.builder().emp(emp.get()).build();
                log.info("NP info " +np.get().getType());
                response = new ResponseEntity<>(np.get(), HttpStatus.OK);
            }
            else {
                /*Error err = Error.builder()
                        .errorCode(HttpStatus.NOT_FOUND.value())
                        .errorDesc("Employee does not exist.").build();
                getResponse = EmpGetResponse.builder()
                        .errList(Collections.singletonList(err)).build();*/
                response = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
            }
        }
        else {
            log.error("NP id is mandatory");
            /*Error err = Error.builder()
                    .errorCode(HttpStatus.BAD_REQUEST.value())
                    .errorDesc("Employee id needed in request.").build();
            getResponse = EmpGetResponse.builder()
                    .errList(Collections.singletonList(err)).build();*/
            response = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        log.info("Time taken " +(System.currentTimeMillis() - ts));
        return response;
    }

    @GetMapping(path="/np", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<NetworkParticipant>> getNPByDomain(@RequestParam(value="domain",
                                                            required=true) String  domainId) {
        log.info("Start getNPByDomain : " + domainId);
        ResponseEntity<List<NetworkParticipant>> response = null;
        List<NetworkParticipant> npList = null;
        long ts = System.currentTimeMillis();

        npList = searchService.getNPByDomain(domainId);
        if(npList != null ) {
            log.info("NP info " +npList.size());
            response = new ResponseEntity<>(npList, HttpStatus.OK);
        }
        else {
            response = new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        log.info("Time taken " +(System.currentTimeMillis() - ts));
        return response;
    }
}
