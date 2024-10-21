/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Arreglos.LibrosArray;
import Clases.Libro;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 */
public class GUI_Libros extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Libros
     */
    private DefaultTableModel modeloTabla = new DefaultTableModel();
    private int TamañoArray = 10;
    private LibrosArray LibroArray = new LibrosArray(TamañoArray);
    private String FORM_ACCION = "REGISTRO";
    private static Libro[] ListaLibros;
    public GUI_Libros() {
        initComponents();
        this.setLocationRelativeTo(null);
        LibroArray.agregar(new Libro(1,"El Alquimista","HP. LOVECRAFT","34234-56665-33"));
        LibroArray.agregar(new Libro(2,"Carrie","STEPHEN KING","7144-3342-122"));
        LibroArray.agregar(new Libro(3,"The Hobbit","J.R TOLKIEN","5345-333-2342"));
        
        mostrarTablaLibros();
    }

    // METODOS
    public void mostrarTablaLibros(){
        try {
            String columnas[] = {"Codigo","Titulo", "Autor", "ISBN"};
            modeloTabla.setColumnIdentifiers(columnas);
            modeloTabla.setRowCount(0);
            table_libros.setModel(modeloTabla);
            
            Libro[] data = LibroArray.obtenerLista();
            ListaLibros = data;
            
            for (int i=0; i<data.length; i++){
                if (data[i] == null){
                    continue;
                }
                int codigo = data[i].getCodigo();
                String titulo = data[i].getTitulo();
                String autor = data[i].getAutor();
                String isbn = data[i].getISBN();
                modeloTabla.addRow(new Object[]{codigo, titulo, autor, isbn});
            }
        } catch (Exception e) {
            System.out.println("Error Listado: "+e.getMessage());
        }
    }
    
    private void buscarLibro(String valor, String tipo){
        modeloTabla.setRowCount(0);
        table_libros.setModel(modeloTabla);
        
        for (Libro libro: LibroArray.obtenerLista()){
            if (libro == null){
                continue;
            }
            int codigo = libro.getCodigo();
            String titulo = libro.getTitulo();
            String autor = libro.getAutor();
            String isbn = libro.getISBN();
            valor = valor.toUpperCase();
            switch (tipo) {
                case "TITULO":
                    if (titulo.toUpperCase().startsWith(valor)){
                        modeloTabla.addRow(new Object[]{ codigo,titulo,autor,isbn });
                    }
                    break;
                case "AUTOR":
                    if (autor.toUpperCase().startsWith(valor)){
                        modeloTabla.addRow(new Object[]{ codigo,titulo,autor,isbn });
                    }
                    break;
                case "ISBN":
                    if (isbn.toUpperCase().startsWith(valor)){
                        modeloTabla.addRow(new Object[]{ codigo,titulo,autor,isbn });
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            
            
        }
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GROUP_TABS = new javax.swing.JTabbedPane();
        TAB_LISTA = new javax.swing.JPanel();
        ertt4 = new javax.swing.JScrollPane();
        table_libros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_tipo_busqueda = new javax.swing.JComboBox<>();
        btn_editar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        TAB_FORM = new javax.swing.JPanel();
        label_titulo_formulario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_autor = new javax.swing.JTextField();
        txt_isbn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        label_error_titulo = new javax.swing.JLabel();
        label_error_isbn = new javax.swing.JLabel();
        label_error_autor = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ertt4.setViewportView(table_libros);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Lista de Libros");

        txt_buscar.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txt_buscarInputMethodTextChanged(evt);
            }
        });
        txt_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscarActionPerformed(evt);
            }
        });
        txt_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_buscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_buscarKeyTyped(evt);
            }
        });

        jLabel2.setText("Buscar");

        jLabel3.setText("Tipo de Busqueda");

        cmb_tipo_busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TITULO", "AUTOR", "ISBN" }));

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TAB_LISTALayout = new javax.swing.GroupLayout(TAB_LISTA);
        TAB_LISTA.setLayout(TAB_LISTALayout);
        TAB_LISTALayout.setHorizontalGroup(
            TAB_LISTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_LISTALayout.createSequentialGroup()
                .addGroup(TAB_LISTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TAB_LISTALayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TAB_LISTALayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TAB_LISTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TAB_LISTALayout.createSequentialGroup()
                                .addComponent(ertt4, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(TAB_LISTALayout.createSequentialGroup()
                                .addGroup(TAB_LISTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TAB_LISTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cmb_tipo_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TAB_LISTALayout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(155, 155, 155)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TAB_LISTALayout.setVerticalGroup(
            TAB_LISTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAB_LISTALayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(TAB_LISTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TAB_LISTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addGroup(TAB_LISTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_tipo_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_editar)
                        .addComponent(btn_eliminar)
                        .addComponent(btn_nuevo)))
                .addGap(18, 18, 18)
                .addComponent(ertt4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        GROUP_TABS.addTab("Lista de Libros", TAB_LISTA);

        label_titulo_formulario.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        label_titulo_formulario.setText("Nuevo Libro");

        jLabel5.setText("Titulo:");

        jLabel6.setText("Autor:");

        jLabel7.setText("ISBN:");

        btn_guardar.setText("GUARDAR");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TAB_FORMLayout = new javax.swing.GroupLayout(TAB_FORM);
        TAB_FORM.setLayout(TAB_FORMLayout);
        TAB_FORMLayout.setHorizontalGroup(
            TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_FORMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(TAB_FORMLayout.createSequentialGroup()
                                    .addGroup(TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(126, 126, 126))
                                .addComponent(label_titulo_formulario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TAB_FORMLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TAB_FORMLayout.createSequentialGroup()
                        .addGroup(TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TAB_FORMLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_error_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_error_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(TAB_FORMLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(label_error_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(205, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TAB_FORMLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        TAB_FORMLayout.setVerticalGroup(
            TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_FORMLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_titulo_formulario)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_error_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_error_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TAB_FORMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_error_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        GROUP_TABS.addTab("Nuevo Libro", TAB_FORM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(GROUP_TABS, javax.swing.GroupLayout.PREFERRED_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GROUP_TABS)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        label_titulo_formulario.setText("");
        if (LibroArray.obtenerElementosValidos() == TamañoArray){
            JOptionPane.showMessageDialog(null, "Se ha llegado al Limite maximo de registros.");
            return;
        }
        
        String titulo = String.valueOf(txt_titulo.getText());
        String autor = String.valueOf(txt_autor.getText());
        String isbn = String.valueOf(txt_isbn.getText());
        int errores = 0;
        if (titulo.length() == 0){
            label_error_titulo.setText("Titulo requerido!");
            errores++;
        }
        if (autor.length() == 0){
            label_error_autor.setText("Autor requerido!");
            errores++;
        }
        if (isbn.length() == 0){
            label_error_isbn.setText("ISBN requerido!");
            errores++;
        }
        
        if (errores > 0){ return; }
        
        String mensaje = "***";
        Libro LibroGuardar = new Libro();
        
        if (FORM_ACCION.equals("REGISTRO")){
            LibroGuardar.setCodigo(LibroArray.obtenerIndiceVacio());
            LibroGuardar.setTitulo(txt_titulo.getText());
            LibroGuardar.setAutor(txt_autor.getText());
            LibroGuardar.setISBN(txt_isbn.getText());
            LibroArray.agregar(LibroGuardar);
            mensaje = "Libro Registrado con exito!";
        
        }else if (FORM_ACCION.equals("EDICION")) {
            LibroGuardar.setCodigo(Integer.parseInt(txt_codigo.getText()));
            LibroGuardar.setTitulo(txt_titulo.getText());
            LibroGuardar.setAutor(txt_autor.getText());
            LibroGuardar.setISBN(txt_isbn.getText());
            LibroArray.editar(LibroGuardar);
            mensaje = "Libro actualizado!";
        }
        
        txt_codigo.setText("");
        txt_titulo.setText("");
        txt_autor.setText("");
        txt_isbn.setText("");
        label_titulo_formulario.setText("Nuevo Libro");
        FORM_ACCION = "REGISTRO";
        
        JOptionPane.showMessageDialog(null, mensaje);
        mostrarTablaLibros();
        GROUP_TABS.setSelectedComponent(TAB_LISTA);
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
        txt_titulo.setText("");
        txt_autor.setText("");
        txt_isbn.setText("");
        txt_codigo.setText(String.valueOf(LibroArray.obtenerIndiceVacio()));
        GROUP_TABS.setSelectedComponent(TAB_FORM);
        txt_titulo.requestFocus();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        // TODO add your handling code here:
        int fila = table_libros.getSelectedRow();
        if (fila < 0){
            JOptionPane.showMessageDialog(null, "Libro no seleccionado");
            return;
        }
        int codigo = (int) modeloTabla.getValueAt(fila, 0);
        Libro LibroData = LibroArray.obtenerLibro(codigo);
        if (LibroData == null){
            JOptionPane.showMessageDialog(null, "Libro no encontrado.");
            return;
        }
        txt_codigo.setText(String.valueOf(LibroData.getCodigo()));
        txt_titulo.setText(LibroData.getTitulo());
        txt_autor.setText(LibroData.getAutor());
        txt_isbn.setText(LibroData.getISBN());
                
        FORM_ACCION = "EDICION";
        label_titulo_formulario.setText("Edicion de Libro");
        
        GROUP_TABS.setSelectedComponent(TAB_FORM);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        int fila = table_libros.getSelectedRow();
        if (fila < 0){
            JOptionPane.showMessageDialog(null, "Libro no seleccionado.");
            return;
        }
        int codigo = (int) modeloTabla.getValueAt(fila, 0);
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Eliminar Libro?","Cuidado!",JOptionPane.YES_NO_OPTION);
        if (confirmacion == 0){
            LibroArray.eliminar(codigo);
            mostrarTablaLibros();
        }
        
        
        
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarKeyTyped

    private void txt_buscarInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txt_buscarInputMethodTextChanged
        // TODO add your handling code here:
        System.out.println(txt_buscar.getText());
    }//GEN-LAST:event_txt_buscarInputMethodTextChanged

    private void txt_buscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscarKeyPressed

    private void txt_buscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscarKeyReleased
        try {
            String valor = txt_buscar.getText();
            String tipo = String.valueOf(cmb_tipo_busqueda.getSelectedItem());
            buscarLibro(valor, tipo);
        } catch (Exception e) {
            System.out.println("Error Busqueda: "+e.getMessage());
        }
    }//GEN-LAST:event_txt_buscarKeyReleased

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
            java.util.logging.Logger.getLogger(GUI_Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Libros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Libros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane GROUP_TABS;
    private javax.swing.JPanel TAB_FORM;
    private javax.swing.JPanel TAB_LISTA;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JComboBox<String> cmb_tipo_busqueda;
    private javax.swing.JScrollPane ertt4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel label_error_autor;
    private javax.swing.JLabel label_error_isbn;
    private javax.swing.JLabel label_error_titulo;
    private javax.swing.JLabel label_titulo_formulario;
    private javax.swing.JTable table_libros;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}