package jaguars.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping("/account")
    public void addPerson(@RequestBody Account account) {
        accountRepository.save(account);
    }

    @RequestMapping("account/{id}")
    public Account getPerson(@PathVariable String id) {
        return accountRepository.findOne(id);
    }

}
