/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function miniMaxSum(arr) {
  let sum = 0;
  let min = Infinity;
  let max = -Infinity;

  arr.forEach((number) => {
    if (number < min) min = number;
    if (number > max) max = number;

    sum += number;
  });

  console.log(`${sum - max} ${sum - min}`);
}

arr = [1, 3, 5, 7, 9];

miniMaxSum(arr);
