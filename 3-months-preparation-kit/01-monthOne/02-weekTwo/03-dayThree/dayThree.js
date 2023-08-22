/*
 * Complete the 'flippingBits' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts LONG_INTEGER n as parameter.
 */

function flippingBits(n) {
  return parseInt(
    n
      .toString(2)
      .padStart(32, '0')
      .split('')
      .map((b) => (b === '1' ? '0' : '1'))
      .join(''),
    2
  );
}

console.log(flippingBits(2147483647));
console.log(flippingBits(1));
console.log(flippingBits(0));
