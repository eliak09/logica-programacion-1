let num1 = prompt("Ingresa el primer número: ");
let num2 = prompt("Ingresa el segundo número: ");
let num3 = prompt("Ingresa el tercer número: ");

let numbers = [parseInt(num1), parseInt(num2), parseInt(num3)];

//verifcar igualdades aquí
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

numbers.sort((a, b) => a - b);
console.log("Menor a mayor: " + numbers);

let numbersDesc = [...numbers].reverse();
console.log("Mayor a menor: " + numbersDesc);

alert("El número menor es: " + numbers[0]);
alert("El número central es: " + numbers[1]);
alert("El número mayor es: " + numbers[2]);
console.log("Menor:", numbers[0]);
console.log("Central:", numbers[1]);
console.log("Mayor:", numbers[2]);