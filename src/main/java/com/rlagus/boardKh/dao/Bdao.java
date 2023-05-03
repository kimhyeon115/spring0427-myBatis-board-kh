package com.rlagus.boardKh.dao;

import java.util.ArrayList;

import com.rlagus.boardKh.dto.FbMemberDto;
import com.rlagus.boardKh.dto.FreeBoardDto;

public interface Bdao {
	
	// 멤버 관련 메소드
	public void joinMemberDao(String mid, String mpw, String mname, String memail);	// 회원가입
	public int checkIdDao(String mid);												// 회원가입여부 체크(아이디 중복여부 체크)
	public int checkIdPwDao(String mid, String mpw);								// 회원 아이디와 비밀번호 일치여부 체크
	
	// 게시판 관련 메소드
	public FbMemberDto getMemberInfo(String mid);									// 아이디로 검색하여 회원정보 가져오기
	public void writeDao(String mid, String mname, String ftitle, String fcontent);	// 게시판에 작성한 정보를 DB에 저장하기
	public ArrayList<FreeBoardDto> listDao();										// 게시판에 작성글 리스트 정보 가져오기(여러개,ArrayList사용)
	public int countList();															// DB에 저장된 글의 개수를 가져오기
	public FreeBoardDto contentViewDao(String fnum);								// DB에서 특정글 하나만 가져오기
	public void deleteDao(String fnum);												// DB에서 특정글 하나를 삭제하기
	public void uphitDao(String fnum);												// 특정 번호의 글 조회수 1증가
}
