package com.auxibudget.api.configuration;

import com.auxibudget.api.controller.ProfileController;
import com.auxibudget.api.repository.ProfileRepository;
import com.auxibudget.api.service.ProfileService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    /* Repositories */
    @Bean
    public ProfileRepository profileRepository() {
        return new ProfileRepository();
    }

    /* Services */
    @Bean
    public ProfileService profileService(ProfileRepository profileRepository) {
        return new ProfileService(profileRepository);
    }

    /* Controllers */
    @Bean
    public ProfileController profileController(ProfileService profileService) {
        return new ProfileController(profileService);
    }
}
