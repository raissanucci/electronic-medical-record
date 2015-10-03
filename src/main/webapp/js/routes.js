ngapp.config(['$routeProvider', function($routeProvider) {
        $routeProvider
            .when('/patients', {
                templateUrl : 'template/patient-list.html',
                controller  : 'patientListController'
            })

            // route for the contact page
            .when('/patients/create', {
                templateUrl : 'template/patient.html',
                controller  : 'patientController'
            })

            // route for viewing the patient
            .when('/patients/:objectid', {
                templateUrl : 'template/patient.html',
                controller  : 'patientController'
            })

            // begin
            .otherwise({
				redirectTo: '/patients'
			})
    }]);
