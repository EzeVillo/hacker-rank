/*
 * Complete the 'marsExploration' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts STRING s as parameter.
 */

function marsExploration(s) {
  const SOS = 'SOS';
  let cont = 0;
  for (let i = 0; i < s.length; i++) if (s[i] !== SOS[i % SOS.length]) cont++;

  return cont;
}

console.log(marsExploration('SOSSPSSQSSOR'));
