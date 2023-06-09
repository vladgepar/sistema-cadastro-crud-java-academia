/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.AlunoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Aluno;

/**
 *
 * @author VladGepar
 */
public class TelaAluno extends javax.swing.JFrame {

    public void preencheTabela() {

        //Criar uma Variável "alunoDAO"
        //Pegar Dados dos Alunos da "listaAlun" e Colocá-los dentro da "tabelaAluno"
        AlunoDAO alunDAO = new AlunoDAO();
        String nome = pesquisarPorNome.getText();
        List<Aluno> listaAlun = alunDAO.getAluno(nome);

        DefaultTableModel tabelaAluno = (DefaultTableModel) tabela.getModel();

        //Comando para Fazer a "Ordenação" das "Linhas/Listas" na Tabela
        tabela.setRowSorter(new TableRowSorter(tabelaAluno));

        //Comando "Evento CaretUpdate" para Filtrar "Linhas/Listas" na Tabela, enquanto Pesquisa por Nome
        tabelaAluno.setNumRows(0);

        //Percorrer a "listaAlun" e Inserir na "tabelaAluno"
        for (Aluno alun : listaAlun) {
            Object[] obj = new Object[]{
                alun.getId_aluno(), //Posição 1 do Array
                alun.getNome(), //Posição 2 do Array
                alun.getCpf(), //Posição 3 do Array
                alun.getEndereco(), //Posição 4 do Array
                alun.getTelefone(), //Posição 5 do Array
                alun.getIdade(), //Posição 6 do Array
                alun.getMensalidade(), //Posição 7 do Array
                alun.getMultaPorAtraso(), //Posição 8 do Array
            };
            //Comando para Preencher as "Linhas/Listas" na Tabela Novamente
            tabelaAluno.addRow(obj);
        }
    }

