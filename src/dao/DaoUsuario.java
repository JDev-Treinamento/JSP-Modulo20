package dao;

import beans.BeanCursoJsp;
import connection.SingleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
