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
		.when('/form/:formName/:docId', {
			templateUrl : function(params){ return '/public/templates/' + params.formName + '.html'; },
			controller: 'docFormController'
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

notesExport.controller('docController', function($scope, $http, $routeParams, $window) {
    $http.get("/doc/" + $routeParams.docId).then(function succes(data, status, headers, config) {
        var formName = data.data.notesItems.form;
        if (checkTplUrl('/public/templates/' + formName + '.html')) {
    		$window.location.href = '/#!/form/' + formName + '/' + $routeParams.docId;
		}else{
			$scope.docdata = data.data;
		}
    });
});
notesExport.controller('docFormController', function($scope, $http, $routeParams, $window) {
    $http.get("/doc/" + $routeParams.docId).then(function succes(data, status, headers, config) {
        $scope.docdata = data.data;
    });
});

var checkTplUrl = function(url) {
    var http = new XMLHttpRequest();
    http.open('HEAD', url, false);
    http.send();
    return (http.status === 200);
};