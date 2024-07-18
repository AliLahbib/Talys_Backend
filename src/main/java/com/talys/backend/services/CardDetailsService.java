package com.talys.backend.services;
import com.talys.backend.entities.CardDetails;
import com.talys.backend.repository.CardDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CardDetailsService {

    @Autowired
    private CardDetailsRepository cardDetailsRepository;

    public List<CardDetails> getAllCardDetails() {
        return cardDetailsRepository.findAll();
    }

    public Optional<CardDetails> getCardDetailsById(String cardId) {
        return cardDetailsRepository.findById(cardId);
    }

    public CardDetails createCardDetails(CardDetails cardDetails) {
        return cardDetailsRepository.save(cardDetails);
    }

    public Optional<CardDetails> updateCardDetails(String cardId, CardDetails cardDetailsDetails) {
        return cardDetailsRepository.findById(cardId).map(cardDetails -> {
            cardDetails.setLastname(cardDetailsDetails.getLastname());
            cardDetails.setLocalityName(cardDetailsDetails.getLocalityName());
            cardDetails.setTown(cardDetailsDetails.getTown());
            cardDetails.setNumber(cardDetailsDetails.getNumber());
            cardDetails.setJob(cardDetailsDetails.getJob());
            cardDetails.setSex(cardDetailsDetails.getSex());
            cardDetails.setReligion(cardDetailsDetails.getReligion());
            cardDetails.setMaritalStatus(cardDetailsDetails.getMaritalStatus());
            cardDetails.setValidityDate(cardDetailsDetails.getValidityDate());
            cardDetails.setReleaseDate(cardDetailsDetails.getReleaseDate());
            cardDetails.setImage(cardDetailsDetails.getImage());
            cardDetails.setCode_qr(cardDetailsDetails.getCode_qr());
            return cardDetailsRepository.save(cardDetails);
        });
    }

    public boolean deleteCardDetails(String cardId) {
        return cardDetailsRepository.findById(cardId).map(cardDetails -> {
            cardDetailsRepository.delete(cardDetails);
            return true;
        }).orElse(false);
    }
}
