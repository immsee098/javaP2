/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package com.myapp.product.view;

import com.myapp.member.model.MemberService;
import com.myapp.member.view.MemberFrame;
import com.myapp.product.model.ProductDAO;
import com.myapp.product.model.ProductDTO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EZEN
 */
public class ProductGUI extends javax.swing.JFrame implements  ActionListener{
    private ProductDAO productDao;
    private DefaultTableModel model=new DefaultTableModel();
    private String[] colNames={"번호","상품명","가격"};
    
    /**
     * Creates new form ProductGUI
     */
    public ProductGUI() {
        initComponents();
        
        productDao  = new ProductDAO();
        
        init();
        
        addEvent();
        
        showAll();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        group1 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jToolBar1 = new javax.swing.JToolBar();
        btAdd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btMemEdit = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        tab1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfNo = new javax.swing.JTextField();
        tfProductName = new javax.swing.JTextField();
        tfPrice = new javax.swing.JTextField();
        tfRegdate = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDescription = new javax.swing.JTextArea();
        tab2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        rdPdName = new javax.swing.JRadioButton();
        rdPrice = new javax.swing.JRadioButton();
        cbPdName = new javax.swing.JComboBox<>();
        tfPrice1 = new javax.swing.JTextField();
        lb = new javax.swing.JLabel();
        tfPrice2 = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfUserid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("상품 관리");

        jToolBar1.setRollover(true);

        btAdd.setText("등록");
        btAdd.setFocusable(false);
        btAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btAdd);

