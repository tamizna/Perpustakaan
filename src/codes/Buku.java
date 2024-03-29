package codes;

import java.awt.HeadlessException;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Buku extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel();

    /**
     * Creates new form FormSatu
     */
    public Buku() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kategori = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        cari_text = new javax.swing.JTextField();
        judul_option = new javax.swing.JRadioButton();
        pengarang_option = new javax.swing.JRadioButton();
        penerbit_option = new javax.swing.JRadioButton();
        cari_btn = new javax.swing.JButton();
        clear_btn = new javax.swing.JButton();
        showall_btn = new javax.swing.JButton();
        tambah_btn = new javax.swing.JButton();
        edit_btn = new javax.swing.JButton();
        hapus_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        idbuku_text = new javax.swing.JTextField();
        judulbuku_text = new javax.swing.JTextField();
        pengarang_text = new javax.swing.JTextField();
        penerbit_text = new javax.swing.JTextField();
        cetakan_text = new javax.swing.JTextField();
        tahunterbit_text = new javax.swing.JTextField();
        jumlahbuku_text = new javax.swing.JTextField();
        simpan_btn = new javax.swing.JButton();
        clear_btn1 = new javax.swing.JButton();
        refresh_btn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Data Buku");
        setPreferredSize(new java.awt.Dimension(1200, 489));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Cari Buku");

        kategori.add(judul_option);
        judul_option.setText("Judul Buku");
        judul_option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judul_optionActionPerformed(evt);
            }
        });

        kategori.add(pengarang_option);
        pengarang_option.setText("Nama Pengarang");

        kategori.add(penerbit_option);
        penerbit_option.setText("Penerbit");

        cari_btn.setText("Cari");
        cari_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari_btnActionPerformed(evt);
            }
        });

        clear_btn.setText("Hapus");
        clear_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_btnActionPerformed(evt);
            }
        });

        showall_btn.setText("Tampilkan Semua");
        showall_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showall_btnActionPerformed(evt);
            }
        });

        tambah_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-circular-outlined-button.png"))); // NOI18N
        tambah_btn.setText("Tambah");
        tambah_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tambah_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tambah_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_btnActionPerformed(evt);
            }
        });

        edit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/note-outlined-symbol.png"))); // NOI18N
        edit_btn.setText("Edit");
        edit_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        edit_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });

        hapus_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/recycling-bin.png"))); // NOI18N
        hapus_btn.setText("Hapus");
        hapus_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hapus_btn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        hapus_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapus_btnActionPerformed(evt);
            }
        });

        jLabel2.setText("Berdasarkan :");

        // membuat tampilan model tabel

        model.addColumn("No");
        model.addColumn("ID Buku");
        model.addColumn("Judul Buku");
        model.addColumn("Nama Pengarang");
        model.addColumn("Penerbit");
        model.addColumn("Cetakan ke-");
        model.addColumn("Tahun Terbit");
        model.addColumn("Total Buku");
        model.addColumn("Stock");

        //menampilkan data database ke dalam tabel
        try {
            int no = 1;
            String sql = "select * from buku";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2),
                    res.getString(3), res.getString(4), res.getString(5),
                    res.getString(6), res.getInt(7), res.getInt(8)});
        }

    } catch (SQLException e) {
    }

    jTable1.setModel(model);
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTable1MouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTable1);

    jPanel1.setBackground(new java.awt.Color(204, 204, 204));
    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas Buku"));

    jLabel3.setText("ID Buku");

    jLabel4.setText("Judul Buku");

    jLabel5.setText("Pengarang");

    jLabel6.setText("Penerbit");

    jLabel7.setText("Cetakan");

    jLabel8.setText("Tahun Terbit");

    jLabel9.setText("Jumlah Buku");

    idbuku_text.setEnabled(false);
    idbuku_text.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            idbuku_textActionPerformed(evt);
        }
    });

    judulbuku_text.setEnabled(false);

    pengarang_text.setEnabled(false);

    penerbit_text.setEnabled(false);

    cetakan_text.setEnabled(false);

    tahunterbit_text.setEnabled(false);

    jumlahbuku_text.setEnabled(false);

    simpan_btn.setText("Simpan");
    simpan_btn.setEnabled(false);
    simpan_btn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            simpan_btnActionPerformed(evt);
        }
    });

    clear_btn1.setText("Bersihkan");
    clear_btn1.setEnabled(false);
    clear_btn1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            clear_btn1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8)
                .addComponent(jLabel9)
                .addComponent(jLabel5)
                .addComponent(jLabel6)
                .addComponent(jLabel7)
                .addComponent(jLabel4)
                .addComponent(jLabel3))
            .addGap(28, 28, 28)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(idbuku_text, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(judulbuku_text, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(penerbit_text)
                            .addComponent(cetakan_text)
                            .addComponent(pengarang_text, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(tahunterbit_text, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(simpan_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear_btn1))
                    .addComponent(jumlahbuku_text, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 13, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(idbuku_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(judulbuku_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(pengarang_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(penerbit_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(cetakan_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(tahunterbit_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel9)
                .addComponent(jumlahbuku_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(simpan_btn)
                .addComponent(clear_btn1))
            .addGap(27, 27, 27))
    );

    refresh_btn.setText("Refresh All");
    refresh_btn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refresh_btnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(tambah_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(edit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(hapus_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(judul_option)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(pengarang_option)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(penerbit_option)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cari_text, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cari_btn)
                                    .addGap(18, 18, 18)
                                    .addComponent(clear_btn)
                                    .addGap(18, 18, 18)
                                    .addComponent(showall_btn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(refresh_btn))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE))))
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cari_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showall_btn)
                        .addComponent(cari_btn)
                        .addComponent(clear_btn)
                        .addComponent(jLabel1)
                        .addComponent(refresh_btn))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(judul_option)
                        .addComponent(pengarang_option)
                        .addComponent(penerbit_option)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(33, 33, 33)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tambah_btn)
                .addComponent(edit_btn)
                .addComponent(hapus_btn))
            .addContainerGap(47, Short.MAX_VALUE))
    );

    jLabel1.getAccessibleContext().setAccessibleName("Data Buku");

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void judul_optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judul_optionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judul_optionActionPerformed

    private void tambah_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_btnActionPerformed
        simpan_btn.setText("Simpan");
        HapusIsian();
        Editable();
    }//GEN-LAST:event_tambah_btnActionPerformed

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        simpan_btn.setText("Update");
        Editable();
    }//GEN-LAST:event_edit_btnActionPerformed

    private void hapus_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapus_btnActionPerformed

        int option = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?", 
                "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {

            // fungsi hapus data
            try {

                String sql = "delete from buku where id_buku='" + idbuku_text.getText() + "'";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
            HapusIsian();
            NonEditable();
            GetData();
        }
    }//GEN-LAST:event_hapus_btnActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened

    }//GEN-LAST:event_formInternalFrameOpened

    private void simpan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_btnActionPerformed

        if (simpan_btn.getText().equals("Update")) {
            // Edit Data
            try {
                String sql = null;
                int stock_temp = 0;
                // Ambil Jumlah Stock
                try {
                    sql = "SELECT * FROM buku WHERE id_buku = '" + idbuku_text.getText() + "'";
                    java.sql.Connection conn = (Connection) Config.configDB();
                    java.sql.Statement stm = conn.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);
                    res.next();
                    int jum_stock = res.getInt("total_stock");
                    if(Integer.parseInt(jumlahbuku_text.getText()) > jum_stock) {
                    stock_temp = res.getInt("stock") + (Integer.parseInt(jumlahbuku_text.getText()) - jum_stock);
                    }
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Penambahan Stock Gagal" + e.getMessage());
                }

                sql = "UPDATE buku SET id_buku = '" + idbuku_text.getText() + "', nama_buku = '" + judulbuku_text.getText()
                        + "', pengarang = '" + pengarang_text.getText() + "',penerbit = '" + penerbit_text.getText()
                        + "',cetakan = '" + cetakan_text.getText() + "',tahun_terbit = '" + tahunterbit_text.getText()
                        + "',total_stock = '" + jumlahbuku_text.getText() + "',stock = '" + stock_temp +"' WHERE id_buku = '" + idbuku_text.getText() + "'";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Data berhasil diedit");
                GetData();
                HapusIsian();
                NonEditable();
                simpan_btn.setText("Simpan");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Perubahan Data Gagal" + e.getMessage());
            }
        } else { // Nambah data baru
            try {
                String sql = "INSERT INTO buku VALUES ('" + idbuku_text.getText() + "','" + judulbuku_text.getText()
                        + "','" + pengarang_text.getText() + "','" + penerbit_text.getText() + "','"
                        + cetakan_text.getText() + "','" + tahunterbit_text.getText()
                        + "','" + jumlahbuku_text.getText() + "','" + jumlahbuku_text.getText() + "')";
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
                GetData();
                HapusIsian();
                NonEditable();
                simpan_btn.setText("Simpan");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_simpan_btnActionPerformed

    private void clear_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btn1ActionPerformed
        HapusIsian();
        NonEditable();
    }//GEN-LAST:event_clear_btn1ActionPerformed

    private void idbuku_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idbuku_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idbuku_textActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // menampilkan data dari tabel ke dalam form pengisian:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String idbuku_temp = jTable1.getValueAt(baris, 1).toString();
        idbuku_text.setText(idbuku_temp);

        String judulbuku_temp = jTable1.getValueAt(baris, 2).toString();
        judulbuku_text.setText(judulbuku_temp);

        String pengarang_temp = jTable1.getValueAt(baris, 3).toString();
        pengarang_text.setText(pengarang_temp);

        String penerbit_temp = jTable1.getValueAt(baris, 4).toString();
        penerbit_text.setText(penerbit_temp);

        String cetakan_temp = jTable1.getValueAt(baris, 5).toString();
        cetakan_text.setText(cetakan_temp);

        String tahunterbit_temp = jTable1.getValueAt(baris, 6).toString();
        tahunterbit_text.setText(tahunterbit_temp);

        String jumlahbuku_temp = jTable1.getValueAt(baris, 7).toString();
        jumlahbuku_text.setText(jumlahbuku_temp);
    }//GEN-LAST:event_jTable1MouseClicked

    private void cari_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari_btnActionPerformed

        if (!(judul_option.isSelected() || pengarang_option.isSelected() || penerbit_option.isSelected())) {
            JOptionPane.showMessageDialog(null, "Pilih kategori terlebih dahulu");
        } else {
            while (model.getRowCount() > 0) {
                for (int i = 0; i < model.getRowCount(); ++i) {
                    model.removeRow(i);
                }
            }

            //menampilkan data database ke dalam tabel
            String sql = null;
            try {

                int no = 1;
                if (judul_option.isSelected()) {
                    sql = "select * from buku where nama_buku REGEXP '" + cari_text.getText() + ".*'";
                } else if (pengarang_option.isSelected()) {
                    sql = "select * from buku where pengarang REGEXP '" + cari_text.getText() + ".*'";
                } else {
                    sql = "select * from buku where penerbit REGEXP '" + cari_text.getText() + ".*'";
                }
                java.sql.Connection conn = (Connection) Config.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while (res.next()) {
                    model.addRow(new Object[]{no++, res.getString(1), res.getString(2),
                        res.getString(3), res.getString(4), res.getString(5),
                        res.getString(6), res.getInt(7), res.getInt(8)});
                }
                jTable1.setModel(model);
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_cari_btnActionPerformed

    private void clear_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_btnActionPerformed
        cari_text.setText("");
        kategori.clearSelection();
    }//GEN-LAST:event_clear_btnActionPerformed

    private void showall_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showall_btnActionPerformed
        GetData();
        cari_text.setText("");
        kategori.clearSelection();
    }//GEN-LAST:event_showall_btnActionPerformed

    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        GetData();
    }//GEN-LAST:event_refresh_btnActionPerformed

    private void HapusIsian() {
        idbuku_text.setText("");
        judulbuku_text.setText("");
        pengarang_text.setText("");
        penerbit_text.setText("");
        cetakan_text.setText("");
        tahunterbit_text.setText("");
        jumlahbuku_text.setText("");
    }

    private void Editable() {
        idbuku_text.setEnabled(true);
        judulbuku_text.setEnabled(true);
        pengarang_text.setEnabled(true);
        penerbit_text.setEnabled(true);
        cetakan_text.setEnabled(true);
        tahunterbit_text.setEnabled(true);
        jumlahbuku_text.setEnabled(true);
        simpan_btn.setEnabled(true);
        clear_btn1.setEnabled(true);
    }

    private void NonEditable() {
        idbuku_text.setEnabled(false);
        judulbuku_text.setEnabled(false);
        pengarang_text.setEnabled(false);
        penerbit_text.setEnabled(false);
        cetakan_text.setEnabled(false);
        tahunterbit_text.setEnabled(false);
        jumlahbuku_text.setEnabled(false);
        simpan_btn.setEnabled(false);
        clear_btn1.setEnabled(false);
    }

    protected void GetData() {
        while (model.getRowCount() > 0) {
            for (int i = 0; i < model.getRowCount(); ++i) {
                model.removeRow(i);
            }
        }
        //menampilkan data database ke dalam tabel
        try {
            int no = 1;
            String sql = "select * from buku";
            java.sql.Connection conn = (Connection) Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while (res.next()) {
                model.addRow(new Object[]{no++, res.getString(1), res.getString(2),
                    res.getString(3), res.getString(4), res.getString(5),
                    res.getString(6), res.getInt(7), res.getInt(8)});
            }
            jTable1.setModel(model);
        } catch (SQLException e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari_btn;
    private javax.swing.JTextField cari_text;
    private javax.swing.JTextField cetakan_text;
    private javax.swing.JButton clear_btn;
    private javax.swing.JButton clear_btn1;
    private javax.swing.JButton edit_btn;
    private javax.swing.JButton hapus_btn;
    private javax.swing.JTextField idbuku_text;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton judul_option;
    private javax.swing.JTextField judulbuku_text;
    private javax.swing.JTextField jumlahbuku_text;
    private javax.swing.ButtonGroup kategori;
    private javax.swing.JRadioButton penerbit_option;
    private javax.swing.JTextField penerbit_text;
    private javax.swing.JRadioButton pengarang_option;
    private javax.swing.JTextField pengarang_text;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JButton showall_btn;
    private javax.swing.JButton simpan_btn;
    private javax.swing.JTextField tahunterbit_text;
    private javax.swing.JButton tambah_btn;
    // End of variables declaration//GEN-END:variables
}
