package com.example.services;

import com.example.entities.User;
import com.example.model.SecurityUser;
import com.example.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class JpaUserDetailsService implements UserDetailsService {

  private final UserRepository userRepository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    return
        new SecurityUser(
            userRepository.findUserByUsername(username)
                          .orElseThrow(() -> new UsernameNotFoundException("Username " + username + " not found!")
                          )
    );
  }

  public void addUser(User user) {
    user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
    userRepository.save(user);
  }
}
