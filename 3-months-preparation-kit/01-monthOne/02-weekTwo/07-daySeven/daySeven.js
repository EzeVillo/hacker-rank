/*
 * Complete the 'pangrams' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

function pangrams(s) {
  const NUMBERS_OF_ALPHABET_LETTERS = 26;
  const PANGRAM = 'pangram';
  const NOT_PANGRAM = 'not pangram';
  if (
    new Set(s.replaceAll(' ', '').toLowerCase().split('')).size ==
    NUMBERS_OF_ALPHABET_LETTERS
  )
    return PANGRAM;
  else return NOT_PANGRAM;
}

console.log(
  pangrams('We promptly judged antique ivory buckles for the next prize')
);
console.log(pangrams('We promptly judged antique ivory buckles for the prize'));
