package com.ecommerce.computerequipmentsales.controller;

import com.ecommerce.computerequipmentsales.constants.ApiEndpoints;
import com.ecommerce.computerequipmentsales.dto.ComputerCaseDTO;
import com.ecommerce.computerequipmentsales.response.ApiResponse;
import com.ecommerce.computerequipmentsales.service.ComputerCaseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = ApiEndpoints.COMPUTER_CASE_API_URL)
public class ComputerCaseController {


    private final ComputerCaseService computerCaseService;

    @GetMapping("/test1")
    public void test1(@RequestParam int data){
        System.out.println("hello1");
    }

    @GetMapping("/{data}")
    public void test2(@PathVariable("data") int data){
        System.out.println("hello2");
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/list")
    public ApiResponse findAll(){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", computerCaseService.findAll());
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/save")
    public ApiResponse save(@RequestBody ComputerCaseDTO computerCaseDTO){
        return new ApiResponse(HttpStatus.CREATED, "SUCCESS", computerCaseService.save(computerCaseDTO));
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        computerCaseService.delete(id);
    }

    @PutMapping("/update")
    public ApiResponse update(@RequestBody ComputerCaseDTO computerCaseDTO){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", computerCaseService.update(computerCaseDTO));
    }
}
