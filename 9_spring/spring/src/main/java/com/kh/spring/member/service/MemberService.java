package com.kh.spring.member.service;

import com.kh.spring.member.model.vo.Member;

public interface MemberService {

	Member loginMember(Member m);

	int idCheck(String checkId);

	int insertMEmber(Member m);

	int updateMember(Member m);

	int deleteMember(String userId);
}
