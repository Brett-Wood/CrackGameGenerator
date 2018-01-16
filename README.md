# CrackGameGenerator
## Description of the program:
This is a Java program that I use to generate full game play outs for testing the "Crack" golf game application.  The program randomly generates an entire 18 hole golf round.  Generating handicaps and strokes on each hole for a user-entered number of players (typically 3, 4 or 5).  This will also generate the number of "cracks" per hole and whether or not there is an active press on each of the two nines.
## About the game:
Crack is a scoring game meant to be played on a full 18 hole round of golf.  The rules are derrived from the classic 3 man 9-point, 4 man 16-point and 5 man 25-point golf scoring format.  Each player has the option to "crack" once per hole.  If a player cracks, the point distribution is multiplied.  The first crack will multiply the distribution by 2, the second will multiply the distribution by 3, the third by 4 and so on.  There is only one press allowed per nine.  If a press is active, all cracks will add a multiplier of 2 instead of just 1.  For example, if there is not an active press one crack is a multiplier of 2.  If there is an active press, that one crack is now a multiplier of 4 instead.  If there hasn't been a press declared on the current nine, the player with the lowest total points is allowed to declare a press.  If there is a tie between any number of players, the points each player earns is the average of the points that would be awarded had there not been a tie.  For example, consider a 3 man game with no cracks or presses where one player wins outright and the other two players tie.  In this case the top player would win his or her 5 points and the other two players would receive the average of the remaining number of points (i.e. each of the two bottom players receive 2 points).
## Base Scoring:
#### 3 Man Game:
|     Place    |  Points  |
|--------------|----------|
| First Place  | 5 points |
| Second Place | 3 points |
| Third Place  | 1 point  |
#### 4 Man Game:
|     Place    |  Points  |
|--------------|----------|
| First Place  | 7 points |
| Second Place | 5 points |
| Third Place  | 3 points |
| Fourth Place | 1 point  |
#### 5 Man Game:
|     Place    |  Points  |
|--------------|----------|
| First Place  | 9 points |
| Second Place | 7 points |
| Third Place  | 5 points |
| Fourth Place | 3 point  |
| Fifth Place  | 1 point  |
