'use strict';

/**
 * Route configuration for the RDash module.
 */
app.config(
    function ($locationProvider, $stateProvider, $urlRouterProvider) {

        $locationProvider.html5Mode(true);
        $urlRouterProvider.otherwise('/404');

        // Application routes
        $stateProvider
            .state('index', {
                url: '/',
                templateUrl: 'partials/dashboard.html',
                controller: 'AlertsCtrl'
            })
            .state('tables', {
                url: '/tables',
                templateUrl: 'partials/tables.html'
            })
            .state('persons', {
                url: '/persons',
                templateUrl: 'partials/persons.html',
                controller: 'personsCtrl'
            }).state('404', {
                url: '/404',
                templateUrl: 'partials/404.html'
            });
    }
);