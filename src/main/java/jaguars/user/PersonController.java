package jaguars.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    PersonRepository prepo;

    @RequestMapping("/person")
    public void addPerson(@RequestBody Person p) {
        prepo.save(p);
    }

    @RequestMapping("person/{name}")
    public Person getPerson(@PathVariable String name) {
        return prepo.findOne(name);
    }
}
