/*
 * Complete the 'migratoryBirds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

function migratoryBirds(arr) {
  let res = { id: '0', value: 0 };
  Object.entries(
    arr.reduce((map, val) => {
      map[val] = map[val] ?? 0;
      map[val]++;
      return map;
    }, {})
  ).forEach(([id, value]) => {
    if (value > res.value) {
      res.id = id;
      res.value = value;
    } else if (value === res.value && id < res.id) {
      res.id = id;
    }
  });

  return res.id;
}

console.log(migratoryBirds([1, 1, 2, 2, 3]));
