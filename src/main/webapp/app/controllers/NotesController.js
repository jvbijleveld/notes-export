var notesControllers = angular.module('notesControllers',[]);

notesControllers.controller('listMenu',['$scope','$http','$routeParams',
	function($scope, $http, $routeParams){
		$scope.viewmenu = null;
		$http.get('/views').success(function(data){
			$scope.viewmenu = data;
		});
	}
]);