package jaguars.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @RequestMapping(value="/accounts", method = RequestMethod.POST)
    public void postPerson(@RequestBody Account account) {
        accountRepository.save(account);
    }

    @RequestMapping(value="/accounts/{id}", method = RequestMethod.GET)
    public Account getPerson(@PathVariable String id) {
        return accountRepository.findOne(id);
    }

    @RequestMapping(value="/accounts", method = RequestMethod.GET)
    public List<Account> getAllAccounts() {
        return (List<Account>) accountRepository.findAll();
    }

    @RequestMapping(value = "/accounts/{id}", method = RequestMethod.DELETE)
    public void deletePerson(@PathVariable String id) {
        accountRepository.delete(id);
    }
}
