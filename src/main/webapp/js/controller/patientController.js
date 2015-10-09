ngapp.controller('PatientController', ['$scope', 'PatientApi', function($scope, PatientApi) {
    $scope.patient = {
        name: "",
        socialName: "",
        mothersName: "",
        fathersName: "",
        gender: "",
        color: "",
        birthdate: "",
        bloodtype: "",
        email: "",
        cpf: "",
        rg: "",
        orgEmissor: "",
        orgEmissorUF: "",
        ddd: "",
        phone: "",
        zip: "",
        address: "",
        addressNumber: "",
        addressComplement: "",
        addressCityArea: "",
        addressCity: "",
        addressUF: "",
        addressCountry: ""
    };

    $scope.savePatient = function() {
        console.log("SAVING PATIENT")
        PatientApi.newPatient($scope.patient);
    }

}])
