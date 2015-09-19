'use strict';

angular.module('electronic-medical-record-api')


.factory('PatientApi', ['Api', function(Api) {
  return {
    
    /**
     * Get the patient list
     */
    patients: function(query) {
      return Api.get('/patients', null, query);
    },
    
    /**
     * Creates a new patient
     */
    newPatient: function(entity) {
      return Api.post('/patients', entity);
    },
    
    /**
     * Get data about the patient
     */
    getPatient: function(id) {
      return Api.get('/patients', id);
    },
    
    /**
     * Updates the data about the patient
     */
    updatePatient: function(entity) {
      return Api.put('/patients', entity.id, entity);
    }
  };
}]);