package com.tonyycruz.credit.application.system.service.impl

import com.tonyycruz.credit.application.system.entity.Customer
import com.tonyycruz.credit.application.system.repository.CustomerRepository
import com.tonyycruz.credit.application.system.service.ICustomerService
import org.springframework.stereotype.Service

@Service
class CustomerService(private val customerRepository: CustomerRepository) : ICustomerService {

    override fun save(customer: Customer): Customer {
        return customerRepository.save(customer)
    }

    override fun findById(id: Long): Customer {
        return customerRepository.findById(id).orElseThrow {
            throw RuntimeException("Id '$id' was not found.")
        }
    }

    override fun delete(id: Long) {
        customerRepository.deleteById(id)
    }
}

