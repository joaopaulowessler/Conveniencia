package net.unesc.vendas.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.unesc.vendas.classes.Cidade;
import net.unesc.vendas.classes.Cidade;

public class CidadeDao {
    
    public void delete(Cidade cidade) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from cidade where cidade.idcidade = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cidade.getCidCodigo());
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

    public void insert(Cidade cidade) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into cidade (idcidade, nome, codibge) values(?,?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cidade.getCidCodigo());
            ps.setString(2, cidade.getCidNome());            
            ps.setInt(3, cidade.getCidCodibge());
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

    public void update(Cidade cidade) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            
            conn = Conexao.getConnection();
            String sql = "update cidade set cidade.nome = ?, cidade.codibge = ? where cidade.idcidade = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,cidade.getCidNome());
            ps.setInt(2,cidade.getCidCodibge());
            ps.setInt(3,cidade.getCidCodigo());
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

    public static Cidade getCidade(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            
            conn = Conexao.getConnection();
            String sql = "select cidade.idcidade, cidade.nome, cidade.codibge from cidade where idcidade = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod     = rs.getInt(1);
                String  nome    = rs.getString(2);                
                Integer codibge = rs.getInt(3);
                
                Cidade cid = new Cidade();
                cid.setCidCodigo(cod);
                cid.setCidNome(nome);
                cid.setCidCodibge(codibge);                

                
                return cid;
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
            String sql = "select max(cidade.idcidade) from cidade";
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
