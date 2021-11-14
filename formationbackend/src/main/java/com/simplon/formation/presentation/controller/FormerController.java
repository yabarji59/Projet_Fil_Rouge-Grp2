package com.simplon.formation.presentation.controller;

import java.util.List;
import org.apache.commons.lang3.StringUtils;

import com.simplon.formation.business.services.interfaces.IFormerService;
import com.simplon.formation.presentation.model.FormerDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FormerController {

    @Autowired
    IFormerService formerService;
<<<<<<< HEAD
=======
    
>>>>>>> develop
    public FormerController(IFormerService formerService){
        this.formerService=formerService;
    }

        @GetMapping({ "/formers" })
        public List<FormerDto> list(@RequestParam(required = false) String name) {
            if (StringUtils.isEmpty(name)) {
                return formerService.getAllFormers();
            }
<<<<<<< HEAD
            return formerService.getAllFormers();   
         }
=======
            return formerService.findFormerByName(name)  ; }
>>>>>>> develop

         @GetMapping({ "/formers/{name}" })
         public FormerDto getByName(@PathVariable String formerName) {
          FormerDto formerDto = formerService.findFormerByName(formerName);
          return formerDto;
         }

         @PostMapping({ "/formers" })
	public void save(@RequestBody FormerDto formerDto) {
		this.formerService.createFormer(formerDto);
    }

    @PutMapping("/formers/{id}")
	public void update(@PathVariable String formerName, @RequestBody FormerDto formerDto) {
		FormerDto currentFormerDto = formerService.findFormerByName(formerName);
		if (currentFormerDto != null) {
			formerService.updateFormer(formerName, formerDto);
		} else {
			formerService.createFormer(formerDto);
		}
    }
}


    
 


    