package java0216;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class JRadioButtonEx extends JFrame {
	private JPanel radioPanel;
	private JRadioButton rbRB;
	private JRadioButton rbRM;
	private JRadioButton rbLP;
	private JRadioButton rbMX;
	
	private JLabel lblPicture;

	// 메인 윈도우 설정
	public JRadioButtonEx() {
		setTitle("JRadioButtonEx");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(getRadioPanel(), BorderLayout.WEST);
		this.getContentPane().add(getLblPicture(), BorderLayout.CENTER);
		pack();
	}

	// JRadioButton들이 배치된 JPanel 생성
	public JPanel getRadioPanel() {
		if (radioPanel == null) {
			radioPanel = new JPanel();

			radioPanel.setLayout(new GridLayout(5, 5));
			radioPanel.add(getRbRB());
			radioPanel.add(getRbRM());
			radioPanel.add(getRbLP());
			radioPanel.add(getRbMX());
			

			// 배타적 선택을 위해 ButtonGroup에 두 개의 JRadioButton 추가
			ButtonGroup group = new ButtonGroup();
			group.add(getRbRB());
			group.add(getRbRM());
			group.add(getRbLP());
			group.add(getRbMX());
		}
		return radioPanel;
	}

	// JRadioButton 생성
	public JRadioButton getRbRB() {
		if (rbRB == null) {
			rbRB = new JRadioButton();
			rbRB.setText("Russian Blue");
			rbRB.setSelected(true);  //기본적으로 선택되도록 설정
			rbRB.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("russianblue.jpg")));
				}
			});
		}
		return rbRB;
	}

	// JRadioButton 생성
	public JRadioButton getRbRM() {
		if (rbRM == null) {
			rbRM = new JRadioButton();
			rbRM.setText("Ragamuffin");
			rbRM.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					getLblPicture().setIcon(new ImageIcon(getClass().getResource("ragamuffin.jpg")));
				}
			});
		}
		return rbRM;
	}
	
	// JRadioButton 생성
		public JRadioButton getRbLP() {
			if (rbLP == null) {
				rbLP = new JRadioButton();
				rbLP.setText("LaPerm");
				rbLP.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						getLblPicture().setIcon(new ImageIcon(getClass().getResource("laperm.jpg")));
					}
				});
			}
			return rbLP;
		}
		
		// JRadioButton 생성
		public JRadioButton getRbMX() {
			if (rbMX == null) {
				rbMX = new JRadioButton();
				rbMX.setText("Manx");
				rbMX.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						getLblPicture().setIcon(new ImageIcon(getClass().getResource("manx2.jpg")));
					}
				});
			}
			return rbMX;
		}

	// 이미지를 보여줄 JLabel 생성
	public JLabel getLblPicture() {
		if (lblPicture == null) {
			lblPicture = new JLabel();
			lblPicture.setIcon(new ImageIcon(getClass().getResource("russianblue.jpg")));
		}
		return lblPicture;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JRadioButtonEx jFrame = new JRadioButtonEx();
				jFrame.setVisible(true);
			}
		});
	}
}

