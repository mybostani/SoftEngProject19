import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 
public class Main {
   
    public static void main(String[] args) {
        //onoma arxikou parathurou molis o xristis anoigei thn efarmogh
        final JFrame frame = new JFrame("MyBostani Application");
        
        //dhmiourgia triwn arxikwn button pou isodynamoun me tis treis epiloges ths main page
        final JButton btnguest = new JButton("Επισκέπτης");
        final JButton btnuser = new JButton("Μέλος");
        final JButton btnnewacc = new JButton("Δημιουργία Λογαριασμού");
        
        //events molis patithoun ta button
        btnuser.addActionListener(
        new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        LoginDialog loginDlg = new LoginDialog(frame);
                        loginDlg.setVisible(true);
                        
                        //elegxos ena egine eisodos swstwn stoixeiwn
                        if(loginDlg.isSucceeded()){ 
                          Member afterlogin = new Member(frame);
                          afterlogin.setVisible(true);
                          
                        }
                        }
                    
                });
                
        btnguest.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e) {
                        Guest afterguest = new Guest(frame);
                        afterguest.setVisible(true);
                     
                    }
                });
 
                
        btnnewacc.addActionListener(
                new ActionListener(){
                     public void actionPerformed(ActionEvent e) {
                        AccountDialog loginDlg = new AccountDialog(frame);
                        loginDlg.setVisible(true);
                        
                        if(loginDlg.isSucceeded()){
                          Member afteraccount = new Member(frame);
                          afteraccount.setVisible(true);
                          
                          
                        }
                    }
                });;
        //dhmiourgia neou stigmiotypoy gia to JPanel wste na emfanistoyn ta button
        JPanel panel = new JPanel(new BorderLayout());
                
        //topothetisi button sthn start, center kai end ths selidas
        panel.add(btnguest, BorderLayout.PAGE_START);
        panel.add(btnuser, BorderLayout.CENTER);
        panel.add(btnnewacc, BorderLayout.PAGE_END);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}