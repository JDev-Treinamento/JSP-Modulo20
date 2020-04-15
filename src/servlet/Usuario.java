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
import java.util.Scanner;

@WebServlet(value = "/SalvarUsuario")
public class Usuario extends HttpServlet {

	private static final long serialVersionUI = 1L;

	private DaoUsuario daoUsuario = new DaoUsuario();

	public Usuario() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		try {
			String acao = req.getParameter("acao");

			String user = req.getParameter("user");


			if (acao.equalsIgnoreCase("delete")) {
				this.daoUsuario.delete(user);

				RequestDispatcher view = req.getRequestDispatcher("/cadastroUsuario.jsp");
				req.setAttribute("usuarios", this.daoUsuario.listar());

				view.forward(req, resp);

			} else if (acao.equalsIgnoreCase("editar")) {
				BeanCursoJsp beanCursoJsp = this.daoUsuario.consultar(user);


				RequestDispatcher view = req.getRequestDispatcher("/cadastroUsuario.jsp");
				req.setAttribute("user", beanCursoJsp);

				view.forward(req, resp);

			} else if (acao.equalsIgnoreCase("listartodos")) {

				RequestDispatcher view = req.getRequestDispatcher("/cadastroUsuario.jsp");
				req.setAttribute("usuarios", this.daoUsuario.listar());
				view.forward(req, resp);
			}


		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String acao = req.getParameter("acao");

		if (acao != null && !acao.equalsIgnoreCase("reset")) {
			try {
				RequestDispatcher view = req.getRequestDispatcher("/cadastroUsuario.jsp");
				req.setAttribute("usuarios", this.daoUsuario.listar());

				view.forward(req, resp);
			} catch (Exception e) {
				e.getStackTrace();
			}
		} else {
			String id = req.getParameter("id");
			String login = req.getParameter("login");
			String senha = req.getParameter("senha");
			String nome = req.getParameter("nome");

			BeanCursoJsp usuario = new BeanCursoJsp();
			usuario.setId(id.isEmpty() ? null : Long.parseLong(id));
			usuario.setLogin(login);
			usuario.setSenha(senha);
			usuario.setNome(nome);

			try {

				if (id == null || id.isEmpty() && !daoUsuario.validarLogin(login)) {
					req.setAttribute("msg", "Usuario já existe com mesmo login");
				}
				if (id == null || id.isEmpty() && daoUsuario.validarLogin(login)) {

					this.daoUsuario.salvarUsuario(usuario);
				} else if (id != null || id.isEmpty() && daoUsuario.validarLogin(login)) {
					this.daoUsuario.atualizar(usuario);
				}

				RequestDispatcher view = req.getRequestDispatcher("/cadastroUsuario.jsp");
				req.setAttribute("usuarios", this.daoUsuario.listar());

				view.forward(req, resp);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
	}

}
