package com.ecommerce.computerequipmentsales.controller;

import com.ecommerce.computerequipmentsales.constants.ApiEndpoints;
import com.ecommerce.computerequipmentsales.dto.DisplayCardDTO;
import com.ecommerce.computerequipmentsales.response.ApiResponse;
import com.ecommerce.computerequipmentsales.service.DisplayCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiEndpoints.DISPLAY_CARD_API_URL)
public class DisplayCardController {

    @Autowired
    private DisplayCardService displayCardService;

    @GetMapping("/list")
    public ApiResponse findAll(){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", displayCardService.findAll());
    }

    @PostMapping("/save")
    public ApiResponse save(@RequestBody DisplayCardDTO displayCardDTO){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", displayCardService.save(displayCardDTO));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        displayCardService.delete(id);
    }

    @PutMapping("/update")
    public ApiResponse update(@RequestBody DisplayCardDTO displayCardDTO){

        return new ApiResponse(HttpStatus.OK, "SUCCESS", displayCardService.save(displayCardDTO));
    }
}
