package servlet;

import beans.BeanCursoJsp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final long serialVersionUI = 1L;

    public LoginServlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BeanCursoJsp beanCursoJsp = new BeanCursoJsp();

        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        RequestDispatcher dispatcher;

        if (beanCursoJsp.validarLoginSenha(login, senha)) {
            dispatcher = req.getRequestDispatcher("acesso_liberado.jsp");
        } else {
            dispatcher = req.getRequestDispatcher("acesso_negado.jsp");
        }

        //Outro exemplo para o IF com Ternario
//        dispatcher = beanCursoJsp.validarLoginSenha(login, senha)
//                ? req.getRequestDispatcher("acesso_liberado.jsp")
//                : req.getRequestDispatcher("acesso_negado.jsp");

        dispatcher.forward(req, resp);
    }
}
