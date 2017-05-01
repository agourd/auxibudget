package com.auxibudget.api.repository;

import com.auxibudget.api.domain.Profile;
import com.auxibudget.api.domain.QProfile;
import com.querydsl.core.types.EntityPath;

public class ProfileRepository extends AbstractRepository<Long, Profile> {

    protected EntityPath<Profile> getEntityPath() {
        return QProfile.profile;
    }

    public Profile getProfile(Long id) {
        return getSession().get(Profile.class, id);
    }
}
