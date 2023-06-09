/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import dao.ProfessorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Professor;

/**
 *
 * @author VladGepar
 */
public class TelaProfessor extends javax.swing.JFrame {

    public void preencheTabela() {

        //Criar uma Variável "professorDAO"
        //Pegar Dados dos Professores da "listaProfe" e Colocá-los dentro da "tabelaProfessor"
        ProfessorDAO profeDAO = new ProfessorDAO();
        String nome = pesquisarPorNome.getText();
        List<Professor> listaProfe = profeDAO.getProfessor(nome);

        DefaultTableModel tabelaProfessor = (DefaultTableModel) tabela.getModel();

        //Comando para Fazer a "Ordenação" das "Linhas/Listas" na Tabela
        tabela.setRowSorter(new TableRowSorter(tabelaProfessor));

        //Comando "Evento CaretUpdate" para Filtrar "Linhas/Listas" na Tabela, enquanto Pesquisa por Nome
        tabelaProfessor.setNumRows(0);

        //Percorrer a "listaProfe" e Inserir na "tabelaProfessor"
        for (Professor profe : listaProfe) {
            Object[] obj = new Object[]{
                profe.getId_professor(), //Posição 1 do Array
                profe.getNome(), //Posição 2 do Array
                profe.getCpf(), //Posição 3 do Array
                profe.getEndereco(), //Posição 4 do Array
                profe.getTelefone(), //Posição 5 do Array
                profe.getIdade(), //Posição 6 do Array
                profe.getSalario(), //Posição 7 do Array
                profe.getHoraTrabalhada(), //Posição 8 do Array
            };
            //Comando para Preencher as "Linhas/Listas" na Tabela Novamente
            tabelaProfessor.addRow(obj);
        }
    }

