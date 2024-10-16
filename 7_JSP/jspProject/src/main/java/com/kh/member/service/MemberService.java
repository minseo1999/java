package com.kh.member.service;

import java.sql.Connection;

import com.kh.member.model.dao.MemberDao;
import com.kh.member.model.vo.Member;
import static com.kh.common.JDBCTemplate.*;

public class MemberService {
	
	public Member loginMember(String userId, String userPwd) {
		Connection conn = getConnection();
		Member m = new MemberDao().loginMember(conn, userId, userPwd);
		
		close(conn);
		return m;
	}

	public int insertMember(Member m) {
		Connection conn = getConnection();
		int result = new MemberDao().insertMember(conn,m);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}

	public Member updatePwdMember(String userId, String userPwd, String userupdatePwd) {
		// TODO Auto-generated method stub
		Connection conn = getConnection();
		int result = new MemberDao().updatePwd(conn, userId, userPwd, userupdatePwd);
		
		Member updateMember = null;
		if(result > 0) {
			commit(conn);
			
			updateMember = new MemberDao().selectMember(conn, userId);
		} else {
			rollback(conn);
		}
		return updateMember;
	}

	public int deleteMember(String userId, String userPwd) {
		Connection conn = getConnection();
		int result = new MemberDao().deleteMember(conn, userId, userPwd);
		Member deleteMember = null;
		
		if(result > 0) {
			commit(conn);
		} else {
			rollback(conn);
		}
		return result;
	}

	public Member updateMember(Member m) {
		Connection conn = getConnection();
		
		int result = new MemberDao().updateMember(conn, m);
		Member updateMember = null;
		if(result > 0) {
			commit(conn);
			
			updateMember = new MemberDao().selectMember(conn, m.getUserId());
		} else {
			rollback(conn);
		}
		return updateMember;
	}

	public int idCheck(String idCheck) {
		Connection conn = getConnection();
		
		int count = new MemberDao().idCheck(conn, idCheck);
		
		return count;
	}
	
	
}
