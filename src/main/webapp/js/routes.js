ngapp.config(['$routeProvider', function($routeProvider) {
        $routeProvider
            .when('/patients', {
                templateUrl : 'template/patient-list.html',
                controller  : 'PatientListController'
            })

            // route for the contact page
            .when('/patients/create', {
                templateUrl : 'template/patient.html',
                controller  : 'PatientController'
            })

            // route for viewing the patient
            .when('/patients/:objectid', {
                templateUrl : 'template/patient.html',
                controller  : 'PatientController'
            })

            // begin
            .otherwise({
				redirectTo: '/patients'
			})
    }]);
