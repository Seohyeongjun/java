package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.BoardDAO;
import DTO.BoardDTO;

public class BoardPage implements MainActive{

	@Override
	public String action(HttpServletRequest request, HttpServletResponse response) {
		
		BoardDAO dao=new BoardDAO();
		String keyWord = request.getParameter("word");	// 검색어 가져오기		
		if(keyWord == null) keyWord="";
		
		// 페이징
		int pageNum=1;	// 현재 페이지 번호
		if(request.getParameter("page")!=null) {	// 페이지 번호 2번 이상 클릭 시
			pageNum = Integer.parseInt(request.getParameter("page"));
		}
		
		int total = dao.totalCount(keyWord);
		int skip = 5;	// 화면에 출력되는 페이징 번호 갯수
		int pagePost = 10; // 한 페이지에 게시글 몇 개?
		int pageTotalNum = total/pagePost;	// 총 페이지 수 (총 게시글 수 /한 페이지 게시글 수)
		if(total%pagePost !=0) pageTotalNum++;	// ( 현재 페이지 포함이기 때문에 +1한다. 21개의 게시글이라면 3페이지(10개씩*2+1)
		int startPage = 1;	// 시작화면 시작 번호
		int endPage = pageTotalNum>skip?skip:pageTotalNum;	// 페이징 마지막 번호
		if(pageTotalNum>skip &&  pageNum>=(skip/2+1)) {	// 페이지 번호의 위치를 이동시키면서 현재 페이지 번호 가운데 
			startPage = pageNum -2;
			endPage = pageTotalNum>pageNum+2 ? pageNum+2 : pageTotalNum;
		}
				
		//게시글 목록 가져오기, 검색 결과
		int start=(pageNum-1)*10;		// 한 페이지에 게시글 10개씩 보이기 위함
		List<BoardDTO> list = dao.findAll(start, keyWord);	//전체 게시글 가져오기(findAll()), 계산된 한 페이지에 10개씩 보이게 함findAll(start)
		
		
		
		request.setAttribute("startPage", startPage);
		request.setAttribute("endPage", endPage);
		request.setAttribute("pageNum", pageNum);
		request.setAttribute("list", list);
		
		return "board/board.jsp";
	}

}
