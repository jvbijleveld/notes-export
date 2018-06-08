<html >
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="public/style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.2/angular.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.2/angular-route.js"></script>
        <script src="/app/notesexport.js"></script>
    </head>
    
    <body ng-app="notesExport">
        <div id="top-bar">
            <div class="logo"></div>
        </div>
        <div id="menu_container" ng-controller="menuController">  
            <ul id="menuOutline">
                <li ng-repeat="menu in viewmenu"><a ng-href="/#!/view/{{menu.viewId}}">{{menu.viewName}}</a></li>
            </ul>
        </div>
        <div id="main_container">
            <div class="searchBar">
                <div class="label_zoeken">zoeken</div>
            </div>
            
            <div class="content_container" ng-view></div>
        </div>
        <div id="footer-bar"></div>
    </body>
    
</html>