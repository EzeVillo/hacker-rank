/*
 * Complete the 'matchingStrings' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts following parameters:
 *  1. STRING_ARRAY strings
 *  2. STRING_ARRAY queries
 */

function matchingStrings(strings, queries) {
  const solution = [];
  queries.forEach((query) => {
    solution.push(strings.filter((string) => string === query).length);
  });
  return solution;
}

console.log(matchingStrings(['ab', 'ab', 'abc'], ['ab', 'abc', 'bc']));
