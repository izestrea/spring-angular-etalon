/**
 * Created by Denis on 3/16/2015.
 */
app.controller('contactsCtrl', ['$scope', '$http', function ($scope, $http) {
    $scope.dynamicPopover = 'Hello, World!';
    $scope.dynamicPopoverTitle = 'Title';

    $http.get('/api/persons/').success(function (data) {
        console.log(data);
    });
}]);