package com.talys.backend.controllers;


import com.talys.backend.entities.CardDetails;

import com.talys.backend.services.CardDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/card")
public class CardDetailsController {

    @Autowired
    private CardDetailsService cardDetailsService;


    @GetMapping
    public List<CardDetails> getAllCardDetails() {
        System.out.println("get all !!!!!!!");
        List<CardDetails> list = cardDetailsService.getAllCardDetails();
        System.out.println(list);
        return list;
    }

    @GetMapping("/{cardId}")
    public ResponseEntity<CardDetails> getCardDetailsById(@PathVariable String cardId) {
        Optional<CardDetails> cardDetails = cardDetailsService.getCardDetailsById(cardId);
        if (cardDetails.isPresent()) {
            return ResponseEntity.ok(cardDetails.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public CardDetails createCardDetails(@RequestBody CardDetails cardDetails) {
        System.out.println("debut create !!!!!");
        return cardDetailsService.createCardDetails(cardDetails);
    }

    @PutMapping("/{cardId}")
    public ResponseEntity<CardDetails> updateCardDetails(@PathVariable String cardId, @RequestBody CardDetails cardDetailsDetails) {
        Optional<CardDetails> updatedCardDetails = cardDetailsService.updateCardDetails(cardId, cardDetailsDetails);
        if (updatedCardDetails.isPresent()) {
            return ResponseEntity.ok(updatedCardDetails.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{cardId}")
    public ResponseEntity<Void> deleteCardDetails(@PathVariable String cardId) {
        if (cardDetailsService.deleteCardDetails(cardId)) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
