package com.sebastian.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sebastian.messenger.database.DatabaseClass;
import com.sebastian.messenger.model.Profile;

public class ProfileService {
	private Map<String, Profile> profiles;

	public ProfileService() {
		profiles = DatabaseClass.getProfiles();

		profiles.put("NombreProfile-yep", new Profile(1L, "NombreProfile-yep", "Sebastian", "Gonzalez"));
	}

	public Profile getProfile(String name) {
		return profiles.get(name);
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile addProfile(Profile profile) {

		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateProfile(Profile profile) {
		if (profile.getProfileName().isEmpty())
			return null;

		profiles.put(profile.getProfileName(), profile);
		return profile;

	}

	public Profile removeProfile(String profilename) {
		return profiles.remove(profilename);
	}

}
