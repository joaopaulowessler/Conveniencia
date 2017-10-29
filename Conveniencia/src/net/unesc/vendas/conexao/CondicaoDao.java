package net.unesc.vendas.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.unesc.vendas.classes.Condicao;
import net.unesc.vendas.classes.Condicao;

public class CondicaoDao {
    
    public void delete(Condicao condicao) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from condpagto where condpagto.idcondpagto = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, condicao.getConCodigo());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void insert(Condicao condicao) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into condpagto (idcondpagto, nome) values(?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, condicao.getConCodigo());
            ps.setString(2, condicao.getConNome());            
            ps.execute();

            conn.commit();

        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Condicao condicao) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "update condpagto set condpagto.nome = ? where condpagto.idcondpagto = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,condicao.getConNome());
            ps.setInt(2,condicao.getConCodigo());
            ps.execute();

            conn.commit();
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if(conn != null){
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public static Condicao getCondicao(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select condpagto.idcondpagto, condpagto.nome from condpagto where condpagto.idcondpagto = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod     = rs.getInt(1);
                String  nome    = rs.getString(2);                
                
                Condicao con = new Condicao();
                con.setConCodigo(cod);
                con.setConNome(nome);                
                
                return con;
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return null;
    }
        
    public int getMax() {
        int codigo = 0;
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "select max(condpagto.idcondpagto) from condpagto";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                codigo = rs.getInt(1);                
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        
        return codigo;
    }
}
