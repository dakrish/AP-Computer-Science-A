import java.util.Scanner;
public class Quiz
{
  int numRights;
  int numCreated = 0;
  int questionNumber = 0;
  String possible;
  double percentage;
  String tempString = new String ("");
  Question temp = new Question("done","");
  Question sentinelQuestion = new Question("done","");
  Question[] questionArray = new Question[26];
  Scanner scan = new Scanner(System.in);
  public Quiz()
  {
    while (numCreated < 25)
    {
      questionArray[numCreated] = new Question("done", "");
      numCreated++;
    }
  }
  public void add(String nQuestion, String nAnswer, int index)
  {
    temp.setQuestion(nQuestion, nAnswer);
    questionArray[index] = temp;
  }
  public void giveQuiz()
  {
    while (!(tempString.equals("done")))
    {
      temp = questionArray[questionNumber];
      tempString = temp.getQuestion();
      if  (tempString.equals("done"))
      {
        break;
      }
      System.out.println(temp);
      possible = scan.nextLine();
      if (temp.answerCorrect(possible))
      {
        System.out.println ("Correct");
        this.numRights++;
      }
      else
      {
        System.out.println ("No, the answer is " + temp.getAnswer() + ".");
      }
      questionNumber++;
    }
    percentage = ((double) numRights)/((double) questionNumber);
    System.out.println("You got " + numRights + "/" + questionNumber + " questions right. This is a " + percentage*100 + "%");
  }
}