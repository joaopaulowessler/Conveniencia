package net.unesc.conveniencia.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.classes.Vendas;

public class VendasDao {
    
    public void delete(Vendas venda) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from venda where venda.ven_codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, venda.getVenCodigo());
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

    public void insert(Vendas venda) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into venda (ven_codigo, cli_codigo, fun_codigo, pro_codigo, ven_data, " +
                         " ven_quantidade, ven_observacao) values(?,?,?,?,?,?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, venda.getVenCodigo());
            ps.setInt(2, venda.getVenCliente());
            ps.setInt(3, venda.getVenFuncionario());
            ps.setInt(4, venda.getVenProduto());
            ps.setString(5, venda.getVenData());
            ps.setFloat(6, venda.getVenQuantidade());
            ps.setString(7, venda.getVenObserva());
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

    public void update(Vendas venda) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "update venda set cli_codigo = ?, fun_codigo = ?, " + 
                         "pro_codigo = ?, ven_data = ?, ven_quantidade = ?, " + 
                         "ven_observacao = ? where venda.ven_codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,    venda.getVenCliente());
            ps.setInt(2,    venda.getVenFuncionario());
            ps.setInt(3,    venda.getVenProduto());
            ps.setString(4, venda.getVenData());
            ps.setFloat(5,  venda.getVenQuantidade());
            ps.setString(6, venda.getVenObserva());
            ps.setInt(7,    venda.getVenCodigo());
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

    public List<Vendas> getAll() {
        List<Vendas> lista = new ArrayList<Vendas>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select ven_codigo, cli_codigo, fun_codigo, pro_codigo, " +
                         "ven_data, ven_quantidade, ven_observacao from venda";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer codigo  = rs.getInt(1);
                Integer cliente = rs.getInt(2);
                Integer func    = rs.getInt(3);
                Integer prod    = rs.getInt(4);
                String  data    = rs.getString(5);
                Float   qtd     = rs.getFloat(6);
                String  obs     = rs.getString(5);
                Vendas ven = new Vendas();
                ven.setVenCodigo(codigo);
                ven.setVenCliente(cliente);
                ven.setVenFuncionario(func);
                ven.setVenProduto(prod);
                ven.setVenData(data);
                ven.setVenQuantidade(qtd);
                ven.setVenObserva(obs);
                
                lista.add(ven);
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
    }

    public static Vendas getVendas(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "select venda.ven_codigo, venda.ven_data, venda.cli_codigo, " +
                         "venda.fun_codigo, venda.pro_codigo, venda.ven_quantidade, " + 
                         "venda.ven_observacao from venda where ven_codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod       = rs.getInt(1);
                String  data      = rs.getString(2);
                Integer cliente   = rs.getInt(3);
                Integer fun       = rs.getInt(4);
                Integer pro       = rs.getInt(5);
                float   qtde      = rs.getFloat(6);
                String  obs       = rs.getString(7);
                       
                Vendas ven = new Vendas();
                ven.setVenCodigo(cod);
                ven.setVenData(data);
                ven.setVenCliente(cliente);
                ven.setVenFuncionario(fun);
                ven.setVenProduto(pro);
                ven.setVenQuantidade(qtde);
                ven.setVenObserva(obs);
                return ven;
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
            String sql = "select max(venda.ven_codigo) from venda";
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
