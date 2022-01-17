function visiple(){
    document.querySelector("article").style.display="none";
}
function temp(elem){
    if(elem.value=="C"){
        document.querySelector(".red1").innerHTML="24";
        document.querySelector(".red2").innerHTML="27";
        document.querySelector(".red3").innerHTML="21";
        document.querySelector(".red4").innerHTML="26";
        document.querySelector(".blue1").innerHTML="18";
        document.querySelector(".blue2").innerHTML="19";
        document.querySelector(".blue3").innerHTML="16";
        document.querySelector(".blue4").innerHTML="24";
    }
    else{
        document.querySelector(".blue1").innerHTML=Math.floor((18*5/9)+32);
        document.querySelector(".red1").innerHTML=Math.floor((27*5/9)+32);
        document.querySelector(".red2").innerHTML=Math.floor((27*5/9)+32);
        document.querySelector(".red3").innerHTML=Math.floor((21*5/9)+32);
        document.querySelector(".blue4").innerHTMLMath.floor((26*5/9)+32);
        document.querySelector(".blue2").innerHTMLMath.floor((19*5/9)+32);
        document.querySelector(".blue3").innerHTMLMath.floor((16*5/9)+32);
        document.querySelector(".blue4").innerHTMLMath.floor((24*5/9)+32);
    }

}