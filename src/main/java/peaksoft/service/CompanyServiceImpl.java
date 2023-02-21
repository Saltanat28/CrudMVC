package peaksoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Company;
import peaksoft.repository.CompanyRepository;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepository repository;
    @Autowired
    public CompanyServiceImpl(CompanyRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Company company) {
        repository.save(company);
    }

    @Override
    public List<Company> getAllCompanies() {
        return repository.getAllCompanies();
    }

    @Override
    public Company getCompanyById(Long id) {
        return null;
    }

    @Override
    public void deleteCompany(Long id) {

    }

    @Override
    public void updateCompany(Long id, Company updatedCompany) {

    }
}
