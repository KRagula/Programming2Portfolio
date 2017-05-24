
/**
 * 
 * @author Sam Cookson
 * @since 03-17-2017 
 *
 */

public class CrowdSourcing {
	
	public static void main(String[] args) {
		GUI gui = new GUI();
		
		String[][] QnA= {
			{"1", "2", "3", "4", "5"},
			{GUI.answer1, GUI.answer2, GUI.answer3, GUI.answer4, GUI.answer5}
		};
			
		for(int i = 0; i < QnA.length; i++) {
			System.out.println(QnA[i][0]);
			for(int j = 0; j < QnA[i].length; j++) {
				System.out.println(QnA[i][j]);
			}
			System.out.println();
		}
	}

}
