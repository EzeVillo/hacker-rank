/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

function countingValleys(steps, path) {
  const UP = 'U';
  let cont = 0;
  let seaLevel = 0;

  for (let i = 0; i < steps; i++) {
    if (path[i] === UP) seaLevel++;
    else seaLevel--;
    if (seaLevel === -1 && path[i + 1] === UP) cont++;
  }
  return cont;
}

console.log(countingValleys(12, 'DDUUDDUDUUUD'));
