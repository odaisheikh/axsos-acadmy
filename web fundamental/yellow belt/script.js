var ninja = 314;
var pirates = 159;
function add(ele){
    ninja++;
    ele.innerHTML = ninja;
}
function add1(ele){
    pirates++;
    ele.innerHTML = pirates;
}
function sub(ele){
    setTimeout(message, 13000);
    ele.remove();
}
function message(){
    var x = "";
    if (ninja > pirates){
        x = "ninjas"
    }
    else {
        x = "pirates"
    }
    alert("this page says \n the " +x+ " have won!");
}