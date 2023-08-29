# NewspaperSubscription
Introduction:
---------------
The Newspaper Subscription application helps users identify viable combinations of newspaper subscriptions 
according to their budget. Users can specify their budget, and the application will generate a list of 
possible combinations of newspapers that fall within the given budget.

Usage:
------------
1.Compile the Java program:
javac NewspaperSubscription.java

2.Run the compiled program:
java NewspaperSubscription

3.Enter your budget when prompted.

4.The application will display the possible combinations of newspaper subscriptions 
that fit within the specified budget.

Class Details:
--------------
Newspaper
.Represents a newspaper subscription.
.Properties:
  .name (String): Name of the newspaper.
  .dailyCost (double[]): Array of daily costs for the newspaper.
.Methods:
   .calculateWeeklyCost(): Calculates and returns the weekly cost of the newspaper subscription 
based on the daily costs.

NewspaperSubscription
.Contains the main application logic and entry point.
.Methods:
         .getPossibleCombinations(double budget, Newspaper... newspapers): Generates a list of possible 
combinations of newspaper subscriptions based on the given budget and a variable number of Newspaper objects.

How It Works:
--------------
1.The main method creates instances of different newspapers 
(TOI, Hindu, ET, BM, HT) with their respective daily costs.

2.The user is prompted to input their budget using the Scanner class.

3.The getPossibleCombinations method is called with the provided budget and the newspaper instances.

4.The application iterates through pairs of newspapers, calculates the combined weekly cost of each pair, 
and adds the pair to the result list if the combined cost is within the budget.

5.The possible combinations are displayed to the user, showing the combinations of newspapers 
that can be subscribed to within the specified budget.

This application provides an interactive way for users to explore their newspaper subscription 
options based on their budget constraints. It's a practical tool for making informed decisions 
about which newspapers to subscribe to.
