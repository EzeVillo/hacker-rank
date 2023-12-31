/*
 * Complete the 'birthday' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY s
 *  2. INTEGER d
 *  3. INTEGER m
 */

function birthday(s, d, m) {
  let cont = 0;
  for (let i = 0; i < s.length; i++) {
    if (
      s.slice(i, i + m).reduce((prev, current) => {
        return prev + current;
      }) === d
    )
      cont++;
  }
  return cont;
}

console.log(birthday([2, 2, 1, 3, 2], 4, 2));