        btEdit.setText("수정");
        btEdit.setFocusable(false);
        btEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btEdit);

        btDel.setText("삭제");
        btDel.setFocusable(false);
        btDel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btDel.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btDel);

        btExit.setText("종료");
        btExit.setFocusable(false);
        btExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btExit);

        btMemEdit.setText("회원정보수정");
        btMemEdit.setFocusable(false);
        btMemEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btMemEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btMemEdit);

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "번호", "상품명", "가격"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jLabel2.setText("상품번호");

        jLabel3.setText("상품명");

        jLabel4.setText("가격");

        jLabel5.setText("등록일");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("상품설명"));

        taDescription.setColumns(20);
        taDescription.setRows(5);
        jScrollPane2.setViewportView(taDescription);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                            .addComponent(tfRegdate))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfRegdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabbedPane.addTab("상품등록", tab1);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("조회조건"));

        group1.add(rdPdName);
        rdPdName.setText("상품명으로 검색");

        group1.add(rdPrice);
        rdPrice.setText("가격으로 검색");

        lb.setText("~");

        btSearch.setText("검색");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdPdName)
                    .addComponent(rdPrice))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbPdName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb)
                        .addGap(18, 18, 18)
                        .addComponent(tfPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btSearch)))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdPdName)
                    .addComponent(cbPdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdPrice)
                    .addComponent(tfPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb)
                    .addComponent(tfPrice2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSearch))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "번호", "상품명", "가격", "설명", "등록일"
            }
        ));
        jScrollPane3.setViewportView(table2);

        javax.swing.GroupLayout tab2Layout = new javax.swing.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tabbedPane.addTab("상품검색", tab2);

        jLabel1.setText("아이디");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabbedPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfUserid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        try {
            ArrayList<ProductDTO> list
                    =ProductDAO.selectTest(tfPrice1.getText(), tfPrice2.getText());
        } catch (SQLException ex) {
            Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ProductGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btSearchActionPerformed
    
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
            java.util.logging.Logger.getLogger(ProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductGUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btMemEdit;
    private javax.swing.JButton btSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbPdName;
    private javax.swing.ButtonGroup group1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb;
    private javax.swing.JRadioButton rdPdName;
    private javax.swing.JRadioButton rdPrice;
    private javax.swing.JTextArea taDescription;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel tab2;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTextField tfNo;
    private javax.swing.JTextField tfPrice;
    private javax.swing.JTextField tfPrice1;
    private javax.swing.JTextField tfPrice2;
    private javax.swing.JTextField tfProductName;
    private javax.swing.JTextField tfRegdate;
    private javax.swing.JTextField tfUserid;
    // End of variables declaration//GEN-END:variables
    
    private void init() {
        tfNo.setEditable(false);
        tfRegdate.setEditable(false);
        tfUserid.setEditable(false);
        
        tfUserid.setText(MemberService.getUserid());
        
        //comboBox에 항목 추가
        //[1]
        /*cbPdName.addItem("사과");
        cbPdName.addItem("귤");
        cbPdName.addItem("포도");*/
        
        //[2]
        /*String[] arr = {"java","oracle","jsp"};
        DefaultComboBoxModel cbModel=new DefaultComboBoxModel<>(arr);
        cbPdName.setModel(cbModel);*/
        
        //[3]
        /*Vector<String> vec = new Vector<String>();
        vec.add("mysql");
        vec.add("oracle");
        vec.add("mssql");
        
        DefaultComboBoxModel cbModel2 = new DefaultComboBoxModel(vec);
        cbPdName.setModel(cbModel2);*/
        
        
    }
    
    private void addEvent() {
        btAdd.addActionListener(this);
        btEdit.addActionListener(this);
        btDel.addActionListener(this);
        btExit.addActionListener(this);
        table1.addMouseListener(new EventHandler());
        cbPdName.addItemListener(new EventHandler());
        btMemEdit.addActionListener(this);
        
        tabbedPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JTabbedPane tpane = (JTabbedPane) e.getSource();
                int idx=tpane.getSelectedIndex();
                if(idx==0){
                    System.out.println("index="+ idx);
                }else if(idx==1){
                    System.out.println("index="+ idx); 
                    
                    try {
                        Vector<String> vec=productDao.selectProductName();
                        DefaultComboBoxModel cbModel=new DefaultComboBoxModel(vec);
                        cbPdName.setModel(cbModel);
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            }
            
        });
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==btAdd){
                add();
            }else if(e.getSource()==btEdit){
                edit();
            }else if(e.getSource()==btDel){
                del();                
            }else if(e.getSource()==btExit){
                System.exit(0);
            }else if(e.getSource()==btMemEdit){
                //회원정보 수정
                //회원수정 화면 띄우기
                MemberFrame f = new MemberFrame(MemberFrame.MEMBER_EDIT);
                f.setVisible(true);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    private void add() throws SQLException {
        //1.
        String pdName=tfProductName.getText();
        String price=tfPrice.getText();
        String desc=taDescription.getText();
        
        //2.
        ProductDTO dto = new ProductDTO();
        dto.setDescription(desc);
        dto.setPrice(Integer.parseInt(price));
        dto.setProductName(pdName);
        
        int cnt=productDao.insertProduct(dto);
        
        //3.
        if(cnt>0){
            JOptionPane.showMessageDialog(this, "상품 등록되었습니다.");
            clear_component1();
            showAll();
        }else{
            JOptionPane.showMessageDialog(this, "상품 등록 실패!");
        }
    }
    
    private void showAll()  {
        //1
        //2
        DecimalFormat df = new DecimalFormat("#,###");
        
        try {
            ArrayList<ProductDTO> list = productDao.selectAll();
            
            String[][] data = new String[list.size()][3];
            for(int i=0;i<list.size();i++){
                ProductDTO dto=list.get(i);
                data[i][0] = dto.getNo()+"";
                data[i][1] = dto.getProductName();
                
                String price=df.format(dto.getPrice());                
                data[i][2] = price;
            }
            
            //3
            model.setDataVector(data, colNames);
            table1.setModel(model);
            
            //
            //table1.getTableHeader().setBackground(Color.black);
            //table1.getTableHeader().setForeground(Color.yellow);
            table1.getTableHeader().setReorderingAllowed(false);
            table1.setRowHeight(30);
            
            //각 컬럼 사이즈 조절
            table1.getColumnModel().getColumn(0).setPreferredWidth(30);
            table1.getColumnModel().getColumn(1).setPreferredWidth(120);
            table1.getColumnModel().getColumn(2).setPreferredWidth(67);
            
            //가격 오른쪽 정렬
            DefaultTableCellRenderer cellRenderer
                    =new DefaultTableCellRenderer();
            cellRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
            table1.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void clear_component1(){
        tfNo.setText("");
        tfProductName.setText("");
        tfPrice.setText("");
        tfRegdate.setText("");
        taDescription.setText("");
        
    }

    private void edit() throws SQLException {
        //1.
        String no=tfNo.getText();
        String pdName=tfProductName.getText();
        String price=tfPrice.getText();
        String desc=taDescription.getText();
        
        if(no==null || no.isEmpty()){
            JOptionPane.showMessageDialog(this, "번호가 선택되어야 합니다.");
            return;
        }else if(pdName==null || pdName.isEmpty()){
            JOptionPane.showMessageDialog(this, "상품명을 입력하세요");
            tfProductName.requestFocus();
            return;
        }
        
        //2.
        ProductDTO dto = new ProductDTO();
        dto.setNo(Integer.parseInt(no));
        dto.setDescription(desc);
        dto.setPrice(Integer.parseInt(price));
        dto.setProductName(pdName);
        
        int cnt=productDao.updateProduct(dto);
        
        //3.
        if(cnt>0){
            JOptionPane.showMessageDialog(this, "상품 수정되었습니다.");
            clear_component1();
            showAll();
        }else{
            JOptionPane.showMessageDialog(this, "상품 수정 실패!");
        }
    }

    private void del() throws SQLException {
        //1.
        String no=tfNo.getText();
        if(no==null || no.isEmpty()){
            JOptionPane.showMessageDialog(this, "번호가 선택되어야 합니다.");
            return;
        }
        
        int result=JOptionPane.showConfirmDialog(this, "삭제하시겠습니까?",
                "삭제", JOptionPane.YES_NO_OPTION);
        
        if(result==JOptionPane.YES_OPTION){
            //2.
            int cnt=productDao.deleteProduct(Integer.parseInt(no));
            
            //3.
            if(cnt>0){
                JOptionPane.showMessageDialog(this, "상품 삭제되었습니다.");
                showAll();
                clear_component1();
            }else{
                JOptionPane.showMessageDialog(this, "상품 삭제 실패.");
            }
        }
        
    }
    
    class EventHandler extends MouseAdapter implements  ItemListener{
        
        @Override
        public void mouseClicked(MouseEvent e) {
            int row=table1.getSelectedRow();
            
            String no=(String) table1.getValueAt(row, 0);
            
            try {
                //번호로 조회
                ProductDTO dto=productDao.selectByNo(Integer.parseInt(no));
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String regdate=sdf.format(dto.getRegDate());
                
                tfNo.setText(dto.getNo()+"");
                tfPrice.setText(dto.getPrice()+"");
                tfProductName.setText(dto.getProductName());
                tfRegdate.setText(regdate);
                taDescription.setText(dto.getDescription());
                
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getSource()==cbPdName){
                if(e.getStateChange()==ItemEvent.SELECTED){
                    rdPdName.setSelected(true);
                }
            }//if
            
            
        }
    }
    
}
