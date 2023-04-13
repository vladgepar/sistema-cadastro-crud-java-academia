/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import conexao.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import modelo.Funcionario;

/**
 *
 * @author VladGepar
 */
public class FuncionarioDAO {

    private Connection connection;

    //Atributos de Instância
    private int id_funcionario;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;
    private String funcao;
    private Object funcionarios;

    //Método Construtor da Classe
    public FuncionarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    //Método Adicionar(Create)
    public void adicionar(Funcionario funcionario) {
        String sql = "INSERT INTO funcionario (nome,cpf,endereco,telefone,idade,salario,funcao) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getEndereco());
            stmt.setString(4, funcionario.getTelefone());
            stmt.setInt(5, funcionario.getIdade());
            stmt.setFloat(6, funcionario.getSalario());
            stmt.setString(7, funcionario.getFuncao());
            stmt.execute();
            //stmt.close();

        } catch (SQLException u) {
            System.out.println("Erro ao Adicionar/Criar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }

    //Método Listar Todos(Read All)
    public List<Funcionario> getFuncionario() {
        String sql = "SELECT * FROM funcionario";

        List<Funcionario> listaFunc = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                Funcionario funcionario = new Funcionario();
                funcionario.setId_funcionario(res.getInt("id_funcionario"));
                funcionario.setNome(res.getString("nome"));
                funcionario.setCpf(res.getString("cpf"));
                funcionario.setEndereco(res.getString("endereco"));
                funcionario.setTelefone(res.getString("telefone"));
                funcionario.setIdade(res.getInt("idade"));
                funcionario.setSalario(res.getFloat("salario"));
                funcionario.setFuncao(res.getString("funcao"));
                listaFunc.add(funcionario);
            }

        } catch (SQLException u) {
            System.out.println("Erro ao Listar/Ler Todos: " + u.getMessage());
            //throw new RuntimeException(u);
        }
        return listaFunc;
    }

    //Método Listar por Nome(Read Name)
    public List<Funcionario> getFuncionario(String nome) {
        String sql = "SELECT * FROM funcionario WHERE nome LIKE ?";

        List<Funcionario> listaFunc = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                Funcionario funcionario = new Funcionario();
                funcionario.setId_funcionario(res.getInt("id_funcionario"));
                funcionario.setNome(res.getString("nome"));
                funcionario.setCpf(res.getString("cpf"));
                funcionario.setEndereco(res.getString("endereco"));
                funcionario.setTelefone(res.getString("telefone"));
                funcionario.setIdade(res.getInt("idade"));
                funcionario.setSalario(res.getFloat("salario"));
                funcionario.setFuncao(res.getString("funcao"));
                listaFunc.add(funcionario);
            }

        } catch (SQLException u) {
            System.out.println("Erro ao Listar/Ler por Nome: " + u.getMessage());
            //throw new RuntimeException(u);
        }
        return listaFunc;
    }

    //Método Editar(Update)
    public void editar(Funcionario funcionario) {
        String sql = "UPDATE funcionario SET nome=?,cpf=?,endereco=?,telefone=?,idade=?,salario=?,funcao=? WHERE id_funcionario=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getEndereco());
            stmt.setString(4, funcionario.getTelefone());
            stmt.setInt(5, funcionario.getIdade());
            stmt.setFloat(6, funcionario.getSalario());
            stmt.setString(7, funcionario.getFuncao());
            stmt.setInt(8, funcionario.getId_funcionario());
            stmt.execute();

        } catch (SQLException u) {
            System.out.println("Erro ao Editar/Atualizar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }

    //Método Excluir(Delete)
    public void excluir(Funcionario funcionario) {
        String sql = "DELETE FROM funcionario WHERE id_funcionario=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, funcionario.getId_funcionario());
            stmt.execute();

        } catch (SQLException u) {
            System.out.println("Erro ao Excluir/Deletar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }
}
