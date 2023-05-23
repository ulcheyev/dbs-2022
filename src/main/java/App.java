/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import dao.BloodBankDAOPostgreSQL;
import entity.BloodbankEntity;
import entity.EmployeeEntity;
import service.EmployeeService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

/**
 * @author Ulchenkov Yevgeniy
 */
public class App extends javax.swing.JFrame {

    javax.swing.JButton getAllDonors;
    // Variables declaration - do not modify
    private javax.swing.JPanel EmployeeFormPanel;
    private javax.swing.JScrollPane EmployeeFormScrollPanel;
    private javax.swing.JTextField documentIdEmployee;
    private javax.swing.JButton employeeAddButton;
    private javax.swing.JTextField employeeAge;
    private javax.swing.JComboBox<String> employeeComboBox;
    private javax.swing.JButton employeeDeleteButton;
    private javax.swing.JTextField employeeEmail;
    private javax.swing.JTextField employeeFirstname;
    private javax.swing.JTextField employeeID;
    private javax.swing.JTextField employeeIdSearchField;
    private javax.swing.JTextField employeeLastname;
    private javax.swing.JButton employeeSearchButton;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton employeeUpdateButton;
    private javax.swing.JButton getAllEmployee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton employeeClearButton;
    private DefaultTableModel model1;
    private EmployeeService employeeService;
    private DefaultComboBoxModel empComboMod;
    /**
     * Creates new form NewJFrame
     */
    public App() {
        initComponents();
        updateComboBox();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        EmployeeFormPanel = new javax.swing.JPanel();
        EmployeeFormScrollPanel = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        employeeIdSearchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        employeeClearButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        documentIdEmployee = new javax.swing.JTextField();
        employeeSearchButton = new javax.swing.JButton();
        getAllEmployee = new javax.swing.JButton();
        employeeID = new javax.swing.JTextField();
        employeeFirstname = new javax.swing.JTextField();
        employeeLastname = new javax.swing.JTextField();
        employeeAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        employeeEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        employeeAddButton = new javax.swing.JButton();
        employeeUpdateButton = new javax.swing.JButton();
        employeeDeleteButton = new javax.swing.JButton();
        employeeComboBox = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();

        getAllDonors = new javax.swing.JButton();


        model1 = new DefaultTableModel();


        employeeService = new EmployeeService();


        empComboMod = new DefaultComboBoxModel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);


        Object[] column = {"Document ID", "Firstname", "Employee ID", "Lastname", "Age", "Email", "Workplace"};
        model1.setColumnIdentifiers(column);
        employeeTable.setModel(model1);

        EmployeeFormScrollPanel.setViewportView(employeeTable);

        jLabel1.setText("Employee ID:");

        jLabel2.setText("Document ID:");

        jLabel3.setText("Employee ID:");

        jLabel4.setText("Firstname:");

        jLabel5.setText("Lastname:");

        jLabel6.setText("Age:");

        employeeSearchButton.setText("Search");

        getAllEmployee.setText("Get All");

        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Edit Panel");

        employeeAddButton.setText("Add");

        employeeUpdateButton.setText("Update");

        employeeDeleteButton.setText("Delete");
        employeeDeleteButton.setActionCommand("");

