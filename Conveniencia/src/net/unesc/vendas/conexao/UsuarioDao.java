package net.unesc.vendas.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import net.unesc.vendas.classes.Usuario;

public class UsuarioDao {
    
    public void delete(Usuario usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from usuario where usuario.idusuario = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, usuario.getUsuCodigo());
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

    public void insert(Usuario usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into usuario (idusuario, nome, login, senha, email, idempresa) " +
                         "values(?,?,?,?,?,?)";
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, usuario.getUsuCodigo());
            ps.setString(2, usuario.getUsuNome());
            ps.setString(3, usuario.getUsuUsuario());            
            ps.setString(4, usuario.getUsuSenha());
            ps.setString(5, usuario.getUsuEmail());
            ps.setInt(6, usuario.getEmpCodigo());            
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

    public void update(Usuario usuario) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "update usuario set usuario.nome = ?, usuario.login = ?, " +
                         "usuario.senha = ?, usuario.email = ?, usuario.idempresa = ? " +
                         "where usuario.idusuario = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getUsuNome());
            ps.setString(2, usuario.getUsuUsuario());
            ps.setString(3, usuario.getUsuSenha());
            ps.setString(4, usuario.getUsuEmail());
            ps.setInt(5,    usuario.getEmpCodigo());
            ps.setInt(6,    usuario.getUsuCodigo());
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

    public List<Usuario> getAll() {
        List<Usuario> lista = new ArrayList<Usuario>();
        /*Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select codigo, descricao from usuarios";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Integer codigo = rs.getInt(1);
                String descricao = rs.getString(2);
                Usuario p = new Usuario();
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

    public static Usuario getUsuario(Integer codigo) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select usuario.idusuario, usuario.nome, usuario.login, " +
                         "usuario.senha, usuario.email, usuario.idempresa from usuario where idusuario = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod     = rs.getInt(1);
                String  nome    = rs.getString(2);
                String  usuario = rs.getString(3);
                String  senha   = rs.getString(4);
                String  email   = rs.getString(5);
                Integer emp     = rs.getInt(6);
                
                Usuario usu = new Usuario();
                usu.setUsuCodigo(cod);
                usu.setUsuNome(nome);
                usu.setUsuUsuario(usuario);
                usu.setUsuSenha(senha);
                usu.setUsuEmail(email);
                usu.setEmpCodigo(emp);
                
                return usu;
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
    
   /* public static Usuario getUsuario(String usuario, String senha) {
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "select usuario.idusuario, usuario.nome, usuario.login, " +
                         "usuario.senha from usuario where login = ? and senha = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()) {
                Integer cod     = rs.getInt(1);
                String  nome    = rs.getString(2);
                String  usuario = rs.getString(3);
                String  senha   = rs.getString(4);
                String  email   = rs.getString(5);
                Integer emp     = rs.getInt(6);
                
                Usuario usu = new Usuario();
                usu.setUsuCodigo(cod);
                usu.setUsuNome(nome);
                usu.setUsuUsuario(usuario);
                usu.setUsuSenha(senha);
                usu.setUsuEmail(email);
                usu.setEmpCodigo(emp);
                
                return usu;
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
    */
    public int getMax() {
        int codigo = 0;
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        try {
            conn = Conexao.getConnection();
            String sql = "select max(usuario.idusuario) from usuario";
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
