/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

function pageCount(n, p) {
  if (n % 2 === 0) n++;
  if (p % 2 === 0) p++;
  return Math.min(Math.floor(p / 2), Math.floor((n - p) / 2));
}

console.log(pageCount(6, 5));
