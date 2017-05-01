package com.auxibudget.api.controller;

import com.auxibudget.api.domain.Profile;
import com.auxibudget.api.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = {"/profile"})
public class ProfileController {

    private ProfileService service;

    @Autowired
    public ProfileController(ProfileService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Profile> getProfile(@RequestParam(name = "id") Long id) {
        Profile profile = service.getProfile(id);
        if(profile != null) {
            return new ResponseEntity<>(profile, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
