var notesExport = angular.module('notesExport',['ngRoute']);

notesExport.config(function($routeProvider){ 
	$routeProvider.
		when('/home',{
			controller: 'listMenu'
		})
		.otherwise({
			redirectTo: '/home'
		});
	}
);

notesExport.controller('menuController', function($scope, $http) {
	$http.get('/views').then(function(data){
		$scope.viewmenu = data;
	});
});

