class PP1102subclass
{
  public String doStuff(String s) throws StringTooLongException
  {
    if (s.length() >= 20)
    {
      throw new StringTooLongException("Input string is toooooooo long.");
    }
    else
    {
      return "Valid string entered!";
    }
  }
}