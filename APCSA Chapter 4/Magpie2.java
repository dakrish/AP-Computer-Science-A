AP CS A 2018 2019
A3
Due Dec 18
Magpie Chatbot Activity 2

Jeanine LaBrosse
Dec 7
Attached are the two .java files to run and modify for activity two as well as the pages from the student book to fill out.
Your work
Assigned
Files you add or create can be viewed and edited by your teacher

Krishna Cheemalapati - Activity 2: Introduction to the Magpie Class
Google Docs

Krishna Cheemalapati - Magpie2.java
Java

Krishna Cheemalapati - MagpieRunner2.java
Java

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * 
  * @param statement
  *            the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
  String response = "";
if (statement.indexOf(" no ") >= 0)
  {
   response = "Why so negative?";
  }
   if (statement.indexOf("mother") >= 0
    || statement.indexOf("father") >= 0
    || statement.indexOf("sister") >= 0
    || statement.indexOf("brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  findKeyword ("dog", "cat", 0); 
 {
   response = "Tell me more about your pets.";
 }  
  findKeyword ("Mrs.Labrosse", 0);
{
   response = "I heard she is a great teacher.";
 }  
   if (statement.indexOf("football") >= 0
    || statement.indexOf("soccer") >= 0
    || statement.indexOf("running") >= 0
    || statement.indexOf("tennis") >= 0)
  {
   response = "Tell me more about your sports interests.";
  }
  else if (statement.indexOf("Christmas") >= 0
    || statement.indexOf("Hannukah") >= 0
    || statement.indexOf("Kwanza") >= 0)
  {
     response = "Oh, how I love the holidays!";
  }
  else if (statement.trim().length() == 0)
 {
  response = "Say something, please.";
 }
  else
  {
   response = getRandomResponse();
  }
  return response;
 }

 private void findKeyword(String string, int i) {
 // TODO Auto-generated method stub
 
}

private void findKeyword(String string, String string2, int i) {
 // TODO Auto-generated method stub
 
}

/**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 6;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  String response = "";
  
  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
  else if (whichResponse == 4)
  {
   response = "You're probably right.";
  }
  else if (whichResponse == 5)
  {
   response = "You leave me speechless.";
  }

  return response;
 }
}
Krishna Cheemalapati - Magpie2.java
Displaying Krishna Cheemalapati - Magpie2.java.