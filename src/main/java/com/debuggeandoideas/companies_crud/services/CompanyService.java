package com.debuggeandoideas.companies_crud.services;

import com.debuggeandoideas.companies_crud.entities.Company;

public interface CompanyService {

    Company create(Company company);

    Company readByName(String name);

    Company update(Company company, String name);

    void delete(String name);
}
