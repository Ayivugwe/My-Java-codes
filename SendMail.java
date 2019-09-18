

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;



import javax.swing.JPasswordField;




import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SendMail {

	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="10,-25"
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JTextArea jTextArea = null;
	private JScrollPane jScrollPane = null;
	private JPanel jPanel3 = null;
	private JButton jButton = null;
	private JButton jButton1 = null;
	private JMenuBar jJMenuBar = null;
	private JMenu jMenu = null;
	private JMenu jMenu1 = null;
	private JMenuItem jMenuItem = null;
	private JPanel jPanel4 = null;
	private JPanel jPanel5 = null;
	private JPanel jPanel7 = null;
	private JLabel jLabel = null;
	private JTextField jTextField = null;
	private JLabel jLabel1 = null;
	private JPasswordField jPasswordField = null;
	private JLabel jLabel3 = null;
	private JTextField jTextField2 = null;
	private JLabel jLabel4 = null;
	private JTextField jTextField3 = null;
	private JLabel jLabel5 = null;
	private JTextField jTextField4 = null;
	private JMenuItem jMenuItem3 = null;
	private JPanel jPanel1 = null;
	private JTextField jTextField5 = null;
	private JPanel jPanel2 = null;
	private requete RqSQL=new requete(); 
	
	
	
	/**
	 * This method initializes jFrame	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setSize(new java.awt.Dimension(584,535));
			Dimension tailleecran=Toolkit.getDefaultToolkit().getScreenSize();
			int larg=tailleecran.width-584;
			int haut=tailleecran.height-500;
			Point poi=new Point(larg/2,haut/2);
			jFrame.setResizable(false);			
			jFrame.setLocation(poi);
			jFrame.setTitle("Envoi mail");
			jFrame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		//	jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage("F:/KINGSTON (N)/abdellah/photos logiciels/ecolesoft_enfance.gif"));
			//jFrame.setResizable(false);
			jFrame.setPreferredSize(new java.awt.Dimension(206,270));
			jFrame.setJMenuBar(getJJMenuBar());
			jFrame.setContentPane(getJContentPane());
			
		}
		return jFrame;
	}
	public SendMail(){
	
}
	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.setPreferredSize(new java.awt.Dimension(200,250));
			jContentPane.add(getJPanel(), java.awt.BorderLayout.NORTH);
			jContentPane.add(getJPanel2(), java.awt.BorderLayout.CENTER);
			jContentPane.add(getJPanel3(), java.awt.BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(new BorderLayout());
			jPanel.setPreferredSize(new java.awt.Dimension(20,185));
			jPanel.add(getJPanel4(), java.awt.BorderLayout.NORTH);
			//jPanel.add(getJPanel1(), java.awt.BorderLayout.SOUTH);
			//jPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12,12,129),2));
			jPanel.add(getJPanel1(), java.awt.BorderLayout.CENTER);
		}
		return jPanel;
	}

	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setSize(new java.awt.Dimension(50,120));
			jTextArea.setFont(new java.awt.Font("Times New Roman", java.awt.Font.PLAIN, 14));
			jTextArea.setSelectedTextColor(Color.RED);	
			jTextArea.setSelectionColor(Color.gray);
		}
		return jTextArea;
	}
	

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setViewportBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
			jScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12,12,177),2));
			jScrollPane.setPreferredSize(new java.awt.Dimension(10,25));
			jScrollPane.setViewportView(getJTextArea());
		}
		return jScrollPane;
	}
			
			

	private JPanel getJPanel3(){
			
			
			
			jPanel3 = new JPanel();
			jPanel3.setLayout(null);
			jPanel3.setPreferredSize(new java.awt.Dimension(100,65));
			jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
			jPanel3.add(getJButton(), null);
			jPanel3.add(getJButton1(), null);
			jPanel3.add(getJTextField5(), null);
			
		
		return jPanel3;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("Piéces jointes");
			jButton.setSize(new java.awt.Dimension(114,28));
			jButton.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 12));
			jButton.setLocation(new java.awt.Point(6,4));
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser fc=new JFileChooser();
					int returnVal = fc.showOpenDialog(jScrollPane);
					if(returnVal == JFileChooser.APPROVE_OPTION) {
					      jTextField5.setText(fc.getSelectedFile().getPath());
					    }

				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 12));			jButton1.setLocation(new java.awt.Point(453,2));
			jButton1.setSize(new java.awt.Dimension(121,59));

			jButton1.setText("Envoyer ");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					envoyer_Email();
				}
				
			});
		}
		return jButton1;
	}
	
	/** la methode principale pour l'envoi d'un Email*/
	private void envoyer_Email()
	{

	      try {
	    	  	if(jTextField!=null&&!jTextField.getText().toString().equals("")){
	    	  		    
	    	  			//envoyeur de message	

	    	  			/** SMPT de Gmail qui est gratuit avec numero de port= 456
	    	  		     *  nom utilisateur,mot de passe d'un compte gmail */
	    	  		    
	    	  			MailSender mail =new MailSender("smtp.gmail.com",465
					    		,jTextField.getText(),jPasswordField.getText(),true);
					    //Message lui meme
	    	  			MailMessage msg =new MailMessage();
				       	//Source de message
					    msg.setFrom(new InternetAddress(jTextField.getText()+"@gmail.com",jTextField3.getText()));
						//Destination 
					    msg.setTo(jTextField2.getText());
				        //Sujet de message
					    msg.setSubject(jTextField4.getText());
					    //Contenu de message
					    msg.setContent(jTextArea.getText(),true);
					    //Piece jointe s'il y a lieu
				        if (!jTextField5.getText().equals("")){
				        
				        	msg.setAttachmentURL(getstring(jTextField5.getText()));
				        }
				        //Envoyer le message
				        mail.sendMessage(msg);
					
				}else {
					
					System.out.println("un des champ est vide ");
					
				}
			} catch (AddressException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				
			} catch (MessagingException e5) {
				// TODO Auto-generated catch block
				e5.printStackTrace();
				
			}catch (UnsupportedEncodingException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
				
			}
	

	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.add(getJMenu());
			jJMenuBar.add(getJMenu1());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu() {
		if (jMenu == null) {
			jMenu = new JMenu();
			jMenu.setText("Fichier");
			jMenu.add(getJMenuItem3());
		}
		return jMenu;
	}

	/**
	 * This method initializes jMenu1	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getJMenu1() {
		if (jMenu1 == null) {
			jMenu1 = new JMenu();
			jMenu1.setText("About");
			jMenu1.add(getJMenuItem());
		}
		return jMenu1;
	}

	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem() {
		if (jMenuItem == null) {
			jMenuItem = new JMenuItem();
			jMenuItem.setToolTipText("about");
			jMenuItem.setText("about");
		}
		return jMenuItem;
	}
//*************************************************************************************************************
	public void Send(String user,String password,String From,String To
			,String Subject,String Message,String JointPiece) throws Exception{
	   
	    	  	if(user!=null&&!user.equals("")){
	    	  		    MailSender mail =new MailSender("smtp.gmail.com",465,user,password,true);
					    MailMessage msg =new MailMessage();
				       	msg.setFrom(new InternetAddress(user //+"@gmail.com"
				       			                       ,From));
						msg.setTo(To);
				        msg.setSubject(Subject);
				        msg.setContent(Message,true);
				        if (!JointPiece.equals("")){
				        msg.setAttachmentURL(getstring(JointPiece));
				        }
				        mail.sendMessage(msg);
					
				}else {
					
					System.out.println("Un des champs est vide ");
					
				}
			
	
}
	//****************************************************************************************************************
	/**
	 * This method initializes jPanel4	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setLayout(new BorderLayout());
			jPanel4.setPreferredSize(new java.awt.Dimension(10,60));
			jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
			jPanel4.add(getJPanel7(), java.awt.BorderLayout.CENTER);
		}
		return jPanel4;
	}

	/**
	 * This method initializes jPanel5	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jLabel5 = new JLabel();
			jLabel5.setText("Sujet :");
			jLabel5.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 14));
			jLabel5.setSize(new java.awt.Dimension(74,25));
			jLabel5.setPreferredSize(new java.awt.Dimension(38,12));
			jLabel5.setLocation(new java.awt.Point(25,83));
			jLabel4 = new JLabel();
			jLabel4.setText("Source :");
			jLabel4.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 14));
			jLabel4.setSize(new java.awt.Dimension(85,25));
			jLabel4.setLocation(new java.awt.Point(25,11));
			jLabel3 = new JLabel();
			jLabel3.setText("Destination :");
			jLabel3.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 14));
			jLabel3.setSize(new java.awt.Dimension(86,25));
			jLabel3.setLocation(new java.awt.Point(25,47));
			jPanel5 = new JPanel();
			jPanel5.setLayout(null);
			jPanel5.setPreferredSize(new java.awt.Dimension(10,90));
		//	jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12,12,129),2));
			jPanel5.add(jLabel3, null);
			jPanel5.add(getJTextField2(), null);
			jPanel5.add(jLabel4, null);
			jPanel5.add(getJTextField3(), null);
			jPanel5.add(jLabel5, null);
			jPanel5.add(getJTextField4(), null);
		}
		return jPanel5;
	}

	/**
	 * This method initializes jPanel6	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	

	/**
	 * This method initializes jPanel7	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel7() {
		if (jPanel7 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("Password   :");
			jLabel1.setSize(new java.awt.Dimension(75,25));
			jLabel1.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 14));
			jLabel1.setLocation(new java.awt.Point(292,19));
			jLabel = new JLabel();
			jLabel.setText("User Name :");
			jLabel.setSize(new java.awt.Dimension(81,25));
			jLabel.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 14));
			jLabel.setBackground(new java.awt.Color(238,238,238));
			jLabel.setForeground(new java.awt.Color(51,51,51));
			jLabel.setLocation(new java.awt.Point(21,19));
			jPanel7 = new JPanel();
			jPanel7.setLayout(null);
			//jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(12,12,129),2));
			jPanel7.add(jLabel, null);
			jPanel7.add(getJTextField(), null);
			jPanel7.add(jLabel1, null);
			jPanel7.add(getJPasswordField(), null);
		}
		return jPanel7;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setLocation(new java.awt.Point(119,19));
			jTextField.setSize(new java.awt.Dimension(139,25));
		}
		return jTextField;
	}

	/**
	 * This method initializes jPasswordField	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getJPasswordField() {
		if (jPasswordField == null) {
			jPasswordField = new JPasswordField();
			jPasswordField.setLocation(new java.awt.Point(377,19));
			jPasswordField.setSize(new java.awt.Dimension(156,25));
		}
		return jPasswordField;
	}

	/**
	 * This method initializes jTextField2	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setLocation(new java.awt.Point(117,47));
			jTextField2.setSize(new java.awt.Dimension(264,25));
		}
		return jTextField2;
	}

	/**
	 * This method initializes jTextField3	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setLocation(new java.awt.Point(117,11));
			jTextField3.setSize(new java.awt.Dimension(264,25));
		}
		return jTextField3;
	}

	/**
	 * This method initializes jTextField4	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField4() {
		if (jTextField4 == null) {
			jTextField4 = new JTextField();
			jTextField4.setLocation(new java.awt.Point(117,83));
			jTextField4.setSize(new java.awt.Dimension(264,25));
		}
		return jTextField4;
	}

	/**
	 * This method initializes jMenuItem3	
	 * 	
	 * 
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getJMenuItem3() {
		if (jMenuItem3 == null) {
			jMenuItem3 = new JMenuItem();
			jMenuItem3.setText("Exit");
			jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(2);
				}
			});
		}
		return jMenuItem3;
	}
	/**
	 * This method initializes jPanel1	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(new BorderLayout());
			jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
			jPanel1.setPreferredSize(new java.awt.Dimension(14,125));
			jPanel1.add(getJPanel5(),BorderLayout.CENTER);
		}
		return jPanel1;
	}
	/**
	 * This method initializes jTextField5	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField5() {
		if (jTextField5 == null) {
			jTextField5 = new JTextField();
			jTextField5.setBounds(new java.awt.Rectangle(6,33,293,26));
		}
		return jTextField5;
	}
	/**
	 * This method initializes jPanel2	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jPanel2 = new JPanel();
			jPanel2.setLayout(new BorderLayout());
			//jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
			jPanel2.add(getJScrollPane(),BorderLayout.CENTER);
		}
		return jPanel2;
	}
	
	private String getstring(String str){
		String fr = "" ;
		for(int i=0;str.length()>i;i++){
			if(str.substring(i,i+1).equals("\\")){
				fr=fr+"\\";
			}
			fr=fr+str.substring(i,i+1);
		}
		return fr;
	}
	/**
	 * @param args
	 */
	public void SendMail_EL(JTable table,int column,String id_el,String d_h,String id_email,String piece_jointe){}
	/*****************************************************************************************************/

	/*****************************************************************************************************/
	//send avertissement aux élèves

	public void SendAVMail_EL(JTable table,int column,String id_el,String d_h,String id_email,String piece_jointe){}
	//send avertissement aux élèves
	/*****************************************************************************************************/

	public void SendMailELAV(String id_el,String d_h,String id_email,String piece_jointe){}
	/*********************************************************************************************************/
	public void SendMail_El_Ex(JTable table,int column,String id_el,String id_email,String piece_jointe){}
	/**********************************************************************/
	public void SendMailAVClass(JTable table,int column,String d_h,String id_email,String piece_jointe){}
	
	
	
	/**********************************************************************/
	public void SendMailClass(JTable table,int column,String d_h,String id_email,String piece_jointe){}
	//sms
	/*****************************************************************************************************/
	public void SendSMSELAV(String id_el,String d_h,String id_sms){}
/*****************************************************************************************/
	public void SendSmS_EL(JTable table,int column,String id_el,String d_h,String id_sms){}	
	/*************************************************************************************/
	/*****************************************************************************************/
	public void SendAVSmS_EL(JTable table,int column,String id_el,String d_h,String id_sms){}	
	/*************************************************************************************/
	
	public void SendSMS_El_Ex(JTable table,int column,String id_el,String id_sms){}
	
	//sms
	
	
	public void SendSMSClass(JTable table,int column,String d_h,String id_sms){}
	//sms
	//sms avertissment
	
	public void SendSMSAVClass(JTable table,int column,String d_h,String id_sms){}
	//sms avertissment eleve
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SendMail().getJFrame().setVisible(true);
		
	}
	

}
