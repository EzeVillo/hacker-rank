/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

function diagonalDifference(arr) {
  let leftRoRightDiagonal = 0;
  let rightToLeftDiagonal = 0;

  for (let i = 0; i < arr.length; i++) {
    leftRoRightDiagonal += arr[i][i];
    rightToLeftDiagonal += arr[i][arr.length - 1 - i];
  }

  return Math.abs(leftRoRightDiagonal - rightToLeftDiagonal);
}

console.log(
  diagonalDifference([
    [1, 2, 21],
    [64, 245, 76582],
    [2342, 34, 32],
  ])
);
