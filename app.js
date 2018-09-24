

//module
var TMbling= angular.module('TMbling',['ngRoute']);

//controller

TMbling.controller('navController',['$scope',function($scope){
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
    .when('/fadeText', {
        templateUrl: 'pages/fadeText.html',
    })
        .when('/input', {
            templateUrl: 'pages/input.html',
        })

});