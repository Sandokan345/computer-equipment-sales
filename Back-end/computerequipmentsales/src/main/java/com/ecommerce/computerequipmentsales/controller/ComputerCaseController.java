package com.ecommerce.computerequipmentsales.controller;

import com.ecommerce.computerequipmentsales.constants.ApiEndpoints;
import com.ecommerce.computerequipmentsales.dto.ComputerCaseDTO;
import com.ecommerce.computerequipmentsales.response.ApiResponse;
import com.ecommerce.computerequipmentsales.service.ComputerCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = ApiEndpoints.COMPUTER_CASE_API_URL)
public class ComputerCaseController {

    @Autowired
    private ComputerCaseService computerCaseService;

    @GetMapping("/list")
    public ApiResponse findAll(){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", computerCaseService.findAll());
    }

    @PostMapping("/save")
    public ApiResponse save(@RequestBody ComputerCaseDTO computerCaseDTO){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", computerCaseService.save(computerCaseDTO));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        computerCaseService.delete(id);
    }

    @PutMapping("/update")
    public ApiResponse update(@RequestBody ComputerCaseDTO computerCaseDTO){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", computerCaseService.save(computerCaseDTO));
    }
}