        employeeTable.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                employeeTableMouseListenerAction(e);
            }
        });


        employeeSearchButton.setText("Search");
        employeeSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeSearchButtonActionPerformed(evt);
            }
        });

        getAllEmployee.setText("Get All");
        getAllEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllEmployeeActionPerformed(evt);
            }
        });

        jLabel7.setText("Email:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Edit Panel");

        employeeAddButton.setText("Add");
        employeeAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeAddButtonActionPerformed(evt);
            }
        });

        employeeUpdateButton.setText("Update");
        employeeUpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeUpdateButtonActionPerformed(evt);
            }
        });

        employeeDeleteButton.setText("Delete");
        employeeDeleteButton.setActionCommand("");
        employeeDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeDeleteButtonActionPerformed(evt);
            }
        });

        employeeComboBox.setModel(empComboMod);
        employeeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeComboBoxActionPerformed(evt);
            }
        });

        jLabel17.setText("Workplace:");

        employeeClearButton.setText("Clear");
        employeeClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EmployeeFormPanelLayout = new javax.swing.GroupLayout(EmployeeFormPanel);
        EmployeeFormPanel.setLayout(EmployeeFormPanelLayout);
        EmployeeFormPanelLayout.setHorizontalGroup(
                EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeFormPanelLayout.createSequentialGroup()
                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(EmployeeFormPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(EmployeeFormPanelLayout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(documentIdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(EmployeeFormPanelLayout.createSequentialGroup()
                                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel7)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(jLabel17)
                                                                        .addComponent(employeeAddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeFormPanelLayout.createSequentialGroup()
                                                                                .addComponent(employeeUpdateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(employeeDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(employeeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(employeeAge)
                                                                        .addComponent(employeeLastname)
                                                                        .addComponent(employeeFirstname)
                                                                        .addComponent(employeeID)
                                                                        .addComponent(employeeEmail)))))
                                        .addGroup(EmployeeFormPanelLayout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(employeeClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(EmployeeFormPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(employeeIdSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(employeeSearchButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(getAllEmployee))
                                        .addComponent(EmployeeFormScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
        );
        EmployeeFormPanelLayout.setVerticalGroup(
                EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeFormPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(getAllEmployee, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1)
                                                .addComponent(employeeIdSearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(employeeSearchButton)))
                                .addGap(18, 18, 18)
                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(EmployeeFormPanelLayout.createSequentialGroup()
                                                .addComponent(EmployeeFormScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(EmployeeFormPanelLayout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addComponent(jLabel8)
                                                .addGap(18, 18, 18)
                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(documentIdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(employeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(28, 28, 28)
                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(employeeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(employeeFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(employeeLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(employeeAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel17)
                                                        .addComponent(employeeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(EmployeeFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(employeeAddButton)
                                                        .addComponent(employeeUpdateButton)
                                                        .addComponent(employeeDeleteButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(employeeClearButton)
                                                .addGap(31, 31, 31))))
        );

        jTabbedPane1.addTab("Employee", EmployeeFormPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>

    private void employeeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void employeeAddButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String name = employeeFirstname.getText();
        String lastname = employeeLastname.getText();
        String age = employeeAge.getText();
        String empId = employeeID.getText();
        String empDocId = documentIdEmployee.getText();
        String empEmail = employeeEmail.getText();
        String workplace = employeeComboBox.getSelectedItem().toString();
        if (name.equals("") || lastname.equals("") || age.equals("") || empId.equals("") || empEmail.equals("") || workplace.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all info");
        } else {
            if (employeeService.searchByEmployeeId(empId) == null && employeeService.searchByDocumentId(empDocId) == null && employeeService.searchEmployeeByEmail(empEmail) == null) {
                employeeService.addEmployee(name, lastname, age, empDocId, empId, empEmail, workplace);
                JOptionPane.showMessageDialog(null, "Added");
            } else {
                JOptionPane.showMessageDialog(null, "Person with this data already exists");
            }
        }

    }

    private void employeeUpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int i = employeeTable.getSelectedRow();
        String name = employeeFirstname.getText();
        String lastname = employeeLastname.getText();
        String age = employeeAge.getText();
        String empId = employeeID.getText();
        String empDocId = documentIdEmployee.getText();
        String empEmail = employeeEmail.getText();
        String workplace = employeeComboBox.getSelectedItem().toString();
        if (name.equals("") || lastname.equals("") || age.equals("") || empId.equals("") || empEmail.equals("") || workplace.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill all info");
        } else {
            employeeService.updateEmployee(empDocId, empId, name, lastname, age, empEmail, workplace);
            JOptionPane.showMessageDialog(null, "Updated");
        }


    }

    private void employeeTableMouseListenerAction(MouseEvent e) {
        int i = employeeTable.getSelectedRow();
        documentIdEmployee.setText(model1.getValueAt(i, 0).toString());
        employeeFirstname.setText(model1.getValueAt(i, 1).toString());
        employeeID.setText(model1.getValueAt(i, 2).toString());
        employeeLastname.setText(model1.getValueAt(i, 3).toString());
        employeeAge.setText(model1.getValueAt(i, 4).toString());
        employeeEmail.setText(model1.getValueAt(i, 5).toString());
        employeeComboBox.setSelectedItem(model1.getValueAt(i, 6).toString());
        documentIdEmployee.setEditable(false);
    }

    private void employeeDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int i = employeeTable.getSelectedRow();
        if (i >= 0) {
            employeeService.deleteEmployee(Integer.parseInt(model1.getValueAt(i, 0).toString()));
            model1.removeRow(i);
            JOptionPane.showMessageDialog(null, "Deleted");
        } else {
            JOptionPane.showMessageDialog(null, "Select the row to delete ");
        }
    }

    private void employeeSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String empdIDSearch = employeeIdSearchField.getText();
        if (empdIDSearch.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill Employee ID");
        } else {
            EmployeeEntity emp = employeeService.searchByEmployeeId(empdIDSearch);
            if (emp == null) {
                JOptionPane.showMessageDialog(null, "Employee with such an Employee ID has not been found");
            } else {
                Object[] rowEmp = new Object[7];
                rowEmp[0] = emp.getDocumentid();
                rowEmp[1] = emp.getFirstname();
                rowEmp[2] = emp.getEmployeeid();
                rowEmp[3] = emp.getLastname();
                rowEmp[4] = emp.getAge();
                rowEmp[5] = emp.getEmail();
                rowEmp[6] = emp.getWorkplace().getName();
                model1.setRowCount(0);
                model1.addRow(rowEmp);
            }
        }

    }

    private void getAllEmployeeActionPerformed(java.awt.event.ActionEvent evt) {
        model1.setRowCount(0);
        model1.setNumRows(0);
        model1.fireTableDataChanged();
        employeeTable.repaint();
        List<EmployeeEntity> emps = employeeService.getAll();
        Object[] row = new Object[7];
        for (EmployeeEntity emp : emps) {
            row[0] = emp.getDocumentid();
            row[1] = emp.getFirstname();
            row[2] = emp.getEmployeeid();
            row[3] = emp.getLastname();
            row[4] = emp.getAge();
            row[5] = emp.getEmail();
            row[6] = emp.getWorkplace().getName();
            model1.addRow(row);
        }

    }

    private void employeeClearButtonActionPerformed(java.awt.event.ActionEvent evt) {
        documentIdEmployee.setText("");
        employeeFirstname.setText("");
        employeeID.setText("");
        employeeLastname.setText("");
        employeeAge.setText("");
        employeeEmail.setText("");
        employeeComboBox.setSelectedItem("");
        documentIdEmployee.setEditable(true);
    }

    public void updateComboBox() {
        BloodBankDAOPostgreSQL bb = new BloodBankDAOPostgreSQL();
        List<BloodbankEntity> res = bb.getAllBloodBanks();
        for (BloodbankEntity entry : res) {
            employeeComboBox.addItem(entry.getName());
        }
    }
    // End of variables declaration
}
