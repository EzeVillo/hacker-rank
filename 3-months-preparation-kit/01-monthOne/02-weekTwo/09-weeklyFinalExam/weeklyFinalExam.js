/*
 * Complete the 'flippingMatrix' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
 */

function flippingMatrix(matrix) {
  let sum = 0;
  for (let i = 0; i < (matrix.length - 1) / 2; i++)
    for (let j = 0; j < (matrix[0].length - 1) / 2; j++)
      sum += Math.max(
        matrix[i][j],
        matrix[matrix.length - 1 - i][matrix[0].length - 1 - j],
        matrix[i][matrix[0].length - 1 - j],
        matrix[matrix.length - 1 - i][j]
      );
  return sum;
}

console.log(
  flippingMatrix([
    [112, 42, 83, 119],
    [56, 125, 56, 49],
    [54, 22, 577, 1],
    [2, 64, 742, 15],
  ])
);
