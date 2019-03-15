package com.nit.order_library.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.nit.order_library.bean.jpa.MembersEntity;
import com.nit.order_library.bean.jpa.RolesEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SecurityMember extends User {
	private static final String ROLE_PREFIX = "ROLE_";
	private static final long serialVersionUID = 1L;
	
	private MembersEntity member;
	
	public SecurityMember(MembersEntity member) {
		super(member.getLoginName(), member.getPassword(), makeGrantedAuthority(member.getListOfRoles()));
		this.member = member;
	}
	
	private static List<GrantedAuthority> makeGrantedAuthority(List<RolesEntity> roles){
		List<GrantedAuthority> list = new ArrayList<>();
		roles.forEach(role -> list.add(new SimpleGrantedAuthority(ROLE_PREFIX + role.getRoleName())));
		return list;
	}

}