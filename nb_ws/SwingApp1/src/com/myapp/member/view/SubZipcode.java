/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.member.view;

import com.myapp.zipcode.model.ZipcodeDAO;
import com.myapp.zipcode.model.ZipcodeDTO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EZEN
 */
public class SubZipcode extends javax.swing.JFrame implements ActionListener{

    private MemberFrame memberFrame;
    private ZipcodeDAO zipcodeDao;
    private String[] colNames={"우편번호","주소"};
    private DefaultTableModel model=new DefaultTableModel();
    
    /**
     * Creates new form SubZipcode
     */
    public SubZipcode() {
        initComponents();
        zipcodeDao=new ZipcodeDAO();
        
        init();
        
        addEvent();
        
    }

    public SubZipcode(MemberFrame memberFrame) {
        this();
        
        this.memberFrame=memberFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfDong = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("우편번호검색");

        jLabel1.setText("지역명(읍면동)");

        btSearch.setText("검색");

        btClose.setText("닫기");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "우편번호", "시도", "구군", "동", "번지"
            }
        ));
        scrollPane.setViewportView(table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDong, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btClose))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch)
                    .addComponent(btClose))
                .addGap(18, 18, 18)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SubZipcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubZipcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubZipcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubZipcode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubZipcode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClose;
    private javax.swing.JButton btSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable table1;
    private javax.swing.JTextField tfDong;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void addEvent() {
        btSearch.addActionListener(this);
        btClose.addActionListener(this);
        
        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getSource()==table1){
                    settingData();
                }
            }            
        });
    }

    private void settingData(){
        int row=table1.getSelectedRow();
        String zipcode=(String) table1.getValueAt(row, 0);
        String address=(String) table1.getValueAt(row, 1);
        
        memberFrame.tfZipcode.setText(zipcode);
        memberFrame.tfAddress1.setText(address);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btSearch){
            search();
        }else if(e.getSource()==btClose){
            this.dispose();
        }
        
    }

    private void search() {
        //1
        String dong=tfDong.getText();
        if(dong ==null || dong.isEmpty()){
            JOptionPane.showMessageDialog(this, "지역명을 입력하세요");
            tfDong.requestFocus();
            return;
        }
        
        try {
            //2
            ArrayList<ZipcodeDTO> list=zipcodeDao.selectZipcode(dong);
            
            //3
            String[][] data=new String[list.size()][colNames.length];
            for(int i=0;i<list.size();i++){
                ZipcodeDTO dto=list.get(i);
                data[i][0]=dto.getZipcode();
                
                String bunji=dto.getStartbunji();
                String endbunji=dto.getEndbunji();
                if(endbunji!=null && !endbunji.isEmpty()){
                    bunji += " ~ " + endbunji;
                }
                
                String address=dto.getSido()+" "+ dto.getGugun()+" "
                        + dto.getDong() +" " + bunji;
                data[i][1]=address;
            }
            
            model.setDataVector(data, colNames);
            table1.setModel(model);
            
            table1.getColumnModel().getColumn(0).setPreferredWidth(20);
            table1.getColumnModel().getColumn(1).setPreferredWidth(190);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
}
