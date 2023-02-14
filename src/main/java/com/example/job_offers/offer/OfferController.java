package com.example.job_offers.offer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping(path="/offer") // This means URL's start with /demo (after Application path)
public class OfferController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private OfferRepository offerRepository;

    @PostMapping(path="/add") // Map ONLY POST Requests
    public @ResponseBody String addNewOffer (@RequestParam String name) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Offer new_offer = new Offer();
        new_offer.setName(name);
        offerRepository.save(new_offer);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Offer> getAllOffers() {
        // This returns a JSON or XML with the users
        return offerRepository.findAll();
    }
}