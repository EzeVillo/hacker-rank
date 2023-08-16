/*
 * Complete the 'breakingRecords' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY scores as parameter.
 */

function breakingRecords(scores) {
  let minScore = scores[0];
  let maxScore = scores[0];
  let maxCount = 0;
  let minCount = 0;

  scores.forEach((score) => {
    if (score > maxScore) {
      maxScore = score;
      maxCount++;
      return;
    }
    if (score < minScore) {
      minScore = score;
      minCount++;
    }
  });
  return [maxCount, minCount];
}

scores = [12, 24, 10, 24];
console.log(breakingRecords(scores));