    /**
     * Creates new form FormTabela
     */
    public TelaProfessor() {
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
        horaTrabalhada = new javax.swing.JTextField();
        salario = new javax.swing.JTextField();
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
                "Id", "Nome", "CPF", "Endereço", "Telefone", "Idade", "Salário", "Hora Trabalhada"
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
        jLabel5.setText("Cadastro - Professor(a)");

        jLabel2.setText("CPF");

        jLabel3.setText("Idade");

        jLabel4.setText("Salário");

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

        jLabel7.setText("Hora Trabalhada");

        jLabel8.setText("Telefone");

        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });

        salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(limpar)
                .addGap(39, 39, 39)
                .addComponent(listar)
                .addGap(40, 40, 40)
                .addComponent(cadastrar)
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pesquisarPorNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(endereco)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nome))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(horaTrabalhada, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cpf))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 69, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(sair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editar)
                .addGap(47, 47, 47)
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
                    .addComponent(salario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(horaTrabalhada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        //DefaultTableModel tabelaProfessor = (DefaultTableModel) tabela.getModel();
        //Object[] dados = {nome.getText(), cpf.getText(), endereco.getText(), telefone.getText(), idade.getText(), salario.getText(), horaTrabalhada.getText()};
        //tabelaProfessor.addRow(dados);  
        
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

        } else if ((salario.getText().isEmpty())) {
            JOptionPane.showInternalMessageDialog(null, "Campo Salário deve ser Preenchido.");

        } else if (Float.parseFloat(salario.getText()) < 0) {
            JOptionPane.showInternalMessageDialog(null, "Campo Salário Não Permite Valor Negativo.");

        } else if ((horaTrabalhada.getText().isEmpty())) {
            JOptionPane.showInternalMessageDialog(null, "Campo Hora Trabalhada deve ser Preenchido.");

        } else if (Integer.parseInt(horaTrabalhada.getText()) < 0) {
            JOptionPane.showInternalMessageDialog(null, "Campo Hora Trabalhada Não Permite Valor Negativo.");

        } else {

            Professor profe = new Professor();
            profe.setNome(nome.getText());
            profe.setCpf(cpf.getText());
            profe.setEndereco(endereco.getText());
            profe.setTelefone(telefone.getText());
            profe.setIdade(Integer.parseInt(idade.getText()));
            profe.setSalario(Float.parseFloat(salario.getText()));
            profe.setHoraTrabalhada(Integer.parseInt(horaTrabalhada.getText()));

            //Instanciar a Classe ProfessorDAO, Criando seu Objeto dao
            ProfessorDAO dao = new ProfessorDAO();
            dao.adicionar(profe);
            JOptionPane.showMessageDialog(null, "Professor(a) " + nome.getText() + " Inserido(a) com Sucesso!");

            //Limpar a Tela após Confirmada a Inserção das Informações nos Campos
            nome.setText("");
            cpf.setText("");
            endereco.setText("");
            telefone.setText("");
            idade.setText("");
            salario.setText("");
            horaTrabalhada.setText("");

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
        salario.setText("");
        horaTrabalhada.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:

        //Botão "Listar" Tabela Atualizada
        TelaProfessor tp = new TelaProfessor();
        tp.setVisible(true);
    }//GEN-LAST:event_listarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:

        //Botão "Excluir" Linha/Professor da Tabela
        int linhaSelecionada = tabela.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(null, "Selecione Linha/Professor(a) para Excluir.");

        } else {
            
            //Instanciar a Classe ProfessorDAO, Criando seu Objeto dao
            Professor profe = new Professor();
            ProfessorDAO dao = new ProfessorDAO();

            profe.setId_professor((int) tabela.getValueAt(tabela.getSelectedRow(), 0));
            dao.excluir(profe);
            JOptionPane.showMessageDialog(null, "Professor(a) " + nome.getText() + " Excluído(a) com Sucesso.");

            //DefaultTableModel tabelaProfessor = (DefaultTableModel) tabela.getModel();
            //tabelaProfessor.removeRow(linhaSelecionada);
            
            //Limpar a Tela após Confirmada a Inserção das Informações nos Campos
            nome.setText("");
            cpf.setText("");
            endereco.setText("");
            telefone.setText("");
            idade.setText("");
            salario.setText("");
            horaTrabalhada.setText("");

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
            JOptionPane.showMessageDialog(null, "Selecione Linha/Professor(a) para Editar.");

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

            } else if ((salario.getText().isEmpty())) {
                JOptionPane.showInternalMessageDialog(null, "Campo Salário deve ser Preenchido.");

            } else if (Float.parseFloat(salario.getText()) < 0) {
                JOptionPane.showInternalMessageDialog(null, "Campo Salário Não Permite Valor Negativo.");

            } else if ((horaTrabalhada.getText().isEmpty())) {
                JOptionPane.showInternalMessageDialog(null, "Campo Hora Trabalhada deve ser Preenchido.");

            } else if (Integer.parseInt(horaTrabalhada.getText()) < 0) {
                JOptionPane.showInternalMessageDialog(null, "Campo Hora Trabalhada Não Permite Valor Negativo.");

            } else {

                //Instanciar a Classe ProfessorDAO, Criando seu Objeto dao
                Professor profe = new Professor();
                ProfessorDAO dao = new ProfessorDAO();

                profe.setId_professor((int) tabela.getValueAt(tabela.getSelectedRow(), 0));
                profe.setNome(nome.getText());
                profe.setCpf(cpf.getText());
                profe.setEndereco(endereco.getText());
                profe.setTelefone(telefone.getText());
                profe.setIdade(Integer.parseInt(idade.getText()));
                profe.setSalario(Float.parseFloat(salario.getText()));
                profe.setHoraTrabalhada(Integer.parseInt(horaTrabalhada.getText()));
                dao.editar(profe);
                JOptionPane.showMessageDialog(null, "Professor(a) " + nome.getText() + " Editado(a) com Sucesso!");

                //DefaultTableModel tabelaProfessor = (DefaultTableModel) tabela.getModel();
                //tabelaProfessor.addRow(linhaSelecionada);
                
                //Limpar a Tela após Confirmada a Inserção das Informações nos Campos            
                nome.setText("");
                cpf.setText("");
                endereco.setText("");
                telefone.setText("");
                idade.setText("");
                salario.setText("");
                horaTrabalhada.setText("");

                //Comando para ser Executado Automat. Sempre que essa Tela for Executada Também
                preencheTabela();
            }
        }
    }//GEN-LAST:event_editarActionPerformed

    private void salarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        // TODO add your handling code here:

        //Botão Clicar com Mouse nas Lindas da Tabela, para Alimentar os Campos Vazios acima
        if (tabela.getSelectedRow() != -1) {
            nome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            cpf.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            endereco.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            telefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            idade.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            salario.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
            horaTrabalhada.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
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
            salario.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
            horaTrabalhada.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
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
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaProfessor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JTextField cpf;
    private javax.swing.JButton editar;
    private javax.swing.JTextField endereco;
    private javax.swing.JButton excluir;
    private javax.swing.JTextField horaTrabalhada;
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
    private javax.swing.JTextField nome;
    private javax.swing.JTextField pesquisarPorNome;
    private javax.swing.JButton sair;
    private javax.swing.JTextField salario;
    private javax.swing.JTable tabela;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
