/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import conexao.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import modelo.Aluno;

/**
 *
 * @author VladGepar
 */
public class AlunoDAO {

    private Connection connection;

    //Atributos de Instância
    private int id_aluno;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float mensalidade;
    private float multaPorAtraso;
    private Object alunos;

    //Método Construtor da Classe
    public AlunoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    //Método Adicionar(Create)
    public void adicionar(Aluno aluno) {
        String sql = "INSERT INTO aluno (nome,cpf,endereco,telefone,idade,mensalidade,multaPorAtraso) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getEndereco());
            stmt.setString(4, aluno.getTelefone());
            stmt.setInt(5, aluno.getIdade());
            stmt.setFloat(6, aluno.getMensalidade());
            stmt.setFloat(7, aluno.getMultaPorAtraso());
            stmt.execute();
            //stmt.close();

        } catch (SQLException u) {
            System.out.println("Erro ao Adicionar/Criar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }

    //Método Listar Todos(Read All)
    public List<Aluno> getAluno() {
        String sql = "SELECT * FROM aluno";

        List<Aluno> listaAlun = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                Aluno aluno = new Aluno();
                aluno.setId_aluno(res.getInt("id_aluno"));
                aluno.setNome(res.getString("nome"));
                aluno.setCpf(res.getString("cpf"));
                aluno.setEndereco(res.getString("endereco"));
                aluno.setTelefone(res.getString("telefone"));
                aluno.setIdade(res.getInt("idade"));
                aluno.setMensalidade(res.getFloat("mensalidade"));
                aluno.setMultaPorAtraso(res.getFloat("multaPorAtraso"));
                listaAlun.add(aluno);
            }

        } catch (SQLException u) {
            System.out.println("Erro ao Listar/Ler Todos: " + u.getMessage());
            //throw new RuntimeException(u);
        }
        return listaAlun;
    }

    //Método Listar por Nome(Read Name)
    public List<Aluno> getAluno(String nome) {
        String sql = "SELECT * FROM aluno WHERE nome LIKE ?";

        List<Aluno> listaAlun = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                Aluno aluno = new Aluno();
                aluno.setId_aluno(res.getInt("id_aluno"));
                aluno.setNome(res.getString("nome"));
                aluno.setCpf(res.getString("cpf"));
                aluno.setEndereco(res.getString("endereco"));
                aluno.setTelefone(res.getString("telefone"));
                aluno.setIdade(res.getInt("idade"));
                aluno.setMensalidade(res.getFloat("mensalidade"));
                aluno.setMultaPorAtraso(res.getFloat("multaPorAtraso"));
                listaAlun.add(aluno);
            }

        } catch (SQLException u) {
            System.out.println("Erro ao Listar/Ler por Nome: " + u.getMessage());
            //throw new RuntimeException(u);
        }
        return listaAlun;
    }

    //Método Editar(Update)
    public void editar(Aluno aluno) {
        String sql = "UPDATE aluno SET nome=?,cpf=?,endereco=?,telefone=?,idade=?,mensalidade=?,multaPorAtraso=? WHERE id_aluno=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCpf());
            stmt.setString(3, aluno.getEndereco());
            stmt.setString(4, aluno.getTelefone());
            stmt.setInt(5, aluno.getIdade());
            stmt.setFloat(6, aluno.getMensalidade());
            stmt.setFloat(7, aluno.getMultaPorAtraso());
            stmt.setInt(8, aluno.getId_aluno());
            stmt.execute();

        } catch (SQLException u) {
            System.out.println("Erro ao Editar/Atualizar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }

    //Método Excluir(Delete)
    public void excluir(Aluno aluno) {
        String sql = "DELETE FROM aluno WHERE id_aluno=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, aluno.getId_aluno());
            stmt.execute();

        } catch (SQLException u) {
            System.out.println("Erro ao Excluir/Deletar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }
}
