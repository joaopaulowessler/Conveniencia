package net.unesc.conveniencia.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.unesc.conveniencia.classes.Funcionario;

public class FuncionarioDao {
    
    public void delete(Funcionario funcionario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from funcionario where funcionario.fun_codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, funcionario.getFunCodigo());
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

    public void insert(Funcionario funcionario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into funcionario (fun_codigo, fun_nome, fun_cpf, fun_rg, fun_sexo, " +
                         "fun_telefone, fun_email, fun_cidade, fun_estado, fun_endereco, fun_dataadm) " +
                         "values(?,?,?,?,?,?,?,?,?,?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1,    funcionario.getFunCodigo());
            ps.setString(2, funcionario.getFunNome());
            ps.setString(3, funcionario.getFunCpf());            
            ps.setString(4, funcionario.getFunRg());
            ps.setString(5, funcionario.getFunSexo());
            ps.setString(6, funcionario.getFunTelefone());
            ps.setString(7, funcionario.getFunEmail());
            ps.setString(8, funcionario.getFunCidade());
            ps.setString(9, funcionario.getFunEstado());
            ps.setString(10,funcionario.getFunEndereco());
            ps.setString(11,funcionario.getFunDataAdm());
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

    public void update(Funcionario funcionario) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "update funcionario set funcionario.fun_nome = ?, funcionario.fun_cpf = ?, " +
                         "funcionario.fun_rg = ?, funcionario.fun_sexo = ?, funcionario.fun_telefone = ?, " +
                         "funcionario.fun_email = ?, funcionario.fun_cidade = ?, funcionario.fun_estado = ?, " +
                         "funcionario.fun_endereco = ?, funcionario.fun_dataadm = ? where funcionario.fun_codigo = ?";
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, funcionario.getFunNome());
            ps.setString(2, funcionario.getFunCpf());            
            ps.setString(3, funcionario.getFunRg());
            ps.setString(4, funcionario.getFunSexo());
            ps.setString(5, funcionario.getFunTelefone());
            ps.setString(6, funcionario.getFunEmail());
            ps.setString(7, funcionario.getFunCidade());
            ps.setString(8, funcionario.getFunEstado());
            ps.setString(9, funcionario.getFunEndereco());
            ps.setString(10, funcionario.getFunEndereco());
            ps.setInt(11,   funcionario.getFunCodigo());
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

    public List<Funcionario> getAll() {
        List<Funcionario> lista = new ArrayList<Funcionario>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select fun_codigo, fun_nome, fun_rg, fun_cpf, fun_email, fun_cidade, " +
                         "fun_estado, fun_endereco from funcionario";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer codigo = rs.getInt(1);
                String nome    = rs.getString(2);
                String rg      = rs.getString(3);
                String cpf     = rs.getString(4);
                String email   = rs.getString(5);
                String cidade  = rs.getString(6);
                String estado  = rs.getString(7);
                String ende    = rs.getString(8);
                Funcionario fun = new Funcionario();
                fun.setFunCodigo(codigo);
                fun.setFunNome(nome);
                fun.setFunRg(rg);
                fun.setFunCpf(cpf);
                fun.setFunEmail(email);
                fun.setFunCidade(cidade);
                fun.setFunEstado(estado);
                fun.setFunEndereco(ende);
                
                lista.add(fun);
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

    public static Funcionario getFuncionario(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select funcionario.fun_codigo, funcionario.fun_nome, funcionario.fun_cpf, " +
                         "funcionario.fun_rg, funcionario.fun_sexo, funcionario.fun_telefone, " +
                         "funcionario.fun_email, funcionario.fun_cidade, funcionario.fun_estado, " +
                         "funcionario.fun_endereco, funcionario.fun_dataadm " +
                         "from funcionario where funcionario.fun_codigo = ?";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod  = rs.getInt(1);
                String nome  = rs.getString(2);
                String cpf   = rs.getString(3);
                String rg    = rs.getString(4);
                String sexo  = rs.getString(5);
                String tel   = rs.getString(6);
                String email = rs.getString(7);
                String cid   = rs.getString(8);
                String est   = rs.getString(9);
                String end   = rs.getString(10);
                String data  = rs.getString(11);
                
                Funcionario fun = new Funcionario();
                fun.setFunCodigo(cod);
                fun.setFunNome(nome);
                fun.setFunCpf(cpf);
                fun.setFunRg(rg);
                fun.setFunSexo(sexo);
                fun.setFunTelefone(tel);
                fun.setFunEmail(email);
                fun.setFunCidade(cid);
                fun.setFunEstado(est);
                fun.setFunEndereco(end);
                fun.setFunDataAdm(data);
                
                return fun;
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
            String sql = "select max(funcionario.fun_codigo) from funcionario";
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
