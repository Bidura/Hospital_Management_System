/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital_management;

/**
 *
 * @author Bidura Sarkar
 */
import java.sql.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

import java.time.LocalDateTime;



 class MyCanvas extends Canvas{  
     @Override
    public void paint(Graphics g) {  
  
        Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("C:\\Users\\Bidura Sarkar\\OneDrive\\Documents\\NetBeansProjects\\Hospital_Management\\src\\hospital_management\\hospital_4.jpg");  
        g.drawImage(i, 12,10,this);  
          
    }  
       
}  



class Departments extends JFrame
{
    
    
 
    Departments(){  
       
       
         final Frame f= new Frame("Click here to view all Departments");  
         final PopupMenu popupmenu = new PopupMenu("Departments");   
         MenuItem Cardiology = new MenuItem("Cardiology");  
          
         MenuItem Orthopaedics = new MenuItem("Orthopaedics");  
          
         MenuItem Paediatrics = new MenuItem("Nephrology");  
         
          MenuItem Neurology = new MenuItem("Neurology");  
          
           MenuItem ENT  = new MenuItem("Dentistry");  
               
         popupmenu.add(Paediatrics);  
         popupmenu.add(Neurology);  
         popupmenu.add(ENT);  
           popupmenu.add(Cardiology); 
           popupmenu.add(Orthopaedics);
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                popupmenu.show(f , e.getX(), e.getY());  
            }                 
         });  
        
         f.add(popupmenu);   
       
         f.setSize(400,90);
         
         
         f.setLayout(null);  
         f.setVisible(true);  
       
     }  
 
}  
    
    
    
    






public class Hospital_Management extends JFrame implements ActionListener{ //inheriatnce

    //decalaration of form elements
    private  JTabbedPane tbp;
    private JButton  ba;
    private JPanel jp2;
    private JButton  ba2;
     private JTextField aid;
       
    
    private JTextField Blood_group;
    private JTextField Dob;
    private JTextField Email;
    private JTextField Gender;
    private JTextField Email2;
    
    private JTextField Username;
    private JButton Register;
    private JButton Cancel;
    
    private JButton Login;
    private JButton Cancel2;
    
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPasswordField Password1;
    private JPasswordField Password2;
    private JPasswordField Password3;
    private JTextField category;
    
    private JTextField docid;
    private JTextField docid2;
     private JTextField docid3;
    private JTextField uid;
    
    private JButton view_slots;
    private JButton view_appt;
    
    
    private JTextField docname;
     
    private JTextField slots;
     private JTextField slots2; 
    private JTextField dept;
    
    private JButton Register2;
    private JButton Cancel3;
    private JButton Update;
    
    private JButton view_pres;
    int flag2=0;
     int flag =0;
     int flag4=0;
     int did=0;
     int user_id = 0;
     
     
     private JTextArea diagnosis;
     private JTextField p_uid;
     private JTextArea medicines;
     private JTextArea symptoms;
     private JButton create_pres;
    
