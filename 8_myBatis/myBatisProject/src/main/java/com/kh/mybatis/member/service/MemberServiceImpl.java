package com.kh.mybatis.member.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.mybatis.common.template.Template;
import com.kh.mybatis.member.model.dao.MemberDao;
import com.kh.mybatis.member.model.vo.Member;

public class MemberServiceImpl implements MemberService{
	
	private MemberDao mDao = new MemberDao();
	
	public Member loginMember(Member m) {
		SqlSession sqlSession = Template.getSqlSession();
		Member loginUser = mDao.loginMember(sqlSession, m);
		
		sqlSession.close();
		return loginUser;
	}

	@Override
	public int insertMember(Member m) {
		SqlSession sqlSession = Template.getSqlSession();
		int result = new MemberDao().insertMember(sqlSession, m);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		return result;
	}
}