/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

function timeConversion(s) {
  const AM = 'AM';
  const PM = 'PM';
  const timeFormat = s.slice(-2);
  const hours = s.slice(0, 2);
  const minutesAndSeconds = s.slice(2, -2);

  if (timeFormat === AM && hours === '12') {
    return '00' + minutesAndSeconds;
  }

  if (timeFormat === PM && hours !== '12') {
    return Number(hours) + 12 + minutesAndSeconds;
  }

  return hours + minutesAndSeconds;
}

s = '12:45:54PM';
const result = timeConversion(s);
console.log(result);
