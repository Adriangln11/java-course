package optionalClasses;


import java.util.Optional;

public class OptionalClasses {

  public static Optional<Double> average (Double ...scores) {
    if (scores.length ==0) {
      return Optional.empty();
    }
    double sum = 0;
    for (Double score : scores) sum += score;
    return Optional.of(sum / scores.length);
  }
  public static void getOptionalResult () {
    Optional<Double> result = average(5.6,8.9,3.8,2.8);
    result.ifPresent(System.out::println);
    System.out.println("There is no result");
  }
}
