package com.example.HiddenGem.service;

import java.util.List;

import com.example.HiddenGem.entity.BoardC;


public interface BoardCService {
	public static final int COUNT_PER_PAGE = 2;	// 한 페이지당 글 목록의 갯수
	public static final int PAGE_PER_SCREEN = 10;	// 한 화면에 표시되는 페이지 갯수
	
	BoardC getBoardC(int bid);
	
	int getBoardCCount(String field, String query);
	
	List<BoardC> getBoardCList(int page, String field, String query);
	
	void insertBoardC(BoardC BoardC);
	
	void updateBoardC(BoardC BoardC);
	
	void deleteBoardC(int bid);
	
	void increaseViewCount(int bid);
	
	void increaseReplyCount(int bid);
	
	void increaseLikeCount(int bid);
	
	void updateLikeCount(int bid, int count);
	
}