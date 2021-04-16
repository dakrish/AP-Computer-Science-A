public class Class{
  public Class(){}
   public void mystery (int n)
   {
     int k;
      for (k = 0; k < n; k++)
      {
         this.mystery(k);
         System.out.println(n);
      }
   }
}