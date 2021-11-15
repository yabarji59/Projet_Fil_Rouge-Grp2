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
import org.springframework.web.bind.annotation.DeleteMapping;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class FormerController {

    @Autowired
    IFormerService formerService;
    public FormerController(IFormerService formerService){
        this.formerService=formerService;
    }

        @GetMapping({ "/formers" })
        public List<FormerDto> list(@RequestParam(required = false) String name) {
            if (StringUtils.isEmpty(name)) {
                return formerService.getAllFormers();
            }
            return formerService.getAllFormers();   
         }

         @GetMapping({ "/formers?name={name}" })
         public List<FormerDto> findFormerByName (String formerName)  {
             List<FormerDto> formers = formerService.findFormerByName(formerName);
             return formers;
            
         }
         @GetMapping({ "/formers/{id}" })
         public FormerDto findFormerById(@PathVariable Long id) {
             FormerDto formerDto = formerService.findFormerById(id);
             return formerDto;
         }

         @PostMapping({ "/formers" })
	public void save(@RequestBody FormerDto formerDto) {
		this.formerService.createFormer(formerDto);
    }

    @PutMapping("/formers/{id}")
	public void update(@PathVariable Long id, @RequestBody FormerDto formerDto) {
		FormerDto currentFormerDto = formerService.findFormerById(id);
		if (currentFormerDto != null) {
			formerService.updateFormer(id, formerDto);
		} else {
			formerService.createFormer(formerDto);
		}
    }
    @DeleteMapping("/formers/{id}")
    public void delete(@PathVariable Long id) {
        formerService.deleteFormer(id);
    }
}


    
 


    