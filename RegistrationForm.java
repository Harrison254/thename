import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Harry
 */
public class RegistrationForm {
    
    static JTextField name_txt;
    static JTextField fname_txt;
    static JRadioButton male;
    static JRadioButton female;
    private static Object add_txtArea;
    public static void main(String args[]){
        //creating frame usiing JFrame class
        JFrame frame=new JFrame("Registration Form");
        frame.setVisible(true);//visibility of the frame
        frame.setBounds(200,100,700,600);//setting location of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //setting background colour
        Container c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.gray);
        
        //creating Label for heading
        Font font=new Font("Aerial",Font.BOLD,20);
        
        JLabel heading_lbl=new JLabel();
        heading_lbl.setBounds(250,5,200,40);
        heading_lbl.setText("<html><font><u><b>Registration Form</b></u></html>");
        heading_lbl.setFont(font);
        
        Font font1=new Font("Aerial",Font.BOLD,15);
        
        //JLabel & JTextField for firstname
        JLabel Fname_lbl=new JLabel("First Name : ");
        Fname_lbl.setBounds(50, 80,100, 30);
        c.add(Fname_lbl);
        name_txt=new JTextField();
        c.add(name_txt);
        name_txt.setBounds(180, 80, 180, 30);
        
        //JLabel & JTextField for Lastname
        JLabel Lname_lbl=new JLabel("Last Name : ");
        Lname_lbl.setBounds(50, 120, 150, 30);
        c.add(Lname_lbl);
        fname_txt=new JTextField();
        c.add(fname_txt);
        fname_txt.setBounds(180, 120, 180, 30);
        
        //JRadioButton for male and Female
        JLabel gender_lbl=new JLabel("Gender : ");
        gender_lbl.setBounds(50,160,150,30);
        Cursor cursor=new Cursor(Cursor.HAND_CURSOR);
        male=new JRadioButton("Male");
        male.setBounds(180,160,70,30);
        male.setBackground(Color.cyan);
        male.setCursor(cursor);
        female=new JRadioButton("Female");
        female.setBounds(280,160,80,30);
        female.setBackground(Color.CYAN);
        female.setCursor(cursor);
        ButtonGroup gender_grp=new ButtonGroup();
        gender_grp.add(male);
        gender_grp.add(female);
        
        //JLabel for DOB
        JLabel dob_lbl=new JLabel("Date of Birth : ");
        dob_lbl.setBounds(50,200,100,30);
        
        String day_arr[]=new String[31];
        for(int i=1;i<=31;i++)
        day_arr[i-1]=Integer.toString(i);
        JComboBox day = new JComboBox(day_arr);
        day.setBounds(180,200,40,30);
        
        String month_arr[]={"Jan","Feb","March","April","May","June","July","Aug","Sepy","Oct","Nov","Dec"};
        JComboBox month = new JComboBox(month_arr);
        month.setBounds(230,200,60,30);
        
        String year_arr[]=new String[70];
        for(int i=1951;i<=2020;i++)
        year_arr[i-1951]=Integer.toString(i);
        JComboBox year = new JComboBox(year_arr);
        year.setBounds(300,200,60,30);
    
        //Address JLabel
        JLabel tel_lbl=new JLabel("Telephone : ");
        tel_lbl.setBounds(50,240,180,30);
        JTextField tel_txt = new JTextField();
        tel_txt.setBounds(180,240,100,30);
        
        //creating JButton for submitting details
        JButton submit_btn = new JButton("Submit");
        submit_btn.setBounds(180,500,120,40);
        Cursor cur = null;
        submit_btn.setCursor(cur);//hand cursor applied
        
        //ActionListener added to submit button
        submit_btn.addActionListener(new ActionListener(){
            private Object chkbox;
            private Object output_txtArea;
            @Override
            public void actionPerformed(ActionEvent event){
                submit_action(event);
            }

            private void submit_action(ActionEvent event) {
                if(chkbox.isSelected()==true){
                   String fname=name_txt.getText();
                   String lname=fname_txt.getText();
                   String gender="Male";
                   if(female.isSelected()==true)
                       gender="Female";
                   String day_name=(String)day.getSelectedItem();
                   String month_name=(String)month.getSelectedItem();
                   String year_name=(String)year.getSelectedItem();
                   String add=add_txtArea.toString();
                   String Phone=tel_txt.getText();
                   //displaying values in JTextArea
                   output_txtArea.setText(
                       "First Name: "+fname +
                               "\n Last Name: "+lname +
                               "\n Gender: "+gender +
                               "\n Date of Birth: "+day_name +
                               ""+month_name +""+year_name +
                               "\n Telephone:"+"\n");
                   }
                else
                  {
                  output_txtArea.setText("Please accept the terms and conditions");
                  }
                 
            }
        });
        
        //creating JTextArea for output
        JTextArea output_txtArea = new JTextArea();
        output_txtArea.setBounds(380,80,260,320);
        //creating checkbox for agreement
        JCheckBox chkbox = new JCheckBox("I accept the terms and conditions");
        chkbox.setBounds(50,430,300,30);
        chkbox.setBackground(Color.GRAY);
        
        //applying font on all fields
        name_txt.setFont(font1);
        fname_txt.setFont(font1);
        male.setFont(font1);
        female.setFont(font1);
        
        //addingJTextFields to container
        c.add(name_txt);
        c.add(name_txt);
        c.add(fname_txt);
        c.add(submit_btn);
        c.add(day);
        c.add(month);
        c.add(year);
        c.add(male);
        c.add(female);
        c.add(dob_lbl);
        c.add(tel_lbl);
        c.add(Fname_lbl);
        c.add(Lname_lbl);
        c.add(tel_txt);
        c.add(output_txtArea);
        c.add(chkbox);
        
       
        //setting font on JLabel
          heading_lbl.setFont(font);
          c.add(heading_lbl);
    }
        
}
