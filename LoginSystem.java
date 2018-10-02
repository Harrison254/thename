
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harry
 */
public class LoginSystem {
    
        
    private JFrame myframe;
    private JTextField txtUsername;
    private JPasswordField txtPassword;


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        JFrame myframe=new JFrame("Login Form");
        myframe.setForeground(Color.MAGENTA);
        myframe.setBackground(Color.yellow);
        myframe.setFont(new Font ("Serif",Font.BOLD, 20));
        JPanel mypanel=new JPanel();
        JPanel panel=new JPanel();
        mypanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JButton mybutton=new JButton();
        JLabel usernameLabel=new JLabel("Username: ");
        JTextField txtUsername=new JTextField();
        txtUsername.setColumns(20);
        JLabel passwordLabel=new JLabel("Password: ");
        JTextField txtPassword=new JTextField();
        txtPassword.setColumns(20);
        JButton login=new JButton("Login");
        JButton cancel=new JButton("Cancel");
        
        //setting password and username
        String Username;
        String Password;
        Password="123";
        Username="Admin";
        Scanner input1=new Scanner(System.in);
        System.out.println(usernameLabel);
        
        //setting panels
        myframe.add(mypanel);
        myframe.setBounds(40, 170, 270, 300);
        mypanel.add(usernameLabel);
        mypanel.add(txtUsername);
        mypanel.add(passwordLabel);
        mypanel.add(txtPassword);
        mypanel.add(login);
        mypanel.add(cancel);
        
        //setting locationds and sizes of panels
        usernameLabel.setBounds(59,80,89,20);
        txtUsername.setBounds(50,150,150,30);
        passwordLabel.setBounds(59,159,89,30);
        txtPassword.setBounds(220,77,146,30);
        login.setBounds(150,220,150,30);
        cancel.setBounds(50,300,100,30);
        
        
        myframe.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        myframe.setVisible(true);//setting visibility of the JFrame
   
       
    }
   
    
}
