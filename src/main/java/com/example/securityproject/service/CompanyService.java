package com.example.securityproject.service;

import com.example.securityproject.model.Company;
import com.example.securityproject.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository repository;

    public List<Company> getAllCompanies() {
        return repository.findAll();
    }

    public void saveCompany(Company company) {
        repository.save(company);
    }

    public Company getByIdCompany(Long id) {
        return repository.findById(id).get();
    }

    public void deleteByIdCompany(Long id) {
        repository.deleteById(id);
    }

    public void updateCompany(Company company, Long id) {
        repository.getById(id);
        repository.save(company);
    }
}
