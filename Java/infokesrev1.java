package informatikakesehatan; 

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*; 
import java.sql.*; 
import java.awt.event.*; 

public class infokesrev1 extends JFrame implements ActionListener{ 
    JLabel JL_disease,JL_code,JL_desc,JL_mdn,JL_id; 
    JTextArea JT_disease,JT_code,JT_desc,JT_mdn,JT_id; 
    JButton btn_search; 
    //JScrollPane scroller;
   
    public infokesrev1(){ 
        super("Data Penyakit"); 
        JL_id = new JLabel("Enter Diseases"); 
        JL_id.setBounds(20, 20, 200, 20); 
        JT_id = new JTextArea(); 
        JT_id.setBounds(130, 20, 250, 20);
        JT_id.setBorder(BorderFactory.createLineBorder(Color.black));
        btn_search = new JButton("Search"); 
        btn_search.setBounds(210, 50, 80, 20); 
        btn_search.addActionListener(this); 
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setSize(400,450); 

        JL_disease = new JLabel("Disease "); 
        JL_disease.setBounds(20, 80, 100, 20); 
        JT_disease = new JTextArea(); 
        JT_disease.setBounds(130, 80, 250, 20); 
        JT_disease.setBorder(BorderFactory.createLineBorder(Color.black));
        JT_disease.setEditable(false);
        JL_code = new JLabel("Code"); 
        JL_code.setBounds(20, 110, 100, 20); 
        JT_code = new JTextArea(); 
        JT_code.setBounds(130, 110, 250, 20);
        JT_code.setBorder(BorderFactory.createLineBorder(Color.black));
        JT_code.setEditable(false);
        JL_desc = new JLabel("Description"); 
        JL_desc.setBounds(20, 140, 100, 20); 
        JT_desc = new JTextArea(); 
        JT_desc.setBounds(130, 140, 250, 120);
        JT_desc.setBorder(BorderFactory.createLineBorder(Color.black));
        //scroller = new JScrollPane(JT_desc,
        //ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
        //ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        //scroller.setLocation(0,0);
        //scroller.setSize(new Dimension(345,190));
        JT_desc.setLineWrap(true);
        JT_desc.setEditable(false);
        JL_mdn = new JLabel("Medicine"); 
        JL_mdn.setBounds(20, 270, 100, 20); 
        JT_mdn = new JTextArea(); 
        JT_mdn.setBounds(130, 270, 250, 120);
        JT_mdn.setBorder(BorderFactory.createLineBorder(Color.black));
        JT_mdn.setLineWrap(true);
        JT_mdn.setEditable(false);
        setLayout(null); 
        add(btn_search); 
        add(JL_disease); 
        add(JT_disease); 
        add(JL_code); 
        add(JT_code); 
        add(JL_desc); 
        add(JT_desc); 
        add(JL_mdn);
        add(JT_mdn);
        add(JL_id); 
        add(JT_id); 
    } 
    public void actionPerformed(ActionEvent e) { 
        Function f = new Function(); 
        ResultSet rs = null; 
        String ds = "diseases"; 
        String cd = "code"; 
        String dc = "desk";
        String md = "medicine";
        rs = f.find(JT_id.getText()); 
        try{ if(rs.next()){ 
            JT_disease.setText(rs.getString("diseases")); 
            JT_code.setText(rs.getString("code")); 
            JT_desc.setText(rs.getString("desk")); 
            JT_mdn.setText(rs.getString("mdn"));
        } else{ 
            JOptionPane.showMessageDialog(null, "NO DATA FOR THIS DISEASE"); 
        } 
        }catch(Exception ex)
        { JOptionPane.showMessageDialog(null, ex.getMessage()); 
        } 
    } 
    
    public class Function{ 
        Connection con = null; 
        ResultSet rs = null; 
        PreparedStatement ps = null; 
        public ResultSet find(String s){ 
            try{ 
                con = DriverManager.getConnection("jdbc:mysql://localhost/data_disease","root",""); 
                ps = con.prepareStatement("select * from data where diseases = ?"); 
                ps.setString(1,s); 
                rs = ps.executeQuery(); 
            }
            catch(Exception ex){ 
                JOptionPane.showMessageDialog(null, ex.getMessage()); 
            } 
            return rs; 
        } 
    } 
    public static void main(String[] args){ 
    new infokesrev1(); 
    } 
}
