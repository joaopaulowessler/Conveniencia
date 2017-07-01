package net.unesc.conveniencia.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import net.unesc.conveniencia.classes.Produto;

public class ProdutoDao {
    
    public void delete(Produto produto) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from produto where produto.pro_codigo = ?";
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
            String sql = "insert into produto (pro_codigo, pro_descricao, pro_unidade, pro_fornecedor, pro_preco, " +
                         " pro_datacad) values(?,?,?,?,?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, produto.getProCodigo());
            ps.setString(2, produto.getProDesc());
            ps.setString(3, produto.getProUnidade());            
            ps.setString(4, produto.getProFornecedor());
            ps.setString(5, String.valueOf(produto.getProPreco()));
            ps.setString(6, produto.getProDataCadastro());
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
            String sql = "update produto set produto.pro_descricao = ?, produto.pro_unidade = ?, " +
                         "produto.pro_fornecedor = ?, produto.pro_preco = ?, produto.pro_datacad = ? " +
                         "where produto.pro_codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, produto.getProDesc());
            ps.setString(2, produto.getProUnidade());
            ps.setString(3, produto.getProFornecedor());
            ps.setFloat(4,  produto.getProPreco());
            ps.setString(5, produto.getProDataCadastro());
            ps.setInt(6,    produto.getProCodigo());
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

    public List<Produto> getAll() {
        List<Produto> lista = new ArrayList<Produto>();
        /*Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, descricao from produtos";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer codigo = rs.getInt(1);
                String descricao = rs.getString(2);
                Produto p = new Produto();
                p.setCodigo(codigo);
                p.setDescricao(descricao);
                lista.add(p);
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
        }*/
        return lista;
    }

    public static Produto getProduto(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select produto.pro_codigo, produto.pro_descricao, produto.pro_unidade, " +
                         "produto.pro_fornecedor, produto.pro_preco, produto.pro_datacad " + 
                         "from produto where pro_codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod = rs.getInt(1);
                String descricao = rs.getString(2);
                String unidade = rs.getString(3);
                String fornecedor = rs.getString(4);
                float preco = rs.getFloat(5);
                String dataCad = rs.getString(6);
                
                Produto p = new Produto();
                p.setProCodigo(cod);
                p.setProDesc(descricao);
                p.setProUnidade(unidade);
                p.setProFornecedor(fornecedor);
                p.setProPreco(preco);
                p.setProDataCadatro(dataCad);
                
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
}
