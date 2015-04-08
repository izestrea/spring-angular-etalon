/**
 * Created by denchiosa on 4/8/15.
 */
app.controller('personsCtrl', function ($scope, $http) {
    $scope.person = {};

    $scope.save = function () {
        $http.post('/register', $scope.person).success(function () {
            console.log('uraaa');
        }).error(function (data) {
            console.log(data);
        });
    }
})
