angular.module('Polynet',[]).controller("RegisterController",function($scope,$http){
    $scope.DataIns = {};

    $scope.get = function(){
        $http({
            method: 'GET',
            url: '/feed'
        }).then(function successCallback(response){
            $scope.stories = response.data;
        }, function errorCallback(err){
            console.log('Error: ' + err.data.error);
        });
    };

    $scope.get();
    $scope.share = function(){
        $http({
            method: 'POST',
            url: '/story',
            data: $scope.Data.content
        }).then(function successCallback(response){
            $scope.Data = {};
            $scope.get();
        }, function errorCallback(err){
            console.log('Error: ' + err.data.error);
        });
    };

    $scope.shareCom = function(id_story,comment){
        var comment = {
            id_story: id_story,
            comment: comment
        }
        $http({
            method: 'POST',
            url: '/com',
            data: comment
        }).then(function successCallback(response){
            $scope.Datac = {};
            $scope.get();
        }, function errorCallback(err){
            console.log('Error: ' + err.data.error);
        });
    };



});
