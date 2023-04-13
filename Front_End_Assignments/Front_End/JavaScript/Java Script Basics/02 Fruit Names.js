<button onclick="sortFruits()">Sort fruits</button>
<ul id="fruits-list">
  <li>Apple</li>
  <li>Banana</li>
  <li>Cherry</li>
  <li>Orange</li>
</ul>

// JavaScript code to sort the fruit array
function sortFruits() {
    const fruitsList = document.getElementById("fruits-list"); // get the list element
    const fruitsArray = Array.from(fruitsList.children) // create an array from the list items
                            .map(li => li.innerText); // map the array to get the text content of each li element
  
    fruitsArray.sort((a, b) => b.localeCompare(a)); // sort the array in descending order
  
    fruitsArray.forEach((fruit, index) => { // update the list items with the sorted fruit names
      fruitsList.children[index].innerText = fruit;
    });
  }