/**
 * Created by Denis on 3/15/2015.
 * basic ng config
 */
var app = angular.module('app', ['ui.router', 'ui.bootstrap']);


app.config(function ($locationProvider, $stateProvider, $urlRouterProvider) {
    $locationProvider.html5Mode(true);
    $urlRouterProvider.otherwise('/404');

    $stateProvider
        .state('home', {
            url: '/',
            templateUrl: 'components/home/home.html',
            controller: 'homeCtrl'
        })
        .state('contacts', {
            url: "/contacts",
            templateUrl: "components/contacts/contacts.html",
            controller: 'contactsCtrl'
        })
        .state('404', {
            url: '/404',
            templateUrl: 'shared/404.html'
        })
});
//config



