Step 1: Create a New Maven Project Open Eclipse and go to File → New → Project. Select Maven Project and click Next. Choose Default Workspace Location and click Next. Select maven-archetype-quickstart (or any basic archetype) and click Next. Enter Group Id (e.g., com.example), Artifact Id (e.g., JUnitDemo), and Version (leave default or customize). Finally, click Finish.

Step 2: Add JUnit Dependency to pom.xml Open the pom.xml file in your project root.

    Inside the <dependencies> tag, add: 

junit junit 4.13.2 test Save the file. Eclipse will automatically update the project and download JUnit jars.

Step 3: Create a Test Class Right-click on src/test/java and select New → Class. Name the class, e.g., CalculatorTest.

Step 4: Write a Basic JUnit Test 
import static org.junit.Assert.assertEquals; 
import org.junit.Test; 
public class CalculatorTest {
  @Test public void testAddition() {
  int result = 2 + 3; 
  assertEquals(5, result); 
  } 
}

Step 5: Run the Test Right-click on the test class (CalculatorTest.java) and select Run As → JUnit Test.

The JUnit view in Eclipse will show green (pass) or red (fail) bars based on the test results.
