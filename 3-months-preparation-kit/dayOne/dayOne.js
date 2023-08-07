'use strict';

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function plusMinus(arr) {
  const solution = {
    positive: 0,
    negative: 0,
    zero: 0,
  };

  arr.forEach((number) => {
    if (number > 0) {
      solution.positive++;
      return;
    }
    if (number < 0) {
      solution.negative++;
      return;
    }
    solution.zero++;
  });

  Object.values(solution).forEach((value) => {
    console.log((value / arr.length).toFixed(6));
  });
}

const arr = [1, 0, 1, -1, -2, 0];

plusMinus(arr);
