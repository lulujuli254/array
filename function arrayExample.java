function arrayExample() {
    // Create an array of names.
    var arrayOfNames = ["Alice", "Bob", "Charlie", "David", "Eve"];
    // Create an array for a shopping list.
    var shoppingList = ["Apples", "Bananas", "Carrots", "Detergent", "Eggs"];
    // Initialize an empty string.
    var str1 = "";

    // Display the names from the array in the HTML element.
    document.getElementById("arrUpp").innerHTML = "all names in array: " + arrayOfNames.join(", ");

    // Add two names to the 'arrayOfNames'.
    arrayOfNames.push("Frank");
    arrayOfNames.push("Grace");

    // Change the name at index 2 to 'Hannah'.
    arrayOfNames[2] = "Hannah";

    // Update the HTML element to display the modified names.
    document.getElementById("arrUpp").innerHTML = "Updated names in array: " + arrayOfNames.join(", ");

    // Initialize an empty string for the shopping list.
    var str2 = "";
    // Iterate through the shopping list array and build the string.
    for (var i = 0; i < shoppingList.length; i++) {
        str2 += shoppingList[i] + ", ";
    }

    // Update the HTML element to display the shopping list.
    document.getElementById("arrUpp").innerHTML = "All items in shopping list: " + str2;

    // Check if the third item is equal to the first item in the shopping list.
    if (shoppingList[2] == shoppingList[0]) {
        alert("Shopping list 3 = 1");
    } else {
        alert("Not equal - sl3 = " + shoppingList[2] + " and sl4 = " + shoppingList[0]);
    }

    // Reverse the shopping list array.
    shoppingList.reverse();
    str2 = "";

    // Iterate through the reversed shopping list and build the string.
    for (var j = 0; j < shoppingList.length; j++) {
        str2 += shoppingList[j] + ", ";
    }

    // Show the reversed shopping list using an alert.
    alert(shoppingList);
}
