function main() {
    let celsiusDegrees;
    celsiusDegrees = Number(window.prompt("Enter a value for celsiusDegrees"));
        
        while (isNaN(celsiusDegrees)) {
            alert("Invalid input. Please enter a number.");
            console.log("Error. Only numbers are allowed.");
            celsiusDegrees = Number(window.prompt("Enter a value for celsiusDegrees"));
        }
    let fahrenheitResult;

    fahrenheitResult = celsiusDegrees * 1.8 + 32;
    alert("The result of the conversion is: " + fahrenheitResult + "°F");
    console.log("Fahrenheit: " + fahrenheitResult + "°F");

    let kelvinResult;

    kelvinResult = celsiusDegrees + 273.15;
    alert("The result of the conversion is: " + kelvinResult + "K");
    console.log("Kelvin: " + kelvinResult + "K");
}
main();