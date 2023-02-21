package peaksoft.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import peaksoft.model.Company;
import peaksoft.service.CompanyService;

@Controller
@RequestMapping("/companies")
public class CompanyApi {

    private final CompanyService companyService;
    @Autowired
    public CompanyApi(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/new")
    public String getAllCompanies(Model model){
        model.addAttribute("companies", companyService.getAllCompanies());
        return "mainPage";
    }
    public String createCompany(Model model){
        model.addAttribute("newCompany",new Company());
        return "newCompany";
    }
    public String saveCompany(){
        return "";
    }

}
