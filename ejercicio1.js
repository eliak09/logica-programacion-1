// Variables con prompt
let num1 = prompt("Ingresa el primer número: ");
let num2 = prompt("Ingresa el segundo número: ");
let num3 = prompt("Ingresa el tercer número: ");

// convertir los números a int. Array para ordenar.
let numbers = [parseInt(num1), parseInt(num2), parseInt(num3)];

// Verifica todas las posibilidades de igualdad con alerta y console.log
if (numbers[0] === numbers[1] && numbers[0] === numbers[2]) {
    alert("Los tres números son iguales.");
    console.log("Los tres números son iguales.");
} else if (numbers[0] === numbers[1]) {
    alert("El primer y segundo número son iguales.");
    console.log("El primer y segundo número son iguales.");
} else if (numbers[0] === numbers[2]) {
    alert("El primer y tercer número son iguales.");
    console.log("El primer y tercer número son iguales.");
} else if (numbers[1] === numbers[2]) {
    alert("El segundo y tercer número son iguales.");
    console.log("El segundo y tercer número son iguales.");
}

// sort ordena de menor a mayor
numbers.sort((a, b) => a - b);
alert("Los números ordenados de menor a mayor son: " + numbers);
console.log("Menor a mayor: " + numbers);

//reverse ordena de mayor a menor. Agreado el operador spread no interferir en el array original.
let numbersDesc = [...numbers].reverse();
alert("Los números ordenados de mayor a menor son: " + numbersDesc);
console.log("Mayor a menor: " + numbersDesc);

//alerta y console.log para cada número según la posición.
alert("El número menor es: " + numbers[0]);
alert("El número central es: " + numbers[1]);
alert("El número mayor es: " + numbers[2]);
console.log("Menor:", numbers[0]);
console.log("Central:", numbers[1]);
console.log("Mayor:", numbers[2]);