/*
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

function sockMerchant(n, ar) {
  let res = 0;
  Object.values(
    ar.reduce((map, val) => {
      map[val] = map[val] ?? 0;
      map[val]++;
      return map;
    }, {})
  ).forEach((number) => {
    res += Math.floor(number / 2);
  });

  return res;
}

console.log(sockMerchant(5, [1, 2, 1, 2, 1, 3, 2]));
