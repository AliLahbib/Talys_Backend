package com.talys.backend.services;

import com.talys.backend.dto.SignupRequest;
import com.talys.backend.entities.User;
import org.springframework.stereotype.Repository;

public interface AuthService {
    User createUser(SignupRequest signupRequest);
}
