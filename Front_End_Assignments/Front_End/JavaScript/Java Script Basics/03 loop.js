// Create an object with some properties
const person = {
    name: "John",
    age: 30,
    occupation: "Programmer"
  };
  
  // Loop through the properties of the object using a for/in loop
  for (const property in person) {
    console.log(`${property}: ${person[property]}`);
  }