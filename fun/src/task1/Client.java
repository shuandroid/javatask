package task1;
import javax.swing.* ;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observer;
import java.util.Scanner;
public class Client extends JFrame implements ActionListener {
	
	
	public static JTextField messageText1 ;
	public JButton   commit ;
	
	public Client(){
		
		
		Container c = this.getContentPane() ;		
		c.setLayout(new FlowLayout()) ;
		JPanel centerPanel = new JPanel(new FlowLayout()) ;
		
		
		messageText1 = new JTextField(20) ;
		commit = new JButton("ȷ��") ;
		JLabel messageLabel = new JLabel("��������ִ�е�ʱ�䣺") ;
		
		
		centerPanel.add(messageLabel) ;
		centerPanel.add(messageText1) ;
		centerPanel.add(commit) ;
		
		c.add(centerPanel) ;
		commit.addActionListener(this) ;
		
		// ����Ļ(500, 300)��괦��ʾ������
		this.setLocation(400, 200);
		// �����޸ļ������Ĵ�С
		this.setResizable(false);
		// ʹ�������и������С����
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
		this.setSize(600,200) ;
		this.setVisible(true) ;
	
	
	}
	
	
	
	public static void main(String[] args) {
		
		  new Client() ; 
    }
	
	public String fortime() {
		String message = messageText1.getText() ;
		if (message.length()== 0) 
			JOptionPane.showMessageDialog(null, "����ʱ�䣺","��ʾ",1) ;
        System.out.println(message) ;
        
        //�������۲��߶���
		Watched watched = new Watched();
        //�����۲��߶��󣬲������۲��߶���Ǽ�
        Observer watcher = new Watcher(watched);
        
		watched.setTime(message) ;
		return message ;
		
	}

	@Override
	//������
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == commit){
			fortime() ;
		}
		// TODO Auto-generated method stub
		
	}

}
