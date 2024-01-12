package com.tonyycruz.credit.application.system.dto

import com.tonyycruz.credit.application.system.entity.Address
import com.tonyycruz.credit.application.system.entity.Customer
import java.math.BigDecimal

data class CustomerViewDto(
    val firstName: String,
    val lastName: String,
    val cpf: String,
    val income: BigDecimal,
    val email: String,
    val zipCode: String,
    val street: String
) {
    constructor(customer: Customer) : this(
        firstName = customer.firstName,
        lastName = customer.lastName,
        cpf = customer.cpf,
        income = customer.income,
        email = customer.email,
        zipCode = customer.address.zipCode,
        street = customer.address.street
    )
}
