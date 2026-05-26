package com.bfh1.bfh1.controller;

import com.bfh1.bfh1.dto.BfhlRequest;
import com.bfh1.bfh1.dto.BfhlResponse;
import com.bfh1.bfh1.service.BfhlService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bfhl")
public class BfhlController
{
    @Autowired
    private BfhlService bfhlService;

    @PostMapping
    public BfhlResponse processData(@RequestBody BfhlRequest request)
    {
        return bfhlService.processData(request);
    }
}