<html >
    <head>
        <title></title>
        <link rel="stylesheet" type="text/css" href="public/style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.2/angular.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.2/angular-route.js"></script>
    
        <script src="/app/controllers/NotesController.js"></script>
        <script src="/app/notesexport.js"></script>
    </head>
    
    <body ng-app="notesExport">
        <div id="top-bar">
            <div class="logo"></div>
        </div>
        <div id="menu_container">  
            <menu type="context" id="menuOutline">
                <menuitem label="Dummy item" />
                
            </menu>
        </div>
        
        <div id="main_container">
            <div class="searchBar">zoeken</div>
            
            <div class="content_container">Shit goes here
            <ng-view></ng-view>
            </div>
            
        </div>
        
        <div id="footer-bar"></div>
    </body>
    
</html>