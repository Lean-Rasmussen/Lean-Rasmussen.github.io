$(document).ready(function(){
    //overstående text
    $(".input--1").on("keypress", function(e){
        let capsLockDisable = false;
        capsLockDisable =(!e.shiftKey && e.key === e.key.toLowerCase() || e.shiftKey && e.key === e.key.toUpperCase())
        if(capsLockDisable === false){
           $(".war1").text("Caps Lock er slået til")
        }
        if(capsLockDisable === true){
            $(".war1").text("   ")
        }
    })

    // sidestående text
    $(".input--2").on("keypress", function(e){
        let capsLockDisable = false;
        capsLockDisable =(!e.shiftKey && e.key === e.key.toLowerCase() || e.shiftKey && e.key === e.key.toUpperCase())
        if(capsLockDisable === false){
            $(".war2").css({"display" :"block"})
        }
        if(capsLockDisable === true){
            $(".war2").css({"display": "none"})
        }
    })

});

