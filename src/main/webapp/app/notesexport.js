var notesExport = angular.module('notesExport',['ngRoute']);

notesExport.config(function($routeProvider) {
	$routeProvider
		.when('/view/:viewId', {
		    templateUrl : '/public/templates/view.html',
			controller: 'viewController'
		})
		.when('/doc/:docId', {
		    templateUrl : '/public/templates/document.html',
			controller: 'docController'
		})
		.otherwise({
			redirectTo: '/'
		});
});

notesExport.controller('menuController', function($scope, $http) {
    $http.get("/views").then(function succes(data, status, headers, config) {
        $scope.viewmenu = data.data;
    });
});

notesExport.controller('viewController', function($scope, $http, $routeParams) {
    $http.get("/views/data/" + $routeParams.viewId).then(function succes(data, status, headers, config) {
        $scope.viewdata = data.data;
    });
});

notesExport.controller('docController', function($scope, $http, $routeParams) {
    $http.get("/doc/" + $routeParams.docId).then(function succes(data, status, headers, config) {
        $scope.docdata = data.data;
    });
});