package com.princedonkor.stock.dbservice.respository;

import com.princedonkor.stock.dbservice.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuotesRepository extends JpaRepository<Quote, Integer> {
    // This is the jpa repository that communicate with our data base, we
// we need to tell it what modal to use and in our case it is Quote and the id for each Quote is going to be an integer

    List<Quote> findByUserName(String username);
    //This is a custom repository method, spring boot already has a lot of default method, but it can not have every method,
    // But cool thing about spring is it allows us to create our own and depending on the method name. in our case we tell jpa
    // To find a user by their username and we pass in the user name as an argument.
}
