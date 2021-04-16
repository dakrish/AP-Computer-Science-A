
import java.util.Scanner;
public class PP810
{
//-----------------------------------------------------------------
// Presents a short quiz.
//-----------------------------------------------------------------
  public static void main (String[] args)
  {
    int questionsMade = 0;
    String question, answer, inputAnswer;
    Quiz quiz = new Quiz();
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to Quick Quiz Creator!");
    while (questionsMade <= 25)
    {
      System.out.println("Enter a question now! Type done if you are done making questions!");
      question = scan.nextLine();
      if  (question.equals("done"))
      {
        break;
      }
      else
      {
      System.out.println("Enter the previous question's answer!");
      answer = scan.nextLine();
      quiz.add(question, answer, questionsMade);
      }
      questionsMade++;
    }
    System.out.println("POP QUIZ!!!");
      quiz.giveQuiz();
  }
    
}