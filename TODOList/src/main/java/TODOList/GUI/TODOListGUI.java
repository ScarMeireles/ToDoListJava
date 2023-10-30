package TODOList.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TODOListGUI extends JFrame{
    public static void main(String[] args) {
    }
    ArrayList<String> tarefas = new ArrayList<String>();
    public JPanel painel = new JPanel();
    public JButton jButtonRegistrar = new JButton("Registrar Tarefa");
    public JButton jButtonListar = new JButton("Listar Rarefas");
    public JButton jButtonRemover = new JButton("Remover Tarefas");
    public JLabel jLabelMensagem = new JLabel("Exemplo simples de Janela");
    //Construtor


    public TODOListGUI() {
        this.setTitle("TODO List - Lista de Tarefas");
        this.setSize(400, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255, 255, 255));
        jButtonRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Digite a tarefa a ser adicionada: ");//System.out.println
                String tarefa = JOptionPane.showInputDialog(null, "Tarefa adicionada com Sucesso!");
                adicionarTarefa(tarefas, tarefa);
            }
        });

        jButtonListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listarTarefas(tarefas);
            }
        });
        jButtonRemover.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Digite o índice da tarefa a ser removida: ");
                String tarefa = JOptionPane.showInputDialog(null, "Tarefa removida com Sucesso!");
                removerTarefa(tarefas, indice);
            }
        });

        painel.add(jButtonRegistrar);
        painel.add(jButtonListar);
        painel.add(jButtonRemover);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); //Centralizar Janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); //Exibir Janela
    }
    public static void adicionarTarefa(ArrayList<String> tarefas, String tarefa) {
        tarefas.add(tarefa);
        JOptionPane.showMessageDialog(null, "Tarefa Adicionada!");
    }
    private static void listarTarefas(ArrayList<String> tarefas) {
        for (String tarefa : tarefas) {
            JOptionPane.showMessageDialog(null, tarefa);
        }
    }
    private static void removerTarefa(ArrayList<String> tarefas, int indice) {
        tarefas.remove(indice);
        JOptionPane.showMessageDialog(null, "Tarefa removida com sucesso.");
    }


}
