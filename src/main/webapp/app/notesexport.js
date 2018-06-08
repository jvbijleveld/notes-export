var notesExport = angular.module('notesExport',['ngRoute','notesControllers']);

notesExport.config(['$routeProvider', 
    function($routeProvider){
		$routeProvider.

		when('/home',{
		    templateUrl: 'home.html',
			controller: 'listMenu'
		}).
		otherwise({
			redirectTo: '/home'
		});
	}
]);	
