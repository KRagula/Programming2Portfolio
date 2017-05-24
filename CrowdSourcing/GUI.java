import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Sets up GUI for application
 * 
 * @author Sam Cookson
 * @since 03-17-2017
 *
 */

@SuppressWarnings("serial")
public class GUI extends JFrame implements ActionListener{
	private JButton crowdContest, CC1, CC2, CC3, CC4, CC5, submit1, submit2, submit3, submit4, submit5, quiz, endQuiz;
	private JButton yes1, yes2, yes3, yes4, yes5, no1, no2, no3, no4, no5;
	static JTextField TF1, TF2, TF3, TF4, TF5;
	private JPanel startPanel, ccPanel, quizPanel;
	private JFrame contentFrame;
	private JLabel instructions1, CCinstructions1, CCinstructions2, Q1, Q2, Q3, Q4, Q5;
	private int nums;
	static String question1, question2, question3, question4, question5, q1, q2, q3, q4, q5;
	static String answer1, answer2, answer3, answer4, answer5;
	
	/**
	 * Sets up the constructor for the GUI class
	 */
	
	public GUI() {
		super("CrowdSourcing");
		
		///Start Panel///
		startPanel = new JPanel();
		startPanel.setLayout(null);
		
		instructions1 = new JLabel();
		instructions1.setBounds(150, 10, 340, 50);
		instructions1.setText("Which type of crowdsourcing would you like to use?");
		
		crowdContest = new JButton("Crowdcontest");
		crowdContest.setBounds(215, 100, 200, 50);
		crowdContest.addActionListener(this);
		
		startPanel.add(instructions1);
		startPanel.add(crowdContest);
		/////////////////
		
		///CC Panel///
		ccPanel = new JPanel();
		ccPanel.setLayout(null);
		
		CCinstructions1 = new JLabel();
		CCinstructions1.setBounds(150, 10, 340, 50);
		CCinstructions1.setText("How many questions would you like in your survey?");
		
		CCinstructions2 = new JLabel();
		CCinstructions2.setBounds(150, 10, 400, 50);
		CCinstructions2.setText("Enter the questions you wish to ask and press 'Enter'.");
		
		CC1 = new JButton("One Question");
		CC1.setBounds(215, 100, 200, 50);
		CC1.addActionListener(this);
		
		CC2 = new JButton("Two Questions");
		CC2.setBounds(215, 200, 200, 50);
		CC2.addActionListener(this);
		
		CC3 = new JButton("Three Questions");
		CC3.setBounds(215, 300, 200, 50);
		CC3.addActionListener(this);
		
		CC4 = new JButton("Four Questions");
		CC4.setBounds(215, 400, 200, 50);
		CC4.addActionListener(this);
		
		CC5 = new JButton("Five Questions");
		CC5.setBounds(215, 500, 200, 50);
		CC5.addActionListener(this);
		
		submit1 = new JButton("Enter");
		submit1.setBounds(420, 100, 50, 50);
		submit1.addActionListener(this);
		
		submit2 = new JButton("Enter");
		submit2.setBounds(420, 200, 50, 50);
		submit2.addActionListener(this);
		
		submit3 = new JButton("Enter");
		submit3.setBounds(420, 300, 50, 50);
		submit3.addActionListener(this);
		
		submit4 = new JButton("Enter");
		submit4.setBounds(420, 400, 50, 50);
		submit4.addActionListener(this);
		
		submit5 = new JButton("Enter");
		submit5.setBounds(420, 500, 50, 50);
		submit5.addActionListener(this);
		
		TF1 = new JTextField(1);
		TF1.setBounds(215, 100, 200, 50);
		
		TF2 = new JTextField(1);
		TF2.setBounds(215, 200, 200, 50);
		
		TF3 = new JTextField(1);
		TF3.setBounds(215, 300, 200, 50);
		
		TF4 = new JTextField(1);
		TF4.setBounds(215, 400, 200, 50);

		TF5 = new JTextField(1);
		TF5.setBounds(215, 500, 200, 50);
		
		quiz = new JButton("Start Quiz");
		quiz.setBounds(215, 600, 200, 50);
		quiz.addActionListener(this);
	
		ccPanel.add(CCinstructions1);
		ccPanel.add(CC1);
		ccPanel.add(CC2);
		ccPanel.add(CC3);
		ccPanel.add(CC4);
		ccPanel.add(CC5);
		//////////////
		
		///Quiz Panel///
		quizPanel = new JPanel();
		quizPanel.setLayout(null);
		
		endQuiz = new JButton("End Quiz");
		endQuiz.setBounds(215, 560, 200, 50);
		endQuiz.addActionListener(this);
		
		yes1 = new JButton("Yes");
		yes1.setBounds(150, 60, 200, 50);
		yes1.addActionListener(this);
		
		no1 = new JButton("No");
		no1.setBounds(350, 60, 200, 50);
		no1.addActionListener(this);
		
		yes2 = new JButton("Yes");
		yes2.setBounds(150, 160, 200, 50);
		yes2.addActionListener(this);
		
		no2 = new JButton("No");
		no2.setBounds(350, 160, 200, 50);
		no2.addActionListener(this);
		
		yes3 = new JButton("Yes");
		yes3.setBounds(150, 260, 200, 50);
		yes3.addActionListener(this);
		
		no3 = new JButton("No");
		no3.setBounds(350, 260, 200, 50);
		no3.addActionListener(this);
		
		yes4 = new JButton("Yes");
		yes4.setBounds(150, 360, 200, 50);
		yes4.addActionListener(this);
		
		no4 = new JButton("No");
		no4.setBounds(350, 360, 200, 50);
		no4.addActionListener(this);
		
		yes5 = new JButton("Yes");
		yes5.setBounds(150, 460, 200, 50);
		yes5.addActionListener(this);
		
		no5 = new JButton("No");
		no5.setBounds(350, 460, 200, 50);
		no5.addActionListener(this);
		
		Q1 = new JLabel();
		Q1.setBounds(50, 10, 340, 50);
		
		Q2 = new JLabel();
		Q2.setBounds(50, 110, 340, 50);
		
		Q3 = new JLabel();
		Q3.setBounds(50, 210, 340, 50);
		
		Q4 = new JLabel();
		Q4.setBounds(50, 310, 340, 50);
		
		Q5 = new JLabel();
		Q5.setBounds(50, 410, 340, 50);
		
		quizPanel.add(yes1);
		quizPanel.add(no1);
		quizPanel.add(yes2);
		quizPanel.add(no2);
		quizPanel.add(yes3);
		quizPanel.add(no3);
		quizPanel.add(yes4);
		quizPanel.add(no4);
		quizPanel.add(yes5);
		quizPanel.add(no5);
		////////////////
		
		contentFrame = new JFrame();
		contentFrame.add(startPanel);
		contentFrame.setBackground(Color.WHITE);
		contentFrame.setSize(600, 800);
		contentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentFrame.setVisible(true);
		contentFrame.setResizable(false);
	}

