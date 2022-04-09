class Ninja {
    constructor(name,health){
        this.name = name;
        this.health=health;
        this.speed = 3;
        this.strength = 3;
    }

    sayName(){
        console.log(this.name);
    }

    showStatus(){
        console.log(this.speed +"" + this.health +""+this.name+""+this.strength)
    }

    drinkSack(){
        this.health +=10;
    }

}