    public Hospital_Management()
    {
       //creating register and login modules
       
        
        JPanel jp1 = new JPanel(new GridBagLayout());
        
        GridBagConstraints c = new GridBagConstraints(); // used for layout in the form of grids
        c.gridx=2;
        c.gridy=0;
        c.anchor= GridBagConstraints.LINE_END;
        c.insets = new Insets(5,5,5,5);
        
       
       
        
        
        
        jLabel1 = new JLabel("Welcome to Apollo Hospital");
        jLabel1.setBorder(BorderFactory.createLineBorder(Color.black));
        jLabel1.setFont(new Font("Tahoma",Font.PLAIN,31));
        jLabel1.setForeground(Color.BLUE    );
        jp1.add(jLabel1,c);
        c.gridy++;
        c.gridx=0;
                
        //adding elements to panel
        c.anchor= GridBagConstraints.LINE_END;
        jLabel3 = new JLabel("Username");
        jp1.add(jLabel3,c);
        c.gridy++;
        jLabel4= new JLabel("Password");
        jp1.add(jLabel4,c);
        c.gridy++;
        
         jLabel5= new JLabel("Confirm Password");
        jp1.add(jLabel5,c);
        c.gridy++;
        
        jLabel6= new JLabel("Email");
        jp1.add(jLabel6,c);
        c.gridy++;
        
        jLabel7= new JLabel("Gender");
        jp1.add(jLabel7,c);
        c.gridy++;
        
        jLabel8= new JLabel("DOB");
        jp1.add(jLabel8,c);
        c.gridy++;
        
         jLabel9= new JLabel("Blood Group");
        jp1.add(jLabel9,c);
        c.gridy++;
        
        jp1.add(new JLabel("Category user/doctor "),c);
        c.gridx+=2;
        c.gridy=1;
        c.anchor=GridBagConstraints.LINE_START;
        Username = new JTextField(10);
        jp1.add(Username,c);
       c.gridy++;
        
        Password1= new JPasswordField(10);
        jp1.add(Password1,c);
       c.gridy++;
       
       
        Password2= new JPasswordField(10);
        jp1.add(Password2,c);
       c.gridy++;
        
        
        Email= new JTextField(10);
        jp1.add(Email,c);
        c.gridy++;
        
        Gender = new JTextField(10);
        jp1.add(Gender,c);
        c.gridy++;
        
        Dob = new JTextField(10);
        jp1.add(Dob,c);
        c.gridy++;
        
        Blood_group = new JTextField(10);
        jp1.add(Blood_group,c);
        c.gridy++;
        
        
        category = new JTextField(10);
        jp1.add(category,c);
        c.gridy++;
         
       
        Register = new JButton("Register");
        Register.addActionListener(this);
        jp1.add(Register,c);
        c.gridy++;
        
        Cancel = new JButton("Cancel");
        Cancel.addActionListener(this);
        jp1.add(Cancel,c);
        c.gridy++;
        
        
         jp2 = new JPanel();
        jp2.add(new JLabel("Enter Email ID"));
        Email2 = new JTextField(10);
        jp2.add(Email2);
        jp2.add(new JLabel("Enter Password"));
        Password3 = new JPasswordField(10);
        jp2.add(Password3);
        Login = new JButton("Login");
        Login.addActionListener(this);
        
        Cancel2 = new JButton("Cancel");
        Cancel2.addActionListener(this);
        
        view_slots = new JButton("View Available Slots");
        view_slots.addActionListener(this);
       
        jp2.add(Login);
        jp2.add(Cancel2);
        
       
        jp1.setBackground(Color.cyan);
        
        jp2.setBackground(Color.cyan);
        
        JPanel jp =  new JPanel();
        final JList list = new JList();
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setBackground(new Color(255, 255, 255));
		list.setValueIsAdjusting(true);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Neurology", "Cardiology", "Nephrology", "Dentistry", "Orthopaedics"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.add(new JLabel("Department"));
		
		list.setBounds(443, 454, 142, 104);
		jp.add(list);
		
		Button button = new Button("View Department info");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedIndex() != -1)
				{
					if(list.getSelectedValue().equals("Neurology"))
						JOptionPane.showMessageDialog(new JFrame(), "Department of neurology was founded in the year 1993\n.It has 20 doctors and more than 100 nurses");
				
					if(list.getSelectedValue().equals("Cardiology"))
						JOptionPane.showMessageDialog(new JFrame(), "Department of Cardiology was founded in the year 1995\n.It has 20 doctors and more than 100 nurses");
				
					if(list.getSelectedValue().equals("Nephrology"))
						JOptionPane.showMessageDialog(new JFrame(), "Department of nephrology was founded in the year 1993\n.It has 20 doctors and more than 100 nurses");
					if(list.getSelectedValue().equals("Dentistry"))
						JOptionPane.showMessageDialog(new JFrame(), "Department of neurology was founded in the year 1993\n.It has 20 doctors and more than 100 nurses");
				
					if(list.getSelectedValue().equals("Orthopaedics"))
						JOptionPane.showMessageDialog(new JFrame(), "Department of orthopaedics was founded in the year 1997\n.It has 20 doctors and more than 100 nurses");
				
				}
			}
		});
		button.setBounds(594, 456, 218, 21);
		jp.add(button);
	


        
        
        
        
       
    
        
       //creating tabbedpane and adding       
       MyCanvas m=new MyCanvas(); 
       tbp = new JTabbedPane();
        tbp.add("Register",jp1);
        tbp.add(m,"Hospital image");
        tbp.add("Login",jp2);
        tbp.add(jp,"View Department Info");
        tbp.setForeground(Color.blue);
        tbp.setBackground(Color.black);
       tbp.setFont(new Font("Verdana", Font.BOLD, 20));
       
        getContentPane().add(tbp);
        
         
        setSize(1500,500);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
             int res = JOptionPane.showConfirmDialog(null,"Do you want to quit ?");
             if(res == JOptionPane.YES_OPTION)
                {
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
            
            
        });
       
        
    }
    
  
    
    
    
    @Override
    public void actionPerformed(ActionEvent e)
    { Connection con;
      Statement st;
        try
        {  // establishing connections
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root", "Password");
            st = con.createStatement();
            
            if(e.getSource() == Register)
        { try{
            
            String s;
            if(new String(Password1.getPassword()).equals(new String(Password2.getPassword()) ))
            {s = "INSERT INTO user_table(name,email,password,dob,gender,blood_group,category) VALUES("+"\""+Username.getText()+"\""+","+"\""+Email.getText()+"\""+","+"\""+new String(Password1.getPassword())+"\""+","+"\""+Dob.getText()+"\""+","+"\""+Gender.getText()+"\""+","+"\""+Blood_group.getText()+"\""+","+"\""+category.getText()+"\""+")";
             st.execute(s);
             //insert query
            }
            else
            {
                System.out.println("Confirmed passwors and actual Password mismatch !");
            }
            con.close();
            JFrame f =new JFrame();
            JOptionPane.showMessageDialog(f,Username.getText()+" has been registered");
            }
        catch(SQLIntegrityConstraintViolationException e2)
        { 
          System.out.println("User exists in database !");  
        }
          catch(Exception e1)
          {
              System.out.println(e1);
          }
        }
            else if(e.getSource()==Cancel)
            {
                dispose();
            }
            else if (e.getSource() == Cancel2)
            {
                dispose();
            }
            else if(e.getSource() == Login)
        {  //login module
           try{
            String s2 = "SELECT * FROM user_table WHERE email = "+"\""+Email2.getText()+"\""+" AND "+"password = "+"\""+new String(Password3.getPassword())+"\"";
            //select query
            PreparedStatement p = con.prepareStatement(s2);
            ResultSet res = p.executeQuery(s2);
            
           int flag3=0;
           String uname="";
           String upass;
           
             while(res.next())
             {  
                  uname = res.getString("name");
                  upass = res.getString("password");
                   
                  if(res.getString("email").equals(Email2.getText()) && upass.equals(new String(Password3.getPassword())))
            { user_id = res.getInt("uid");
               if(res.getString("category").equals("user"))
                flag3=1;
              else
                 flag3=2;
                break;
            }
             }  
             if(flag3 == 0)
             {
                  JFrame f =  new JFrame();
                
                JOptionPane.showMessageDialog(f,"Incorrect Credentials!");
                
             }
             else if(flag3 == 2)
             {   
                 String query = "SELECT docid FROM doctor WHERE uid = "+Integer.toString(user_id);
                  PreparedStatement ps2 = con.prepareStatement(query);
                  ResultSet rs3 = ps2.executeQuery(query);
                  while(rs3.next())
                  {
                      did = rs3.getInt("docid");
                  }
                
                 //register in doctor table
                  JPanel jp3 = new JPanel();
                  jp3.add(new JLabel("Register in doctors list"));
                  jp3.add(new JLabel("Doctor name"));
                  docname = new JTextField(20);
                  jp3.add(docname);
                  jp3.add(new JLabel("Department") );
                  dept = new JTextField(20);
                  jp3.add(dept);
                  jp3.add(new JLabel("No of slots"));
                  slots = new JTextField(15);
                  jp3.add(slots);
                  Register2 = new JButton("Register in doctors list ");
                  Register2.addActionListener(this);
                  jp3.add(Register2);
                  
                  
                  
                  JPanel jp4 = new JPanel();
                  jp4.add(new JLabel("View Appointments"));
                   
                   view_appt = new JButton("View appointments");
                   view_appt.addActionListener(this);
                   jp4.add(view_appt);
                   jp4.add(new JLabel("Update available slots"));
                    slots2 = new JTextField(15);
                   jp4.add(slots2);
                   Update = new JButton("Update slots");
                   Update.addActionListener(this);
                   jp4.add(Update);
                    
                   
                   JPanel jp5 = new JPanel();
                   jp5.add(new JLabel("Create Prescription"));
                   jp5.add(new JLabel("Enter used id"));
                   p_uid = new JTextField(10);
                   jp5.add(p_uid);
                    jp5.add(new JLabel("Diagnosis"));
                   diagnosis = new JTextArea(15,20);
                   diagnosis.addFocusListener(new FocusAdapter(){
                   @Override
                       public void focusLost(FocusEvent e)
                   {  JOptionPane.showMessageDialog(null,"You entered  = "+diagnosis.getText());
                   }
                   });
                   diagnosis.addKeyListener(new KeyAdapter()
                   {  public void keyPressed(KeyEvent e)
                   {
                       if(e.getKeyCode() == KeyEvent.VK_ENTER)
                       {
                           JOptionPane.showMessageDialog(null,"You entered = "+diagnosis.getText());
                       }
                   }
                       
                   });
                   jp5.add(diagnosis);
                   jp5.add(new JLabel("Medicines"));
                   medicines = new JTextArea(15,20);
                   medicines.addKeyListener(new KeyAdapter(){
                   public void keyPressed(KeyEvent e)
                   {
                       if(e.getKeyCode() == KeyEvent.VK_ENTER)
                       {
                           JOptionPane.showMessageDialog(null,"You entered = "+medicines.getText());
                       }
                   }
                    });
                   medicines.addFocusListener(new FocusAdapter(){

                       public void focusLost(FocusEvent e)
                   {  JOptionPane.showMessageDialog(null,"You entered  = "+medicines.getText());
                   }
                   });
                   
                  
                   jp5.add(medicines);
                   jp5.add(new JLabel("Symptoms"));
                   symptoms = new JTextArea(15,20);
                   symptoms.addKeyListener(new KeyAdapter(){
                       public void keyPressed(KeyEvent e)
                       {
                           if(e.getKeyCode()==KeyEvent.VK_ENTER)
                           {
                               JOptionPane.showMessageDialog(null,"You entered = "+symptoms.getText());
                           }
                       }
                   });
                   
                   symptoms.addFocusListener(new FocusAdapter(){

                       public void focusLost(FocusEvent e)
                   {  JOptionPane.showMessageDialog(null,"You entered  = "+symptoms.getText());
                   }
                   });
                   
                   
                   jp5.add(symptoms);
                   create_pres = new JButton("Create Prescription");
                   create_pres.addActionListener(this);
                   jp5.add(create_pres);
                   
                   if(flag4==0 && flag==0)
                   {
                       
                       //adding various options accoriding to user category
                       
                       tbp.add(jp3,"Register in doctors list");
                       tbp.add(jp4,"Update Slots and View appointment");
                       tbp.add(jp5,"Create Prescription");
                       jp2.add(view_slots,"View slots ");
                      
                       flag4=1;
                        JFrame f =  new JFrame();
                
                JOptionPane.showMessageDialog(f,uname +" has logged in successfully");
                   }
                    
                   
                   
                 
             }
             else if(flag3==1){
                 
                 
                JPanel jp3 = new JPanel();
                ba = new JButton();
                uid = new JTextField(10);
                docid = new JTextField(10);
                jp3.add(new JLabel("User ID"));
                jp3.add(uid);
                jp3.add(new JLabel("Doctor ID"));
                jp3.add(docid);
                 jp3.setBackground(Color.cyan);
                 jp3.setFont(new Font("Verdana",Font.PLAIN,20));
                
                
                
                
               ba=new JButton("Book Appointment");
               
               
            
                ba.addActionListener(this);
                jp3.add(ba,"Book Appoinment");
               
                
                
                JPanel jp4 = new JPanel();
                ba2 = new JButton("Cancel Appointments");
                ba2.addActionListener(this);
                aid  = new JTextField(5);
                docid2 = new JTextField(5);
                 jp4.add(new JLabel("Enter Appointment ID "));
                 jp4.add(aid);
                 jp4.add(new JLabel("Enter Doctor ID "));
                 jp4.add(docid2);
                 jp4.add(ba2,"Cancel Appointment");
                 jp4.setBackground(Color.cyan);
                 
                  view_pres=new JButton("View Prescription");
                       view_pres.addActionListener(this);
                       
                
                 if(flag == 0 && flag4==0)
                 { //adding options according to user category
                  jp2.add(view_pres);
                 tbp.add("Book Appointment",jp3);
                 tbp.add(jp4,"Cancel Appointment ");
                 jp2.add(view_slots,"View slots");
                 flag=1;
                  JFrame f =  new JFrame();
                
                JOptionPane.showMessageDialog(f,uname +" has logged in successfully");
                 }
               
                 
                 
             
                
                
                
             }
            
           }
           catch(Exception e4)
        {
            e4.getMessage();
        }
        }  
            
            else if(e.getSource()==view_pres)
            { // viewing prescription - using select query
                try{
                   String s1 ="SELECT prescription.*,docname FROM prescription,doctor WHERE prescription.uid = "+user_id +" AND prescription.docid = doctor.docid";
                   PreparedStatement ps = con.prepareStatement(s1);
                   ResultSet rset= ps.executeQuery(s1);
                   while(rset.next())
                   {
                       JFrame f =  new JFrame();
                       JOptionPane.showMessageDialog(f,"Date = " +rset.getObject("date") +" Doctor name = "+ rset.getString("docname")+"  Diagnosis  = "+rset.getString("diagnosis")+ "   Medicines = "+rset.getString("medicines")+"  Symptoms = "+rset.getString("symptoms"));
                   }
                }
                catch(Exception e1){
                    System.out.println(e1);
                }
            }
            
            else if(e.getSource()==create_pres)
            { // creating prescription module - using insert query
                try{
                    LocalDateTime date =LocalDateTime.now();
                    String s1 ="INSERT INTO prescription(uid,docid,diagnosis,symptoms,medicines,date) VALUES("+p_uid.getText()+","+did+","+"\""+diagnosis.getText()+"\""+","+"\""+symptoms.getText()+"\""+","+"\""+medicines.getText()+"\""+","+"\""+date+"\""+")";
                    System.out.println(s1);
                    st.execute(s1);
                     JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f,"Prescription created !");
                }
                catch(Exception e1)
                {
                    e1.getMessage();
                }
            }
            
            else if(e.getSource() == Update)
            { // updating available slots using update statement 
                try{
                    String s1 = "UPDATE doctor SET slots = "+slots2.getText()+" WHERE docid = "+did;
                    st.execute(s1);
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f,"Slots updated !");
                }
                catch(Exception e1)
                {
                    e1.getMessage();
                }
            }
            
            
            else if(e.getSource() == view_appt)
            { // viewing appointments
                try{
                     String s1 = "SELECT aid,appt.uid,name FROM appt,user_table WHERE docid = "+did+" AND appt.uid = user_table.uid";
                     PreparedStatement ps = con.prepareStatement(s1);
                    ResultSet rs = ps.executeQuery(s1);
                    int count =0;
                     while(rs.next())
                         count++;
                     
                     if(count==0)
                    {   System.out.println("Here");
                        JFrame f = new JFrame();
                       JOptionPane.showMessageDialog(f,"No appointments yet");
                
                        
                    }
                     else{
                     rs = ps.executeQuery(s1);
                    while(rs.next())
                    {   JFrame f = new JFrame();
                       JOptionPane.showMessageDialog(f,"Appointment id = "+rs.getInt("aid")+",  User Id = "+rs.getInt("uid")+",  Username = "+rs.getString("name"));
                
                        count++;
                    }
                     }
                }
                catch(Exception e1)
                {
                    e1.getMessage();
                }
            }
            
            
            else if(e.getSource()==Register2)
            {  // registering doctor into doctors list
                try{
                    String s1="INSERT INTO doctor(docname,dept,slots,uid) VALUES("+"\""+docname.getText()+"\""+","+"\""+dept.getText()+"\""+","+slots.getText()+","+user_id+")";
                    
                    st.execute(s1);
                    s1 = "SELECT * FROM doctor";
                    PreparedStatement ps = con.prepareStatement(s1);
                    ResultSet rs = ps.executeQuery(s1);
                    
                    while(rs.next())
                    {
                        did = rs.getInt("docid");
                    }
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f,"Doctor is registered , Doctor id = "+Integer.toString(did));
                }
                catch(Exception e1)
                {
                    e1.getMessage();
                }
            }
             else if(e.getSource() == ba)
             { try{
                 
                 String s;
                 s="SELECT * FROM doctor WHERE docid = "+docid.getText();
                 
                int slots=0;
                PreparedStatement p1 = con.prepareStatement(s);
                 ResultSet res2 = p1.executeQuery(s);
                 while(res2.next())
                 {
                     slots=res2.getInt("slots");
                 }
                 if(slots>0){
                     //as soon as an appointment is booked the no of slots of the doctor decreases - update and insert query
                 s="INSERT INTO appt(uid,docid) VALUES("+uid.getText()+","+docid.getText()+")";
                 st.execute(s);
                 s ="UPDATE doctor SET slots = slots -1 WHERE docid = "+docid.getText();
                 st.execute(s);
                 int appt_id=0;
                 s = "SELECT aid FROM appt";
                 PreparedStatement st2 = con.prepareStatement(s);
                 ResultSet rs1 = st2.executeQuery(s);
                 while(rs1.next())
                 {
                     appt_id = rs1.getInt("aid");
                 }
                 JFrame f1= new JFrame();
                 
                     JOptionPane.showMessageDialog(f1, "appointment booked! Appointment ID = "+Integer.toString(appt_id));
                 }
                 else
                 {
                     JFrame f1= new JFrame();
                     JOptionPane.showMessageDialog(f1, "No slots available");
                  }
                }
                catch(Exception e1)
                {
                    e1.getMessage();
                }
             }
             else if (e.getSource() == ba2)
             { try{ // deleting appointments from appt table - DELETE statement
                String s = "DELETE FROM appt WHERE aid = "+aid.getText();
                st.execute(s);
                s = "UPDATE doctor SET slots = slots+1 WHERE docid = "+docid2.getText();
                st.execute(s);
                JFrame f1= new JFrame();
                 
                     JOptionPane.showMessageDialog(f1, "appointment cancelled!");  
             }
             catch(SQLException e1)
             {
                 e1.getMessage();
             }
             }
             else if(e.getSource() == view_slots)
             {   try{
                      
                 Object data[][];
                 String s = "SELECT * FROM doctor";
                 PreparedStatement  state = con.prepareStatement(s);
                 ResultSet rset = state.executeQuery();
                 int count = 0; 
                 while(rset.next())
                 {
                    count++; 
                 }
                 data = new Object[count][4];
                  rset = state.executeQuery();
                  while(rset.next())
                 { String sarr[];
                  sarr = new String[4];
                   sarr[0]=Integer.toString(rset.getInt("docid"));
                   sarr[1]=rset.getString("docname");
                   sarr[2]= rset.getString("dept");
                   sarr[3]=Integer.toString(rset.getInt("slots"));
                   data[count-1]= sarr;
                   count--;
                     }
                  String str[]={"Doc id ","Docname","Department","slots"};
                  DefaultTableModel dft = new DefaultTableModel(data,str);
                  JTable jt0 = new JTable(dft);
                  jt0.setFont(new Font("Verdana",Font.BOLD,14));
                  jt0.setBackground(Color.LIGHT_GRAY);
                 
                  if(flag2 == 0)
                  {tbp.add(new JScrollPane(jt0),"View Slots");
                   flag2=1;
                  }
                  else
                  {   tbp.remove(4);
                      tbp.add(jt0,"View Slots");
                  }
                  
                }
                catch(SQLException e1 )
                {
                    
                }
                 
             }
            
            
        }
        catch(Exception e2)
        {
         
         System.out.println(e2);
        }
        
       
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        //driver class name 
        //com.mysql.cj.jdbc.Driver
        try{
          
        new Hospital_Management().setVisible(true);
        
        new Departments();
        /*Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root", "Password");
        System.out.println(con);*/
        
       
        
        }
        
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
    }
        
    
}

