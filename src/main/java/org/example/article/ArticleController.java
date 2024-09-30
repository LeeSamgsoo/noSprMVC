package org.example.article;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class ArticleController extends HttpServlet {
    private final ArticleService articleService = new ArticleService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();  // /view/1, /edit/2 같은 경로

        if (pathInfo != null) {
            String[] pathParts = pathInfo.split("/");
            if (pathParts.length > 1) {
                String action = pathParts[1];  // view, edit 등 액션 추출
                switch (action) {
                    case "list":
                        articleList(req, resp);  // 사용자 ID 전달
                        break;
                    default:
                        articleList(req, resp);
                        break;
                }
            }
        } else {
            articleList(req, resp);  // 기본 동작
        }
    }

    private void articleList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Article> articles = this.articleService.list();

        // 사용자 목록을 요청에 추가 (JSP에서 참조 가능하도록)
        req.setAttribute("articles", articles);

        // JSP로 포워딩
        RequestDispatcher dispatcher = req.getRequestDispatcher("article_list.jsp");
        dispatcher.forward(req, resp);
    }
}
