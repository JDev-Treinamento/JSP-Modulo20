package dao;

import connection.SingleConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DaoLogin {

    private Connection connection;

    public DaoLogin() {
        this.connection = SingleConnection.getConnection();
    }

    public boolean validarLogin(String login, String senha) throws Exception {

        String sql = "SELECT * FROM usuario " +
                "WHERE LOGIN = '" + login + "'" +
                " AND SENHA = '" + senha + "'";

        PreparedStatement statement = this.connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();

        // ELE JÁ RETORNA TRUE/FALSE POR DEFAULT
        return resultSet.next();
    }


}
