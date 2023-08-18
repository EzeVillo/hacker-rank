/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

function gradingStudents(grades) {
  const result = [];
  grades.forEach((grade) => {
    const remainder = grade % 5;
    const takeToBeMultipleOfFive = 5 - remainder;
    if (grade < 38 || remainder === 0 || takeToBeMultipleOfFive >= 3) {
      result.push(grade);
      return;
    }
    result.push(grade + takeToBeMultipleOfFive);
  });
  return result;
}

console.log(gradingStudents([88]));
