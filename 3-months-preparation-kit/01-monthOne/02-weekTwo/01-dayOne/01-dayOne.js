/*
 * Complete the 'lonelyinteger' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

function lonelyinteger(a) {
  for (let i = 0; i < a.length; i++) {
    if (a.filter((number) => number === a[i]).length === 1) {
      return a[i];
    }
  }
}

console.log(lonelyinteger([1, 2, 3, 4, 3, 2, 1]));
