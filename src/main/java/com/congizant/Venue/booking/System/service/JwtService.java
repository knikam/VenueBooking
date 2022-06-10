package com.congizant.Venue.booking.System.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.congizant.Venue.booking.System.model.User;
import com.congizant.Venue.booking.System.repository.UserRepository;
import com.congizant.Venue.booking.System.util.JwtRequest;
import com.congizant.Venue.booking.System.util.JwtResponse;
import com.congizant.Venue.booking.System.util.JwtUtil;


@Service
public class JwtService implements UserDetailsService{

	@Autowired
	private UserRepository userReop;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	public JwtResponse createJwtToken(JwtRequest jwtRequest) throws Exception{
		String userName = jwtRequest.getUserName();
		String userPassword = jwtRequest.getUserPassword();
		authenticate(userName, userPassword);
		final UserDetails userDetaisl = loadUserByUsername(userName);
		String newGeneratedToken = jwtUtil.generateToken(userDetaisl);
		User user = userReop.findById(userName).get();
		return new JwtResponse(user, newGeneratedToken);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userReop.findById(username).get();
		if (user != null) {
			return new org.springframework.security.core.userdetails.User(user.getLoginId(), user.getPassword(),getAuthorities());
		} else {
			throw new UsernameNotFoundException("Username is not valid");
		}
	}
	
	private Set<SimpleGrantedAuthority> getAuthorities() {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
			authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		return authorities;
	}
	
	private void authenticate(String userName, String userPassword) throws Exception{
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userName, userPassword));
		} catch (DisabledException e) {
			throw new Exception("User is disabled");
		} catch(BadCredentialsException e) {
			throw new Exception("Bad credentials from user");
		}
	}
	
}