package net.unesc.conveniencia.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/convenienciadb", "sa", "");
        } catch (SQLException e) {
            System.out.println("Problemas ao conectar no banco de dados");
        } catch (ClassNotFoundException e) {
            System.out.println("O driver não foi configurado corretametne");
        }

        return conn;
    }
}
