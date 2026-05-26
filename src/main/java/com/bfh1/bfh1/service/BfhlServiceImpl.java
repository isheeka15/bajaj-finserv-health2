package com.bfh1.bfh1.service;

import com.bfh1.bfh1.dto.BfhlRequest;
import com.bfh1.bfh1.dto.BfhlResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BfhlServiceImpl implements BfhlService
{
    @Override
    public BfhlResponse processData(BfhlRequest request)
    {
        List<String> evenNumbers = new ArrayList<>();
        List<String> oddNumbers = new ArrayList<>();
        List<String> alphabets = new ArrayList<>();
        List<String> specialCharacters = new ArrayList<>();

        StringBuilder allAlphabets = new StringBuilder();
        int sum = 0;

        if(request == null || request.getData() == null)
        {
            request = new BfhlRequest();
            request.setData(new ArrayList<>());
        }

        for(String item : request.getData())
        {
            if(item.matches("-?\\d+"))
            {
                int num = Integer.parseInt(item);

                if(num % 2 == 0)
                {
                    evenNumbers.add(item);
                }
                else
                {
                    oddNumbers.add(item);
                }

                sum = sum + num;
            }
            else if(item.matches("[a-zA-Z]+"))
            {
                alphabets.add(item.toUpperCase());
                allAlphabets.append(item);
            }
            else
            {
                specialCharacters.add(item);
            }
        }

        String reversed = allAlphabets.reverse().toString();
        StringBuilder concatString = new StringBuilder();

        for(int i = 0; i < reversed.length(); i++)
        {
            char ch = reversed.charAt(i);

            if(i % 2 == 0)
            {
                concatString.append(Character.toUpperCase(ch));
            }
            else
            {
                concatString.append(Character.toLowerCase(ch));
            }
        }

        BfhlResponse response = new BfhlResponse();

        response.setIs_success(true);
        response.setUser_id("isheeka_soni_15082003");
        response.setEmail("soniisheeka230376@acropolis.in");
        response.setRoll_number("0827CY231071");

        response.setOdd_numbers(oddNumbers);
        response.setEven_numbers(evenNumbers);
        response.setAlphabets(alphabets);
        response.setSpecial_characters(specialCharacters);
        response.setSum(String.valueOf(sum));
        response.setConcat_string(concatString.toString());

        return response;
    }
}