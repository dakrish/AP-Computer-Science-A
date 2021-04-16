public class PP605
{
  public static void main(String[] args)
  {
    class PairOfDice
    {
      class Die
      {
        private int faceValue;
        public Die()
        {
          faceValue = 1;
        }
        public void roll()
        {
          faceValue = (int)(Math.random() * 6) + 1;
        }
        public void setFaceValue(int value)
        {
          faceValue = value;
        }
        public int getFaceValue()
        {
          return faceValue;
        }
        public String toString()
        {
          String result = Integer.toString(faceValue);
          return result;
        }
      }
      private Die die1, die2;
      public PairOfDice()
      {
        die1=new Die();
        die2=new Die();
      }
      public int rollDie1()
      {
        return die1.getFaceValue();
      }
      public int rollDie2()
      {
        return die2.getFaceValue();
      }
      public void placeDie1(int dieValue)
      {
        die1.setFaceValue(dieValue);
      }
      public void placeDie2(int dieValue)
      {
        die2.setFaceValue(dieValue);
      }
      public void rollBothDice()
      {
        die1.roll();
        die2.roll();
      }
      public int add()
      {
        return die1.getFaceValue()+die2.getFaceValue();
      }
    }
    int count = 0;
    PairOfDice pair=new PairOfDice();
    for (int rolls = 1; rolls <=1000; rolls++)
    {
      pair.rollBothDice();
      if ((pair.rollDie1()==6)&&(pair.rollDie2()==6))
      {
        count++;
      }
    }
    System.out.println(count);
  }
}