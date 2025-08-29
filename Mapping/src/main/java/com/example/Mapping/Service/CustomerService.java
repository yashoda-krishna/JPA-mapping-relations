package com.example.Mapping.Service;

import com.example.Mapping.Entity.Customer;
import com.example.Mapping.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public List <Customer> get()
    {
        return customerRepository.findAll();
    }
    public Optional<Customer> findById(int id)
    {
        return customerRepository.findById(id);
    }

}
