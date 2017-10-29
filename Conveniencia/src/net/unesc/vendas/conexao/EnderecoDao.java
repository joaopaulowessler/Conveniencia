package net.unesc.vendas.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.unesc.vendas.classes.Endereco;
import net.unesc.vendas.classes.Endereco;

public class EnderecoDao {
    
    public void delete(Endereco endereco) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from endereco where endereco.idendereco = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, endereco.getEndCodigo());
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

    public void insert(Endereco endereco) {
        
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into endereco (idendereco, descricao, cep, idpais, idestado, cidade_idcidade, idbairro) values(?,?,?,?,?,?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, endereco.getEndCodigo());
            ps.setString(2, endereco.getEndDescricao());
            ps.setInt(3, endereco.getEndCep());
            ps.setInt(4, endereco.getEndPais());
            ps.setInt(5, endereco.getEndEstado());
            ps.setInt(6, endereco.getEndCidade());
            ps.setInt(7, endereco.getEndBairro());            
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

    public void update(Endereco endereco) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            
            conn = Conexao.getConnection();
            String sql = "update endereco set endereco.descricao = ?, endereco.cep = ?, endereco.idpais = ?, " +
                         "endereco.idestado = ?, endereco.cidade_idcidade = ?, endereco.idbairro = ? " +
                         "where endereco.idendereco = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,endereco.getEndDescricao());
            ps.setInt(2,endereco.getEndCep());
            ps.setInt(3,endereco.getEndPais());
            ps.setInt(4,endereco.getEndEstado());
            ps.setInt(5,endereco.getEndCidade());
            ps.setInt(6,endereco.getEndBairro());            
            ps.setInt(7,endereco.getEndCodigo());
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

    public static Endereco getEndereco(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            
            conn = Conexao.getConnection();
            String sql = "select endereco.idendereco, endereco.descricao, endereco.cep, endereco.idpais, " +
                         "endereco.idestado, endereco.cidade_idcidade, endereco.idbairro " +
                         "from endereco where idendereco = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod     = rs.getInt(1);
                String  descri  = rs.getString(2);                
                Integer cep     = rs.getInt(3);
                Integer pais    = rs.getInt(4);
                Integer estado  = rs.getInt(5);
                Integer cidade  = rs.getInt(6);
                Integer bairro  = rs.getInt(7);
                
                Endereco est = new Endereco();
                est.setEndCodigo(cod);
                est.setEndDescricao(descri);                
                est.setEndCep(cep);
                est.setEndPais(pais);
                est.setEndEstado(estado);
                est.setEndCidade(cidade);
                est.setEndBairro(bairro);
                
                return est;
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
            String sql = "select max(endereco.idendereco) from endereco";
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
