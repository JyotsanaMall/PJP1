function getResult(){
    var op = getRadioValue();
    var x = parseInt(document.getElementById("n1").value);
    var y = parseInt(document.getElementById("n2").value);
    var res = -1;

    if(op == 1){
        res = x + y;
    }
    else if(op == 2){
        res = x - y
    }
    else if(op == 3){
        res = x * y;
    }
    else{
        res = x / y;
    }
    document.getElementById("res").innerHTML = res;
}

function getRadioValue(){
    var radio = document.getElementsByName("operation");
    for(var i=0; i<radio.length; i++){
        if(radio[i].checked){
            return radio[i].value;
        }
    }
}