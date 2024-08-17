package controller;

import java.io.IOException; 
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import dao.BoardDAO;
import dto.Board;
import java.util.*;

@WebServlet("/boardList")
public class boardList extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int currentPage = 1; // Default page
        int recordsPerPage = 10; // Default records per page

        try {
            String currentPageParam = request.getParameter("currentPage");
            String recordsPerPageParam = request.getParameter("recordsPerPage");

            if (currentPageParam != null && !currentPageParam.isEmpty()) {
                currentPage = Integer.parseInt(currentPageParam);
            }

            if (recordsPerPageParam != null && !recordsPerPageParam.isEmpty()) {
                recordsPerPage = Integer.parseInt(recordsPerPageParam);
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred: " + e.getMessage());
        }

        BoardDAO dao = BoardDAO.getInstance();
        List<Board> boardlist = dao.selectAllBoard(currentPage, recordsPerPage);
        request.setAttribute("boardlist", boardlist);

        int count = dao.getCount();
        int npage = count / recordsPerPage;
        if (count % recordsPerPage > 0) {
            npage++;
        }

        request.setAttribute("npage", npage);
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("recordsPerPage", recordsPerPage);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/community.jsp");
        dispatcher.forward(request, response);
    }
}
