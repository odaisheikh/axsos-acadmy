function pizzaoven(crustType, sauceType, cheeses, toppings) {
    var pizza = {};
    pizzaoven.crustType = crustType;
    pizzaoven.sauceType = sauceType;
    pizzaoven.cheese = cheeses;
    pizzaoven.toppings = toppings;
    return pizza;
}
    
var s1 = pizzaoven("deep dish", "traditional", ["mozzarella"], ["pepperoni", "sausage"]);

console.log(s1);