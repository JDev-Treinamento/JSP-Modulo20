package dao;

import beans.BeanCursoJsp;
import connection.SingleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoUsuario {

    private Connection connection;

    public DaoUsuario() {
        this.connection = SingleConnection.getConnection();
    }

    public void salvarUsuario(BeanCursoJsp usuario) {

        String sql = "INSERT INTO USUARIO(login, senha) " +
                "VALUES (?,?)";

        try {
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1, usuario.getLogin());
            insert.setString(2, usuario.getSenha());

            insert.execute();
            connection.commit();
        } catch (Exception e) {
            e.getStackTrace();
            try {
                connection.rollback();
            } catch (SQLException sqlException) {
                sqlException.getStackTrace();
            }
        }
    }

    public List<BeanCursoJsp> listar() throws SQLException {
        List<BeanCursoJsp> lista = new ArrayList<>();
        String sql = "SELECT * FROM USUARIO";

        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            BeanCursoJsp beanCursoJsp = new BeanCursoJsp();
            beanCursoJsp.setLogin(resultSet.getString("login"));
            beanCursoJsp.setSenha(resultSet.getString("senha"));
            lista.add(beanCursoJsp);
        }

        return lista;

    }

    public void delete(String login) {
        String sql = "DELETE FROM USUARIO " +
                "WHERE LOGIN = '" + login + "'";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            connection.commit();
        } catch (Exception e) {
            e.getStackTrace();
            try {
                connection.rollback();
            } catch (SQLException sqlException) {
                sqlException.getStackTrace();
            }
        }
    }

    public BeanCursoJsp consultar(String login) throws SQLException {
        String sql = "SELECT * FROM USUARIO " +
                "WHERE LOGIN = '" + login + "'";


        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()) {
            BeanCursoJsp beanCursoJsp = new BeanCursoJsp();
            beanCursoJsp.setId(resultSet.getLong("id"));
            beanCursoJsp.setLogin(resultSet.getString("login"));
            beanCursoJsp.setSenha(resultSet.getString("senha"));

            return beanCursoJsp;
        }


        return null;
    }


    public void atualizar(BeanCursoJsp usuario) {

        String sql = "UPDATE USUARIO SET LOGIN = ?, SENHA = ? " +
                "WHERE ID = " + usuario.getId();

        try {
            PreparedStatement insert = connection.prepareStatement(sql);
            insert.setString(1, usuario.getLogin());
            insert.setString(2, usuario.getSenha());

            insert.executeUpdate();
            connection.commit();
        } catch (Exception e) {
            e.getStackTrace();
            try {
                connection.rollback();
            } catch (SQLException sqlException) {
                sqlException.getStackTrace();
            }
        }
    }
}
