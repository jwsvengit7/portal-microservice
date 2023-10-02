package com.service.authservice.web.config;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final RestTemplate restTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Implement logic to load user details from your data source
        // For example, you can retrieve user details from a database
        // Replace this with your actual user retrieval logic
        String userDetailsServiceUrl = "http://localhost:8167/api/student/users/" + username;
        User user = restTemplate.getForObject(userDetailsServiceUrl, User.class);

        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }

        // Convert the retrieved user details to UserDetails and return
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                user.getAuthorities()

                // Add roles/authorities here based on user's data
        );
    }
}
