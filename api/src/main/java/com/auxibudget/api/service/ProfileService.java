package com.auxibudget.api.service;

import com.auxibudget.api.domain.Profile;
import com.auxibudget.api.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class ProfileService {

    private ProfileRepository repository;

    @Autowired
    public ProfileService(ProfileRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Profile getProfile(Long id) {
        return repository.getProfile(id);
    }
}
