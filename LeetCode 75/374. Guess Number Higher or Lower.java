/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {

        int min = 1;
        int max = n;


        while (min <= max) {
            int num = min + (max - min) / 2;
            int guessRes = guess(num);

            if (guessRes == 0) {
                return num;
            }

            if (guessRes == -1) {
                max = num - 1;
            }
            else {
                min = num + 1;
            }
        }

        return -1;
        // return guessGen(1, n);
    }

    // public int guessGen(int min, int max) {

    //     int num = min + (max - min) / 2;
    //     int res = guess(num);

    //     if (res == 0) {
    //         return num;
    //     }
    //     else if (res == -1) {
    //         return guessGen(min, num - 1);
    //     }

    //     return guessGen(num + 1, max);
    // }

}