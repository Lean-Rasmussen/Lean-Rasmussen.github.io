$(window).scroll(function(){
    let wScroll = $(this).scrollTop();
    let scropp = wScroll*-0.15;
    let textscroll =  wScroll*1.5;
    console.log(scropp +" scroop " + wScroll +" window scroll ")
    $('.parallax-advanced__background--front').css({
        "transform":"translate(0px," + scropp +"px)"
    })
    $('.parallax-advanced__background--text').css({
        "transform":"translate(0px," + textscroll +"px)",
        "opacity": 1- (textscroll*0.002),
    })
})

//module
var TMbling= angular.module('TMbling',['ngRoute']);

//controller

TMbling.controller('navController',['$scope',function($scope){
    console.log($scope)
}])

//routes
TMbling.config(function($routeProvider){

    $routeProvider

    //route for home page
    .when('/', {
        templateUrl: 'pages/home.html',
    })

    .when('/parallax', {
        templateUrl: 'pages/parallaxbasic.html',
    })

    .when('/advancedParallax', {
        templateUrl: 'pages/advancedParallax.html',
    })
    .when('/SVG', {
        templateUrl: 'pages/svg.html',
    })

});