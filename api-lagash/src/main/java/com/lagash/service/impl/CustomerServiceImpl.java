package com.lagash.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.lagash.model.Customer;
import com.lagash.model.CustomerList;
import com.lagash.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

    public List<Customer> getCustomer() {
        RestTemplate restTemplate = new RestTemplate();
        CustomerList cust = restTemplate.getForObject("http://www.mocky.io/v2/5e14cb0f2d00004b00167396",
                CustomerList.class);
        List<Customer> customerList = new ArrayList<Customer>();
        if (cust != null) {
            customerList.add(cust.getCustomer1());
            customerList.add(cust.getCustomer2());
            customerList.add(cust.getCustomer3());
            customerList.add(cust.getCustomer4());
            customerList.add(cust.getCustomer5());
            customerList.add(cust.getCustomer6());
            customerList.add(cust.getCustomer7());
            customerList.add(cust.getCustomer8());
            customerList.add(cust.getCustomer9());
            customerList.add(cust.getCustomer10());
        }
        return customerList;

    }

}
