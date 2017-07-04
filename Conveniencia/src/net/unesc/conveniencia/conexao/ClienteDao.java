package net.unesc.conveniencia.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.classes.Cliente;

public class ClienteDao {
    
    public void delete(Cliente cliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from cliente where cliente.cli_codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cliente.getCliCodigo());
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

    public void insert(Cliente cliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into cliente (cli_codigo, cli_nome, cli_cpf, cli_rg, cli_telefone, " +
                         " cli_email, cli_cidade, cli_estado, cli_endereco, cli_sexo) values(?,?,?,?,?,?,?,?,?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1,    cliente.getCliCodigo());
            ps.setString(2, cliente.getCliNome());
            ps.setString(3, cliente.getCliCpf());            
            ps.setString(4, cliente.getCliRg());
            ps.setString(5, cliente.getCliTelefone());
            ps.setString(6, cliente.getCliEmail());
            ps.setString(7, cliente.getCliCidade());
            ps.setString(8, cliente.getCliEstado());
            ps.setString(9, cliente.getCliEndereco());
            ps.setString(9, cliente.getCliSexo());
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

    public void update(Cliente cliente) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            
            conn = Conexao.getConnection();
            String sql = "update cliente set cliente.cli_nome = ?, cliente.cli_cpf = ?, " +
                         "cliente.cli_rg = ?, cliente.cli_telefone = ?, cliente.cli_email = ?, " +
                         "cliente.cli_cidade = ?, cliente.cli_estado = ?, cliente.cli_endereco = ?, " +
                         "cliente.cli_sexo = ? where cliente.cli_codigo = ?";
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, cliente.getCliNome());
            ps.setString(2, cliente.getCliCpf());
            ps.setString(3, cliente.getCliRg());
            ps.setString(4, cliente.getCliTelefone());
            ps.setString(5, cliente.getCliEmail());
            ps.setString(6, cliente.getCliCidade());
            ps.setString(7, cliente.getCliEstado());
            ps.setString(8, cliente.getCliEndereco());
            ps.setString(9, cliente.getCliSexo());
            ps.setInt(10,    cliente.getCliCodigo());
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

    public List<Cliente> getAll() {
        List<Cliente> lista = new ArrayList<Cliente>();
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

    public static Cliente getCliente(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
             String sql = "select cliente.cli_codigo, cliente.cli_nome, cliente.cli_cpf, " +
                          "cliente.cli_rg, cliente.cli_telefone, cliente.cli_email, " +
                          "cliente.cli_cidade, cliente.cli_estado, cliente.cli_endereco, " +
                          "cliente.cli_sexo from cliente where cliente.cli_codigo = ?";
             
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod      = rs.getInt(1);
                String  nome     = rs.getString(2);
                String  cpf      = rs.getString(3);
                String  rg       = rs.getString(4);
                String  telefone = rs.getString(5);
                String  email    = rs.getString(6);
                String  cidade   = rs.getString(7);
                String  estado   = rs.getString(8);
                String  endereco = rs.getString(9);
                String  sexo     = rs.getString(10);
                
                Cliente cli = new Cliente();
                cli.setCliCodigo(cod);
                cli.setCliNome(nome);
                cli.setCliCpf(cpf);
                cli.setCliRg(rg);
                cli.setCliTelefone(telefone);
                cli.setCliEmail(email);
                cli.setCliCidade(cidade);
                cli.setCliEstado(estado);
                cli.setCliEndereco(endereco);
                cli.setCliSexo(sexo);
                return cli;
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
            String sql = "select max(cliente.cli_codigo) from cliente";
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