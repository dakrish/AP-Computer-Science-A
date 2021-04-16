class PP1104subclass
{
  public String doStuff(String code) throws InvalidDocumentCodeException
  {
    if ((code.charAt(0) == 'c') || (code.charAt(0) == 'u') || (code.charAt(0) == 'p') || (code.charAt(0) == 'C') || (code.charAt(0) == 'U') || (code.charAt(0) == 'P')){return "Valid Code Entered!";}
    else
    {
      throw new InvalidDocumentCodeException();
    }
  }
}