	/**
	 * Manages functionality of GUI elements
	 * 
	 * @param e
	 */
	
	public void actionPerformed(ActionEvent e) {		
		Object button = e.getSource();
		if(button == crowdContest) {
			System.out.println("Crowdcontest");
			contentFrame.remove(startPanel);
			contentFrame.add(ccPanel);
			contentFrame.revalidate();
			contentFrame.repaint();
		}
		
		if(button == CC1) {
			ccPanel.remove(CC1);
			ccPanel.remove(CC2);
			ccPanel.remove(CC3);
			ccPanel.remove(CC4);
			ccPanel.remove(CC5);
			ccPanel.remove(CCinstructions1);
			ccPanel.add(CCinstructions2);
			ccPanel.add(TF1);
			ccPanel.add(submit1);
			ccPanel.add(quiz);
			ccPanel.revalidate();
			ccPanel.repaint();
		}else if(button == CC2) {
			ccPanel.remove(CC1);
			ccPanel.remove(CC2);
			ccPanel.remove(CC3);
			ccPanel.remove(CC4);
			ccPanel.remove(CC5);
			ccPanel.remove(CCinstructions1);
			ccPanel.add(CCinstructions2);
			ccPanel.add(TF1);
			ccPanel.add(TF2);
			ccPanel.add(submit1);
			ccPanel.add(submit2);
			ccPanel.add(quiz);
			ccPanel.revalidate();
			ccPanel.repaint();
		}else if(button == CC3) {
			ccPanel.remove(CC1);
			ccPanel.remove(CC2);
			ccPanel.remove(CC3);
			ccPanel.remove(CC4);
			ccPanel.remove(CC5);
			ccPanel.remove(CCinstructions1);
			ccPanel.add(CCinstructions2);
			ccPanel.add(TF1);
			ccPanel.add(TF2);
			ccPanel.add(TF3);
			ccPanel.add(submit1);
			ccPanel.add(submit2);
			ccPanel.add(submit3);
			ccPanel.add(quiz);
			ccPanel.revalidate();
			ccPanel.repaint();
		}else if(button == CC4) {
			ccPanel.remove(CC1);
			ccPanel.remove(CC2);
			ccPanel.remove(CC3);
			ccPanel.remove(CC4);
			ccPanel.remove(CC5);
			ccPanel.remove(CCinstructions1);
			ccPanel.add(CCinstructions2);
			ccPanel.add(TF1);
			ccPanel.add(TF2);
			ccPanel.add(TF3);
			ccPanel.add(TF4);
			ccPanel.add(submit1);
			ccPanel.add(submit2);
			ccPanel.add(submit3);
			ccPanel.add(submit4);
			ccPanel.add(quiz);
			ccPanel.revalidate();
			ccPanel.repaint();
		}else if(button == CC5) {
			ccPanel.remove(CC1);
			ccPanel.remove(CC2);
			ccPanel.remove(CC3);
			ccPanel.remove(CC4);
			ccPanel.remove(CC5);
			ccPanel.remove(CCinstructions1);
			ccPanel.add(CCinstructions2);
			ccPanel.add(TF1);
			ccPanel.add(TF2);
			ccPanel.add(TF3);
			ccPanel.add(TF4);
			ccPanel.add(TF5);
			ccPanel.add(submit1);
			ccPanel.add(submit2);
			ccPanel.add(submit3);
			ccPanel.add(submit4);
			ccPanel.add(submit5);
			ccPanel.add(quiz);
			ccPanel.revalidate();
			ccPanel.repaint();
		}
		
		if(button == submit1) {
			nums = 1;
			try {
				String question1 = TF1.getText();
				IO(question1);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(button == submit2) {
			nums = 2;
			try {
				String question2 = TF2.getText();
				IO(question2);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(button == submit3) {
			nums = 3;
			try {
				String question3 = TF3.getText();
				IO(question3);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(button == submit4) {
			nums = 4;
			try {
				String question4 = TF4.getText();
				IO(question4);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}else if(button == submit5) {
			nums = 5;
			try {
				String question5 = TF5.getText();
				IO(question5);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		
		if(button == quiz) {
			contentFrame.remove(ccPanel);
			contentFrame.add(quizPanel);
			contentFrame.revalidate();
			contentFrame.repaint();
		}
		
		if(button == yes1) {
			answer1 = "yes";
		}else if(button == no1) {
			answer1 = "no";
		}else if(button == yes2) {
			answer2 = "yes";
		}else if(button == no2) {
			answer2 = "no";
		}else if(button == yes3) {
			answer3 = "yes";
		}else if(button == no3) {
			answer3 = "no";
		}else if(button == yes4) {
			answer4 = "yes";
		}else if(button == no4) {
			answer4 = "no";
		}else if(button == yes5) {
			answer5 = "yes";
		}else if(button == no5) {
			answer5 = "no";
		}
	}
	
	/**
	 * Write and reads from file
	 * 
	 * @param question
	 * @throws Exception
	 */
	
	public void IO(String question) throws Exception{
		String file = "Questions.txt";
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outputStream = new PrintWriter(bw);
		outputStream.println(question);
		if(nums == 1) {
			q1 = question;
			Q1.setText(q1);
			quizPanel.add(Q1);
		}else if(nums == 2) {
			q2 = question;
			Q2.setText(q2);
			quizPanel.add(Q2);
		}else if(nums == 3) {
			q3 = question;
			Q3.setText(q3);
			quizPanel.add(Q3);
		}else if(nums == 4) {
			q4 = question;
			Q4.setText(q4);
			quizPanel.add(Q4);
		}else if(nums == 5) {
			q5 = question;
			Q5.setText(q5);
			quizPanel.add(Q5);
		}
		outputStream.close();
		System.out.println("Done");
	}
}
