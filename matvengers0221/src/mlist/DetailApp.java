package mlist;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Blob;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DetailApp extends JFrame{
	private ArrayList<ms> m = new ArrayList<ms>();
	tst t1 = new tst();


	private JPanel panelSouth;
//	private JButton btnOk;
	private JButton btnCancel;
	private String name;
	private double star;
	private String starString;
	private Blob v_img;
	private Blob m_img;
	private String tel;
	private String addr;
	private String menu;
	private String subj;
	private String cmt;
	private String url;
	
	private JFrame frame;


	/**
	 * Create the application.
	 * @throws Exception 
	 */
	public DetailApp() throws Exception {
		if(Listbtn.idx == 1) {
			m = t1.result7(Listbtn.na1);
			name = m.get(0).getName();
			star = m.get(0).getStar();
			starString = ""+ star;
			v_img = m.get(0).getV_img();
			m_img = m.get(0).getM_img();
			tel = m.get(0).getTel();
			addr = m.get(0).getAddr();
			menu = m.get(0).getMenu();
			subj = m.get(0).getSubj();
			cmt = m.get(0).getCmt();
			url = m.get(0).getUrl();
		}
		else if (Listbtn.idx == 2) {
			m = t1.result7(Listbtn.na2);
			name = m.get(0).getName();
			star = m.get(0).getStar();
			starString = ""+ star;
			v_img = m.get(0).getV_img();
			m_img = m.get(0).getM_img();
			tel = m.get(0).getTel();
			addr = m.get(0).getAddr();
			menu = m.get(0).getMenu();
			subj = m.get(0).getSubj();
			cmt = m.get(0).getCmt();
			url = m.get(0).getUrl();
		}
		else if (Listbtn.idx == 3) {
			m = t1.result7(Listbtn.na3);
			name = m.get(0).getName();
			star = m.get(0).getStar();
			starString = ""+ star;
			v_img = m.get(0).getV_img();
			m_img = m.get(0).getM_img();
			tel = m.get(0).getTel();
			addr = m.get(0).getAddr();
			menu = m.get(0).getMenu();
			subj = m.get(0).getSubj();
			cmt = m.get(0).getCmt();
			url = m.get(0).getUrl();
		}
		initialize();

	}

	public JPanel getPanelSouth() {
		if (panelSouth == null) {
			panelSouth = new JPanel();
			panelSouth.setBackground(Color.WHITE);
//			panelSouth.add(getBtnOk());
			panelSouth.add(getBtnCancel());
		}
		return panelSouth;
	}
	//Cancel ?????? ??????
	public JButton getBtnCancel() {
		if (btnCancel == null) {
			btnCancel = new JButton();
			btnCancel.setText("??????");
			btnCancel.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
		}
		
		return btnCancel;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame=this;
		frame.setBounds(100, 100, 400, 600);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.getContentPane().setLayout(null);
		frame.setTitle("?????? ?????????");
		frame.setSize(400, 600);
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//????????? JPanel ??????
		frame.getContentPane().add(getPanelSouth());
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 299, 25);
		frame.getContentPane().add(panel);
		//?????????
		JLabel lblNewLabel = new JLabel(name);
		panel.add(lblNewLabel);
		//?????? ??????
		JLabel lblNewLabel_1 = new JLabel(starString);
		lblNewLabel_1.setBounds(400, 400, 138, 250);
		panel.add(lblNewLabel_1);
		//?????? ??????
		JLabel lblNewLabel_2 = new JLabel("??????");
		lblNewLabel_2.setBounds(0, 24, 436, 75);
		panel.add(lblNewLabel_2);
		//????????????
		JLabel lblNewLabel_3 = new JLabel("Tel: "+tel);
		lblNewLabel_3.setBounds(0, 109, 217, 25);
		panel.add(lblNewLabel_3);
		//??????
		JLabel lblNewLabel_4 = new JLabel("??????: "+addr);
		lblNewLabel_4.setBounds(218, 109, 218, 25);
		panel.add(lblNewLabel_4);
		//??????(???, ???, ?????? ???)
		JLabel lblNewLabel_5 = new JLabel(subj);
		lblNewLabel_5.setBounds(0, 144, 436, 31);
		panel.add(lblNewLabel_5);
		//??????
		JLabel lblNewLabel_6 = new JLabel(cmt);
		lblNewLabel_6.setBounds(0, 185, 436, 36);
		panel.add(lblNewLabel_6);
		//url
		JLabel lblNewLabel_7 = new JLabel(url);
		lblNewLabel_7.setBounds(0, 231, 436, 32);
		panel.add(lblNewLabel_7);
		panel.add(getPanelSouth());
		panel.add(getBtnCancel());
	}
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					DetailApp window = new DetailApp();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}
	
	
	
//}