    /**
     * Creates new form FormTabela
     */
    public TelaAluno() {
        initComponents();

        //Comando para ser Executado Automat. Sempre que essa Tela for Executada Também
        preencheTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        cadastrar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        listar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        multaPorAtraso = new javax.swing.JTextField();
        mensalidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        idade = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        pesquisarPorNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Flow Tech Academy");

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Endereço", "Telefone", "Idade", "Mensalidade", "Multa por Atraso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel1.setText("Nome");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Cadastro - Aluno(a)");

        jLabel2.setText("CPF");

        jLabel3.setText("Idade");

        jLabel4.setText("Mensalidade");

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpfActionPerformed(evt);
            }
        });

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        listar.setText("Listar");
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });

        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        jLabel7.setText("Multa por Atraso");

        jLabel8.setText("Telefone");

        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        jLabel9.setText("Endereço");

        idade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idadeActionPerformed(evt);
            }
        });

        pesquisarPorNome.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                pesquisarPorNomeCaretUpdate(evt);
            }
        });
        pesquisarPorNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarPorNomeActionPerformed(evt);
            }
        });

        jLabel6.setText("Pesquisar/Nome:");

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator2)))
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mensalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                            .addComponent(endereco)
                            .addComponent(nome))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multaPorAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefone)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(limpar)
                .addGap(40, 40, 40)
                .addComponent(listar)
                .addGap(41, 41, 41)
                .addComponent(cadastrar)
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(sair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editar)
                .addGap(50, 50, 50)
                .addComponent(excluir)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(9, 9, 9)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(multaPorAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpar)
                    .addComponent(listar)
                    .addComponent(pesquisarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cadastrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(excluir)
                    .addComponent(editar)
                    .addComponent(sair))
                .addGap(11, 11, 11))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        // TODO add your handling code here:

        //Botão "Cadastrar" no Banco de Dados
        //DefaultTableModel tabelaAluno = (DefaultTableModel) tabela.getModel();
        //Object[] dados = {nome.getText(), cpf.getText(), endereco.getText(), telefone.getText(), idade.getText(), mensalidade.getText(), multaPorAtraso.getText()};
        //tabelaAluno.addRow(dados);
        
        //Validação dos Dados Inseridos
        if ((nome.getText().isEmpty())) {
            JOptionPane.showInternalMessageDialog(null, "Campo Nome deve ser Preenchido.");

        } else if ((cpf.getText().isEmpty())) {
            JOptionPane.showInternalMessageDialog(null, "Campo CPF deve ser Preenchido.");

        } else if ((cpf.getText().length() < 11) || (cpf.getText().length() > 15)) {
            JOptionPane.showInternalMessageDialog(null, "Campo CPF Preenchido Incorretamente.");

        } else if ((endereco.getText().isEmpty())) {
            JOptionPane.showInternalMessageDialog(null, "Campo Endereço deve ser Preenchido.");

        } else if ((telefone.getText().isEmpty())) {
            JOptionPane.showInternalMessageDialog(null, "Campo Telefone deve ser Preenchido.");

        } else if ((idade.getText().isEmpty())) {
            JOptionPane.showInternalMessageDialog(null, "Campo Idade deve ser Preenchido.");

        } else if (Integer.parseInt(idade.getText()) < 0) {
            JOptionPane.showInternalMessageDialog(null, "Campo Idade Não Permite Valor Negativo.");

        } else if (Integer.parseInt(idade.getText()) < 10) {
            JOptionPane.showInternalMessageDialog(null, "Campo Idade Não Permite Menores de 10 Anos.");

        } else if ((mensalidade.getText().isEmpty())) {
            JOptionPane.showInternalMessageDialog(null, "Campo Mensalidade deve ser Preenchido.");

        } else if (Float.parseFloat(mensalidade.getText()) < 0) {
            JOptionPane.showInternalMessageDialog(null, "Campo Mensalidade Não Permite Valor Negativo.");

        } else if ((Float.parseFloat(mensalidade.getText()) != 70)
                && (Float.parseFloat(mensalidade.getText()) != 90)
                && (Float.parseFloat(mensalidade.getText()) != 120)) {
            JOptionPane.showInternalMessageDialog(null, "Campo Mensalidade com Valor Divergente. Planos ( 70, 90 ou 120 ).");

        } else if ((multaPorAtraso.getText().isEmpty())) {
            JOptionPane.showInternalMessageDialog(null, "Campo Multa por Atraso deve ser Preenchido.");

        } else if (Float.parseFloat(multaPorAtraso.getText()) < 0) {
            JOptionPane.showInternalMessageDialog(null, "Campo Multa por Atraso Não Permite Valor Negativo.");

        } else {

            Aluno alun = new Aluno();
            alun.setNome(nome.getText());
            alun.setCpf(cpf.getText());
            alun.setEndereco(endereco.getText());
            alun.setTelefone(telefone.getText());
            alun.setIdade(Integer.parseInt(idade.getText()));
            alun.setMensalidade(Float.parseFloat(mensalidade.getText()));
            alun.setMultaPorAtraso(Float.parseFloat(multaPorAtraso.getText()));

            //Instanciar a Classe AlunoDAO, Criando seu Objeto dao
            AlunoDAO dao = new AlunoDAO();
            dao.adicionar(alun);
            JOptionPane.showMessageDialog(null, "Aluno(a) " + nome.getText() + " Inserido(a) com Sucesso!");

            //Limpar a Tela após Confirmada a Inserção das Informações nos Campos
            nome.setText("");
            cpf.setText("");
            endereco.setText("");
            telefone.setText("");
            idade.setText("");
            mensalidade.setText("");
            multaPorAtraso.setText("");

            //Comando para ser Executado Automat. Sempre que essa "Tela" for Executada Também
            preencheTabela();
        }
    }//GEN-LAST:event_cadastrarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:

        //Botão "Sair"
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        // TODO add your handling code here:      

        //Botão "Limpar" Dados na Tela, ainda na Fase de Preenchimento
        nome.setText("");
        cpf.setText("");
        endereco.setText("");
        telefone.setText("");
        idade.setText("");
        mensalidade.setText("");
        multaPorAtraso.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:

        //Botão "Listar" Tabela Atualizada
        TelaAluno tp = new TelaAluno();
        tp.setVisible(true);
    }//GEN-LAST:event_listarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:

        //Botão "Excluir" Linha/Aluno da Tabela
        int linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione Linha/Aluno(a) para Excluir.");

        } else {
            
            //Instanciar a Classe AlunoDAO, Criando seu Objeto dao
            Aluno alun = new Aluno();
            AlunoDAO dao = new AlunoDAO();

            alun.setId_aluno((int) tabela.getValueAt(tabela.getSelectedRow(), 0));
            dao.excluir(alun);
            JOptionPane.showMessageDialog(null, "Aluno(a) " + nome.getText() + " Excluído(a) com Sucesso.");

            //DefaultTableModel tabelaAluno = (DefaultTableModel) tabela.getModel();
            //tabelaAluno.removeRow(linhaSelecionada);
            
            //Limpar a Tela após Confirmada a Inserção das Informações nos Campos
            nome.setText("");
            cpf.setText("");
            endereco.setText("");
            telefone.setText("");
            idade.setText("");
            mensalidade.setText("");
            multaPorAtraso.setText("");

            //Comando para ser Executado Automat. Sempre que essa Tela for Executada Também
            preencheTabela();
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpfActionPerformed

    private void idadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idadeActionPerformed

    private void pesquisarPorNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarPorNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisarPorNomeActionPerformed

    private void pesquisarPorNomeCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_pesquisarPorNomeCaretUpdate
        // TODO add your handling code here:

        //"Campo" para Filtrar "Linhas/Listas" na Tabela, enquanto Pesquisa por Nome
        preencheTabela(); //Comando para ser Executado Automat. Sempre que essa Tela for Executada Também
    }//GEN-LAST:event_pesquisarPorNomeCaretUpdate

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:

        //Botão "Editar" no Banco de Dados
        int linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione Linha/Aluno(a) para Editar.");

        } else if (tabela.getSelectedRow() != -1) {

            //Validação dos Dados Inseridos
            if ((nome.getText().isEmpty())) {
                JOptionPane.showInternalMessageDialog(null, "Campo Nome deve ser Preenchido.");

            } else if ((cpf.getText().isEmpty())) {
                JOptionPane.showInternalMessageDialog(null, "Campo CPF deve ser Preenchido.");

            } else if ((cpf.getText().length() < 11) || (cpf.getText().length() > 15)) {
                JOptionPane.showInternalMessageDialog(null, "Campo CPF Preenchido Incorretamente.");

            } else if ((endereco.getText().isEmpty())) {
                JOptionPane.showInternalMessageDialog(null, "Campo Endereço deve ser Preenchido.");

            } else if ((telefone.getText().isEmpty())) {
                JOptionPane.showInternalMessageDialog(null, "Campo Telefone deve ser Preenchido.");

            } else if ((idade.getText().isEmpty())) {
                JOptionPane.showInternalMessageDialog(null, "Campo Idade deve ser Preenchido.");

            } else if (Integer.parseInt(idade.getText()) < 0) {
                JOptionPane.showInternalMessageDialog(null, "Campo Idade Não Permite Valor Negativo.");

            } else if (Integer.parseInt(idade.getText()) < 10) {
                JOptionPane.showInternalMessageDialog(null, "Campo Idade Não Permite Menores de 10 Anos.");

            } else if ((mensalidade.getText().isEmpty())) {
                JOptionPane.showInternalMessageDialog(null, "Campo Mensalidade deve ser Preenchido.");

            } else if (Float.parseFloat(mensalidade.getText()) < 0) {
                JOptionPane.showInternalMessageDialog(null, "Campo Mensalidade Não Permite Valor Negativo.");

            } else if ((Float.parseFloat(mensalidade.getText()) != 70)
                    && (Float.parseFloat(mensalidade.getText()) != 90)
                    && (Float.parseFloat(mensalidade.getText()) != 120)) {
                JOptionPane.showInternalMessageDialog(null, "Campo Mensalidade com Valor Divergente. Planos ( 70, 90 ou 120 ).");

            } else if ((multaPorAtraso.getText().isEmpty())) {
                JOptionPane.showInternalMessageDialog(null, "Campo Multa por Atraso deve ser Preenchido.");

            } else if (Float.parseFloat(multaPorAtraso.getText()) < 0) {
                JOptionPane.showInternalMessageDialog(null, "Campo Multa por Atraso Não Permite Valor Negativo.");

            } else {

                //Instanciar a Classe AlunoDAO, Criando seu Objeto dao
                Aluno alun = new Aluno();
                AlunoDAO dao = new AlunoDAO();

                alun.setId_aluno((int) tabela.getValueAt(tabela.getSelectedRow(), 0));
                alun.setNome(nome.getText());
                alun.setCpf(cpf.getText());
                alun.setEndereco(endereco.getText());
                alun.setTelefone(telefone.getText());
                alun.setIdade(Integer.parseInt(idade.getText()));
                alun.setMensalidade(Float.parseFloat(mensalidade.getText()));
                alun.setMultaPorAtraso(Float.parseFloat(multaPorAtraso.getText()));
                dao.editar(alun);
                JOptionPane.showMessageDialog(null, "Aluno(a) " + nome.getText() + " Editado(a) com Sucesso!");

                //DefaultTableModel tabelaAluno = (DefaultTableModel) tabela.getModel();
                //tabelaAluno.addRow(linhaSelecionada);
                
                //Limpar a Tela após Confirmada a Inserção das Informações nos Campos            
                nome.setText("");
                cpf.setText("");
                endereco.setText("");
                telefone.setText("");
                idade.setText("");
                mensalidade.setText("");
                multaPorAtraso.setText("");

                //Comando para ser Executado Automat. Sempre que essa Tela for Executada Também
                preencheTabela();
            }
        }
    }//GEN-LAST:event_editarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:

        //Botão Clicar com Mouse nas Lindas da Tabela, para Alimentar os Campos Vazios acima
        if (tabela.getSelectedRow() != -1) {
            nome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            cpf.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            endereco.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            telefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            idade.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            mensalidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
            multaPorAtraso.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyReleased
        // TODO add your handling code here:

        //Teclas "Direcionais" do Teclado, para "Deslizar" na Tabela, enquanto Alimenta os Campos Vazios acima
        if (tabela.getSelectedRow() != -1) {
            nome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            cpf.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            endereco.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            telefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            idade.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            mensalidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
            multaPorAtraso.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
        }
    }//GEN-LAST:event_tabelaKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton editar;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton limpar;
    private javax.swing.JButton listar;
    private javax.swing.JTextField mensalidade;
    private javax.swing.JTextField multaPorAtraso;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField pesquisarPorNome;
    private javax.swing.JButton sair;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
