/**
 * Sum Arrays
 *
 * Write a function that takes an array of numbers and returns the sum of the numbers. The numbers can be negative. If the array is empty, return 0.
 *
 */

public class SumArray {

  public static double sum(double[] numbers) {
    double soma = 0;
    for (int i = 0; i < numbers.length; i++) {
      soma += numbers[i];
    }
    return soma;
  }
}
