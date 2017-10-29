package net.unesc.vendas.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.unesc.vendas.classes.Empresa;
import net.unesc.vendas.classes.Empresa;

public class EmpresaDao {
    
    public void delete(Empresa empresa) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from empresa where empresa.idempresa = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, empresa.getEmpCodigo());
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

    public void insert(Empresa empresa) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into empresa (idempresa, nome) values(?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, empresa.getEmpCodigo());
            ps.setString(2, empresa.getEmpNome());            
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

    public void update(Empresa empresa) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "update empresa set empresa.nome = ? where empresa.idempresa = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,empresa.getEmpNome());
            ps.setInt(2,empresa.getEmpCodigo());
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

    public static Empresa getEmpresa(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select empresa.idempresa, empresa.nome from empresa where empresa.idempresa = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod     = rs.getInt(1);
                String  nome    = rs.getString(2);                
                
                Empresa con = new Empresa();
                con.setEmpCodigo(cod);
                con.setEmpNome(nome);                
                
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
            String sql = "select max(empresa.idempresa) from empresa";
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
