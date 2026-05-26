package com.bfh1.bfh1.service;

import com.bfh1.bfh1.dto.BfhlRequest;
import com.bfh1.bfh1.dto.BfhlResponse;

public interface BfhlService
{
    BfhlResponse processData(BfhlRequest request);
}