function dropDown(){
    var stationList = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'];
    for(let i=0;i<=stationList.length-1;i++)
    {
    document.getElementById('sourceStation').innerHTML += `<option value=${i+1}>Station-${stationList[i]}</option>`;
 
    document.getElementById('destStation').innerHTML += `<option value=${i+1}>Station-${stationList[i]}</option>`;
    }
}
dropDown();


function calculateFare(){
    let initialDest = document.getElementById('sourceStation').value;
    // console.log(initialDest);
    let finalDest = document.getElementById('destStation').value;
    // console.log(finalDest);

    let noOfStations = Math.abs(initialDest - finalDest);

    var fare = 0;

    if(noOfStations < 1 ){
        fare = 10;
    }

    if(noOfStations %4 == 0){
        fare = (Math.floor(noOfStations/4)*10);
    }
    else{
        fare = (Math.floor(noOfStations/4 + 1)*10);
    }

    if(noOfStations > 24){
        fare = 60;
    }

    if(document.getElementById('payMethod').value == 'card' && noOfStations >= 5){
        fare = fare - fare*0.1;
    }

    document.getElementById('fare').value = fare;
}