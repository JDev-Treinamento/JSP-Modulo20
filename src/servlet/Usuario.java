package servlet;

import beans.BeanCursoJsp;
import dao.DaoUsuario;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/SalvarUsuario")
public class Usuario extends HttpServlet {

    private static final long serialVersionUI = 1L;

    private DaoUsuario daoUsuario = new DaoUsuario();

    public Usuario() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        BeanCursoJsp usuario = new BeanCursoJsp();
        usuario.setLogin(login);
        usuario.setSenha(senha);


        this.daoUsuario.salvarUsuario(usuario);

        try {
            RequestDispatcher view = req.getRequestDispatcher("/cadastroUsuario.jsp");
            req.setAttribute("usuarios", this.daoUsuario.listar());

            view.forward(req, resp);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
