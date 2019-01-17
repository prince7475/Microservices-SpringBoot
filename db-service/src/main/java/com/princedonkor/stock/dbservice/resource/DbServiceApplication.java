package com.princedonkor.stock.dbservice.resource;

import com.princedonkor.stock.dbservice.respository.QuotesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/db") //Creating a rest endpoint all rest that comes in starting with rest/db will come to this folder
public class DbServiceApplication {

    private QuotesRepository quotesRepository; // We created an instance of our repository;

    @GetMapping("/{username}") // Our first end point is a get request to get user by name and we can get the path variable by using @PathVariable provided by spring
    public List<String> getQuotes(@PathVariable String username) {
        return quotesRepository.findByUserName(username)
            .stream()
            .map( quote -> quote.getQuotes())
            .collect(Collectors.toList())
        ;
        // our quoteRepository is getting our user by name in our database.
        // We only need the quotes so what we did was map and only return a list of quotes;
    }




}
