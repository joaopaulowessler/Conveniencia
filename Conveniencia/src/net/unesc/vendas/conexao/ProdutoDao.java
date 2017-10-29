package net.unesc.vendas.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.unesc.vendas.classes.Produto;

public class ProdutoDao {
    
    public void delete(Produto produto) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from produto where produto.idproduto = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, produto.getProCodigo());
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

    public void insert(Produto produto) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into produto (idproduto, nome, idunidademedida, pesounit) " +
                         " values(?,?,?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, produto.getProCodigo());
            ps.setString(2, produto.getProDescricao());
            ps.setInt(3, produto.getProUnidade());
            ps.setFloat(4, produto.getProPeso());            
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

    public void update(Produto produto) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "update produto set produto.nome = ?, produto.idunidademedida = ?, " +
                         "produto.pesounit = ? where produto.idproduto = ?";
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getProDescricao());
            ps.setInt(2,    produto.getProUnidade());
            ps.setFloat(3,  produto.getProPeso());            
            ps.setInt(4,    produto.getProCodigo());
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

    /*public List<Produto> getAll() {
        List<Produto> lista = new ArrayList<Produto>();
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "select idproduto, nome, idunidademedida, " +
                         "pesounit from produto";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer codigo    = rs.getInt(1);
                String  descricao = rs.getString(2);
                String  um        = rs.getString(3);
                String  forn      = rs.getString(4);
                float   preco     = rs.getFloat(5);
                String  data      = rs.getString(6);
                
                Produto pro = new Produto();
                pro.setProCodigo(codigo);
                pro.setProDesc(descricao);
                pro.setProUnidade(um);
                pro.setProFornecedor(forn);
                pro.setProPreco(preco);
                pro.setProDataCadatro(data);
                lista.add(pro);
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
        return lista;
    }*/

    public static Produto getProduto(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select produto.idproduto, produto.nome, produto.idunidademedida, " +
                         "produto.pesounit from produto where idproduto = ?";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod = rs.getInt(1);
                String descricao = rs.getString(2);
                Integer unidade = rs.getInt(3);
                float peso = rs.getFloat(4);
                
                Produto p = new Produto();
                p.setProCodigo(cod);
                p.setProDescricao(descricao);
                p.setProUnidade(unidade);
                p.setProPeso(peso);
                
                return p;
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
            String sql = "select max(produto.idproduto) from produto";
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
