/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import conexao.ConnectionFactory;
import java.util.ArrayList;
import java.util.List;
import modelo.Visitante;

/**
 *
 * @author VladGepar
 */
public class VisitanteDAO {

    private Connection connection;

    //Atributos de Instância
    private int id_visitante;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float diariaValor;  //valorASerPago    
    private Object visitantes;

    //Método Construtor da Classe
    public VisitanteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    //Método Adicionar(Create)
    public void adicionar(Visitante visitante) {
        String sql = "INSERT INTO visitante (nome,cpf,endereco,telefone,idade,diariaValor) VALUES (?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, visitante.getNome());
            stmt.setString(2, visitante.getCpf());
            stmt.setString(3, visitante.getEndereco());
            stmt.setString(4, visitante.getTelefone());
            stmt.setInt(5, visitante.getIdade());
            stmt.setFloat(6, visitante.getDiariaValor());
            stmt.execute();
            //stmt.close();

        } catch (SQLException u) {
            System.out.println("Erro ao Adicionar/Criar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }

    //Método Listar Todos(Read All)
    public List<Visitante> getVisitante() {
        String sql = "SELECT * FROM visitante";

        List<Visitante> listaVisit = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                Visitante visitante = new Visitante();
                visitante.setId_visitante(res.getInt("id_visitante"));
                visitante.setNome(res.getString("nome"));
                visitante.setCpf(res.getString("cpf"));
                visitante.setEndereco(res.getString("endereco"));
                visitante.setTelefone(res.getString("telefone"));
                visitante.setIdade(res.getInt("idade"));
                visitante.setDiariaValor(res.getFloat("diariaValor"));
                listaVisit.add(visitante);
            }

        } catch (SQLException u) {
            System.out.println("Erro ao Listar/Ler Todos: " + u.getMessage());
            //throw new RuntimeException(u);
        }
        return listaVisit;
    }

    //Método Listar por Nome(Read Name)
    public List<Visitante> getVisitante(String nome) {
        String sql = "SELECT * FROM visitante WHERE nome LIKE ?";

        List<Visitante> listaVisit = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + nome + "%");
            ResultSet res = stmt.executeQuery();

            while (res.next()) {

                Visitante visitante = new Visitante();
                visitante.setId_visitante(res.getInt("id_visitante"));
                visitante.setNome(res.getString("nome"));
                visitante.setCpf(res.getString("cpf"));
                visitante.setEndereco(res.getString("endereco"));
                visitante.setTelefone(res.getString("telefone"));
                visitante.setIdade(res.getInt("idade"));
                visitante.setDiariaValor(res.getFloat("diariaValor"));
                listaVisit.add(visitante);
            }

        } catch (SQLException u) {
            System.out.println("Erro ao Listar/Ler por Nome: " + u.getMessage());
            //throw new RuntimeException(u);
        }
        return listaVisit;
    }

    //Método Editar(Update)
    public void editar(Visitante visitante) {
        String sql = "UPDATE visitante SET nome=?,cpf=?,endereco=?,telefone=?,idade=?,diariaValor=? WHERE id_visitante=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, visitante.getNome());
            stmt.setString(2, visitante.getCpf());
            stmt.setString(3, visitante.getEndereco());
            stmt.setString(4, visitante.getTelefone());
            stmt.setInt(5, visitante.getIdade());
            stmt.setFloat(6, visitante.getDiariaValor());
            stmt.setInt(7, visitante.getId_visitante());
            stmt.execute();

        } catch (SQLException u) {
            System.out.println("Erro ao Editar/Atualizar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }

    //Método Excluir(Delete)
    public void excluir(Visitante visitante) {
        String sql = "DELETE FROM visitante WHERE id_visitante=?";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, visitante.getId_visitante());
            stmt.execute();

        } catch (SQLException u) {
            System.out.println("Erro ao Excluir/Deletar: " + u.getMessage());
            //throw new RuntimeException(u);

        }
    }

}
