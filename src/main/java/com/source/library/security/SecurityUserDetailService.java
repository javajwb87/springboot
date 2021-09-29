package com.source.library.security;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.source.library.bean.jpa.MembersEntity;
import com.source.library.data.repository.jpa.MembersJpaRepository;

@Service
public class SecurityUserDetailService implements UserDetailsService 
{
	
    @Autowired
	private MembersJpaRepository memberRepository;
    
    
    public UserDetails loadUserByUsername(String loginName) throws UsernameNotFoundException {

        Optional<MembersEntity> member = memberRepository.findByLoginName(loginName);
        
        if (!member.isPresent())
        	throw new UsernameNotFoundException("Invalid username or password.");
        
        return new SecurityMember(member.get());
	}

}
