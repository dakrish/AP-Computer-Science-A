//********************************************************************
//  DVD.java       Author: Lewis/Loftus
//
//  Represents a DVD video disc.
//********************************************************************

import java.text.NumberFormat;

public class DVD implements Comparable
{
  private String title, director;
  private int year;
  private double cost;
  private boolean bluRay;
  
  //-----------------------------------------------------------------
  //  Creates a new DVD with the specified information.
  //-----------------------------------------------------------------
  public DVD (String title, String director, int year, double cost,
              boolean bluRay)
  {
    this.title = title;
    this.director = director;
    this.year = year;
    this.cost = cost;
    this.bluRay = bluRay;
  }
  
  //-----------------------------------------------------------------
  //  Returns a string description of this DVD.
  //-----------------------------------------------------------------
  public String toString()
  {
    NumberFormat fmt = NumberFormat.getCurrencyInstance();
    
    String description;
    
    description = fmt.format(cost) + "    \t" + year + "    \t";
    description += title + "    \t" + director;
    
    if (bluRay)
      description += "    \t" + "Blu-Ray";
    
    return description;
  }
  public boolean equals(Object other)
  {
    return (title.equals(((DVD)other).getTitle()));
  }
  
  public String getTitle()
  {
    return this.title;
  }
  
  //-----------------------------------------------------------------
  //  Uses both last and first names to determine ordering.
  //-----------------------------------------------------------------
  public int compareTo(Object other)
  {
    int result;
    
    String otherTitle = ((DVD)other).getTitle();
    
      result = title.compareTo(otherTitle);
    
    return result;
  }
  
}
