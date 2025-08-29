package com.example.Mapping.Controller;

import com.example.Mapping.Entity.Customer;
import com.example.Mapping.Repository.CustomerRepository;
import com.example.Mapping.Repository.ItemRepository;
import com.example.Mapping.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class MappingController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ItemRepository itemRepository;
    @PostMapping("/")
    public Customer save(@RequestBody Customer customer)
    {
        return customerRepository.save(customer);
    }
    @GetMapping
    public List<Customer> getdetils()
    {
        return customerService.get();
    }
    @GetMapping("{id}")
    public Optional<Customer> findby(int id)
    {
        return customerService.findById(id);
    }

}
