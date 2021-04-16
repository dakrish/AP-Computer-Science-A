public class TestCoin

{

   //-----------------------------------------------------------------

   //  Flips a coin multiple times and counts the number of heads

   //  and tails that result.  Locks and unlocks coins

   //-----------------------------------------------------------------

   public static void main (String[] args)

   {

      final int NUM_FLIPS = 25;

 

      CoinV2 myCoin = new CoinV2(19, 19);  // instantiate the Coin object

 

      for (int count=1; count <= NUM_FLIPS; count++)

      {

         myCoin.flip(19);

 

         System.out.println(myCoin);

 

         if (count % 10 == 0)

            myCoin.lock(19);

         else

            if (count % 5 == 0)

               myCoin.unlock(19);

 

      }

 

   }

}