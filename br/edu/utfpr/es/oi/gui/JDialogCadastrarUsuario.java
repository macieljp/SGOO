package br.edu.utfpr.es.oi.gui;

import br.edu.utfpr.es.oi.util.Util;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author JoaoPaulo
 */
public class JDialogCadastrarUsuario extends javax.swing.JDialog {

    
    public JDialogCadastrarUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
 
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldNome = new javax.swing.JTextField();
        jFormattedTextFieldRA = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSiape = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButtonAluno = new javax.swing.JRadioButton();
        jRadioButtonProfessor = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDepartamento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSenha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabelFoto1 = new javax.swing.JLabel();
        jTextFieldArea = new javax.swing.JTextField();
        jLabelArea = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInteresse = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(640, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(640, 400));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setMaximumSize(new java.awt.Dimension(640, 400));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(640, 400));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(640, 400));

        jPanel3.setEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNome.setEnabled(false);
        jPanel3.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 300, -1));

        try {
            jFormattedTextFieldRA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRA.setToolTipText("Somente números");
        jFormattedTextFieldRA.setEnabled(false);
        jFormattedTextFieldRA.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldRAFocusLost(evt);
            }
        });
        jPanel3.add(jFormattedTextFieldRA, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 110, -1));

        try {
            jFormattedTextFieldSiape.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldSiape.setToolTipText("Somente números");
        jFormattedTextFieldSiape.setEnabled(false);
        jFormattedTextFieldSiape.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldSiapeFocusLost(evt);
            }
        });
        jPanel3.add(jFormattedTextFieldSiape, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, -1));

        jLabel1.setText("Nome:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("RA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SiAPE:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        buttonGroup1.add(jRadioButtonAluno);
        jRadioButtonAluno.setText("Aluno");
        jRadioButtonAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAlunoActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonAluno, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        buttonGroup1.add(jRadioButtonProfessor);
        jRadioButtonProfessor.setText("Professor");
        jRadioButtonProfessor.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jRadioButtonProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonProfessorActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButtonProfessor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel6.setText("Informações Pessoais:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 20));

        jLabelFoto.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/es/oi/icons/icon_student_48.png"))); // NOI18N
        jLabelFoto.setToolTipText("Selecionar Foto");
        jLabelFoto.setAlignmentX(0.5F);
        jLabelFoto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelFoto.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelFoto.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelFoto.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel3.add(jLabelFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel4.setText("Departamento:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        jTextFieldDepartamento.setEnabled(false);
        jPanel3.add(jTextFieldDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 300, -1));

        jLabel9.setText("Senha:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        jTextFieldSenha.setEnabled(false);
        jPanel3.add(jTextFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 100, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 12)); 
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("?");
        jLabel10.setToolTipText("Registro Acâdemico Aluno");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 10, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 12)); 
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("?");
        jLabel11.setToolTipText("Código do Professor");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 20, -1));

        jTextFieldEmail1.setEnabled(false);
        jTextFieldEmail1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEmail1FocusLost(evt);
            }
        });
        jPanel3.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 300, -1));

        jLabel12.setText("E-mail:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        jTabbedPane1.addTab("Informações Pessoais", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFoto1.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFoto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFoto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/utfpr/es/oi/icons/icon_student_48.png"))); // NOI18N
        jLabelFoto1.setToolTipText("Selecionar Foto");
        jLabelFoto1.setAlignmentX(0.5F);
        jLabelFoto1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelFoto1.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabelFoto1.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabelFoto1.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel4.add(jLabelFoto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTextFieldArea.setEnabled(false);
        jPanel4.add(jTextFieldArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 260, -1));

        jLabelArea.setText("Área de Interesse:");
        jPanel4.add(jLabelArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 40));

        jTextAreaInteresse.setColumns(20);
        jTextAreaInteresse.setRows(5);
        jTextAreaInteresse.setEnabled(false);
        jScrollPane1.setViewportView(jTextAreaInteresse);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 410, 210));

        jTabbedPane1.addTab("Área de Interesse", jPanel4);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 400));

        jPanel2.setMaximumSize(new java.awt.Dimension(640, 80));
        jPanel2.setMinimumSize(new java.awt.Dimension(640, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(255, 102, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jButton3.setText("Limpar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, 40));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jButton4.setText("Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, 40));

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jButton2.setText("Cadastrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 640, 80));

        setSize(new java.awt.Dimension(656, 518));
        setLocationRelativeTo(null);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void jRadioButtonProfessorActionPerformed(java.awt.event.ActionEvent evt) {
        UserSelecionado();
    }

    private void jRadioButtonAlunoActionPerformed(java.awt.event.ActionEvent evt) {
        UserSelecionado();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        salvar();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        dispose();
    }

    private void jTextFieldEmail1FocusLost(java.awt.event.FocusEvent evt) {
        if (Util.validarEmail(jTextFieldEmail1.getText().trim())) {
            jTextFieldEmail1.setBackground(Color.green);
        } else {
            jTextFieldEmail1.setBackground(Color.red);
            Util.dispayMsg("E-mail inválido!");
            jTextFieldEmail1.requestFocus();
        }
    }

    private void jFormattedTextFieldSiapeFocusLost(java.awt.event.FocusEvent evt) {

    }

    private void jFormattedTextFieldRAFocusLost(java.awt.event.FocusEvent evt) {


    }

    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jFormattedTextFieldRA;
    private javax.swing.JFormattedTextField jFormattedTextFieldSiape;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFoto1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButtonAluno;
    private javax.swing.JRadioButton jRadioButtonProfessor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaInteresse;
    private javax.swing.JTextField jTextFieldArea;
    private javax.swing.JTextField jTextFieldDepartamento;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSenha;
    

    private void UserSelecionado() {

        if (!jRadioButtonAluno.isSelected() && jRadioButtonProfessor.isSelected()) {

            jFormattedTextFieldRA.setEnabled(false);
            jFormattedTextFieldSiape.setEnabled(true);
            jTextFieldDepartamento.setEnabled(true);
            jTextFieldNome.setEnabled(true);
            jTextFieldSenha.setEnabled(true);
            jTextFieldArea.setEnabled(true);
            jTextFieldEmail1.setEnabled(true);
            jTextAreaInteresse.setEnabled(true);

        } else if (jRadioButtonAluno.isSelected() && !jRadioButtonProfessor.isSelected()) {

            jFormattedTextFieldSiape.setEnabled(false);
            jTextFieldDepartamento.setEnabled(true);
            jFormattedTextFieldRA.setEnabled(true);
            jTextFieldNome.setEnabled(true);
            jTextFieldSenha.setEnabled(true);
            jTextFieldArea.setEnabled(true);
            jTextFieldEmail1.setEnabled(true);
            jTextAreaInteresse.setEnabled(true);

        }

    }

    private void salvar() {
        if (jRadioButtonAluno.isSelected() && !jRadioButtonProfessor.isSelected()) {

            if (verificarCamposAluno()) {  //verifica se o campos Titulo de Aluno esta vazio
//novo aluno
                novo();
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Contem campo vazio ou tipo incorreto de dado !");
        }
        if (!jRadioButtonAluno.isSelected() && jRadioButtonProfessor.isSelected()) {
            if (verificarCamposProfessor()) {  //verifica se o campos Titulo de Aluno esta vazio
//novo professor                novo();
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Contem campo vazio ou tipo incorreto de dado !");
        }
    }

    private void novo() {
        jFormattedTextFieldSiape.setText(null);
        jTextFieldDepartamento.setText(null);
        jTextFieldArea.setText(null);
        jTextAreaInteresse.setText(null);
        jFormattedTextFieldRA.setText(null);
        jTextFieldNome.setText(null);
        jTextFieldSenha.setText(null);
        jTextFieldArea.setText(null);

    }

    protected boolean verificarCamposAluno() {
        return !(jFormattedTextFieldRA.getText().isEmpty()
                && jTextFieldNome.getText().isEmpty() && jTextFieldDepartamento.getText().isEmpty()
                && jTextFieldSenha.getText().isEmpty() && jTextFieldEmail1.getText().isEmpty()
                && jTextFieldArea.getText().isEmpty() /*&& jTextAreaInteresse.getText().isEmpty()*/);

    }

    protected boolean verificarCamposProfessor() {
        return !(jTextFieldNome.getText().isEmpty() && jTextFieldSenha.getText().isEmpty()
                && jTextFieldArea.getText().isEmpty() /*&& jTextAreaInteresse.getText().isEmpty()*/
                && jFormattedTextFieldSiape.getText().isEmpty() && jTextFieldEmail1.getText().isEmpty()
                && jTextFieldDepartamento.getText().isEmpty());

    }
}
