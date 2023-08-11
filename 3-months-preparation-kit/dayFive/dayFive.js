function processData(input) {
  input = input.split('\r\n');
  input.forEach((line) => {
    const [operation, type, words] = line.split(';');

    if (operation === 'S') {
      let solution = words.split(/(?<!^)(?=[A-Z])/g);
      solution = solution.join(' ').toLowerCase();
      if (type === 'M') {
        solution = solution.slice(0, -2);
      }
      console.log(solution);
    }

    if (operation === 'C') {
      let solution = words.split(' ');
      for (let i = 1; i < solution.length; i++) {
        solution[i] = capitalize(solution[i]);
      }
      solution = solution.join('');

      if (type === 'M') {
        solution = solution.concat('()');
      }
      if (type === 'C') {
        solution = capitalize(solution);
      }
      console.log(solution);
    }
  });
}

const capitalize = (word) => word.charAt(0).toUpperCase() + word.slice(1);

input = 'C;M;mouse pad';
processData(input);
