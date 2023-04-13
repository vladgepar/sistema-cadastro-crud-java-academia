/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import conexao.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import modelo.Professor;

/**
 *
 * @author VladGepar
 */
public class ProfessorDAO {

    private Connection connection;

    //Atributos de Instância
    private int id_professor;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;
    private int horaTrabalhada;
    private Object professores;

    //Método Construtor da Classe
    public ProfessorDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    //Método Adicionar(Create)
    public void adicionar(Professor professor) {
        String sql = "INSERT INTO professor (nome,cpf,endereco,telefone,idade,salario,horaTrabalhada) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getCpf());
            stmt.setString(3, professor.getEndereco());
            stmt.setString(4, professor.getTelefone());
            stmt.setInt(5, professor.getIdade());
            stmt.setFloat(6, professor.getSalario());
            stmt.setInt(7, professor.getHoraTrabalhada());
            stmt.execute();
            //stmt.close();

        } catch (SQLException u) {
            System.out.println("Erro ao Adicionar/Criar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }

    //Método Listar Todos(Read All)
    public List<Professor> getProfessor() {
        String sql = "SELECT * FROM professor";

        List<Professor> listaProfe = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                Professor professor = new Professor();
                professor.setId_professor(res.getInt("id_professor"));
                professor.setNome(res.getString("nome"));
                professor.setCpf(res.getString("cpf"));
                professor.setEndereco(res.getString("endereco"));
                professor.setTelefone(res.getString("telefone"));
                professor.setIdade(res.getInt("idade"));
                professor.setSalario(res.getFloat("salario"));
                professor.setHoraTrabalhada(res.getInt("horaTrabalhada"));
                listaProfe.add(professor);
            }

        } catch (SQLException u) {
            System.out.println("Erro ao Listar/Ler Todos: " + u.getMessage());
            //throw new RuntimeException(u);
        }
        return listaProfe;
    }

    //Método Listar por Nome(Read Name)
    public List<Professor> getProfessor(String nome) {
        String sql = "SELECT * FROM professor WHERE nome LIKE ?";

        List<Professor> listaProfe = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                Professor professor = new Professor();
                professor.setId_professor(res.getInt("id_professor"));
                professor.setNome(res.getString("nome"));
                professor.setCpf(res.getString("cpf"));
                professor.setEndereco(res.getString("endereco"));
                professor.setTelefone(res.getString("telefone"));
                professor.setIdade(res.getInt("idade"));
                professor.setSalario(res.getFloat("salario"));
                professor.setHoraTrabalhada(res.getInt("horaTrabalhada"));
                listaProfe.add(professor);
            }

        } catch (SQLException u) {
            System.out.println("Erro ao Listar/Ler por Nome: " + u.getMessage());
            //throw new RuntimeException(u);
        }
        return listaProfe;
    }

    //Método Editar(Update)
    public void editar(Professor professor) {
        String sql = "UPDATE professor SET nome=?,cpf=?,endereco=?,telefone=?,idade=?,salario=?,horaTrabalhada=? WHERE id_professor=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getCpf());
            stmt.setString(3, professor.getEndereco());
            stmt.setString(4, professor.getTelefone());
            stmt.setInt(5, professor.getIdade());
            stmt.setFloat(6, professor.getSalario());
            stmt.setInt(7, professor.getHoraTrabalhada());
            stmt.setInt(8, professor.getId_professor());
            stmt.execute();

        } catch (SQLException u) {
            System.out.println("Erro ao Editar/Atualizar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }

    //Método Excluir(Delete)
    public void excluir(Professor professor) {
        String sql = "DELETE FROM professor WHERE id_professor=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, professor.getId_professor());
            stmt.execute();

        } catch (SQLException u) {
            System.out.println("Erro ao Excluir/Deletar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }
}
