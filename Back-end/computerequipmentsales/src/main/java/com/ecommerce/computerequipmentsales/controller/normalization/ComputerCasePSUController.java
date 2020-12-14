package com.ecommerce.computerequipmentsales.controller.normalization;

import com.ecommerce.computerequipmentsales.constants.ApiEndpoints;
import com.ecommerce.computerequipmentsales.dto.normalizationDTO.ComputerCasePSUDTO;
import com.ecommerce.computerequipmentsales.response.ApiResponse;
import com.ecommerce.computerequipmentsales.service.normalization.ComputerCasePSUService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = ApiEndpoints.COMPUTER_CASE_PSU_API_URL)
public class ComputerCasePSUController {

    @Autowired
    private ComputerCasePSUService computerCasePSUService;

    @GetMapping("/list")
    public ApiResponse findAll(){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", computerCasePSUService.findAll());
    }

    @PostMapping("/save")
    public ApiResponse save(@RequestBody ComputerCasePSUDTO computerCasePSUDTO){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", computerCasePSUService.save(computerCasePSUDTO));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        computerCasePSUService.delete(id);
    }

    @PutMapping("/update")
    public ApiResponse update(@RequestBody ComputerCasePSUDTO computerCasePSUDTO){
        return new ApiResponse(HttpStatus.OK, "SUCCESS", computerCasePSUService.save(computerCasePSUDTO));
    }
}
